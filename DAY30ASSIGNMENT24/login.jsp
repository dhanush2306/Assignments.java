<%@ page language="java" %>

<html>
<body>

<h2>Login Page</h2>

<form action="LoginServlet" method="post">

Username:
<input type="text" name="username"><br><br>

Password:
<input type="password" name="password"><br><br>

<input type="submit" value="Login">

</form>

<%
String error = (String)request.getAttribute("error");

if(error!=null){
out.println("<p style='color:red;'>"+error+"</p>");
}
%>

</body>
</html>