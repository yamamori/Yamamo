<%@ page language="java" contentType="text/html; charset=windows-31j" pageEncoding="windows-31j"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- 旧式
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
 --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-31j">
<title>Insert title here</title>
</head>
<body>
<h2>Test 5 : EL / JSTL</h2>

<div>
	■Use EL<br>
	<strong><c:out value="${testParamVal}" /></strong><br>
	<strong><c:out value="${testNum}" /></strong><br>
	<br>
	<br>
	<p>（JSTL＋EL式）：こっちの方が楽だね。更に、c:outを使うと、XSS（攻撃手法の１つ）対策にもなる。
		<c:out value="${yama}" />
	</p>
	<br>
	<br>
	<p>（JSPの書き方）
	<%
		out.println(request.getAttribute("yama"));
	%>
	</p>
</div>
<br>
</body>
</html>