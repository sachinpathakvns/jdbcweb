
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
<!DOCTYPE html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <!-- Bootstrap CSS -->
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
      crossorigin="anonymous"
    />
    <title>Document</title>
    <style>
      text {
        font-size: 20px;
      }
      body {
        box-sizing: border-box;
        margin: 0;
        padding: 0;
        background-color: rgb(127, 202, 224);
      }
      div {
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
      }
      form {
        background-color: rgb(82, 172, 192);
        width: 400px;
        border-radius: 30px;
        padding: 40px 60px;
        box-shadow: 0 10px 25px rgba(34, 103, 164, 0.2);
      }
      input {
        padding: 2px;
        top: -7px;
        left: 3px;
        z-index: 10;
        font-size: 14px;
        font-weight: 600;
      }
      label {
        position: absolute;
        top: 15px;
        left: 15px;
        padding: 0 4px;
        background-color: rgb(90, 12, 12);
        color: rgb(20, 83, 83);
        font-size: 16px;
        transition: 0.5s;
        z-index: 0;
      }
    </style>
  </head>
  <body>
    <div class="container-fluid">
      <div class="row">
        <div class="col-md-12"></div>
      </div>

      <div class="row">
        <div class="col-md-6">
          <form>
            <input type="hidden" name="check" />
            rollno<input type="number" name="rollno" value="<%=rollno%>" />
            <br />
            Name<input type="text" name="name" value="" />
            <br />
            physics<input type="number" name="math" value="<%=physics%>" />
            <br />
            Chemistry<input type="number" name="math" value="<%=chemistry%>" />
            <br />
            Math<input type="number" name="math" value="<%=math%>" />
            <br />
            <input type="submit" value="Insert" />
          </form>
        </div>
        <div class="col-md-6"></div>
      </div>
    </div>

    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
      crossorigin="anonymous"
    ></script>
  </body>
</html>

 