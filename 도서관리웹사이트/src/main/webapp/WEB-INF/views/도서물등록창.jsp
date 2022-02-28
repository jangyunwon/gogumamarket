<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
		input,textarea {
			width: 100%;
			padding: 10px 20px;
			margin: 5px 0;
			box-sizing: border-box;
		}
		
		
input[type=submit]:hover {
	color: black;
	background-color :orange ;
}
	</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>도서물 등록 창</h1>
<form action ="add" method="post">
제목<input type="text" name="bookname"/><br>
책소개<textarea rows="5" cols="25" name="contents"></textarea><br>
저자<input type="text" name="author"/><br>
가격<input type="text" name="price"/><br>
<input type="submit" value="저장"> 
</form>

</body>
</html>