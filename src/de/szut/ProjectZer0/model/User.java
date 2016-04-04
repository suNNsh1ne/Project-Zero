package de.szut.ProjectZer0.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class User {
	
	@Id
	@GeneratedValue
	@Column(name = "USER_ID")
	private double userId;
	
	@Column(name = "USERNAME")
	private String username;
	
	@Column(name = "PASSWORD")
	private String password;
	
	@Column(name ="PERMISSION_PRIORITY")
	private Integer permissionPriority;
	
	public User() {}

	@Id
	@GeneratedValue
	public double getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
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
