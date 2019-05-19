package model;

import java.util.Date;

public class Let {
	
	private int id;
	private String broj;
	private Date datumPolaska;
	private Date datumDolaska;
	private String polazniAerodrom;
	private String dolazniAerodrom;
	private int brojSedista;
	private double cenaKarte;
	private boolean obrisan;
	
	
	
	public Let(int id, String broj, Date datumPolaska, Date datumDolaska, String polazniAerodrom, String dolazniAerodrom, 
			int brojSedista, double cenaKarte, boolean obrisan) {
		super();
		this.id = id;
		this.broj = broj;
		this.datumPolaska = datumPolaska;
		this.datumDolaska = datumDolaska;
		this.polazniAerodrom = polazniAerodrom;
		this.dolazniAerodrom = dolazniAerodrom;
		this.brojSedista = brojSedista;
		this.cenaKarte = cenaKarte;
		this.obrisan = obrisan;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBroj() {
		return broj;
	}
	public void setBroj(String broj) {
		this.broj = broj;
	}
	public Date getDatumPolaska() {
		return datumPolaska;
	}
	public void setDatumPolaska(Date datumPolaska) {
		this.datumPolaska = datumPolaska;
	}
	public Date getDatumDolaska() {
		return datumDolaska;
	}
	public void setDatumDolaska(Date datumDolaska) {
		this.datumDolaska = datumDolaska;
	}
	public String getPolazniAerodrom() {
		return polazniAerodrom;
	}
	public void setPolazniAerodrom(String polazniAerodrom) {
		this.polazniAerodrom = polazniAerodrom;
	}
	public String getDolazniAerodrom() {
		return dolazniAerodrom;
	}
	public void setDolazniAerodrom(String dolazniAerodrom) {
		this.dolazniAerodrom = dolazniAerodrom;
	}
	public int getBrojSedista() {
		return brojSedista;
	}
	public void setBrojSedista(int brojSedista) {
		this.brojSedista = brojSedista;
	}
	public double getCenaKarte() {
		return cenaKarte;
	}
	public void setCenaKarte(double cenaKarte) {
		this.cenaKarte = cenaKarte;
	}
	public boolean isObrisan() {
		return obrisan;
	}
	public void setObrisan(boolean obrisan) {
		this.obrisan = obrisan;
	}



	@Override
	public String toString() {
		return "Let [id=" + id + ", broj=" + broj + ", datumPolaska=" + datumPolaska + ", datumDolaska=" + datumDolaska
				+ ", polazniAerodrom=" + polazniAerodrom + ", dolazniAerodrom=" + dolazniAerodrom + ", brojSedista="
				+ brojSedista + ", cenaKarte=" + cenaKarte + ", obrisan=" + obrisan + ", getId()=" + getId()
				+ ", getBroj()=" + getBroj() + ", getDatumPolaska()=" + getDatumPolaska() + ", getDatumDolaska()="
				+ getDatumDolaska() + ", getPolazniAerodrom()=" + getPolazniAerodrom() + ", getDolazniAerodrom()="
				+ getDolazniAerodrom() + ", getBrojSedista()=" + getBrojSedista() + ", getCenaKarte()=" + getCenaKarte()
				+ ", isObrisan()=" + isObrisan() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
