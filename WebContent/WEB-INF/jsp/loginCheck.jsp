<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        String username=request.getParameter("username");
        String password=request.getParameter("password");
       
        if((username.equals("test") && password.equals("test")))
            {
            session.setAttribute("username",username);
            response.sendRedirect("successfullLogin");
            }
        else
            response.sendRedirect("loginError");
        %>
    </body>
</html>
