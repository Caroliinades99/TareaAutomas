//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.03.18 a las 04:30:33 PM COT 
//

package coop.equidad.autos.automas.rtaRecibesolicitud;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Clase Java para anonymous complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="Table1">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Idinspeccion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="Idsolicitud" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="Fechadigitacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="Placa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Domicilio" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="Asegurable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Vlr._x0020_Accesorios" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="Cod._x0020_Fasecolda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Vlr._x0020_Fasecolda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Vlr._x0020_Automas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Numero_Chasis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Numero_Motor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Idcolor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Centro_x0020_Revision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Carroceria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Operacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Respuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "table1" })
@XmlRootElement(name = "NewDataSet")
public class NewDataSet {

	@XmlElement(name = "Table1")
	public List<NewDataSet.Table1> table1;

	/**
	 * Gets the value of the table1 property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the table1 property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getTable1().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link NewDataSet.Table1 }
	 * 
	 * 
	 */
	public List<NewDataSet.Table1> getTable1() {
		if (table1 == null) {
			table1 = new ArrayList<NewDataSet.Table1>();
		}
		return this.table1;
	}

	/**
	 * <p>
	 * Clase Java para anonymous complex type.
	 * 
	 * <p>
	 * El siguiente fragmento de esquema especifica el contenido que se espera que
	 * haya en esta clase.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="Idinspeccion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
	 *         &lt;element name="Idsolicitud" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
	 *         &lt;element name="Fechadigitacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
	 *         &lt;element name="Placa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *         &lt;element name="Domicilio" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
	 *         &lt;element name="Asegurable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *         &lt;element name="Vlr._x0020_Accesorios" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
	 *         &lt;element name="Cod._x0020_Fasecolda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *         &lt;element name="Vlr._x0020_Fasecolda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *         &lt;element name="Vlr._x0020_Automas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *         &lt;element name="Numero_Chasis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *         &lt;element name="Numero_Motor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *         &lt;element name="Idcolor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *         &lt;element name="Centro_x0020_Revision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *         &lt;element name="Carroceria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *         &lt;element name="Operacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *         &lt;element name="Respuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "idinspeccion", "idsolicitud", "fechadigitacion", "placa", "domicilio",
			"asegurable", "vlrX0020Accesorios", "codX0020Fasecolda", "vlrX0020Fasecolda",
			"vlrX0020Automas", "numeroChasis", "numeroMotor", "idcolor", "centroX0020Revision", "carroceria",
			"operacion", "respuesta" })
	public static class Table1 {

		@XmlElement(name = "Idinspeccion")
		public Long idinspeccion;
		@XmlElement(name = "Idsolicitud")
		public Long idsolicitud;
		@XmlElement(name = "Fechadigitacion")
		@XmlSchemaType(name = "dateTime")
		public XMLGregorianCalendar fechadigitacion;
		@XmlElement(name = "Placa")
		public String placa;
		@XmlElement(name = "Domicilio")
		public Boolean domicilio;
		@XmlElement(name = "Asegurable")
		public String asegurable;
		@XmlElement(name = "Vlr._x0020_Accesorios")
		public Long vlrX0020Accesorios;
		@XmlElement(name = "Cod._x0020_Fasecolda")
		public String codX0020Fasecolda;
		@XmlElement(name = "Vlr._x0020_Fasecolda")
		public String vlrX0020Fasecolda;
		@XmlElement(name = "Vlr._x0020_Automas")
		public String vlrX0020Automas;
		@XmlElement(name = "Numero_Chasis")
		public String numeroChasis;
		@XmlElement(name = "Numero_Motor")
		public String numeroMotor;
		@XmlElement(name = "Idcolor")
		public String idcolor;
		@XmlElement(name = "Centro_x0020_Revision")
		public String centroX0020Revision;
		@XmlElement(name = "Carroceria")
		public String carroceria;
		@XmlElement(name = "Operacion")
		public String operacion;
		@XmlElement(name = "Respuesta")
		public String respuesta;

		/**
		 * Obtiene el valor de la propiedad idinspeccion.
		 * 
		 * @return possible object is {@link Long }
		 * 
		 */
		public Long getIdinspeccion() {
			return idinspeccion;
		}

		/**
		 * Define el valor de la propiedad idinspeccion.
		 * 
		 * @param value allowed object is {@link Long }
		 * 
		 */
		public void setIdinspeccion(Long value) {
			this.idinspeccion = value;
		}

		/**
		 * Obtiene el valor de la propiedad idsolicitud.
		 * 
		 * @return possible object is {@link Long }
		 * 
		 */
		public Long getIdsolicitud() {
			return idsolicitud;
		}

		/**
		 * Define el valor de la propiedad idsolicitud.
		 * 
		 * @param value allowed object is {@link Long }
		 * 
		 */
		public void setIdsolicitud(Long value) {
			this.idsolicitud = value;
		}

		/**
		 * Obtiene el valor de la propiedad fechadigitacion.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getFechadigitacion() {
			return fechadigitacion;
		}

		/**
		 * Define el valor de la propiedad fechadigitacion.
		 * 
		 * @param value allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setFechadigitacion(XMLGregorianCalendar value) {
			this.fechadigitacion = value;
		}

		/**
		 * Obtiene el valor de la propiedad placa.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getPlaca() {
			return placa;
		}

		/**
		 * Define el valor de la propiedad placa.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setPlaca(String value) {
			this.placa = value;
		}

		/**
		 * Obtiene el valor de la propiedad domicilio.
		 * 
		 * @return possible object is {@link Boolean }
		 * 
		 */
		public Boolean isDomicilio() {
			return domicilio;
		}

		/**
		 * Define el valor de la propiedad domicilio.
		 * 
		 * @param value allowed object is {@link Boolean }
		 * 
		 */
		public void setDomicilio(Boolean value) {
			this.domicilio = value;
		}

		/**
		 * Obtiene el valor de la propiedad asegurable.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getAsegurable() {
			return asegurable;
		}

		/**
		 * Define el valor de la propiedad asegurable.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setAsegurable(String value) {
			this.asegurable = value;
		}

		/**
		 * Obtiene el valor de la propiedad vlrX0020Accesorios.
		 * 
		 * @return possible object is {@link Long }
		 * 
		 */
		public Long getVlrX0020Accesorios() {
			return vlrX0020Accesorios;
		}

		/**
		 * Define el valor de la propiedad vlrX0020Accesorios.
		 * 
		 * @param value allowed object is {@link Long }
		 * 
		 */
		public void setVlrX0020Accesorios(Long value) {
			this.vlrX0020Accesorios = value;
		}

		/**
		 * Obtiene el valor de la propiedad codX0020Fasecolda.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getCodX0020Fasecolda() {
			return codX0020Fasecolda;
		}

		/**
		 * Define el valor de la propiedad codX0020Fasecolda.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setCodX0020Fasecolda(String value) {
			this.codX0020Fasecolda = value;
		}

		/**
		 * Obtiene el valor de la propiedad vlrX0020Fasecolda.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVlrX0020Fasecolda() {
			return vlrX0020Fasecolda;
		}

		/**
		 * Define el valor de la propiedad vlrX0020Fasecolda.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setVlrX0020Fasecolda(String value) {
			this.vlrX0020Fasecolda = value;
		}

		/**
		 * Obtiene el valor de la propiedad vlrX0020Automas.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVlrX0020Automas() {
			return vlrX0020Automas;
		}

		/**
		 * Define el valor de la propiedad vlrX0020Automas.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setVlrX0020Automas(String value) {
			this.vlrX0020Automas = value;
		}

		/**
		 * Obtiene el valor de la propiedad numeroChasis.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getNumeroChasis() {
			return numeroChasis;
		}

		/**
		 * Define el valor de la propiedad numeroChasis.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setNumeroChasis(String value) {
			this.numeroChasis = value;
		}

		/**
		 * Obtiene el valor de la propiedad numeroMotor.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getNumeroMotor() {
			return numeroMotor;
		}

		/**
		 * Define el valor de la propiedad numeroMotor.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setNumeroMotor(String value) {
			this.numeroMotor = value;
		}

		/**
		 * Obtiene el valor de la propiedad idcolor.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getIdcolor() {
			return idcolor;
		}

		/**
		 * Define el valor de la propiedad idcolor.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setIdcolor(String value) {
			this.idcolor = value;
		}

		/**
		 * Obtiene el valor de la propiedad centroX0020Revision.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getCentroX0020Revision() {
			return centroX0020Revision;
		}

		/**
		 * Define el valor de la propiedad centroX0020Revision.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setCentroX0020Revision(String value) {
			this.centroX0020Revision = value;
		}

		/**
		 * Obtiene el valor de la propiedad carroceria.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getCarroceria() {
			return carroceria;
		}

		/**
		 * Define el valor de la propiedad carroceria.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setCarroceria(String value) {
			this.carroceria = value;
		}

		/**
		 * Obtiene el valor de la propiedad operacion.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getOperacion() {
			return operacion;
		}

		/**
		 * Define el valor de la propiedad operacion.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setOperacion(String value) {
			this.operacion = value;
		}

		/**
		 * Obtiene el valor de la propiedad respuesta.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getRespuesta() {
			return respuesta;
		}

		/**
		 * Define el valor de la propiedad respuesta.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setRespuesta(String value) {
			this.respuesta = value;
		}

	}

}
