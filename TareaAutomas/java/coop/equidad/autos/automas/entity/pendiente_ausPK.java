package coop.equidad.autos.automas.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the S03032 database table.
 * 
 */
@Embeddable
public class pendiente_ausPK implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String certif;
	private String codplan;
	private String sucur;
	private String orden;

	
	
	public String getCertif() {
		return certif;
	}

	public void setCertif(String certif) {
		this.certif = certif;
	}

	public String getCodplan() {
		return codplan;
	}

	public void setCodplan(String codplan) {
		this.codplan = codplan;
	}

	public String getSucur() {
		return sucur;
	}

	public void setSucur(String sucur) {
		this.sucur = sucur;
	}

	public String getOrden() {
		return orden;
	}

	public void setOrden(String orden) {
		this.orden = orden;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((certif == null) ? 0 : certif.hashCode());
		result = prime * result + ((codplan == null) ? 0 : codplan.hashCode());
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
		pendiente_ausPK other = (pendiente_ausPK) obj;
		if (certif == null) {
			if (other.certif != null)
				return false;
		} else if (!certif.equals(other.certif))
			return false;
		if (codplan == null) {
			if (other.codplan != null)
				return false;
		} else if (!codplan.equals(other.codplan))
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