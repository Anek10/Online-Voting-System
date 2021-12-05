package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class CandidateView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("   \n");
      out.write("    \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>VOTES GIVEN ARE:</title>\n");
      out.write("        <style>\n");
      out.write("            .table1{\n");
      out.write("                border: 1px solid black;\n");
      out.write("                width:100%;\n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                background-color: blue;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>THE CANDIDATES ARE:</h1>\n");
      out.write("         <table class=\"table1\">\n");
      out.write("            <tr>\n");
      out.write("                <th>First Name</th>\n");
      out.write("                <th>Last Name</th>\n");
      out.write("                <th>Mobile No</th>\n");
      out.write("                <th>Email Id</th>\n");
      out.write("                <th>Party Name</th>\n");
      out.write("            </tr>\n");
      out.write("             \n");
      out.write("                  ");

                try {
                  Class.forName("com.mysql.jdbc.Driver").newInstance();
                  Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Voters","root","admin");
                  Statement stm= conn.createStatement();
                  ResultSet rs= stm.executeQuery("select * from candidate");
                  while(rs.next())
                  {
                      
      out.write("\n");
      out.write("                 <tr>     \n");
      out.write("                <td>");
      out.print(rs.getString("FirstName"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("LastName"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("MobileNo"));
      out.write("</td>   \n");
      out.write("                <td>");
      out.print(rs.getString("EmailId"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("PartyName"));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                       ");

                  }
                } catch(Exception ex)  {
                 ex.printStackTrace();
                 }
                 
      out.write("\n");
      out.write("           \n");
      out.write("   \n");
      out.write("       \n");
      out.write("            </table>\n");
      out.write("       </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<!--create table candidate (FirstName varchar(20),LastName varchar(20),MobileNo varchar(10),EmailId varchar(20),PartyName varchar(50))\n");
      out.write("    insert into candidate values('Narendra','Modi','345678964','modi@gmail.com','Bhartiya Janata party')\n");
      out.write("    insert into candidate values('Arvind','Kejriwal','4567839256','kerriwal@gmail.com','Aam Aadmi Party')\n");
      out.write("    insert into candidate values('Rahul','Gandhi','9987356284','gandhi@gmail.com','Indian National Congress')\n");
      out.write("    insert into candidate values('Uddhav','Thackery','8567459348','thackery@gmail.com','Shiv Sena')-->");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
