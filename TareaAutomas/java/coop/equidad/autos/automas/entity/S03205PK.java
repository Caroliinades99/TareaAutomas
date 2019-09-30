package coop.equidad.autos.automas.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the S03205 database table.
 * 
 */
@Embeddable
public class S03205PK implements Serializable {
	private static final long serialVersionUID = 1L;

	private String sucur;
	private String codpla;
	private String certif;	
	private BigDecimal orden;
	private BigDecimal inciso;
	private String coddet;
	
	public S03205PK() {
	}

	public String getCertif() {
		return this.certif;
	}

	public void setCertif(String certif) {
		this.certif = certif;
	}

	public String getCoddet() {
		return this.coddet;
	}

	public void setCoddet(String coddet) {
		this.coddet = coddet;
	}

	public String getCodpla() {
		return this.codpla;
	}

	public void setCodpla(String codpla) {
		this.codpla = codpla;
	}

	public BigDecimal getInciso() {
		return this.inciso;
	}

	public void setInciso(BigDecimal inciso) {
		this.inciso = inciso;
	}

	public BigDecimal getOrden() {
		return this.orden;
	}

	public void setOrden(BigDecimal orden) {
		this.orden = orden;
	}

	public String getSucur() {
		return this.sucur;
	}

	public void setSucur(String sucur) {
		this.sucur = sucur;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((certif == null) ? 0 : certif.hashCode());
		result = prime * result + ((coddet == null) ? 0 : coddet.hashCode());
		result = prime * result + ((codpla == null) ? 0 : codpla.hashCode());
		result = prime * result + ((inciso == null) ? 0 : inciso.hashCode());
		result = prime * result + ((orden == null) ? 0 : orden.hashCode());
		result = prime * result + ((sucur == null) ? 0 : sucur.hashCode());
		
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
		S03205PK other = (S03205PK) obj;
		if (certif == null) {
			if (other.certif != null)
				return false;
		} else if (!certif.equals(other.certif))
			return false;
		if (coddet == null) {
			if (other.coddet != null)
				return false;
		} else if (!coddet.equals(other.coddet))
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
		if (orden == null) {
			if (other.orden != null)
				return false;
		} else if (!orden.equals(other.orden))
			return false;
		if (sucur == null) {
			if (other.sucur != null)
				return false;
		} else if (!sucur.equals(other.sucur))
			return false;
		
		return true;
	}

}