package model;

import java.util.Date;

public class Korisnik {

	private String id;
	private String korisnickoIme;
	private String lozinka;
	private Date datumRegistracije;
	private boolean uloga;
	private boolean blokiran;
	private String ime;
	private String prezime;
	
	
	public Korisnik(String id, String korisnickoIme, String lozinka, Date datumRegistracije, 
					boolean uloga, boolean blokiran, String ime, String prezime) {
			super();
			this.id = id;
			this.korisnickoIme = korisnickoIme;
			this.lozinka = lozinka;
			this.datumRegistracije = datumRegistracije;
			this.uloga = uloga;
			this.blokiran = blokiran;
			this.ime = ime;
			this.prezime = prezime;
		
		
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getKorisnickoIme() {
		return korisnickoIme;
	}
	public void setKorisnickoIme(String korisnickoIme) {
		this.korisnickoIme = korisnickoIme;
	}
	public String getLozinka() {
		return lozinka;
	}
	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
	}
	public Date getDatumRegistracije() {
		return datumRegistracije;
	}
	public void setDatumRegistracije(Date datumRegistracije) {
		this.datumRegistracije = datumRegistracije;
	}
	public boolean isUloga() {
		return uloga;
	}
	public void setUloga(boolean uloga) {
		this.uloga = uloga;
	}
	public boolean isBlokiran() {
		return blokiran;
	}
	public void setBlokiran(boolean blokiran) {
		this.blokiran = blokiran;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}


	@Override
	public String toString() {
		return "Korisnik [id=" + id + ", korisnickoIme=" + korisnickoIme + ", lozinka=" + lozinka
				+ ", datumRegistracije=" + datumRegistracije + ", uloga=" + uloga + ", blokiran=" + blokiran + ", ime="
				+ ime + ", prezime=" + prezime + ", getId()=" + getId() + ", getKorisnickoIme()=" + getKorisnickoIme()
				+ ", getLozinka()=" + getLozinka() + ", getDatumRegistracije()=" + getDatumRegistracije()
				+ ", isUloga()=" + isUloga() + ", isBlokiran()=" + isBlokiran() + ", getIme()=" + getIme()
				+ ", getPrezime()=" + getPrezime() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
