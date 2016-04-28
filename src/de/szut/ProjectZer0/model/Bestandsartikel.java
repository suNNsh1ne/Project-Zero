package de.szut.ProjectZer0.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
	private double BestandsartikelId;

	@Column(name = "ARTIKELSTAMM")
	private Artikelstamm Artikelstamm;

	@Column(name = "ANZAHL")
	private Integer Anzahl;

	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "Bestand_Lager", joinColumns = {
			@JoinColumn(name = "BESTANDSARTIKEL_ID") }, inverseJoinColumns = { @JoinColumn(name = "LAGER_ID") })
	private Set<Lager> Lager;

	@ManyToOne
	@JoinColumn(name = "WARENEINGANG_ID")
	private Wareneingang Wareneingang;

	@ManyToOne
	@JoinColumn(name = "WARENAUSGANG_ID")
	private Warenausgang Warenausgang;

	public Bestandsartikel() {
	}

	public double getBestandsartikelId() {
		return BestandsartikelId;
	}

	public void setBestandsartikelId(double bestandsartikelId) {
		this.BestandsartikelId = BestandsartikelId;
	}

	public Artikelstamm getArtikelstamm() {
		return Artikelstamm;
	}

	public void setArtikelstamm(Artikelstamm artikelstamm) {
		Artikelstamm = artikelstamm;
	}

	public Integer getAnzahl() {
		return Anzahl;
	}

	public void setAnzahl(Integer anzahl) {
		Anzahl = anzahl;
	}

	public Set<Lager> getLager() {
		return Lager;
	}

	public void setLager(Set<Lager> lager) {
		Lager = lager;
	}

	public Wareneingang getWareneingang() {
		return Wareneingang;
	}

	public void setWareneingang(Wareneingang wareneingang) {
		Wareneingang = wareneingang;
	}

	public Warenausgang getWarenausgang() {
		return Warenausgang;
	}

	public void setWarenausgang(Warenausgang warenausgang) {
		Warenausgang = warenausgang;
	}
}
