package de.szut.ProjectZer0.web;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")
public class LoginController {

	@RequestMapping("/test")
	public String erpLogin() {
		//ModelMap map = new ModelMap();

		//map.addAttribute("login", new User());
		return "login";
	}

	@RequestMapping("/loginCheck.htm")
	public ModelAndView erpLoginCheck(@ModelAttribute("username") String username, @ModelAttribute("password") String password) {
		
		//userDAO = userDAO.getByName(username);
		
		
		ModelMap map = new ModelMap();
		return new ModelAndView("login/loginCheck", map);
	}

	@RequestMapping("/loginError.htm")
	public ModelAndView erpLoginError() {
		ModelMap map = new ModelMap();
		return new ModelAndView("login/error", map);
	}

	@RequestMapping("/successfullLogin.htm")
	public ModelAndView erpLoginSuccessfull() {
		ModelMap map = new ModelMap();
		return new ModelAndView("login/successfullLogin", map);
	}
	
	@RequestMapping("/generateTestData.htm")
	public ModelAndView generateData() {
		ModelMap map = new ModelMap();
		
//		try{
//			Class.forName("org.hsqldb.jdbc.JDBCDriver");
//		}
//		catch(ClassNotFoundException e)
//		{
//			System.err.println("Treiberklasse nicht gefunden!");
//		}
//		
//		Connection con = null;
//		try {
//			con = DriverManager.getConnection("jdbc:hsqldb:mem:erp", "SA", "");
//			Statement stmt = con.createStatement();
//
//			String createUser = "INSERT INTO User(Username, Password, PermissionPriority) VALUES('suNNsh1ne','test', '4')";
//			stmt.executeUpdate(createUser);
//			String sql = "SELECT * FROM User";
//			ResultSet rs = stmt.executeQuery(sql);
//			
//			while (rs.next())
//			{
//				String id = rs.getString(1);
//				String Username = rs.getString(2);
//				String Password = rs.getString(3);
//				String PermissionPriority = rs.getString(4);
//				System.out.println(id + " " + Username + " " + Password + "" + PermissionPriority);
//			}
//			
//
//			rs.close();
//			stmt.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		finally
//		{
//			if(con != null)
//			{
//				try
//				{
//					con.close();
//				}
//				catch(SQLException e)
//				{
//					e.printStackTrace();
//				}
//			}
//		}
		System.out.println("test erfolgreich");

		return new ModelAndView("redirect:login.htm", map);
	}
}
