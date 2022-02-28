<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>

.wrap {
	position: absolute;
	top: 20%;
	left:40%;
	margin-top: -86px;
	margin-left: -89px;
	text-align: center;
}
input[type=button] {
  width: 180px;
  height: 50px;
  font-size:20px;
  color: black;
  line-height: 50px;
  text-align: center;
  background: white;
  border: solid 3px grey;
  border-radius: 15px;

}


input[type=button]:hover {
	color:white;
	background-color :skyblue;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="wrap">
<a><input type="button" id="seller" onclick="location.href='prepare' " name="seller" value="판매자"/></a>
<a><input type="button" id="consumer" onclick="location.href='list' " name="consumer" value="소비자"/></a>

</div>
</body>
</html>