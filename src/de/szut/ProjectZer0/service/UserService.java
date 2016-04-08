package de.szut.ProjectZer0.service;

import java.util.List;

import de.szut.ProjectZer0.model.User;


public interface UserService {
	
	User findById(int id);
    void saveUser(User user);  
    void deleteUserByUsername(String username);
    List<User> getAllUser();
    User findUserByUsername(String username);
     
}