<%@ include file="db.jsp" %>

<html>
<body>

<h2>Add Student</h2>

<form method="post">

Name: <input type="text" name="name"><br><br>
Email: <input type="text" name="email"><br><br>
Course: <input type="text" name="course"><br><br>

<input type="submit" value="Add Student">

</form>

<%

String name=request.getParameter("name");
String email=request.getParameter("email");
String course=request.getParameter("course");

if(name!=null){

PreparedStatement ps = con.prepareStatement(
"insert into student(name,email,course) values(?,?,?)"
);

ps.setString(1,name);
ps.setString(2,email);
ps.setString(3,course);

ps.executeUpdate();

out.println("Student Added Successfully");

}

%>

<a href="listStudent.jsp">View Students</a>

</body>
</html>