import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class LoginServlet extends HttpServlet {

protected void doPost(HttpServletRequest request,
HttpServletResponse response)
throws ServletException, IOException {

String username = request.getParameter("username");
String password = request.getParameter("password");

try{

Class.forName("com.mysql.cj.jdbc.Driver");

Connection con = DriverManager.getConnection(
"jdbc:mysql://localhost:3306/test",
"root",
"password"
);

PreparedStatement ps = con.prepareStatement(
"SELECT * FROM users WHERE username=? AND password=?"
);

ps.setString(1, username);
ps.setString(2, password);

ResultSet rs = ps.executeQuery();

if(rs.next()){

RequestDispatcher rd =
request.getRequestDispatcher("dashboard.jsp");

rd.forward(request,response);

}else{

request.setAttribute("error","Invalid Username or Password");

RequestDispatcher rd =
request.getRequestDispatcher("login.jsp");

rd.forward(request,response);

}

}catch(Exception e){
e.printStackTrace();
}

}
}