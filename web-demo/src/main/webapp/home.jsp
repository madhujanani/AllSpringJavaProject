<%@page import="java.util.ArrayList"%>
<%@page import="org.training.web.model.UserCredentials"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import ="java.util.ArrayList" %>
    <%@page import ="org.training.web.model.UserCredentials" %>
    <%@taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home jsp first file</title>
</head>
<body>
<!--  <%String name =(String)request.getAttribute("name"); %><!-- scriptlet -->
<h1>hello <%=name%>  ${passww}from  home jsp</h1><!-- Expression -->
<!-- <%List <UserCredentials>useList =(ArrayList<UserCredentials>) request.getAttribute("Users"); %> -->
<table>
<tr>
	<th>ID</th>
	<th>Name</th>
	<th>Password</th>
</tr>

<c:forEach items ="${Users}" var = "user">
<tr>
	<td><c:out value ="${ user.getId()}"/></td>
	<td><c:out value ="${user.getUserName()}"/></td>
	<td><c:out value ="${user.getPassword()}"/></td>
	
	</tr>
</c:forEach>
<!--  
<%
 for(UserCredentials user:useList){%>
		<tr>
		<td><%=user.getPassword() %></td> 
		  <td><%=user.getUserName() %></td> 
		<td><%=user.getId() %></td> 		
		</tr>

   <% } %>
   -->

</table>



</body>
</html>