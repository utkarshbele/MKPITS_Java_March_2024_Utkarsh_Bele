<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="stud" class="demo.BeanStudent" scope="application"/>

<jsp:setProperty property="name" name="stud" param="nm"/>
<%--integer values should be in single quotes --%>
<jsp:setProperty property="marks" name="stud" param='mk'/>

<jsp:getProperty property="name" name="stud"/>
<jsp:getProperty property="marks" name="stud"/>

</body>
<%
out.println(stud.getResult());
%>
</html>