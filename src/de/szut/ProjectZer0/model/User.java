package de.szut.ProjectZer0.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	private Integer id;
	private String username;
	private String password;
	private Integer permissionPriority;
	
	public User() {}

	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getPermissionPriority() {
		return permissionPriority;
	}

	public void setPermissionPriority(Integer permissionPriority) {
		this.permissionPriority = permissionPriority;
	}


}
