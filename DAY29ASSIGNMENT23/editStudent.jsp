<%@ include file="db.jsp" %>

<%

int id=Integer.parseInt(request.getParameter("id"));

PreparedStatement ps = con.prepareStatement(
"select * from student where id=?"
);

ps.setInt(1,id);

ResultSet rs=ps.executeQuery();

rs.next();

%>

<html>
<body>

<h2>Edit Student</h2>

<form method="post">

<input type="hidden" name="id" value="<%=rs.getInt("id")%>">

Name:
<input type="text" name="name" value="<%=rs.getString("name")%>"><br><br>

Email:
<input type="text" name="email" value="<%=rs.getString("email")%>"><br><br>

Course:
<input type="text" name="course" value="<%=rs.getString("course")%>"><br><br>

<input type="submit" value="Update">

</form>

<%

String name=request.getParameter("name");

if(name!=null){

PreparedStatement ps2 = con.prepareStatement(
"update student set name=?,email=?,course=? where id=?"
);

ps2.setString(1,name);
ps2.setString(2,request.getParameter("email"));
ps2.setString(3,request.getParameter("course"));
ps2.setInt(4,Integer.parseInt(request.getParameter("id")));

ps2.executeUpdate();

response.sendRedirect("listStudent.jsp");

}

%>

</body>
</html>