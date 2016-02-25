package de.szut.ProjectZer0.model;

import javax.persistence.Entity;

@Entity
public class User {
	private Integer id;
	private String username;
	private String password;
<<<<<<< HEAD
=======
	
	@Column(name = "email")
	private String email;
	
	@Column(name ="permissionPriority")
	private Integer permissionPriority;
>>>>>>> refs/remotes/origin/master
	
	public User() {}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


}
