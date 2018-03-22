<%-- 
    Document   : login
    Created on : 20.04.2012, 15:08:12
    Author     : stu-ist109
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Enter system</title>
    </head>
    <body>
        <form name="input" method="post" action="UIController">
            Login <input name="login" type="text"><br>
            Password <input name="password" type="password"><br>
            <input type="submit" value="Enter">
        </form>
    </body>
</html>