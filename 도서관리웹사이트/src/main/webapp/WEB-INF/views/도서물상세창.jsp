<%@page import="com.stone.springmvc.common.Book"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
    <%
    request.setCharacterEncoding("utf-8");
    	Book book = (Book) request.getAttribute("book");
    %>
<!DOCTYPE html>
<html>
<head>
<style>
	
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>도서물 상세창</h1>
제목:<%= book.getBookname() %><br>
책소개:<textarea rows="5" cols="25" readonly><%= book.getContents() %></textarea><br>
출판사:<%= book.getAuthor() %><br>
가격:<%= book.getPrice() %><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href='list'>목록</a>&nbsp;&nbsp;

<a href="delete?bookid=<%= book.getBookid() %>" onclick="return confirm('삭제 하시겠습니까?');">삭제</a>
&nbsp;&nbsp;
<a href = "구매창.jsp">구매하기</a>
</body>
</html>