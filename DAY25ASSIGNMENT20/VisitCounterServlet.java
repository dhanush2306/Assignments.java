import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VisitCounterServlet extends HttpServlet {

protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {

response.setContentType("text/html");
PrintWriter out = response.getWriter();

Cookie[] cookies = request.getCookies();

int visitCount = 0;

if(cookies != null){
for(Cookie c : cookies){

if(c.getName().equals("visitCount")){
visitCount = Integer.parseInt(c.getValue());
}
}
}

visitCount++;

Cookie newCookie = new Cookie("visitCount", String.valueOf(visitCount));
response.addCookie(newCookie);

out.println("<h2>You visited this page "+visitCount+" times</h2>");

}
}
