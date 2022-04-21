<%-- 
    Document   : insert
    Created on : 20 Apr, 2022, 11:34:54 AM
    Author     : sachin
--%>
 
<%@page import="dataconnect.DBConfig"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
boolean ispostback=(request.getParameter("check")==null)?false:true;
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
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert</title>
    </head>
    
    <body>
        <h1>Create a Bank Account</h1>
        <h2><%=result%></h2>
        <form>
            <input type="hidden" name="check">
            Account No <input type="number" name="accountno" value="<%=accountno%>">
            <br>
            Account Holder Name<input type="text" name="accountholdername" value="<%=accountholder%>">
            <br>
            Balance<input type="number" name="balance" value="<%=balance%>">
            <br>
            <input type="submit" value="Insert">
        </form>
    </body>
</html>
 