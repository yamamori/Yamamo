<%@ page language="java" contentType="text/html; charset=windows-31j" pageEncoding="windows-31j"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-31j">
<title>yamamo:TestDB3</title>
<style type="text/css">
table.sample{
	width: 500px;
    border-top:1px solid #663300;
    border-left:1px solid #663300;
    border-collapse:collapse;
    border-spacing:0;
    background-color:#ffffff;
    empty-cells:show;
}
.sample th{
    border-right:1px solid #663300;
    border-bottom:1px solid #663300;
    color:#330000;
    background-color:#EEBB88;
    background-position:left top;
    padding:0.3em 1em;
    text-align:center;
}
.sample td{
    border-right:1px solid #663300;
    border-bottom:1px solid #663300;
    padding:0.3em 1em;
}
</style>
</head>
<body>
<h2>Test DB</h2>
<br>
<%-- disp result --%>
<h3>## Book Table</h3>
<table class="sample">
	<tr>
		<th>bookid</th>
		<th>title</th>
		<th>userid</th>
		<th>price</th>
	</tr>
	<c:forEach var="bookVo" items="${bookList}">
		<tr>
			<td>${bookVo.bookid}</td>
			<td>${bookVo.title}</td>
			<td>${bookVo.userid}</td>
			<td>${bookVo.price}</td>
		</tr>
	</c:forEach>
</table>

<h3>## User Table</h3>
<table class="sample">
	<tr>
		<th>userid</th>
		<th>username</th>
		<th>age</th>
		<th>sex</th>
		<th>money</th>
	</tr>
	<c:forEach var="userVo" items="${userList}">
		<tr>
			<td>${userVo.userid}</td>
			<td>${userVo.username}</td>
			<td>${userVo.age}</td>
			<td>${userVo.sex}</td>
			<td>${userVo.money}</td>
		</tr>
	</c:forEach>
</table>

</body>
</html>