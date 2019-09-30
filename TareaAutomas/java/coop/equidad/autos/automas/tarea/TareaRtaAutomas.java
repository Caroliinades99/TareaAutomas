package coop.equidad.autos.automas.tarea;

import java.io.StringReader;
import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import coop.equidad.autos.automas.entity.S03205;
import coop.equidad.autos.automas.entity.S03205PK;
import coop.equidad.autos.automas.entity.pendiente_aus;
import coop.equidad.autos.automas.entity.pendiente_ausPK;
import coop.equidad.autos.automas.repository.S03205Repository;
import coop.equidad.autos.automas.repository.pendiente_ausRepository;
import coop.equidad.autos.automas.rtaRecibesolicitud.NewDataSet;
import coop.equidad.autos.automas.rtaRecibesolicitud.ServiceStub;
import coop.equidad.autos.automas.rtaRecibesolicitud.NewDataSet.Table1;
import coop.equidad.autos.automas.rtaRecibesolicitud.ServiceStub.ConsultarRtaInspeccion;
import coop.equidad.autos.automas.rtaRecibesolicitud.ServiceStub.ConsultarRtaInspeccionResponse;

@Component
@PropertySource(ignoreResourceNotFound = true, value = "classpath:application.properties")
public class TareaRtaAutomas {

	private final Logger logArchivo = LoggerFactory.getLogger(this.getClass());

	@Value("${automas.Idaseguradora}")
	private int idAseguradora;

	@Value("${automas.Clavesg}")
	private String clavesG;

	@Autowired
	pendiente_ausRepository pendienteAusRepository;

	@Autowired
	S03205Repository s03205Repository;

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	// ESTE PARA QUE SEA CADA 6 HORAS
//	@Scheduled(fixedDelay = 10800000)
//	ESTE PARA QUE SEA CADA DOIS MINUTOS --- 
//	@Scheduled(fixedDelay = 180000)
	public void rtaLista() throws JAXBException {
		logArchivo.error("Ingreso a la tarea de seis horas");
		String rta = "";

		List<pendiente_aus> listaPen = pendienteAusRepository.findBy(BigDecimal.ONE);

		for (pendiente_aus pendiente_aus : listaPen) {
			
			try {
				ServiceStub serviceStub = new ServiceStub();
				
				if (valid(pendiente_aus.getRespuesta())) {

					ConsultarRtaInspeccion consultarRtaInspeccion8 = new ConsultarRtaInspeccion();
					String rtaLista = pendiente_aus.getRespuesta().trim();
					
					rta = rtaLista.trim().replace("EXISTE INSPECCION No ","").replace("Se insertó la Solicitud N° ","").replace("EXISTE SOLICITUD No ","");
					
					consultarRtaInspeccion8.setIdsolicitud(Long.parseLong(rta.trim()));
					
					consultarRtaInspeccion8.setClavesg(clavesG);
					consultarRtaInspeccion8.setIdaseguradora(idAseguradora);

					ConsultarRtaInspeccionResponse respuesta = serviceStub.consultarRtaInspeccion(consultarRtaInspeccion8);

					if (respuesta.getConsultarRtaInspeccionResult().getExtraElement().toString() != null) {

						String xml = respuesta.getConsultarRtaInspeccionResult().getExtraElement().toString();
						xml = xml.replace(
								"<diffgr:diffgram xmlns:diffgr=\"urn:schemas-microsoft-com:xml-diffgram-v1\" xmlns:msdata=\"urn:schemas-microsoft-com:xml-msdata\">",
								"");
						xml = xml.replace("</diffgr:diffgram>", "");
						xml = xml.replace("diffgr:id=\"Table11\"", "");
						xml = xml.replace("msdata:rowOrder=\"0\"", "");

						JAXBContext jc = JAXBContext.newInstance(NewDataSet.class);
						Unmarshaller unmarshaller = jc.createUnmarshaller();
						StreamSource streamSource = new StreamSource(new StringReader(xml));
						JAXBElement<NewDataSet> je = unmarshaller.unmarshal(streamSource, NewDataSet.class);

						NewDataSet dataSet = je.getValue();

						if (dataSet.table1 != null) {
							for (Table1 dtaSet : dataSet.table1) {
								S03205 s03205 = new S03205();
								S03205PK s03205PK = new S03205PK();

								s03205PK.setCertif(pendiente_aus.getId().getCertif());
								s03205PK.setCoddet("ASEGURAB");
								s03205PK.setCodpla(pendiente_aus.getId().getCodplan());
								s03205PK.setInciso(BigDecimal.ZERO);
								s03205PK.setOrden(new BigDecimal(pendiente_aus.getId().getOrden()));
								s03205PK.setSucur(pendiente_aus.getId().getSucur());
								s03205.setId(s03205PK);
								String estadoAs = dtaSet.asegurable;
								if (estadoAs.equals("ASEGURABLE SI")) {
									s03205.setValstring("01");
								} else if (estadoAs.equals("ASEGURABLE NO")) {
									s03205.setValstring("02");
								} else {
									s03205.setValstring("00");
								}
								s03205.setValnumber(BigDecimal.ZERO);
								
								String mensje = "EL CERTIFICADO ES: "+pendiente_aus.getId().getCertif()+" EL ESTADO ES: "+estadoAs;
								
								logArchivo.error(mensje);
								
								s03205Repository.save(s03205);
							}
						} else {
							String errorPlaca = "La placa es: " + pendiente_aus.getPlaca() + " y el certificado "
									+ pendiente_aus.getId().getCertif();
							logArchivo.info("El servicio responde, pero no se obtiene datos sobre la placa");
							logArchivo.info(errorPlaca);
						}
					}
				} else {
					pendiente_aus aus = new pendiente_aus();
					pendiente_ausPK ausPK = new pendiente_ausPK();

					ausPK.setCertif(pendiente_aus.getId().getCertif());
					ausPK.setCodplan(pendiente_aus.getId().getCodplan());
					ausPK.setOrden(pendiente_aus.getId().getOrden());
					ausPK.setSucur(pendiente_aus.getId().getSucur());
					aus.setId(ausPK);
					aus.setConsecutivo(pendiente_aus.getConsecutivo());
					aus.setEstado(BigDecimal.ZERO);
					aus.setPlaca(pendiente_aus.getPlaca());
					aus.setRespuesta("pendiente");
					pendienteAusRepository.save(aus);

				}
			} catch (RemoteException errorInsertando) {
				String errorInsertPlaca = "Hubo algun problema insertando los datos de la placa: "
						+ pendiente_aus.getPlaca() + " con el certificado " + pendiente_aus.getId().getCertif();
				logArchivo.error(errorInsertPlaca);
				logArchivo.error("El error es: ", errorInsertando);
			}

		}

	}

	public boolean valid(String respuesta) {
		boolean resp = true;
		boolean resultado = respuesta.trim().contains("BD");
		if (respuesta.trim().equalsIgnoreCase("NO Se inserto la Solicitud".trim()) || resultado == resp) {
			resp = false;
		} else {
			resp = true;
		}
		return resp;
	}
}