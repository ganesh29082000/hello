<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.klu.DAO.*" %>
    <%@ page import="java.sql.ResultSet" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="displayd.css">
<title>Insert title here</title>
</head>
<h>Choose a choreographer then register</h>
<body>
<style>

body{
    margin: 0;
    padding: 0;
    background: url(background.jpg);
    background-size: cover;
    background-position: center;
    font-family: sans-serif;
}
</style>
<table align="center" border="1px">
<tr><td>Name</td><td>Email</td><td>Age</td><td>Phone</td><td>Dance</td><td>Register</td></tr>
<%
DAO2 d=new DAO2();
ResultSet rst=d.getodissichoreographers();
while(rst.next())
{%>
	<tr><td><%=rst.getString(2)%></td><td><%=rst.getString(3) %></td><td><%=rst.getInt(4) %></td><td><%=rst.getLong(5) %></td><td><%=rst.getString(8) %></td><td><form action="odissichoreographerregistration" method="post"><input type="hidden" name="name" value='<%=rst.getString(2) %>'><input type="hidden" name="style" value="odissi"><input type="submit" value="Register"></form></td></tr>
<%} %>
</table>
<section class="page-section bg-light" id="portfolio">

<div id="wrapper"> 
  <div id="home1">
   <video width="500" height="350" poster="odissi.jpg" controls="controls" preload="none"> 
     <source type="video/mp4" value="Hip-Hop" src="odissi video.mp4" />
   </video>
  </div>
</body>
</html>