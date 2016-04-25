<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register JSP</title>
    </head>
    <body>
        <h1>Register Page</h1>
        <div style="text-align:center">
            <h2>Register Details</h2>
            <form action="registerCheck" method="post">
            <br/>Username:<input type="text" name="username">
            <br/>Password:<input type="password" name="password">
            <br/><input type="submit" value="Submit">
	         </form>
	         <form action="login">
	            	<input type="submit" value="Zurück zum Login">
	         </form>
        </div>
    </body>
</html>
