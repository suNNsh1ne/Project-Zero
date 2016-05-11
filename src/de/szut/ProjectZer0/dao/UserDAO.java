package de.szut.ProjectZer0.dao;

import java.util.List;
import de.szut.ProjectZer0.model.User;

public interface UserDAO {
	/*public void saveUser(User user);
	public List<User> listUser() ;
	public User getUser(Integer id);
	public void delUser(User user);
	public List<User> getByName(String username);*/
	
	User findById(int id);
    void saveUser(User user);  
    void deleteUserByUsername(String username);
    void deleteUserById(String id);
    List<User> getAllUser();
    User findUserByUsername(String username);

}
