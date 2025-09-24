<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/style.css">
<link rel="javascript" href="js/javascript.js">
<title>どこつぶ</title>
</head>
<body>
<h1 class="title">どこつぶへようこそ</h1>
<form action="Login" method="post">
User Name:<input type="text" name="name"><br>
<p>PlofileImage
<table>

<tr>
<th><img class="primg" src="img/1.png"></th>
<th><img class="primg" src="img/2.png"></th>
<th><img class="primg" src="img/3.png"></th>
<th><img class="primg" src="img/4.png"></th>
</tr>
<tr>
	<th><input type="radio" name="img" value="1" checked></th>
	<th><input type="radio" name="img" value="2"></th>
	<th><input type="radio" name="img" value="3"></th>
	<th><input type="radio" name="img" value="4"></th>
</tr>
</table>
PassWord:<input type="password" name="pass"><br>
<input type="submit" value="Login">
</form>
</body>
</html>