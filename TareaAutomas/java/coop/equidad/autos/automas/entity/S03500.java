package coop.equidad.autos.automas.entity;

import java.util.Date;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class S03500 {

	@EmbeddedId
	private S03500PK id;
	
	private String sigla;
	private String nombre;
	private String nit;
	private int tipper;
	private String sucrea;
	private String sucmod;
	private Date fecrea;
	private Date fecmod;
	private String claide;
	private String codcia;
	private String sucur;
	private Date fecnacimiento;
	private int sexo;
	private int cattributaria;
	private String digito;
	
	
	public S03500PK getId() {
		return id;
	}
	public void setId(S03500PK id) {
		this.id = id;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNit() {
		return nit;
	}
	public void setNit(String nit) {
		this.nit = nit;
	}
	public int getTipper() {
		return tipper;
	}
	public void setTipper(int tipper) {
		this.tipper = tipper;
	}
	public String getSucrea() {
		return sucrea;
	}
	public void setSucrea(String sucrea) {
		this.sucrea = sucrea;
	}
	public String getSucmod() {
		return sucmod;
	}
	public void setSucmod(String sucmod) {
		this.sucmod = sucmod;
	}
	public Date getFecrea() {
		return fecrea;
	}
	public void setFecrea(Date fecrea) {
		this.fecrea = fecrea;
	}
	public Date getFecmod() {
		return fecmod;
	}
	public void setFecmod(Date fecmod) {
		this.fecmod = fecmod;
	}
	public String getClaide() {
		return claide;
	}
	public void setClaide(String claide) {
		this.claide = claide;
	}
	public String getCodcia() {
		return codcia;
	}
	public void setCodcia(String codcia) {
		this.codcia = codcia;
	}
	public String getSucur() {
		return sucur;
	}
	public void setSucur(String sucur) {
		this.sucur = sucur;
	}
	public Date getFecnacimiento() {
		return fecnacimiento;
	}
	public void setFecnacimiento(Date fecnacimiento) {
		this.fecnacimiento = fecnacimiento;
	}
	public int getSexo() {
		return sexo;
	}
	public void setSexo(int sexo) {
		this.sexo = sexo;
	}
	public int getCattributaria() {
		return cattributaria;
	}
	public void setCattributaria(int cattributaria) {
		this.cattributaria = cattributaria;
	}
	public String getDigito() {
		return digito;
	}
	public void setDigito(String digito) {
		this.digito = digito;
	}
		
	
}
