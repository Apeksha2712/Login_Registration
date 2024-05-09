<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile Page</title>
</head>
<style>

body{
	margin:0;
	align-items:center;
	background-color:lightgreen;
	justify-content:center;
	height:100vh;
	background-image:url('background.jpg');
	background-size:cover;
	background-position:center center;
	background-repeat:no-repeat;
	display:flex;
	flex-direction:column;
}
.container{
	width:300px;
	height:150px;
	padding:20px;
	border-radius:10px;
	box-shadow:0 0 10px rgba(0 ,0, 1, 0.5);
	background-color:white;
	text-align:center;
}
h3{
color:red;
font-size:25px;
}
a{
font-size:25px;

}
</style>
<body>
<div class="container">
<h3>Welcome :${session_name}</h3><br>

<a href="index.html">Log Out</a>
</div>
</body>
</html>