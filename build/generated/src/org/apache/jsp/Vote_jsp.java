package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Vote_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Voting Page</title>\n");
      out.write("        <style>\n");
      out.write("            h2 {\n");
      out.write("                color: red;\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 45px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            body {\n");
      out.write("                background-color: pink ;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("             input[type=submit]{font-size: 30px;\n");
      out.write("                     background-color: greenyellow;\n");
      out.write("                     border: 1px solid;\n");
      out.write("                     padding: 10px 5px;\n");
      out.write("                     margin-left: 500px;\n");
      out.write("                 }\n");
      out.write("                p {  color:blue;\n");
      out.write("                     text-align: center;\n");
      out.write("                     font-size: 20px;\n");
      out.write("                     \n");
      out.write("                 }\n");
      out.write("             .vertical-center {\n");
      out.write("  \n");
      out.write("               text-align: center;\n");
      out.write("               border: 5px blue;\n");
      out.write(" \n");
      out.write("               margin-left: -500px;\n");
      out.write(" \n");
      out.write("                      }\n");
      out.write("    </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h2>LOGIN SUCCESSFUL !</h2>\n");
      out.write("        <form id=\"form\" method=\"Post\" action=\"Result\">\n");
      out.write("          \n");
      out.write("            \n");
      out.write("<h2>Select your Party and candidate to vote</h2>\n");
      out.write("<p><input type=\"radio\" name=\"candidate\"  value=\"BJP\" /> BJP</p>\n");
      out.write("<p><input type=\"radio\" name=\"candidate\" value=\"AAP\"/>AAP</p>\n");
      out.write("<p><input type=\"radio\" name=\"candidate\" value=\"CONGRESS\"/> CONGRESS</p>\n");
      out.write("<p><input type=\"radio\" name=\"candidate\" value=\"SHIV SENA\"/> SHIV SENA</p>\n");
      out.write("<p><input type=\"radio\" name=\"candidate\" value=\"NOTA\"/> NOTA</p>\n");
      out.write("\n");
      out.write(" <div class=\"vertical-center\">\n");
      out.write("<input type=\"submit\" value=\"Submit\" onclick=\"this.value='Submitting!';this.disabled='disabled'; this.form.submit();demo();\" >\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("function demo() {\n");
      out.write("alert (\"you have successfully placed your vote once!\");\n");
      out.write("\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("        \n");
      out.write("     ");


response.setHeader("Cache-Control","no-cache");
response.setHeader("Cache-Control","no-store");
response.setHeader("Pragma","no-cache");



      out.write("\n");
      out.write("<script>\n");
      out.write("    history.forward();\n");
      out.write("</script>\n");
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
