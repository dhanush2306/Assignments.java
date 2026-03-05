import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class LoginServlet extends HttpServlet {

protected void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {

response.setContentType("text/html");
PrintWriter out = response.getWriter();

String username = request.getParameter("username");
String password = request.getParameter("password");

try{

Connection con = DriverManager.getConnection(
"jdbc:mysql://localhost:3306/testdb","root","password");

String query = "SELECT * FROM users WHERE username=? AND password=?";
PreparedStatement ps = con.prepareStatement(query);

ps.setString(1,username);
ps.setString(2,password);

ResultSet rs = ps.executeQuery();

if(rs.next()){
out.println("<h2>Login Success</h2>");
}else{
out.println("<h2>Invalid Login</h2>");
}

con.close();

}catch(Exception e){
out.println(e);
}

}
}