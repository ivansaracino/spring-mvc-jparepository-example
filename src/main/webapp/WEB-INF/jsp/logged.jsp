<%-- 
    Document   : logged
    Created on : 29-ott-2014, 13.57.32
    Author     : CSP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
  <head>
    <title>TODO supply a title</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
  </head>
  <body>
      <div><spring:message code="welcome" /> ${utente.userName}</div>
      <h3><spring:message code="orders" /></h3>
      <table>
        <c:forEach items="${utenteindb.ordini}" var="ordine">
            <tr>
                <td>${ordine.dataOrdine}</td>
                <td>${ordine.valoreOrdine}</td>
            </tr>
        </c:forEach>
      </table>
  </body>
</html>
