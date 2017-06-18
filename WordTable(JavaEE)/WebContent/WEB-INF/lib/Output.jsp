<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "model.WordCount" %>
<%@ page import = "java.util.ArrayList" %>
<%
ArrayList<WordCount> wordCount = (ArrayList<WordCount>) request.getAttribute("wordCount");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>解析結果</title>
</head>
<body>
<TABLE border="1">
<TR><TD>単語</TD><TD>出現回数</TD></TR>
<%
for(int i = 0;i < wordCount.size();i++){
%>
<TR><TD><%= wordCount.get(i).getWord() %></TD><TD> <%= wordCount.get(i).getCount() %></TD></TR>
<%
}
%>
</TABLE>
</body>
</html>