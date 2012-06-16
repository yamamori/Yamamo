<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>yamamo:BookStore</title>
<link rel="stylesheet" type="text/css" href="/bookstore/css/index.css" />
</head>
<body>
<h2>sample BookStore</h2>
<%-- disp result --%>
<hr>

<h3>## Book Table</h3>
<table class="sample">
	<tr>
		<th>bookid</th>
		<th>title</th>
		<th>userid</th>
		<th>price</th>
		<th> ---- </th>
	</tr>
	<c:forEach var="bookVo" items="${bookList}">
		<tr>
			<td>${bookVo.bookid}</td>
			<td><c:out value="${bookVo.title}" /></td>
			<td><c:out value="${bookVo.userid}" /></td>
			<td><c:out value="${bookVo.price}" /></td>
			<td><input type="button" value="delete" onclick="deleteBook(${bookVo.bookid})"></td>
		</tr>
	</c:forEach>
</table>
<hr>

<h3>## Book Table Regist</h3>
<form name="frmRegistBook" action="/bookstore" method="post">
	<input name="proc" type="hidden" value="regist" />
	<table class="sample regist">
		<tr>
			<th>bookid</th>
			<th>title</th>
			<th>userid</th>
			<th>price</th>
		</tr>
		<tr>
			<td><strong>AUTO</strong></td>
			<td><input name="title" type="text" value="" /></td>
			<td><input name="userid" type="text" value="" /></td>
			<td><input name="price" type="text" value="" /></td>
		</tr>
	</table>
	<input type="submit" value="regist new book" />
</form>
<input type="button" value="regist new book (by Ajax)" onclick="registBook();" />
<hr>

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
			<td><c:out value="${userVo.userid}" /></td>
			<td><c:out value="${userVo.username}" /></td>
			<td><c:out value="${userVo.age}" /></td>
			<td><c:out value="${userVo.sex}" /></td>
			<td><c:out value="${userVo.money}" /></td>
		</tr>
	</c:forEach>
</table>

<!-- ## iframe -->
<!-- 
<iframe name="ifrHidden" style="display: none;"></iframe>
<iframe name="ifrHidden" src="/Test1"></iframe>
 -->

<!-- ## Ajax (native) -->
<script type="text/javascript">
<!--
function registBook(){
	var title, userid, price;
	title = document.frmRegistBook.title.value;
	userid = document.frmRegistBook.userid.value;
	price = document.frmRegistBook.price.value;
	
	var sendData = "";
	sendData += "proc=regist";
	sendData += "&title=" + encodeURIComponent(title);
	sendData += "&userid=" + encodeURIComponent(userid);
	sendData += "&price=" + price;
	
	doAjax(sendData, alertSuccess);
}
function deleteBook(bookid){
	var sendData = "";
	sendData += "proc=delete";
	sendData += "&bookid=" + bookid;
	
	doAjax(sendData, alertSuccess);
}
function doAjax(sendData, callbackFunc){
	httpObj = createXMLHttpRequest(callbackFunc);
	if (httpObj){
		httpObj.open("POST","/bookstore/api",true);
		httpObj.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
		httpObj.send(sendData);
	}
}

// callback function
function alertSuccess(){
	if ((httpObj.readyState == 4) && (httpObj.status == 200)){
		alert("成功しました。");
		location.reload();
	}
}
// ajax object
function createXMLHttpRequest(callbackFunc){
	var XMLhttpObject = null;
	try{
		XMLhttpObject = new XMLHttpRequest();
	}catch(e){
		try{
			XMLhttpObject = new ActiveXObject("Msxml2.XMLHTTP");
		}catch(e){
			try{
				XMLhttpObject = new ActiveXObject("Microsoft.XMLHTTP");
			}catch(e){
				return null;
			}
		}
	}
	if (XMLhttpObject){
		XMLhttpObject.onreadystatechange = callbackFunc;
	}
	return XMLhttpObject;
}
// -->
</script>
</body>
</html>