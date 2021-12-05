import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AdminCheck extends HttpServlet {

@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        try{
            String name = request.getParameter("user");
            String password=request.getParameter("pass");
        if(password.equals("admin") && name.equals("root"))
        {            
         RequestDispatcher rd =request.getRequestDispatcher("AdminInterface.jsp");
         rd.forward(request,response);
        }else
        {
           
          out.println("<font color='red'<h1>You have entered incorrect password</h1></font>");
          RequestDispatcher rd=request.getRequestDispatcher("AdminLogin.jsp");
          rd.include(request,response);
        }
    }finally{
            out.close();
        }
}
}