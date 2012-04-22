<%@ page language="java" contentType="text/html; charset=windows-31j" pageEncoding="windows-31j"
		import="java.sql.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-31j">
<title>yamamo:TestDB1</title>
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
<h2>Test DB1 : use scriptlet</h2>
<br>
<%-- SQL --%>
<%
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/testdb?" + 
        "user=root&password=yamamori&useUnicode=true&characterEncoding=UTF-8");
    Statement st=conn.createStatement();
%>


<%-- disp result --%>
<h3>## Book Table</h3>
<table class="sample">
	<tr>
		<th>bookid</th>
		<th>title</th>
		<th>userid</th>
		<th>price</th>
	</tr>

<%
	ResultSet rsBook = st.executeQuery("select * from book");
	while(rsBook.next()){
	    out.println("<tr>");
	    out.println("<td>" + rsBook.getInt("bookid") + "</td>");
	    out.println("<td>" + rsBook.getString("title") + "</td>");
	    out.println("<td>" + rsBook.getInt("userid") + "</td>");
	    out.println("<td>" + rsBook.getInt("price") + "</td>");
	    out.println("</tr>");
	}
%>
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
<%
	ResultSet rsUser = st.executeQuery("select * from user");
	while(rsUser.next()){
	    out.println("<tr>");
	    out.println("<td>" + rsUser.getInt("userid") + "</td>");
	    out.println("<td>" + rsUser.getString("username") + "</td>");
	    out.println("<td>" + rsUser.getInt("age") + "</td>");
	    out.println("<td>" + rsUser.getString("sex") + "</td>");
	    out.println("<td>" + rsUser.getInt("money") + "</td>");
	    out.println("</tr>");
	}
%>
</table>
<%
	st.close();
	conn.close();
%>
</body>
</html>