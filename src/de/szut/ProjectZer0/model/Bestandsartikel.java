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
	private int BestandsartikelId;

	@Column(name = "ANZAHL")
	private Integer Anzahl;


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
