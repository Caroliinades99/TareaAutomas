package coop.equidad.autos.automas.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the S03205 database table.
 * 
 */
@Entity
@NamedQuery(name="S03205.findAll", query="SELECT s FROM S03205 s")
public class S03205 implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private S03205PK id;
	public S03205PK getId() {
		return id;
	}
	public void setId(S03205PK id) {
		this.id = id;
	}

	@Temporal(TemporalType.DATE)
	private Date valdate;

	private BigDecimal valnumber;

	private String valstring;

	public S03205() {
	}

	public Date getValdate() {
		return this.valdate;
	}

	public void setValdate(Date valdate) {
		this.valdate = valdate;
	}

	public BigDecimal getValnumber() {
		return this.valnumber;
	}

	public void setValnumber(BigDecimal valnumber) {
		this.valnumber = valnumber;
	}

	public String getValstring() {
		return this.valstring;
	}

	public void setValstring(String valstring) {
		this.valstring = valstring;
	}

}