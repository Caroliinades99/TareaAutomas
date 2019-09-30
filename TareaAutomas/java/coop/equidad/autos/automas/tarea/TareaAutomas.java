package coop.equidad.autos.automas.tarea;

import java.io.StringReader;
import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import org.apache.axis2.AxisFault;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import coop.equidad.autos.automas.recibesolicitud.*;
import coop.equidad.autos.automas.recibesolicitud.NewDataSet.Table1;
import coop.equidad.autos.automas.repository.*;
import coop.equidad.autos.automas.entity.*;
import coop.equidad.autos.automas.rtaRecibesolicitud.ServiceStub;
import coop.equidad.autos.automas.rtaRecibesolicitud.ServiceStub.RecibeSolicitud;
import coop.equidad.autos.automas.rtaRecibesolicitud.ServiceStub.RecibeSolicitudResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
@PropertySource(ignoreResourceNotFound = true, value = "classpath:application.properties")

public class TareaAutomas {

	private final Logger logArchivo = LoggerFactory.getLogger(this.getClass());

	@Value("${automas.Idaseguradora}")
	private int Idaseguradora;

	@Value("${automas.Idintermediario}")
	private int Idintermediario;

	@Value("${automas.Claveintermediario}")
	private String Claveintermediario;

	@Value("${automas.Nombreintermediario}")
	private String Nombreintermediario;

	@Value("${automas.Apellidointermediario}")
	private String Apellidointermediario;

	@Value("${automas.Idsucursal}")
	private int Idsucursal;

	@Value("${automas.Sucursal}")
	private String Sucursal;

	@Value("${automas.Observaciones}")
	private String Observaciones;

	@Value("${automas.Idservicio}")
	private int Idservicio;

	@Value("${automas.Serviciosolicitado}")
	private String Serviciosolicitado;

	@Value("${automas.Domicilio}")
	private Boolean Domicilio;

	@Value("${automas.Personacontacto}")
	private String Personacontacto;

	@Value("${automas.Idciudad}")
	private int Idciudad;

	@Value("${automas.Ubicacionvehiculo}")
	private String Ubicacionvehiculo;

	@Value("${automas.Telefonofijo}")
	private String Telefonofijo;

	@Value("${automas.Clavesg}")
	private String Clavesg;

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	@Autowired
	pendiente_ausRepository pendienteAusRepository;
	@Autowired
	S03202Repository s03202Repository;
	@Autowired
	S03205Repository s03205Repository;
	@Autowired
	S03500Repository s03500Repository;

	@Scheduled(fixedDelay = 120000)
	public void lista() {
		logArchivo.error("Ingreso a la tarea de dos minutos");
		Boolean validacion = true;
		List<pendiente_aus> lista1 = pendienteAusRepository.findBy(BigDecimal.ZERO);
		for (pendiente_aus pendienteOB : lista1) {
			List<S03205> placa = s03205Repository.findByS03205(pendienteOB.getId().getCertif(), "01010120",
					pendienteOB.getId().getCodplan(), new BigDecimal(pendienteOB.getId().getOrden()),
					pendienteOB.getId().getSucur());
			// cod tercero
			if (!placa.isEmpty()) {
				List<S03202> codigoTercero = s03202Repository.findByS03202(pendienteOB.getId().getCertif(),
						pendienteOB.getId().getCodplan(), pendienteOB.getId().getSucur(),
						new BigDecimal(pendienteOB.getId().getOrden()));
				// tercero completo
				List<S03500> tercero = s03500Repository.findByS03500(codigoTercero.get(0).getId().getCodigo());
				// correo
				List<S03205> correo = s03205Repository.findByS03205(pendienteOB.getId().getCertif(), "01010120",
						pendienteOB.getId().getCodplan(), new BigDecimal(pendienteOB.getId().getOrden()),
						pendienteOB.getId().getSucur());
				// telefono
				List<S03205> telefono = s03205Repository.findByS03205(pendienteOB.getId().getCertif(), "813",
						pendienteOB.getId().getCodplan(), new BigDecimal(pendienteOB.getId().getOrden()),
						pendienteOB.getId().getSucur());
				Calendar cal = Calendar.getInstance();
				cal.set(Calendar.DAY_OF_MONTH, 20);
				cal.set(Calendar.MONTH, 03);
				cal.set(Calendar.YEAR, 2019);

				ServiceStub serviceStub = null;
				try {
					serviceStub = new ServiceStub();
				} catch (AxisFault errorServicio) {
					logArchivo.error("Hubo algun problema con la conexion del servicio");
					logArchivo.error(errorServicio.toString());
					validacion = false;
				}
				if (validacion) {
					RecibeSolicitud recibeSolicitud = new RecibeSolicitud();
					recibeSolicitud.setPlaca(placa.get(0).getValstring());
					recibeSolicitud.setIdaseguradora(Idaseguradora);
					recibeSolicitud.setIdintermediario(Idintermediario);
					recibeSolicitud.setClaveintermediario(Claveintermediario);
					recibeSolicitud.setNombreintermediario(Nombreintermediario);
					recibeSolicitud.setApellidointermediario(Apellidointermediario);
					recibeSolicitud.setIdsucursal(Idsucursal);
					recibeSolicitud.setSucursal(Sucursal);
					recibeSolicitud.setFecha(cal);
					recibeSolicitud.setNombresolicitante(tercero.get(0).getNombre());
					recibeSolicitud.setIdentificacion(tercero.get(0).getNit());
					recibeSolicitud.setNombrecliente(tercero.get(0).getNombre());
					recibeSolicitud.setObservaciones(Observaciones);
					recibeSolicitud.setNsolicitudaseguradora(pendienteOB.getConsecutivo());
					recibeSolicitud.setIdservicio(Idservicio);
					recibeSolicitud.setServiciosolicitado(Serviciosolicitado);
					recibeSolicitud.setDomicilio(Domicilio);
					recibeSolicitud.setPersonacontacto(Personacontacto);
					recibeSolicitud.setIdciudad(Idciudad);
					recibeSolicitud.setUbicacionvehiculo(Ubicacionvehiculo);
					recibeSolicitud.setTelefonofijo(Telefonofijo);
					recibeSolicitud.setNcelular(telefono.size() > 0 ? telefono.get(0).getValstring() : "");
					recibeSolicitud.setEmail(correo.size() > 0 ? correo.get(0).getValstring() : "");
					recibeSolicitud.setClavesg(Clavesg);
					try {
						RecibeSolicitudResponse respuesta = serviceStub.recibeSolicitud(recibeSolicitud);
						if (respuesta.getRecibeSolicitudResult().getExtraElement().toString() != null) {
							String xml = respuesta.getRecibeSolicitudResult().getExtraElement().toString();
							xml = xml.replace(
									"<diffgr:diffgram xmlns:diffgr=\"urn:schemas-microsoft-com:xml-diffgram-v1\" xmlns:msdata=\"urn:schemas-microsoft-com:xml-msdata\">",
									"");
							xml = xml.replace("</diffgr:diffgram>", "");
							xml = xml.replace("diffgr:id=\"Table11\"", "");
							xml = xml.replace("msdata:rowOrder=\"0\"", "");
							xml = xml.replace("diffgr:hasChanges=\"inserted\"", "");
							JAXBContext jc = JAXBContext.newInstance(NewDataSet.class);
							Unmarshaller unmarshaller = jc.createUnmarshaller();
							StreamSource streamSource = new StreamSource(new StringReader(xml));
							JAXBElement<NewDataSet> je = unmarshaller.unmarshal(streamSource, NewDataSet.class);

							NewDataSet dataSet = (NewDataSet) je.getValue();

							for (Table1 datSet : dataSet.table1) {
								logArchivo.error(datSet.getRespuesta());
								logArchivo.error(datSet.getIdSolicitud().trim());
								if (!datSet.getIdSolicitud().trim().equalsIgnoreCase("0".trim())
										|| !datSet.getIdSolicitud().trim().equalsIgnoreCase("-1".trim())
										|| !datSet.getIdSolicitud().trim().equalsIgnoreCase("-4".trim())
										|| !datSet.getIdSolicitud().trim().equalsIgnoreCase("-3".trim())) {

									S03205 s03205 = new S03205();
									S03205PK s03205PK = new S03205PK();
									s03205PK.setCertif(pendienteOB.getId().getCertif());
									s03205PK.setCoddet("NUMCITA");
									s03205PK.setCodpla(pendienteOB.getId().getCodplan());
									s03205PK.setInciso(BigDecimal.ZERO);
									s03205PK.setOrden(new BigDecimal(pendienteOB.getId().getOrden()));
									s03205PK.setSucur(pendienteOB.getId().getSucur());
									s03205.setId(s03205PK);
									s03205.setValnumber(new BigDecimal("0"));
									if (Integer.parseInt(datSet.getIdSolicitud()) != -2) {
										s03205.setValstring(datSet.getIdSolicitud());
									} else {
										s03205.setValstring(datSet.getRespuesta());
									}
									String texto = "|"+datSet.getRespuesta();
									logArchivo.error(texto);
									s03205Repository.save(s03205);

								}

								pendienteOB.setEstado(BigDecimal.ONE);
								if (pendienteOB.getRespuesta().equalsIgnoreCase("pendiente")) {
									pendienteOB.setRespuesta(datSet.getIdSolicitudExistente());
								}
								if (datSet.getIdSolicitud().trim().equalsIgnoreCase("0".trim())
										|| datSet.getIdSolicitud().trim().equalsIgnoreCase("-1".trim())
										|| datSet.getIdSolicitud().trim().equalsIgnoreCase("-4".trim())
										|| datSet.getIdSolicitud().trim().equalsIgnoreCase("-3".trim())) {
									pendienteOB.setEstado(BigDecimal.ZERO);
									pendienteOB.setRespuesta("pendiente");
								}
								pendienteAusRepository.save(pendienteOB);
							}
						}
					} catch (RemoteException | JAXBException errorInsertando) {
						String errorInsertandos = "Hubo un error al insertar los datos del certificado "
								+ pendienteOB.getId().getCertif();
						logArchivo.error(errorInsertandos);
						logArchivo.error("El error es: ", errorInsertando);
					}
				}
			}
		}
	}

}
