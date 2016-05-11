<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<c:set var="cp"
	value="${pageContext.request.servletContext.contextPath}" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${cp}/static/css/style.css">

	<link rel="shortcut icon" href="${cp}/static/images/favicon.ico" type="image/x-icon" />
	<link rel="apple-touch-icon" sizes="57x57" href="${cp}/static/images/apple-touch-icon-57x57.png">
	<link rel="apple-touch-icon" sizes="60x60" href="${cp}/static/images/apple-touch-icon-60x60.png">
	<link rel="apple-touch-icon" sizes="72x72" href="${cp}/static/images/apple-touch-icon-72x72.png">
	<link rel="apple-touch-icon" sizes="76x76" href="${cp}/static/images/apple-touch-icon-76x76.png">
	<link rel="apple-touch-icon" sizes="114x114" href="${cp}/static/images/apple-touch-icon-114x114.png">
	<link rel="apple-touch-icon" sizes="120x120" href="${cp}/static/images/apple-touch-icon-120x120.png">
	<link rel="apple-touch-icon" sizes="144x144" href="${cp}/static/images/apple-touch-icon-144x144.png">
	<link rel="apple-touch-icon" sizes="152x152" href="${cp}/static/images/apple-touch-icon-152x152.png">
	<link rel="apple-touch-icon" sizes="180x180" href="${cp}/static/images/apple-touch-icon-180x180.png">
	<link rel="icon" type="image/png" href="${cp}/static/images/favicon-16x16.png" sizes="16x16">
	<link rel="icon" type="image/png" href="${cp}/static/images/favicon-32x32.png" sizes="32x32">
	<link rel="icon" type="image/png" href="${cp}/static/images/favicon-96x96.png" sizes="96x96">
	<link rel="icon" type="image/png" href="${cp}/static/images/android-chrome-192x192.png" sizes="192x192">
	<meta name="msapplication-square70x70logo" content="${cp}/images/smalltile.png" />
	<meta name="msapplication-square150x150logo" content="${cp}/images/mediumtile.png" />
	<meta name="msapplication-wide310x150logo" content="${cp}/images/widetile.png" />
	<meta name="msapplication-square310x310logo" content="${cp}/images/largetile.png" />

<title>Projet Zer0 Login</title>
</head>
<body>
	<div id="login">
	<img src="${cp}/static/images/p0_logo.png" />
	<h1>Bitte melden Sie sich an:</h1>
		<form action="loginCheck" method="post">
			<br /><input type="text" name="username" placeholder="Username" class="input_field"> 
			<br /><input type="password" name="password" placeholder="Passwort" class="input_field">
			<span class="forgot_password"><a href="">Passwort vergessen?</a></span>
			<br /><input type="submit" value="Login" class="button">
		</form>	
	</div>
	<br />
</body>
</html>