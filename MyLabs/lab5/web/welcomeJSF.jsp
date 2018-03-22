<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>Dollar to Rub</title>
        </head>
        <body>
            <h:form>
            <h1><h:outputText value="Перевод денег"/></h1>
            <br>
            <h3>
                Курс доллара США:
                <h:inputText value="#{ManagedBeanRequest.rub}" size="1">
                     <f:validateLongRange maximum="1000" minimum="0">
                         <h:message for="rub">
                             Введите число корректно.
                        </h:message>
                     </f:validateLongRange>
                </h:inputText>         
            <br>

             Всего
             <h:inputText value="#{ManagedBeanRequest.dollar}" size="1">
                     <f:validateLongRange maximum="1000" minimum="0">
                         <h:message for="dollar">
                             Введите число корректно.
                        </h:message>
                     </f:validateLongRange>
                </h:inputText>
             долларов
            </h3>
            <br>
            <h4>
             Введите дату (гггг-мм-дд):
             <h:inputText value="#{ManagedBeanRequest.data}">
                 <f:convertDateTime pattern="yyyy-mm-dd"/>
             </h:inputText>
            </h4>

            <br>
                <h:commandButton type="Submit" value="Подсчитать" action="#{ManagedBeanRequest.Count}"/>
            </h:form>
        </body>
    </html>
</f:view>
