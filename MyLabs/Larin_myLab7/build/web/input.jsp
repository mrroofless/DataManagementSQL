<%-- 
    Document   : input
    Created on : 11.03.2012, 12:12:13
    Author     : stu-ist109
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Input Client</title>
    </head>
    <body>
        <form name="input" method="post" action="UIController">
            Имя клиента <input name="fname" type="text"><br>
            Фамилия клиента <input name="lname" type="text"><br>
            Адрес клиента <input name="address" type="text"><br>
            <input type="submit" value="Отправить">
        </form>
    </body>
</html>
