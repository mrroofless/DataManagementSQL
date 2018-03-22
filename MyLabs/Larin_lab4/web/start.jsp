<%-- 
    Document   : start
    Created on : 23.03.2012, 12:11:33
    Author     : stu-ist109
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>Заказ микроосхем</title>
        </head>
        <body>
            <h:form>
          <br>
                <h1><h:outputText value="Заказ микроосхем"/></h1>
                <br>
                <h2>

                   Введите маркировку:
                    <h:inputText id="marking" value="#{ManagedBeanRequest.marking}" size="15">
                    </h:inputText>
                    <br>


                    Введите количество микросхем:
                    <h:inputText id="number" value="#{ManagedBeanRequest.number}" size="10">
                        <f:validateLongRange maximum="100000000000" minimum="1">
                            <h:message for="numder">
                                Введите число корректно!
                            </h:message>
                        </f:validateLongRange>
                    </h:inputText>

                    <br>
                    <h:message for="number" errorClass="">
                    Введите число корректно!
                    </h:message>

                    <h:commandButton type="Submit" value="Посчитать" action="#{ManagedBeanRequest.Count}"/>
                </h3>
            </h:form>
        </body>
    </html>
</f:view>
