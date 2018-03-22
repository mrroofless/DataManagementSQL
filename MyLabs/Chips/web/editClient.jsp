<%-- 
    Document   : editClient
    Created on : 11.03.2012, 12:39:47
    Author     : stu-ist109
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
<form action="editClient.jsp" method="POST">
</form>
<body>
        <form name="input" method="post" action="UIController">
            id_chip <input name="id_chip" type="text"><br>
            marking <input name="marking" type="text"><br>
            digit_capacity <input name="digit_capacity" type="text"><br>
            capacity <input name="capacity" type="text"><br>
            date_of_output <input name="date_of_output" type="text"><br>
            access_time <input name="access_time" type="text"><br>
            popular <input name="popular" type="text"><br>
            cost <input name="cost" type="text"><br>

            <input type="submit" value="Отправить">
        </form>
    </body>
