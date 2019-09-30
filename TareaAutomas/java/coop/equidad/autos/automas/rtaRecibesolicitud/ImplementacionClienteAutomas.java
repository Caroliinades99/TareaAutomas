package coop.equidad.autos.automas.rtaRecibesolicitud;

import java.io.StringReader;
import java.rmi.RemoteException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.stream.StreamSource;

import coop.equidad.autos.automas.rtaRecibesolicitud.NewDataSet.Table1;
import coop.equidad.autos.automas.rtaRecibesolicitud.ServiceStub.ConsultarRtaInspeccion;
import coop.equidad.autos.automas.rtaRecibesolicitud.ServiceStub.ConsultarRtaInspeccionResponse;

public class ImplementacionClienteAutomas {

	public static void main(String[] args) throws JAXBException, XMLStreamException, FactoryConfigurationError {
		// TODO Auto-generated method stub
		try {
			ServiceStub serviceStub = new ServiceStub();

			ConsultarRtaInspeccion consultarRtaInspeccion8 = new ConsultarRtaInspeccion();

			consultarRtaInspeccion8.setIdsolicitud(1224492);
			consultarRtaInspeccion8.setClavesg("Qdc?In4g$Aut01#");
			consultarRtaInspeccion8.setIdaseguradora(73);

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

				NewDataSet dataSet = (NewDataSet) je.getValue();

				for (Table1 dtaSet : dataSet.table1) {
					System.out.println(dtaSet.idinspeccion.intValue());
					System.out.println(dtaSet.asegurable);
					System.out.println(dtaSet.carroceria);
					System.out.println(dtaSet.centroX0020Revision);
					System.out.println(dtaSet.codX0020Fasecolda);
					System.out.println(dtaSet.idcolor);
					System.out.println(dtaSet.numeroChasis);
					System.out.println(dtaSet.numeroMotor);
					System.out.println(dtaSet.operacion);
					System.out.println(dtaSet.placa);
					System.out.println(dtaSet.respuesta);
					System.out.println(dtaSet.vlrX0020Automas);
					System.out.println(dtaSet.vlrX0020Fasecolda);
					System.out.println(dtaSet.domicilio);
					System.out.println(dtaSet.fechadigitacion);
					System.out.println(dtaSet.idsolicitud.intValue());
					System.out.println(dtaSet.vlrX0020Accesorios.intValue());
				}
			}
		} catch (RemoteException e) {
			System.out.println("Hola, soy una excepcion, revisame porque algo esta fallando " + e);
			e.printStackTrace();
		}
	}
}