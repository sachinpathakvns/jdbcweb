package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import dataconnect.DBConfig;
import java.sql.PreparedStatement;

public final class newselect_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/menu.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

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

      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("      <style>\n");
      out.write("        body {\n");
      out.write("        box-sizing: border-box;\n");
      out.write("        margin: 0;\n");
      out.write("        padding: 0;\n");
      out.write("        background-color:  blue;\n");
      out.write("             } \n");
      out.write("       .jdbcinput{\n");
      out.write("        top: -7px;\n");
      out.write("        left: 3px;\n");
      out.write("        z-index: 10;\n");
      out.write("        font-size: 14px;\n");
      out.write("        font-weight: 600;\n");
      out.write("        color: purple;\n");
      out.write("          }\n");
      out.write("          .jdbcformdiv {\n");
      out.write("        display: flex;\n");
      out.write("        justify-content: center;\n");
      out.write("        align-items: center;\n");
      out.write("        height: 100vh;\n");
      out.write("      }\n");
      out.write("         .jdbc{\n");
      out.write("        background-color: rgb(82, 172, 192);\n");
      out.write("        width: 400px;\n");
      out.write("        border-radius: 30px;\n");
      out.write("        padding: 40px 60px;\n");
      out.write("        box-shadow: 0 10px 25px rgba(34, 103, 164, 0.2);\n");
      out.write("      }\n");
      out.write("      body {\n");
      out.write("        box-sizing: border-box;\n");
      out.write("        margin: 0;\n");
      out.write("        padding: 0;\n");
      out.write("        background-color: rgb(127, 202, 224);\n");
      out.write("      }\n");
      out.write("      </style>\n");
      out.write("    <!-- Required meta tags -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
      out.write("   ");
      out.write("\n");
      out.write("    <title>Hello, world!</title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("      <div class=\"container-fluid\">\n");
      out.write("          ");
      out.write("          <div class=\"row\">\n");
      out.write("              \n");
      out.write("              <div class=\"col-md-12\">\n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark \">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <a class=\"navbar-brand\" href=\"#\">Navbar</a>\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("      <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link active\" aria-current=\"page\" href=\"#\">Home</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"newinsert.jsp\">Insert</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"newdelete.jsp\">Delete</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"newselect.jsp\">Select</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"newupdate.jsp\">Update</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item dropdown\">\n");
      out.write("          <a class=\"nav-link dropdown-toggle\" href=\"\" id=\"navbarDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("            Dropdown\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"#\">Action</a></li>\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"#\">Another action</a></li>\n");
      out.write("            <li><hr class=\"dropdown-divider\"></li>\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"#\">Something else here</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link disabled\" href=\"#\" tabindex=\"-1\" aria-disabled=\"true\">Disabled</a>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("      <form class=\"d-flex\">\n");
      out.write("        <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("        <button class=\"btn btn-outline-success\" type=\"submit\">Search</button>\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("              </div>\n");
      out.write("          </div>");
      out.write("\n");
      out.write("          \n");
      out.write("      </div>\n");
      out.write("          \n");
      out.write("          <div class=\"row\">\n");
      out.write("              <div class=\"col-md-12\">\n");
      out.write("                \n");
      out.write("     \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

boolean ispostback=(request.getParameter("check")==null)?false:true;
String rollno="",name="",physics="",chemistry="",math ="",result="Your Data";
if(ispostback)
{
    try
    {
    rollno=request.getParameter("rollno");
    name=request.getParameter("name");
    physics=request.getParameter("physics");
    chemistry=request.getParameter("chemistry");
    math =request.getParameter("math ");
    PreparedStatement statement=DBConfig.connect().prepareStatement("select * from  student where rollno=?");
    statement.setString(1, rollno);
   ResultSet rs= statement.executeQuery();
   if(rs.next())
   {
       name="" + rs.getObject("name");
       physics="" + rs.getObject("physics");
       chemistry="" + rs.getObject("chemistry");
       math ="" + rs.getObject("math");
       result="Found";
   }
   else
   {
    result="Not found";
   }
    }
    catch(Exception ex)
    {
        System.out.println(ex);
        result=ex.getMessage();
    }
}

      out.write("\n");
      out.write(" <div class=\"jdbcformdiv\">\n");
      out.write("                  <h1>SELECT</h1>\n");
      out.write("             <form class=\"jdbc\">\n");
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
      out.write(" </div>\n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("              </div>\n");
      out.write("              \n");
      out.write("          </div>\n");
      out.write("    `\n");
      out.write("    ");
      out.write(" <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <!-- Option 2: Separate Popper and Bootstrap JS -->\n");
      out.write("    <!\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\" integrity=\"sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js\" integrity=\"sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF\" crossorigin=\"anonymous\"></script>\n");
      out.write("    -->\n");
      out.write("  </body>\n");
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
