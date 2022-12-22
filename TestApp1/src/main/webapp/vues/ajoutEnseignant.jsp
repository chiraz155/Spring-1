<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form"%>

<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
     
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Departement GCR</title>
<c:set var="cxt" value="${pageContext.request.contextPath }"/>
<h3>Ajouter un enseignant</h3>
</head>
<body>
<form:form methode="POST" action ="${cxt}/addEns" modelAttribute="ens">
       
        <p>nom :<form:input path="nom"/></p>
         <p>Prenom :<form:input path="Prenom"/></p>
 
        <p>charge :<form:input path="charge"/></p>
        <input type="submit" value="ajouter"/>
 
  </form:form>  
</body>
</html>