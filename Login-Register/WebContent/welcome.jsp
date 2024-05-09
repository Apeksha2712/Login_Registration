<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>

<link rel="StyleSheet"  href="indexstyle.css">
</head>
<body>
<% 
//retrive the session object
HttpSession session1=request.getSession(false);
//check if the session in not null and username attribute is set
if(session1 !=null && session1.getAttribute("username")!=null){
	String username=(String) session.getAttribute("username");

%>
<div class="container">
<h1>welcome,<%=username %>!</h1>  
<p> We're happy to have you in our platform.</p>
<h3>Explore,learn and connect with our community.</h3>
<p>Feel free to stay as long as you like,and when you are ready to leave then Logout.</p>
you can <a href="index.html">LOGOUT</a>securely.
</div>

<%
}
else {
	//redirect to the login page if the session is invalid
	response.sendRedirect("login.servlet");
} %>

</body>
</html>