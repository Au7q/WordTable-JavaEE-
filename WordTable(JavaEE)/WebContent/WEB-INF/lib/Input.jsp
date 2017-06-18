<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>単語頻度表</title>
</head>
<body>
英文を入力してください
<form action = "/wordtable/Servlet" method = "post">
<textarea name="str" cols=100 rows=20></textarea><br>
<input type = "submit" value = "送信">
</form>
</body>
</html>