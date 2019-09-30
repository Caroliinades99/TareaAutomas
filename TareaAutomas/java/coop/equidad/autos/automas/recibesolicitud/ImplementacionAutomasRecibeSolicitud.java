package coop.equidad.autos.automas.recibesolicitud;

import java.io.StringReader;
import java.rmi.RemoteException;
import java.util.Calendar;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import org.apache.axis2.AxisFault;

import coop.equidad.autos.automas.recibesolicitud.NewDataSet.Table1;
import coop.equidad.autos.automas.rtaRecibesolicitud.ServiceStub;
import coop.equidad.autos.automas.rtaRecibesolicitud.ServiceStub.RecibeSolicitud;
import coop.equidad.autos.automas.rtaRecibesolicitud.ServiceStub.RecibeSolicitudResponse;

public class ImplementacionAutomasRecibeSolicitud {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, 20);
		cal.set(Calendar.MONTH, 03);
		cal.set(Calendar.YEAR, 2019);

		ServiceStub serviceStub = null;
		try {
			serviceStub = new ServiceStub();
		} catch (AxisFault e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		RecibeSolicitud recibeSolicitud = new RecibeSolicitud();

		recibeSolicitud.setPlaca("PRU001");//--s03205 detalle placa   valstring
		recibeSolicitud.setIdaseguradora(73);
		recibeSolicitud.setIdintermediario(6770);
		recibeSolicitud.setClaveintermediario("8600284");
		recibeSolicitud.setNombreintermediario("DIRECTO LA EQUIDAD");
		recibeSolicitud.setApellidointermediario("");
		recibeSolicitud.setIdsucursal(439);
		recibeSolicitud.setSucursal("EQ BOGOTA");
		recibeSolicitud.setFecha(cal);
		recibeSolicitud.setNombresolicitante("EQUIDAD WEB SERVICE");//--
		//-- s03202  rol 1 vas a la tabla s03500 buscas a el tercero por codigo
		recibeSolicitud.setIdentificacion("123456");
		recibeSolicitud.setNombrecliente("PRUEBA WEB SERVICE");//--
		recibeSolicitud.setObservaciones("PRUEBA");
		recibeSolicitud.setNsolicitudaseguradora(0);//tabla agrega un consecutivo 
		recibeSolicitud.setIdservicio(1);
		recibeSolicitud.setServiciosolicitado("Inspecci�n Veh�culo Liviano");
		recibeSolicitud.setDomicilio(false);
		recibeSolicitud.setPersonacontacto("");
		recibeSolicitud.setIdciudad(11001);
		recibeSolicitud.setUbicacionvehiculo("");
		recibeSolicitud.setTelefonofijo("");
		recibeSolicitud.setNcelular("312121212");//--
		recibeSolicitud.setEmail("prueba@gmail.com");//--
		recibeSolicitud.setClavesg("Qdc?In4g$Aut01#");

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
					System.out.println(datSet.getOperacion());
					System.out.println(datSet.getIdSolicitud());
					System.out.println(datSet.getRespuesta());
				}   //--insert s03205  detalle codigo numcita val string save or update  persist
				//--tabla que ya creaste columa resultado update getRespuesta
			}

		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}