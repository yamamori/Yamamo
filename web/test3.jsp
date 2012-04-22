<%@ page language="java" contentType="text/html; charset=windows-31j" pageEncoding="windows-31j"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-31j">
<title>Insert title here</title>
</head>
<body>
<h2>Test 3 : Scliptlet test</h2>
<%
	// sample of [request] scope
	
	out.println("<h2>sample of [request] scope.</h2>");
	out.println("<br><br>");
	
	// encode
	request.setCharacterEncoding("windows-31j");

	// getParameter
	out.println("<p>1.getParameter</p>");
	out.println("<br>");
	out.println(request.getParameter("name"));
	out.println("<br><br>");

	// getParameterValues
	out.println("<p>2.getParameterValues</p>");
	out.println("<br>");

	String[] strAry = request.getParameterValues("hobby");
	for(int i=0; i<strAry.length; i++){
	  out.print(strAry[i] + "<br>");
	}
%>
</body>
</html>