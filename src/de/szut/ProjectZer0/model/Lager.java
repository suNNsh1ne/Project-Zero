package de.szut.ProjectZer0.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "LAGER")
public class Lager {

	@Column(name="LAGER_ID")
	private double LagerID;
	
	@Column(name = "ORT")
	private String Ort;
	
	@Column(name = "KAPAZITÄT")
	private Integer Integer; 
	
	@Column(name ="AUSLASTUNG")
	private Integer Auslastung;
	
	@ManyToMany(mappedBy="Lager")
	private Bestandsartikel Bestandsartikel;
	
	@OneToMany(mappedBy="Lager")
	private Set<Mitarbeiter> Mitarbeiter;
	
	
	public Lager() {}

	public double getLagerID() {
		return LagerID;
	}

	public void setLagerID(double lagerID) {
		LagerID = lagerID;
	}

	public String getOrt() {
		return Ort;
	}

	public void setOrt(String ort) {
		Ort = ort;
	}

	public Integer getInteger() {
		return Integer;
	}

	public void setInteger(Integer integer) {
		Integer = integer;
	}

	public Integer getAuslastung() {
		return Auslastung;
	}

	public void setAuslastung(Integer auslastung) {
		Auslastung = auslastung;
	}

	public Bestandsartikel getBestandsartikel() {
		return Bestandsartikel;
	}

	public void setBestandsartikel(Bestandsartikel bestandsartikel) {
		Bestandsartikel = bestandsartikel;
	}

	public Set<Mitarbeiter> getMitarbeiter() {
		return Mitarbeiter;
	}

	public void setMitarbeiter(Set<Mitarbeiter> mitarbeiter) {
		Mitarbeiter = mitarbeiter;
	}

}
