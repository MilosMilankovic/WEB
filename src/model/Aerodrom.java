package model;

public class Aerodrom {

	private int id;
	private String naziv;

	
	public Aerodrom(String naziv, int id) {
		super();
		this.naziv = naziv;
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	@Override
	public String toString() {
		return "Aerodrom [id=" + id + ", naziv=" + naziv + "]";
	}
	
	
	
	
	
}
