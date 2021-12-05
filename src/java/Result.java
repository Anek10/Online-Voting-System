import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Result extends HttpServlet {
    @Override
public void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
       response.setContentType("text/html");
  
        
         try{
        String name=request.getParameter("candidate");
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Voters","root","admin");
        PreparedStatement p=con.prepareStatement("insert into votes values(?)");
        p.setString(1,name);
        p.executeUpdate();
        response.sendRedirect("Aftervote.jsp");
         }

          catch(Exception e){ }
        
      }
        
}

//create table votes(PartyName varchar(20));
//select count(*) from votes where PartyName='SHIV SENA';