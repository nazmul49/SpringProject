<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BJIT</title>
</head>
<body>
	<h1>Login Success Page</h1>
	<p>You are logged in with email ${user.email}.</p>

	
	<a href="/HelloMVC/info">View profile</a></br>
	<a href="/HelloMVC/user">Add new user</a></br>
	<a href="/HelloMVC/info">Show user info</a></br>
	<a href="/HelloMVC/user">Delete user</a></br>
	<a href="/HelloMVC/user">Update user</a></br>
	
	</br></br>
	<a href="/HelloMVC/login2">Go back</a>
</body>
</html>