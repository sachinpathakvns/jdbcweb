<%@include file="header.jsp" %>
    <title>Hello, world!</title>
  </head>
  <body>
      <div class="container-fluid">
          <%@include file="menu.jsp" %>
          
      </div>
          
          <div class="row">
              <div class="col-md-12">
                
     <%@page import="java.sql.ResultSet"%>
<%@page import="dataconnect.DBConfig"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
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
%>
 <div class="jdbcformdiv">
                  
             <form class="jdbc">
                 <h1>SELECT</h1>
            <input type="hidden" name="check" />
            <input type="number" name="rollno" value="<%=rollno%>" placeholder="rollno"/>
            <br />
            <input type="text" name="name" value="<%=name%>" placeholder="Name"/>
            <br />
            <input type="number" name="math" value="<%=physics%>" placeholder="physics"/>
            <br />
            <input type="number" name="math" value="<%=chemistry%>" placeholder="Chemistry"/>
            <br />
            <input type="number" name="math" value="<%=math%>" placeholder="Math"/>
            <br />
            <input type="number" name="math" value="<%=math%>" placeholder="Total"/>
            <input type="submit" value="get" />
          </form>
 </div>
                  
                  
                  
                  
              </div>
              
          </div>
    `
    <%@include file="footer.jsp"%>