
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Result of countning</title>
    </head>
    <f:view>
    <h:form>
       <body>
        <h1>
            Итого: <h:outputText value="#{ManagedBeanRequest.result}"/> руб.
             <br>
             Подсчет № <h:outputText value="#{ManagedBeanSession.op_counter}"/>
        </h1>
    </body>
    <h:commandButton type="Submit" value="Пересчитать" action="once more"/>
    </h:form>

    </f:view>
    
</html>
