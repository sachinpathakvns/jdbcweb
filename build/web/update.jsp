
<%@page import="dataconnect.DBConfig"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
boolean ispostback=(request.getParameter("check")==null)?false:true;
String accountno="",accountholder="",balance="",result="Update your account";
if(ispostback)
{
    try
    {
    accountno=request.getParameter("accountno");
    accountholder=request.getParameter("accountholdername");
    balance=request.getParameter("balance");
    PreparedStatement statement=DBConfig.connect().prepareStatement("Update accounts set accountholdername=?,accountbalance=? where accountno=?");
    statement.setString(1, accountholder);
    statement.setString(2, balance);
    statement.setString(3, accountno);
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
        <title>Update</title>
    </head>
    <body>
        <h1>update your account</h1>
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
 