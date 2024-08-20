<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="s" class="acc.Account" scope="application"/>

<jsp:setProperty name="s" property="name" param="name" />
<jsp:setProperty name="s" property="address" param="address" />
<jsp:setProperty name="s" property="city" param="city" />
<jsp:setProperty name="s" property="phone_number" param="phone_number" />
<jsp:setProperty name="s" property="email" param="email" />
<jsp:setProperty name="s" property="password" param="password" />
<%  
if (s.registerUser() > 0) {
	out.println("<h1>Sign Up Successful!</h1>");
	out.println("<p>Your account has been created successfully.</p>");
	out.println("<p><a href='index.html'>Back to Login</a></p>");
} else {
	out.println("<h1>Sign Up Failed</h1>");
	out.println("<p>There was an error creating your account. Please try again.</p>");
	out.println("<p><a href='signup.html'>Back to SignUp Page</a></p>");
}
%>
</body>
</html>