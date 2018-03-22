<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@page import="serv.Client"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Output</title>
    </head>
    <body>
        <h1>This is output table</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>Имя</th>
                    <th>Фамилия</th>
                    <th>Адрес</th>
                </tr>
            </thead>
            <tbody>
                <% List<Client> clients = (List<Client>) request.getAttribute("clients");
                for (Client client:clients){%>
                <tr>
                    <td><%=client.getFname()%></td>
                    <td><%=client.getLname()%></td>
                    <td><%=client.getAddress()%></td>
                </tr>
                <%}%>
            </tbody>
        </table>

    </body>
</html>
