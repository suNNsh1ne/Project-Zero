package de.szut.ProjectZer0.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MITARBEITER")
public class Mitarbeiter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MITARBEITER_ID")
<<<<<<< HEAD
	private int mitarbeiterId;
	
=======
	private double mitarbeiterId;

>>>>>>> refs/remotes/origin/Adrian-Test-Build
	@Column(name = "NAME")
	private String Name;

	@ManyToOne
	@JoinColumn(name = "LAGER_ID")
	private Set<Lager> Lager;

	public Mitarbeiter() {
	}

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

	public Set<Lager> getLager() {
		return Lager;
	}

	public void setLager(Set<Lager> lager) {
		Lager = lager;
	}

}