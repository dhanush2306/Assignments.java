<%@ include file="db.jsp" %>

<%

int id=Integer.parseInt(request.getParameter("id"));

PreparedStatement ps = con.prepareStatement(
"delete from student where id=?"
);

ps.setInt(1,id);

ps.executeUpdate();

response.sendRedirect("listStudent.jsp");

%>