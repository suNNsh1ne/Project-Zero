package de.szut.ProjectZer0.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "BESTANDSARTIKEL")
public class Bestandsartikel {

	@Id
	@GeneratedValue
	@Column(name = "BESTANDSARTIKEL_ID")
	private int BestandsartikelId;

	@Column(name = "ANZAHL")
	private Integer Anzahl;

	@ManyToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinTable(name = "lagerBestand", joinColumns = { 
			@JoinColumn(name = "BESTANDSARTIKEL_ID", nullable = false, updatable = true)},
			inverseJoinColumns = {@JoinColumn(name = "LAGER_ID", nullable = false, updatable = true)
	})
	private Set<Lager> lagerBestand;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name = "ARTIKELSTAMM_ID", nullable = false)
	private Artikelstamm artikelstamm;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name = "WARENEINGANG_ID", nullable = false)
	private Wareneingang wareneingang;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name = "WARENAUSGANG_ID", nullable = false)
	private Warenausgang warenausgang;
	
	public Set<Lager> getLagerBestand() {
		return lagerBestand;
	}

	public void setLagerBestand(Set<Lager> lagerBestand) {
		this.lagerBestand = lagerBestand;
	}

	public Wareneingang getWareneingang() {
		return wareneingang;
	}

	public void setWareneingang(Wareneingang wareneingang) {
		this.wareneingang = wareneingang;
	}

	public Warenausgang getWarenausgang() {
		return warenausgang;
	}

	public void setWarenausgang(Warenausgang warenausgang) {
		this.warenausgang = warenausgang;
	}

	public void setArtikelstamm(Artikelstamm artikelstamm) {
		this.artikelstamm = artikelstamm;
	}

	public Artikelstamm getArtikelstamm() {
		return artikelstamm;
	}

	public void setArtikelstaemme(Artikelstamm artikelstamm) {
		this.artikelstamm = artikelstamm;
	}

	public Bestandsartikel() {
	}

	public int getBestandsartikelId() {
		return BestandsartikelId;
	}

	public void setBestandsartikelId(int bestandsartikelId) {
		this.BestandsartikelId = bestandsartikelId;
	}


	public Integer getAnzahl() {
		return Anzahl;
	}

	public void setAnzahl(Integer anzahl) {
		Anzahl = anzahl;
	}

}
