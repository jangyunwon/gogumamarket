<%@page import="com.stone.springmvc.common.Book"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%
		List<Book> books = (List<Book>)request.getAttribute("books");
	%>
<!DOCTYPE html>
<html>
<head>
<style>
table, td, th {  
  border: 1px solid #ddd;
  text-align: left;
}

table {
  border-collapse: collapse;
  width: 100%;
}

th, td {
  padding: 15px;
}

th {
background-color: skyblue;
}


</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>도서물 목록 창</h1>
<table>
	<tr>
		<th>번호</th>
		<th>제목</th>
		<th>저자</th>
		<th>가격</th>
	</tr>
	
	
	<%
		for (int i=1; i<=books.size(); i++) {
		Book book = books.get(i-1);
	%>
		<tr>
		<td><%=i %></td> 
		<td><a href="detail?bookid=<%= book.getBookid() %>">
		<%=book.getBookname()%></a></td>
		<td><%=book.getAuthor() %></td>
		<td><%=book.getPrice() %></td>
		</tr>	
	<%
		}
	%>
	
	</table>
</body>
</html>