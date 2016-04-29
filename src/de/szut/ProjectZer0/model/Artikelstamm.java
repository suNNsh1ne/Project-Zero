package de.szut.ProjectZer0.model;

	import java.sql.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

	@Entity
	@Table(name = "ARTIKELSTAMM")
	public class Artikelstamm {
		
		@Id
		@GeneratedValue
		@Column(name = "ARTIKELSTAMM_ID")
		private int ArtikelstammId;
		
		@Column(name = "BEZEICHNUNG")
		private String Bezeichnung;
		
		@Column(name = "BESCHREIBUNG")
		private String Beschreibung;
		
		@Column(name ="KATEGORIE")
		private Integer Kategorie;
		
		@Column(name ="ATTRIBUTE")
		private Date Attribute;
		
		@Column(name ="ANZAHL")
		private Date Anzahl;
		
		@Column(name ="PREIS")
		private Date Preis;
		
		@ManyToMany(mappedBy="Artikelstämme")
		@Column(name ="LIEFERANTEN")
		private Set<Lieferant> Lieferanten;
		
		public Artikelstamm() {}

		public int getArtikelstammId() {
			return ArtikelstammId;
		}

		public void setArtikelstammId(Integer ArtikelstammId) {
			this.ArtikelstammId = ArtikelstammId;
		}

		public String getBezeichnung() {
			return Bezeichnung;
		}

		public void setBezeichnung(String bezeichnung) {
			Bezeichnung = bezeichnung;
		}

		public String getBeschreibung() {
			return Beschreibung;
		}

		public void setBeschreibung(String beschreibung) {
			Beschreibung = beschreibung;
		}

		public Integer getKategorie() {
			return Kategorie;
		}

		public void setKategorie(Integer kategorie) {
			Kategorie = kategorie;
		}

		public Date getAttribute() {
			return Attribute;
		}

		public void setAttribute(Date attribute) {
			Attribute = attribute;
		}

		public Date getAnzahl() {
			return Anzahl;
		}

		public void setAnzahl(Date anzahl) {
			Anzahl = anzahl;
		}

		public Date getPreis() {
			return Preis;
		}

		public void setPreis(Date preis) {
			Preis = preis;
		}

		
}
