<%@include file="header.jsp" %>
    <title>Hello, world!</title>
  </head>
  <body>
      <div class="container-fluid">
          <%@include file="menu.jsp" %>
          
      </div>
          
          <div class="row">
              <div class="col-md-12">
                
 
<%@page import="dataconnect.DBConfig"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
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
    PreparedStatement statement=DBConfig.connect().prepareStatement("delete from student where rollno=?");
    statement.setString(1, rollno);
    statement.executeUpdate();
    result="Successfull";
    }
    catch(Exception ex)
    {
        System.out.println(ex);
        result=ex.getMessage();
    }
}
%>
                   <div class="jdbcformdiv">
                  
             <form class="jdbc">
                  <h1>DELETE</h1>
            <input type="hidden" name="check" />
            <input type="number" name="rollno" value="<%=rollno%>" placeholder="rollno"/>
            <br />
            <input type="submit" value="get" />
          </form>
          </div>
              </div>
              
          </div>
    `
    <%@include file="footer.jsp" %>