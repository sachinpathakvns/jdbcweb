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
//out.print(ispostback);
String accountno="",accountholder="",balance="",result="Create your  account";
if(ispostback)
{
    try
    {
    accountno=request.getParameter("accountno");
    accountholder=request.getParameter("accountholdername");
    balance=request.getParameter("balance");
    PreparedStatement statement=DBConfig.connect().prepareStatement("insert into accounts values(?,?,?)");
    statement.setString(1, accountno);
    statement.setString(2, accountholder);
    statement.setString(3, balance);
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Insert</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <h1>Create a Bank Account</h1>\n");
      out.write("        <h2>");
      out.print(result);
      out.write("</h2>\n");
      out.write("        <form>\n");
      out.write("            <input type=\"hidden\" name=\"check\">\n");
      out.write("            Account No <input type=\"number\" name=\"accountno\" value=\"");
      out.print(accountno);
      out.write("\">\n");
      out.write("            <br>\n");
      out.write("            Account Holder Name<input type=\"text\" name=\"accountholdername\" value=\"");
      out.print(accountholder);
      out.write("\">\n");
      out.write("            <br>\n");
      out.write("            Balance<input type=\"number\" name=\"balance\" value=\"");
      out.print(balance);
      out.write("\">\n");
      out.write("            <br>\n");
      out.write("            <input type=\"submit\" value=\"Insert\">\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write(" ");
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
