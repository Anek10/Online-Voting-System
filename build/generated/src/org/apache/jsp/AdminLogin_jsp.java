package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin Login Page</title>\n");
      out.write("        <style>\n");
      out.write("             body {\n");
      out.write("                background-image:url(\"image/lion.png\");\n");
      out.write("                background-size: 1000px 700px;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-color: gray;\n");
      out.write("                 }\n");
      out.write("            form{\n");
      out.write("                 text-align: center;\n");
      out.write("                 margin-top: 23%;\n");
      out.write("                 margin-left: 20%;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                padding: 20px;\n");
      out.write("                color: limegreen;\n");
      out.write("            }\n");
      out.write("             input[type=submit]{\n");
      out.write("                     background-color:greenyellow;\n");
      out.write("                     border: 1px solid;\n");
      out.write("                     margin: 4px 6px;\n");
      out.write("                     padding: 5px 5px;\n");
      out.write("                     \n");
      out.write("                 }\n");
      out.write("                 input[type=text] {\n");
      out.write("                     border: 2px solid;\n");
      out.write("                     color: lime;\n");
      out.write("                 }\n");
      out.write("                 input[type=password] {\n");
      out.write("                     border: 2px solid;\n");
      out.write("                     color: lime;\n");
      out.write("                 }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form method=\"post\" action=\"AdminCheck\">\n");
      out.write("            Name:<input type=\"text\" name=\"user\"/><br><br>\n");
      out.write("            Password:<input type=\"password\" name=\"pass\"><br><br>\n");
      out.write("            <input type=\"submit\" value=\"ADMIN LOGIN\">\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("    \n");
      out.write("    </body>\n");
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
