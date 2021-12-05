package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class ElectionResult_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>VOTES GIVEN ARE:</title>\n");
      out.write("        <style>\n");
      out.write("            th {\n");
      out.write("                \n");
      out.write("                Color:#00FFF9;\n");
      out.write("                font-size: 23;\n");
      out.write("            }\n");
      out.write("            th, td {\n");
      out.write("                \n");
      out.write("                width:150px;\n");
      out.write("                text-align:center;\n");
      out.write("                border:1px solid black;\n");
      out.write("                padding:30px;\n");
      out.write("              \n");
      out.write("            }\n");
      out.write("            .table1{\n");
      out.write("              \n");
      out.write("                background-image: url(\"image/BJP.png\");\n");
      out.write("                background-repeat: no-repeat ;\n");
      out.write("                border: 1px solid black;\n");
      out.write("                background-size: 180px 150px;\n");
      out.write("                width:100%;\n");
      out.write("            }\n");
      out.write("             .table2{\n");
      out.write("                 background-image: url(\"image/AAP.jpg\");\n");
      out.write("                 background-repeat: no-repeat ;\n");
      out.write("                border: 1px solid black;\n");
      out.write("                  background-size: 180px 150px;\n");
      out.write("                width:100%;\n");
      out.write("            }\n");
      out.write("             .table3{\n");
      out.write("                 background-image: url(\"image/ss.jpeg\");\n");
      out.write("                 background-repeat: no-repeat ;\n");
      out.write("                border: 1px solid black;\n");
      out.write("                  background-size: 180px 150px;\n");
      out.write("                width:100%;\n");
      out.write("            }\n");
      out.write("             .table4{\n");
      out.write("                 background-image: url(\"image/CONGRESS.jpg\");\n");
      out.write("                 background-repeat: no-repeat ;\n");
      out.write("                border: 1px solid black;\n");
      out.write("                  background-size: 180px 150px;\n");
      out.write("                width:100%;\n");
      out.write("            }\n");
      out.write("             .table5{\n");
      out.write("                 background-image: url(\"image/nota.jpeg\");\n");
      out.write("                 background-repeat: no-repeat ;\n");
      out.write("                  border: 1px solid black;\n");
      out.write("                  background-size: 180px 150px;\n");
      out.write("                width:100%;\n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                background-color: lightsteelblue;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1></h1>\n");
      out.write("         <table class=\"table1\">\n");
      out.write("            <tr>\n");
      out.write("                <th>Bhartiya Janata Party</th>\n");
      out.write("                   \n");
      out.write("            </tr>\n");
      out.write("             \n");
      out.write("                  ");

                try {
                  Class.forName("com.mysql.jdbc.Driver").newInstance();
                  Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Voters","root","admin");
                  Statement stm= conn.createStatement();
                  ResultSet rs= stm.executeQuery("select count(*) from votes where PartyName='BJP'");
                  while(rs.next())
                  {
                      
      out.write("\n");
      out.write("                 <tr>     \n");
      out.write("                <td>");
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("  \n");
      out.write("                </tr>\n");
      out.write("                       ");

                  }
                } catch(Exception ex)  {
                 ex.printStackTrace();
                 }
                 
      out.write("\n");
      out.write("           \n");
      out.write("                 </table>\n");
      out.write("                 <table class='table2'>\n");
      out.write("            <tr>\n");
      out.write("                <th>Aam Admi Party</th>\n");
      out.write("                   \n");
      out.write("            </tr>\n");
      out.write("             \n");
      out.write("                  ");

                try {
                  Class.forName("com.mysql.jdbc.Driver").newInstance();
                  Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Voters","root","admin");
                  Statement stm= conn.createStatement();
                  ResultSet rs= stm.executeQuery("select count(*) from votes where PartyName='AAP'");
                  while(rs.next())
                  {
                      
      out.write("\n");
      out.write("                 <tr>     \n");
      out.write("                <td>");
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("  \n");
      out.write("                </tr>\n");
      out.write("                       ");

                  }
                } catch(Exception ex)  {
                 ex.printStackTrace();
                 }
                 
      out.write("\n");
      out.write("   \n");
      out.write("              </table>\n");
      out.write("                 <table class='table3'>\n");
      out.write("            <tr>\n");
      out.write("                <th>Shiv Sena</th>\n");
      out.write("                   \n");
      out.write("            </tr>\n");
      out.write("             \n");
      out.write("                  ");

                try {
                  Class.forName("com.mysql.jdbc.Driver").newInstance();
                  Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Voters","root","admin");
                  Statement stm= conn.createStatement();
                  ResultSet rs= stm.executeQuery("select count(*) from votes where PartyName='SHIV SENA'");
                  while(rs.next())
                  {
                      
      out.write("\n");
      out.write("                 <tr>     \n");
      out.write("                <td>");
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("  \n");
      out.write("                </tr>\n");
      out.write("                       ");

                  }
                } catch(Exception ex)  {
                 ex.printStackTrace();
                 }
                 
      out.write("\n");
      out.write("                 \n");
      out.write("                  </table>\n");
      out.write("                 <table class='table4'>\n");
      out.write("            <tr>\n");
      out.write("                <th>CONGRESS</th>\n");
      out.write("                   \n");
      out.write("            </tr>\n");
      out.write("             \n");
      out.write("                  ");

                try {
                  Class.forName("com.mysql.jdbc.Driver").newInstance();
                  Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Voters","root","admin");
                  Statement stm= conn.createStatement();
                  ResultSet rs= stm.executeQuery("select count(*) from votes where PartyName='CONGRESS'");
                  while(rs.next())
                  {
                      
      out.write("\n");
      out.write("                 <tr>     \n");
      out.write("                <td>");
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("  \n");
      out.write("                </tr>\n");
      out.write("                       ");

                  }
                } catch(Exception ex)  {
                 ex.printStackTrace();
                 }
                 
      out.write("\n");
      out.write("                 \n");
      out.write("                  </table>\n");
      out.write("                 <table class='table5'>\n");
      out.write("            <tr>\n");
      out.write("                <th>NOTA</th>\n");
      out.write("                   \n");
      out.write("            </tr>\n");
      out.write("             \n");
      out.write("                  ");

                try {
                  Class.forName("com.mysql.jdbc.Driver").newInstance();
                  Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Voters","root","admin");
                  Statement stm= conn.createStatement();
                  ResultSet rs= stm.executeQuery("select count(*) from votes where PartyName='NOTA'");
                  while(rs.next())
                  {
                      
      out.write("\n");
      out.write("                 <tr>     \n");
      out.write("                <td>");
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("  \n");
      out.write("                </tr>\n");
      out.write("                       ");

                  }
                } catch(Exception ex)  {
                 ex.printStackTrace();
                 }
                 
      out.write("\n");
      out.write("            </table>\n");
      out.write("    </body>\n");
      out.write("</html>   ");
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
