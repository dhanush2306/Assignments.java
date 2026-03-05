<%@ page language="java" %>

<%
String name = request.getParameter("name");
String email = request.getParameter("email");
String course = request.getParameter("course");
int marks = Integer.parseInt(request.getParameter("marks"));

if(marks < 0 || marks > 100){
%>

<h3 style="color:red;">Invalid Marks! Marks must be between 0 and 100.</h3>

<a href="form.jsp">Go Back</a>

<%
}else{
%>

<h2>Student Details</h2>

Name: <%= name %> <br><br>
Email: <%= email %> <br><br>
Course: <%= course %> <br><br>
Marks: <%= marks %> <br><br>

<%
}
%>