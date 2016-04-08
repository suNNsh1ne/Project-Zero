package de.szut.ProjectZer0.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID")
	private int userId;
	
	@Column(name = "USERNAME")
	private String username;
	
	@Column(name = "PASSWORD")
	private String password;
	
	@Column(name ="PERMISSION_PRIORITY")
	private Integer permissionPriority;
	
	public User() {}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int d) {
		this.userId = d;
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
