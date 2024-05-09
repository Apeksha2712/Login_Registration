//<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Log out</title>
</head>
<body>
<%
HttpSession logoutsession=request.getSession(false);

if(logoutsession != null){
	logoutsession.invalidate();
}
response.sendRedirect("index.html");
%>
</body>
</html>
//