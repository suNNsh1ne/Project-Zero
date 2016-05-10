package de.szut.ProjectZer0.model;


	import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

	@Entity
	@Table(name = "WARENEINGANG")
	public class Wareneingang {
		
		@Id
		@GeneratedValue
		@Column(name = "WARENEINGANG_ID")
		private int wareneingangId;
		
		@Column(name ="ANZAHL")
		private int Anzahl;
		
		@Column(name ="EINGANGS_DATUM")
		private Date Eingangs_Datum;
		
		public Wareneingang() {}

		public int getWareneingangId() {
			return wareneingangId;
		}

		public void setWareneingangId(int wareneingangId) {
			this.wareneingangId = wareneingangId;
		}


		public Integer getAnzahl() {
			return Anzahl;
		}

		public void setAnzahl(Integer anzahl) {
			Anzahl = anzahl;
		}

		public Date getEingangs_Datum() {
			return Eingangs_Datum;
		}

		public void setEingangs_Datum(Date eingangs_Datum) {
			Eingangs_Datum = eingangs_Datum;
		}


}