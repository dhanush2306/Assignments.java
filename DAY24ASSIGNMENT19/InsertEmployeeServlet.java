import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class InsertEmployeeServlet extends HttpServlet {

protected void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {

response.setContentType("text/html");
PrintWriter out = response.getWriter();

int id = Integer.parseInt(request.getParameter("id"));
String name = request.getParameter("name");
String email = request.getParameter("email");
double salary = Double.parseDouble(request.getParameter("salary"));

try{

Connection con = DriverManager.getConnection(
"jdbc:mysql://localhost:3306/testdb","root","password");

String query = "INSERT INTO employee VALUES(?,?,?,?)";

PreparedStatement ps = con.prepareStatement(query);

ps.setInt(1,id);
ps.setString(2,name);
ps.setString(3,email);
ps.setDouble(4,salary);

ps.executeUpdate();

out.println("Employee inserted successfully");

con.close();

}catch(Exception e){
out.println(e);
}

}
}