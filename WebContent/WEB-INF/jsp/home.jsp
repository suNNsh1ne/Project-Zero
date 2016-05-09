<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<c:set var="cp"
	value="${pageContext.request.servletContext.contextPath}" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${cp}/static/css/style.css">
<link rel="stylesheet" href="${cp}/static/css/sidemenu.css">
<!--  <script type="text/javascript" src="${cp}/static/js/jquery-2.2.3.min.js"></script>-->
<title>Home</title>

</head>


<body>
	<%@ include file="sidemenu.jsp"%>
	<div class="content">
		<h1>Project Zero</h1>
	</div>
</body>
</html>