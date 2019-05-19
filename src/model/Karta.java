package model;

import java.util.Date;

public class Karta {

	private int id; 
	private String polazniLet;
	private String dolazniLet;
	private String sedistePolazniLet;
	private String sedistePovratniLet;
	private Date datumRezervacije;
	private Date datumProdaje;
	private String korisnikId;
	private boolean obrisan;
	
	
	public Karta(int id, String polazniLet, String dolazniLet, String sedistePolazniLet, String sedistePovratniLet,
			Date datumRezervacije, Date datumProdaje, String korisnikId, boolean obrisan) {
		super();
		
		this.id = id;
		this.polazniLet = polazniLet;
		this.dolazniLet = dolazniLet;
		this.sedistePolazniLet = sedistePolazniLet;
		this.sedistePovratniLet = sedistePovratniLet;
		this.datumRezervacije = datumRezervacije;
		this.datumProdaje = datumProdaje;
		this.korisnikId = korisnikId;
		this.obrisan = obrisan;
	}
	
	
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPolazniLet() {
		return polazniLet;
	}
	public void setPolazniLet(String polazniLet) {
		this.polazniLet = polazniLet;
	}
	public String getDolazniLet() {
		return dolazniLet;
	}
	public void setDolazniLet(String dolazniLet) {
		this.dolazniLet = dolazniLet;
	}
	public String getSedistePolazniLet() {
		return sedistePolazniLet;
	}
	public void setSedistePolazniLet(String sedistePolazniLet) {
		this.sedistePolazniLet = sedistePolazniLet;
	}
	public String getSedistePovratniLet() {
		return sedistePovratniLet;
	}
	public void setSedistePovratniLet(String sedistePovratniLet) {
		this.sedistePovratniLet = sedistePovratniLet;
	}
	public Date getDatumRezervacije() {
		return datumRezervacije;
	}
	public void setDatumRezervacije(Date datumRezervacije) {
		this.datumRezervacije = datumRezervacije;
	}
	public Date getDatumProdaje() {
		return datumProdaje;
	}
	public void setDatumProdaje(Date datumProdaje) {
		this.datumProdaje = datumProdaje;
	}
	public String getKorisnikId() {
		return korisnikId;
	}
	public void setKorisnikId(String korisnikId) {
		this.korisnikId = korisnikId;
	}
	public boolean isObrisan() {
		return obrisan;
	}
	public void setObrisan(boolean obrisan) {
		this.obrisan = obrisan;
	}
	
	
	@Override
	public String toString() {
		return "Karta [id=" + id + ", polazniLet=" + polazniLet + ", dolazniLet=" + dolazniLet + ", sedistePolazniLet="
				+ sedistePolazniLet + ", sedistePovratniLet=" + sedistePovratniLet + ", datumRezervacije="
				+ datumRezervacije + ", datumProdaje=" + datumProdaje + ", korisnikId=" + korisnikId + ", obrisan="
				+ obrisan + "]";
	}
	
	
}
