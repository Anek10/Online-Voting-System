package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Votesgiven_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("  \n");
      out.write("    \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>CANDIDATE VIEW</title>\n");
      out.write("        <style>\n");
      out.write("            .table1{\n");
      out.write("                border: 1px solid black;\n");
      out.write("                width:100%;\n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                background-color: purple;\n");
      out.write("            }\n");
      out.write("              th {\n");
      out.write("                \n");
      out.write("                width:150px;\n");
      out.write("                text-align:center;\n");
      out.write("                border:1px solid black;\n");
      out.write("                color: red;\n");
      out.write("                padding:30px\n");
      out.write("              \n");
      out.write("            }\n");
      out.write("               td {\n");
      out.write("                \n");
      out.write("                width:150px;\n");
      out.write("                text-align:center;\n");
      out.write("                border:1px solid black;\n");
      out.write("                color: #ADEF07;\n");
      out.write("                padding:30px\n");
      out.write("              \n");
      out.write("            }\n");
      out.write("            h1 {\n");
      out.write("                color:#F2BB12;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>THE Votes GIVEN ARE:</h1>\n");
      out.write("         <table class=\"table1\">\n");
      out.write("            <tr>\n");
      out.write("                <th>PARTY NAME</TH>\n");
      out.write("            </tr>\n");
      out.write("             \n");
      out.write("                  ");

                try {
                  Class.forName("com.mysql.jdbc.Driver").newInstance();
                  Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Voters","root","admin");
                  Statement stm= conn.createStatement();
                  ResultSet rs= stm.executeQuery("select * from votes");
                  while(rs.next())
                  {
                      
      out.write("\n");
      out.write("                 <tr>     \n");
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
      out.write("</html>");
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
