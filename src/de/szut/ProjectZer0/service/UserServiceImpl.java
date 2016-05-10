package de.szut.ProjectZer0.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import de.szut.ProjectZer0.dao.UserDAO;
import de.szut.ProjectZer0.model.User;
 
 
@Service("UserService")
@Transactional
public class UserServiceImpl implements UserService {
 
    @Autowired
    private UserDAO dao;

 
    public void saveUser(User User) {
        dao.saveUser(User);
    }
 
    public void updateUser(User User) {
        User entity = dao.findById(User.getUserId());
        if(entity!=null){
        	entity.setUsername(User.getUsername());
        	entity.setPassword(User.getPassword());
        	entity.setPermissionPriority(User.getPermissionPriority());

        }
    }
 
    public void deleteUserByUsername(String username){
        dao.deleteUserByUsername(username);
    }
    
 
    public List<User> getAllUser() {
    	return dao.getAllUser();
    }
 
    public User findUserByUsername(String username) {
    	return dao.findUserByUsername(username);
    }

	@Override
	public User findById(int id) {
		return dao.findById(id);
	}

}