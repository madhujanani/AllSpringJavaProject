<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>products Details</h1>
<table>
<tr>
	<th>ProductID</th>
	<th>Product_ name</th>
	<th>Product_description</th>
	<th>Product_category</th>
	<th>Price</th>
	<th>Quantity</th>
</tr>
<c:forEach items="${createprod}" var = "prod"> 
<tr>
<td><c:out value="${prod.getProdId()}"/></td>
<td><c:out value="${prod.getProdName()}"/></td>
<td><c:out value="${prod.getProdDesc()}"/></td>
<td><c:out value="${prod.getProdCategory()}"/></td>
<td><c:out value="${prod.getPrice()}"/></td>
<td><c:out value="${prod.getQuantity()}"/></td>
</tr>
</c:forEach>
</table>

</body>
</html>