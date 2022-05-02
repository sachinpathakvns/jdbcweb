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
String rollno="",name="",physics="",chemistry="",math="",result="Update your  account";
if(ispostback)
{
    try
     {
    rollno=request.getParameter("rollno");
    name=request.getParameter("name");
    physics=request.getParameter("physics");
    chemistry=request.getParameter("chemistry");
    math =request.getParameter("math");
    PreparedStatement statement=DBConfig.connect().prepareStatement("update student set name=?,physics=?,chemistry=?,math=? where rollno=?");
    statement.setString(1, name);
    statement.setString(2, physics);
    statement.setString(3, chemistry);
    statement.setString(4, math);
    statement.setString(5, rollno);
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
               <h1>UPDATE</h1>
            <input type="hidden" name="check" />
            <input type="number" name="rollno" value="<%=rollno%>" placeholder="rollno"/>
            <br />
            <input type="text" name="name" value="<%=name%>" placeholder="Name" />
            <br />
            <input type="number" name="physics" value="<%=physics%>" placeholder="physics" />
            <br />
            <input type="number" name="chemistry" value="<%=chemistry%>" placeholder="Chemistry"/>
            <br />
            <input type="number" name="math" value="<%=math%>" placeholder="Math"/>
            <br />
            <input type="submit" value="Get" />
          </form>
 </div>
                  
                  
                  
                  
              </div>
              
          </div>
    `
    <%@include file="footer.jsp" %>