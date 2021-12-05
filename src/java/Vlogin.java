import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Vlogin extends HttpServlet {

@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        try{
            String name = request.getParameter("name");
            String card=request.getParameter("card");
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Voters","root","admin");
            PreparedStatement p=con.prepareStatement("Select FirstName,VoterCardNo from register1 where Firstname=? and VoterCardNo=?");
            p.setString(1,name);
            p.setString(2, card);
            ResultSet rs=p.executeQuery();
                 if(rs.next())
               response.sendRedirect("Vote.jsp");
              
            else
            out.println("<style>");
            out.println("h1  color:purple;</style }");
            out.println("<h1>INVALID LOGIN CREDENTIALS</h1>");
            RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
            rd.include(request,response);
                    
        } catch(Exception e) {
            out.println("Sorry Something went wrong! Try again later.");
        }
        }
}