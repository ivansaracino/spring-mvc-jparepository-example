<%-- 
    Document   : index
    Created on : 29-ott-2014, 11.39.44
    Author     : CSP
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
      <title>Login</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
  </head>
  <body>
      <div><spring:message code="welcome" /></div>
     
      
      <hr />
      <form:form commandName="utente">
          User: <form:input path="userName" /> <br />
                <form:errors path="userName" /> <br />  
          Password: <form:password path="password" /> <br />
                    <form:errors path="password" /> <br />
                    <input type="submit" value="Login"  /> <br />
      </form:form>
          
          ${messaggio}
          
        
          
        
  </body>
</html>
