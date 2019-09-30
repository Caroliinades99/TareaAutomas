package coop.equidad.autos.automas.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the S03032 database table.
 * 
 */
@Entity


public class pendiente_aus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private pendiente_ausPK id;
	private BigDecimal estado;
	private String respuesta;
	private String placa;
	private int consecutivo;

	public pendiente_ausPK getId() {
		return id;
	}

	public void setId(pendiente_ausPK id) {
		this.id = id;
	}

	public BigDecimal getEstado() {
		return estado;
	}

	public void setEstado(BigDecimal estado) {
		this.estado = estado;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	public int getConsecutivo() {
		return consecutivo;
	}

	public void setConsecutivo(int consecutivo) {
		this.consecutivo = consecutivo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

}