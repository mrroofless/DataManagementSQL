<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="serv.Client"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Output</title>
    </head>
    <body>
        <c:set var="count" scope="session" value="1" />
        <c:if test="${count == 1}">
            Это ваше первое посещение страницы!
        </c:if>
            <x:parse xml="${xmldoc}" var="output"/>
        <h1>Список клиентов</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>Имя</th>
                    <th>Фамилия</th>
                    <th>Адрес</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                <x:forEach items="${requestScope.clients}" var="client">
                    
                       <td> <x:out value="${client.fname}" default="NO DATA"/> </td>
                       <td> <x:out value="${client.lname}" default="NO DATA"/></td>
                       <td> <x:out value="${client.address}" default="NO DATA"/></td>
                    </tr>
                </x:forEach>
            </tbody>
        </table>
        <h2> Повторный ввод данных: <h2/>
        <c:import url="input.jsp" />
        
        <c:url value="http://www.vlsu.ru" var="myUrl">
        </c:url>
<a href='<c:out value="${myUrl}"/>'>На домашнюю<a/>

    </body>
</html>
