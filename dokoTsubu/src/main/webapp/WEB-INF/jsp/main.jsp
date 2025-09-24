<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="model.User,model.Mutter,java.util.List" %>

<%
	User loginUser = (User)session.getAttribute("loginUser");
	List<Mutter> mutterList = (List<Mutter>)application.getAttribute("mutterList");
	String errorMsg = (String)request.getAttribute("errorMsg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/style.css">
<link rel="javascript" href="js/javascript.js">
<title>Main</title>
</head>
<body>
<h1>どこつぶメイン</h1>
<p>
<img class="primg" src="img/<%=loginUser.getImg() %>.png"><%= loginUser.getName() %>さん、ログイン中
<a href="Logout">Logout</a>
</p>
<p><a href="Main">ReLoad</a></p>
<form action="Main" method="post">
<input type="text" name="text">
<input type="submit" value="Post">
</form>
<% if(errorMsg != null){ %>
<p><%=errorMsg %></p>
<%} %>
<% for(Mutter mutter : mutterList){ %>
	<hr>
	<table>
	<tr>
	<th><img class="primg" src="img/<%= mutter.getImg()%>.png"><div class="name"><%= mutter.getUserName() %></div></th>
	</tr>
	<tr>
	<th><%= mutter.getText() %></th>
	<tr>
	</table>
	<%} %>
	
</body>
</html>