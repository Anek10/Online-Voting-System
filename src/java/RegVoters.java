import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.concurrent.TimeUnit;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class RegVoters extends HttpServlet{
 
@Override
public void doPost(HttpServletRequest request,HttpServletResponse response)
        throws ServletException,IOException{
    response.setContentType("text/html;charset+UTF-8");
    PrintWriter out= response.getWriter();
    try{
        String fname=request.getParameter("fname");
        String lname=request.getParameter("lname");
        String mobile=request.getParameter("mobile");
        String email=request.getParameter("email");
        String gender=request.getParameter("gender");
        String dob=request.getParameter("dob");
        String card=request.getParameter("card");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Voters","root","admin");
    PreparedStatement p=con.prepareStatement("insert into register1 values(?,?,?,?,?,?,?)");
p.setString(1,fname);
p.setString(2,lname);
p.setString(3,mobile);
p.setString(4,email);
p.setString(5,gender);
p.setString(6, dob);
p.setString(7, card);
p.executeUpdate();

out.println("<font color='blue'<h4>YOU HAVE SUCESSFULLY REGISTERED</h4></font>");
RequestDispatcher rd =request.getRequestDispatcher("index.jsp");
rd.include(request,response);
 
    }
    catch(Exception e){ }
        
      }
  }

