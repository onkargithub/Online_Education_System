<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Education System</title>
<!-- Favicon -->
<link rel="icon" href="img/s.jpeg.jpeg">
</head>
<body>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<center>
		<marquee>
			<font color=green size=200> Develope BY Shirale Onkareshwar</font>
		</marquee>


		<h1>
			<font color="red">Login Page</font>
		</h1>

		<font color="red"> <%
 if (request.getAttribute("msg") != null) {
 	out.print(request.getAttribute("msg"));
 }
 %></font>

		<form action="login" method="post">
			username &nbsp<input type="text" name="username"><br>
			<br> password &nbsp<input type="password" name="password"><br>
			<br> <input type="submit" value="login">&nbsp&nbsp <input
				type="reset" value="reset"><br> <a
				href="createaccountpage">Create Account</a>
		</form>
	</center>
</body>
</html>


<style>
body {
	background-image: url('img/image.jpeg');
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: cover;
}
</style>



<style>
body {
	background-image: url('img/bgImageLogin.jpg');
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: cover;
}
</style>