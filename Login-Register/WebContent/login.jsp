<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>

<link rel="StyleSheet"  href="style.css">
</head>
<body>
<div class="container">
<h1>Login</h1>
<form action="LoginServlet" method="post">
<label for="username">USERNAME:</label>
<input type="text"  name="username" required><br>
<label for="password">PASSWORD:</label>
<input type="password"  name="password" required><br>
<button type="submit">Login</button>
</form>

<p><a href="index.html">Back To Home Page </a>





</div>


</body>
</html>