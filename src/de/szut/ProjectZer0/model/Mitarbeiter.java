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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MITARBEITER")
public class Mitarbeiter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MITARBEITER_ID")
	private int mitarbeiterId;
	
	@Column(name = "NAME")
	private String Name;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
		@JoinTable(name = "lagerZuweisung", joinColumns = { 
				@JoinColumn(name = "MITARBEITER_ID", nullable = false, updatable = true)},
				inverseJoinColumns = {@JoinColumn(name = "LAGER_ID", nullable = false, updatable = true)
		})
	private Set<Lager> lagerZuweisung;
	
	public int getMitarbeiterId() {
		return mitarbeiterId;
	}

	public void setMitarbeiterId(int mitarbeiterId) {
		this.mitarbeiterId = mitarbeiterId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}


}