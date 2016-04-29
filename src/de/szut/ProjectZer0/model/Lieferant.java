package de.szut.ProjectZer0.model;

	import java.util.List;

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
	@Table(name = "LIEFERANT")
	public class Lieferant {
		
		@Id
		@GeneratedValue
		@Column(name = "LIEFERANTEN_ID")
		private int lieferantenId;
		
		@Column(name = "ADRESSE")
		private String Adresse;
		
		@Column(name = "ANSPRECHPARTNER")
		private String Ansprechpartner;
		
		@ManyToOne
		@JoinColumn(name = "WARENEINGANG_ID")
		private Wareneingang Wareneingang;
		
		@ManyToMany(cascade = {CascadeType.ALL})
		//Evtl Table umbenennen
		@JoinTable(name="LieferArtikel", joinColumns={@JoinColumn(name="LIEFERANTEN_ID")}, inverseJoinColumns={@JoinColumn(name="ARTIKELSTAMM_ID")})
		//evtl liste von Artikelstämmen
		private List<Artikelstamm> Artikelstämme;
		
		public Lieferant() {}

		@Id
		@GeneratedValue
		public int getLieferantId() {
			return lieferantenId;
		}

		public void setLieferantId(int lieferantenId) {
			this.lieferantenId = lieferantenId;
		}

		public String getAdresse() {
			return Adresse;
		}

		public void setAdresse(String adresse) {
			Adresse = adresse;
		}

		public String getAnsprechpartner() {
			return Ansprechpartner;
		}

		public void setAnsprechpartner(String ansprechpartner) {
			Ansprechpartner = ansprechpartner;
		}

		public Wareneingang getWareneingang() {
			return Wareneingang;
		}

		public void setWareneingang(Wareneingang wareneingang) {
			Wareneingang = wareneingang;
		}

		public List<Artikelstamm> getArtikelstämme() {
			return Artikelstämme;
		}

		public void setArtikelstämme(List<Artikelstamm> artikelstämme) {
			Artikelstämme = artikelstämme;
		}


}