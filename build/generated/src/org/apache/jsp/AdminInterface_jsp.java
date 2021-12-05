package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminInterface_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>ADMIN INTERFACE</title>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-color: purple;\n");
      out.write("                  \n");
      out.write("            }\n");
      out.write("            h1{\n");
      out.write("                text-align: center;\n");
      out.write("                color:greenyellow;\n");
      out.write("            } \n");
      out.write("            .button{\n");
      out.write("                padding: 15px 32px;\n");
      out.write("                text-align: center;\n");
      out.write("                background-color: #4CAF50;\n");
      out.write("                color:white;\n");
      out.write("                border:none;\n");
      out.write("                display: inline-block;\n");
      out.write("                font-size: 16px;\n");
      out.write("                border-radius: 4px; \n");
      out.write("                border:2px solid;\n");
      out.write("                margin-left: 350px;\n");
      out.write("                margin-top: 50px;\n");
      out.write("               \n");
      out.write("            }\n");
      out.write("            .button1{\n");
      out.write("                padding: 15px 32px;\n");
      out.write("                text-align: center;\n");
      out.write("                background-color: #4CAF50;\n");
      out.write("                color:white;\n");
      out.write("                border:none;\n");
      out.write("                display: inline-block;\n");
      out.write("                font-size: 16px;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                border: 2px solid;\n");
      out.write("                margin-left:350px;\n");
      out.write("                margin-top: 50px;\n");
      out.write("            }\n");
      out.write("                .button2{\n");
      out.write("                padding: 15px 32px;\n");
      out.write("                text-align: center;\n");
      out.write("                background-color: #4CAF50;\n");
      out.write("                color:white;\n");
      out.write("                border:none;\n");
      out.write("                display: inline-block;\n");
      out.write("                font-size: 16px;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                border: 2px solid;\n");
      out.write("                margin-left:350px;\n");
      out.write("                margin-top: 50px;\n");
      out.write("            }\n");
      out.write("            .log{\n");
      out.write("                color: red;\n");
      out.write("              \n");
      out.write("                margin:1000px 350px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("\n");
      out.write("            </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>SUCCESSFUL LOGIN</h1>\n");
      out.write("         <a href=\"CandidateView.jsp\" target=\"_blank\" class=\"button\"> View Candidates</a>\n");
      out.write("         <a href=\"Votesgiven.jsp\" target=\"_blank\"  class=\"button1\"> View Election Votes</a>\n");
      out.write("         <a href=\"ElectionResult.jsp\" target=\"_blank\" class=\"button2\">Election Result</a>\n");
      out.write("         <a href=\"index.jsp\" class=\"log\">LOGOUT</a>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
