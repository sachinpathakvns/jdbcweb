package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dataconnect.DBConfig;
import java.sql.PreparedStatement;

public final class insert_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
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
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

boolean ispostback=(request.getParameter("check")==null)?false:true;
String rollno="",name="",physics="",chemistry="",math="",result="Create your  account";
if(ispostback)
{
    try
    {
    rollno=request.getParameter("rollno");
    name=request.getParameter("name");
    physics=request.getParameter("physics");
    chemistry=request.getParameter("chemistry");
    math =request.getParameter("math ");
    PreparedStatement statement=DBConfig.connect().prepareStatement("insert into student values(?,?,?,?,?)");
    statement.setString(1, rollno);
    statement.setString(2, name);
    statement.setString(3, physics);
    statement.setString(4, chemistry);
    statement.setString(5, math);
    statement.executeUpdate();
    result="Successfull";
    }
    catch(Exception ex)
    {
        System.out.println(ex);
        result=ex.getMessage();
    }
}

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <style>\n");
      out.write("      nav {\n");
      out.write("        font-size: 24px;\n");
      out.write("      }\n");
      out.write("    </style>\n");
      out.write("    <!-- Required meta tags -->\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link\n");
      out.write("      href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\"\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\"\n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("    />\n");
      out.write("    <title>Document</title>\n");
      out.write("    <style>\n");
      out.write("      text {\n");
      out.write("        font-size: 20px;\n");
      out.write("      }\n");
      out.write("      body {\n");
      out.write("        box-sizing: border-box;\n");
      out.write("        margin: 0;\n");
      out.write("        padding: 0;\n");
      out.write("        background-color: rgb(127, 202, 224);\n");
      out.write("      }\n");
      out.write("      div {\n");
      out.write("        display: flex;\n");
      out.write("        justify-content: center;\n");
      out.write("        align-items: center;\n");
      out.write("        height: 100vh;\n");
      out.write("      }\n");
      out.write("      form {\n");
      out.write("        background-color: rgb(82, 172, 192);\n");
      out.write("        width: 400px;\n");
      out.write("        border-radius: 30px;\n");
      out.write("        padding: 40px 60px;\n");
      out.write("        box-shadow: 0 10px 25px rgba(34, 103, 164, 0.2);\n");
      out.write("      }\n");
      out.write("      input {\n");
      out.write("        padding: 2px;\n");
      out.write("        top: -7px;\n");
      out.write("        left: 3px;\n");
      out.write("        z-index: 10;\n");
      out.write("        font-size: 14px;\n");
      out.write("        font-weight: 600;\n");
      out.write("      }\n");
      out.write("      label {\n");
      out.write("        position: absolute;\n");
      out.write("        top: 15px;\n");
      out.write("        left: 15px;\n");
      out.write("        padding: 0 4px;\n");
      out.write("        background-color: rgb(90, 12, 12);\n");
      out.write("        color: rgb(20, 83, 83);\n");
      out.write("        font-size: 16px;\n");
      out.write("        transition: 0.5s;\n");
      out.write("        z-index: 0;\n");
      out.write("      }\n");
      out.write("    </style>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-12\">Menu</div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-6\">\n");
      out.write("          <form>\n");
      out.write("            <input type=\"hidden\" name=\"check\" />\n");
      out.write("            rollno<input type=\"number\" name=\"rollno\" value=\"");
      out.print(rollno);
      out.write("\" />\n");
      out.write("            <br />\n");
      out.write("            Name<input type=\"text\" name=\"name\" value=\"\" />\n");
      out.write("            <br />\n");
      out.write("            physics<input type=\"number\" name=\"math\" value=\"");
      out.print(physics);
      out.write("\" />\n");
      out.write("            <br />\n");
      out.write("            Chemistry<input type=\"number\" name=\"math\" value=\"");
      out.print(chemistry);
      out.write("\" />\n");
      out.write("            <br />\n");
      out.write("            Math<input type=\"number\" name=\"math\" value=\"");
      out.print(math);
      out.write("\" />\n");
      out.write("            <br />\n");
      out.write("            <input type=\"submit\" value=\"Insert\" />\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-6\"></div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script\n");
      out.write("      src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\"\n");
      out.write("      integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\"\n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("    ></script>\n");
      out.write("  </body>\n");
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
