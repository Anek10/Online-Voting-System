package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>REGISTRATION Page</title>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-color: blue;\n");
      out.write("                background-image:url(\"image/register.png\");\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-size: 1500px 700px;\n");
      out.write("            }\n");
      out.write("           form{\n");
      out.write("              text-align:center;\n");
      out.write("              color:greenyellow;\n");
      out.write("              margin-top: 10%;\n");
      out.write("            }\n");
      out.write("          \n");
      out.write("          input{\n");
      out.write("              border-radius: 5px;\n");
      out.write("              border: 2px solid;\n");
      out.write("              color:blue;\n");
      out.write("              text-align: center;\n");
      out.write("          }\n");
      out.write("    </style>\n");
      out.write("    <script>\n");
      out.write("        function validate()\n");
      out.write("        {\n");
      out.write("        var FirstName = document.form.fname.value;\n");
      out.write("        var LastName = document.form.lname.value;\n");
      out.write("        var MobileNo= document.form.mobile.value;\n");
      out.write("        var Email = document.form.email.value;\n");
      out.write("        var Gender = document.form.gender.value; \n");
      out.write("        var DOB = document.form.dob.value;\n");
      out.write("        var VoterId= document.form.card.value;;\n");
      out.write("        \n");
      out.write("        \n");
      out.write("           if (FirstName==null || FirstName==\"\")\n");
      out.write("             { \n");
      out.write("              alert(\"First Name can't be blank\"); \n");
      out.write("              return false; \n");
      out.write("              }\n");
      out.write("           else if (LastName==null || LastName==\"\")\n");
      out.write("             { \n");
      out.write("           alert(\" Last Name can't be blank\"); \n");
      out.write("              return false;\n");
      out.write("              }\n");
      out.write("           else if (MobileNo==null || MobileNo==\"\")\n");
      out.write("             { \n");
      out.write("           alert(\"Mobile Number can't be blank\"); \n");
      out.write("           return false; \n");
      out.write("              }\n");
      out.write("           else if (Email==null || Email==\"\")\n");
      out.write("             { \n");
      out.write("           alert(\"Email can't be blank\"); \n");
      out.write("           return false; \n");
      out.write("              }\n");
      out.write("           else if (DOB==null || DOB==\"\")\n");
      out.write("             { \n");
      out.write("           alert(\"Date Of Birth can't be blank\"); \n");
      out.write("           return false; \n");
      out.write("              }\n");
      out.write("             else if (VoterId==null || VoterId==\"\")\n");
      out.write("             { \n");
      out.write("           alert(\"Voter Card Number can't be blank\"); \n");
      out.write("           return false; \n");
      out.write("              }\n");
      out.write("          \n");
      out.write("        \n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <form name=\"form\" method=\"post\" action=\"RegVoters\" onsubmit=\"return validate()\" >\n");
      out.write("         First Name:<input type=\"text\" name=\"fname\"><br><br>\n");
      out.write("         Last Name:<input type=\"text\" name=\"lname\"><br><br>\n");
      out.write("         Mobile Number:<input type=\"text\"  name=\"mobile\" ><br><br>\n");
      out.write("         E-Mail:<input type=\"text\" name=\"email\"><br><br>\n");
      out.write("         Gender:\n");
      out.write("         <input type=\"radio\"  name=\"gender\" value=\"Male\"/> Male\n");
      out.write("         <input type=\"radio\" name=\"gender\" value=\"Female\"/>Female\n");
      out.write("          <input type=\"radio\" name=\"gender\" value=\"Other\"/>Other<br><br>\n");
      out.write("                \n");
      out.write("          DOB:<input type=\"date\" name=\"dob\" >\n");
      out.write("         in format of YYYY-MM-DD<br><br>\n");
      out.write("         Voter Card Number:<input type=\"text\" name=\"card\"><br><br>\n");
      out.write("         \n");
      out.write("         <input type=\"submit\" value=\"REGISTER\">\n");
      out.write("         </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("<!--mysql> create table register1(FirstName varchar(20) not null,LastName varchar(20) not null,MobileNo varchar(45) not null,Email varchar(20) not null,\n");
      out.write("Gender varchar(6) not null ,DateOfBirth date not null,VoterCardNo varchar(10) not null);-->\n");
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
