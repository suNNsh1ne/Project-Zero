package de.szut.ProjectZer0.model;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

	@Entity
	@Table(name = "LIEFERANT")
	public class Lieferant {
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "LIEFERANTEN_ID")
		private int lieferantenId;
		
		@Column(name = "ADRESSE")
		private String Adresse;
		
		@Column(name = "ANSPRECHPARTNER")
		private String Ansprechpartner;
		
		@ManyToMany(fetch = FetchType.EAGER, mappedBy = "lieferantZuweisung",cascade = CascadeType.ALL)
		private Set<Artikelstamm> artikelstaemme;
		
		@ManyToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
		@JoinColumn(name = "WARENEINGANG_ID")
		private Wareneingang wareneingang;
		
		@ManyToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
		@JoinColumn(name = "WARENAUSGANG_ID")
		private Warenausgang warenausgang;
		
		public Wareneingang getWareneingang() {
			return wareneingang;
		}

		public void setWareneingang(Wareneingang wareneingang) {
			this.wareneingang = wareneingang;
		}
		
		public int getLieferantenId() {
			return lieferantenId;
		}

		public void setLieferantenId(int lieferantenId) {
			this.lieferantenId = lieferantenId;
		}

		public Warenausgang getWarenausgang() {
			return warenausgang;
		}

		public void setWarenausgang(Warenausgang warenausgang) {
			this.warenausgang = warenausgang;
		}


		public Set<Artikelstamm> getArtikelstaemme() {
			return artikelstaemme;
		}

		public void setArtikelstaemme(Set<Artikelstamm> artikelstaemme) {
			this.artikelstaemme = artikelstaemme;
		}

		public int getLieferantId() {
			return lieferantenId;
		}

		public void setLieferantId(int lieferantenId) {
			this.lieferantenId = lieferantenId;
		}

		public String getAdresse() {
			return Adresse;
		}

		public void setAdresse(String Adresse) {
			this.Adresse = Adresse;
		}

		public String getAnsprechpartner() {
			return Ansprechpartner;
		}

		public void setAnsprechpartner(String ansprechpartner) {
			Ansprechpartner = ansprechpartner;
		}


}