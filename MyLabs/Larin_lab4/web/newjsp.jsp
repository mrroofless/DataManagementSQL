<%-- 
    Document   : newjsp
    Created on : 23.03.2012, 12:10:31
    Author     : stu-ist109
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Результат</title>
    </head>
        <f:view>
    <h:form>
       <body>
        <h1>
            Микросхема = <h:outputText value="#{ManagedBeanRequest.marking}"/>
            <br>
            Количество = <h:outputText value="#{ManagedBeanRequest.number}"/>
            <br>
            Дата = <h:outputText value="#{ManagedBeanRequest.date_of_output}"/>
            <br>
            Итог = <h:outputText value="#{ManagedBeanRequest.result}"/> рублей
             <br>
             Запрос № <h:outputText value="#{ManagedBeanSession.counter}"/>
        </h1>
    </body>
    <h:commandButton type="Submit" value="Заново" action="once more"/>
    </h:form>

    </f:view>

</html>
