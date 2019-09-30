package coop.equidad.autos.automas.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the S03202 database table.
 * 
 */
@Entity
public class S03202 implements Serializable {
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private S03202PK id;

	public S03202PK getId() {
		return id;
	}

	public void setId(S03202PK id) {
		this.id = id;
	}

	private BigDecimal categoria;
	private String codcla;
	private BigDecimal comision;
	private String nombre;
	private BigDecimal orden;
	private BigDecimal parentesco;
	private BigDecimal participacion;
	private String principal;

	public S03202() {
	}

	public BigDecimal getCategoria() {
		return this.categoria;
	}

	public void setCategoria(BigDecimal categoria) {
		this.categoria = categoria;
	}

	public String getCodcla() {
		return this.codcla;
	}

	public void setCodcla(String codcla) {
		this.codcla = codcla;
	}

	public BigDecimal getComision() {
		return this.comision;
	}

	public void setComision(BigDecimal comision) {
		this.comision = comision;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getOrden() {
		return this.orden;
	}

	public void setOrden(BigDecimal orden) {
		this.orden = orden;
	}

	public BigDecimal getParentesco() {
		return this.parentesco;
	}

	public void setParentesco(BigDecimal parentesco) {
		this.parentesco = parentesco;
	}

	public BigDecimal getParticipacion() {
		return this.participacion;
	}

	public void setParticipacion(BigDecimal participacion) {
		this.participacion = participacion;
	}

	public String getPrincipal() {
		return this.principal;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
	}

}