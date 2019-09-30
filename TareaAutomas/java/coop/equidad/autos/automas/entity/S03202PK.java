package coop.equidad.autos.automas.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.*;


/**
 * The persistent class for the S03202 database table.
 * 
 */
@Embeddable
public class S03202PK implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String codigo;
	private Integer vinculacion;
	private String certif;
	private String codpla;
	private String sucur;
	private BigDecimal inciso;
	
	public S03202PK() {
	}


	public Integer getVinculacion() {
		return vinculacion;
	}

	public void setVinculacion(Integer vinculacion) {
		this.vinculacion = vinculacion;
	}

	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getCertif() {
		return certif;
	}


	public void setCertif(String certif) {
		this.certif = certif;
	}


	public String getCodpla() {
		return codpla;
	}


	public void setCodpla(String codpla) {
		this.codpla = codpla;
	}


	public String getSucur() {
		return sucur;
	}


	public void setSucur(String sucur) {
		this.sucur = sucur;
	}


	public BigDecimal getInciso() {
		return inciso;
	}


	public void setInciso(BigDecimal inciso) {
		this.inciso = inciso;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((certif == null) ? 0 : certif.hashCode());
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((codpla == null) ? 0 : codpla.hashCode());
		result = prime * result + ((inciso == null) ? 0 : inciso.hashCode());
		result = prime * result + ((sucur == null) ? 0 : sucur.hashCode());
		result = prime * result + ((vinculacion == null) ? 0 : vinculacion.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		S03202PK other = (S03202PK) obj;
		if (certif == null) {
			if (other.certif != null)
				return false;
		} else if (!certif.equals(other.certif))
			return false;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (codpla == null) {
			if (other.codpla != null)
				return false;
		} else if (!codpla.equals(other.codpla))
			return false;
		if (inciso == null) {
			if (other.inciso != null)
				return false;
		} else if (!inciso.equals(other.inciso))
			return false;
		if (sucur == null) {
			if (other.sucur != null)
				return false;
		} else if (!sucur.equals(other.sucur))
			return false;
		if (vinculacion == null) {
			if (other.vinculacion != null)
				return false;
		} else if (!vinculacion.equals(other.vinculacion))
			return false;
		return true;
	}


	
	
	
}