package de.szut.ProjectZer0.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import de.szut.ProjectZer0.model.User;
import de.szut.ProjectZer0.service.LoginService;

//import com.javawebtutor.model.User;
//import com.javawebtutor.service.LoginService;

public class LoginServlet extends HttpServlet 
{

	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
		
			String userId = request.getParameter("userId");
			String password = request.getParameter("password");
			LoginService loginService = new LoginService();
			
			boolean result = loginService.validateUser(userId, password);
			User user = loginService.getUserByUserId(userId);
			
			if(result == true)
			{
				request.getSession().setAttribute("user", user);
				response.sendRedirect("successfullLogin.jsp");
			}
			else
			{
				response.sendRedirect("loginError.htm");
			}

	}
}
