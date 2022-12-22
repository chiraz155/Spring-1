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
</head>
<body>
<h3>Liste des enseignants</h3>
<table border="1">
  <c:forEach items ="${Enseignants}" var="l">
   <tr>
       <td>${ l.prenom}</td>
       <td>${l.nom}</td>
       <td>${ l.charge}</td>
       
   </tr>
         
 </c:forEach>




</table>
<a href="${cxt}/Ajouter"> Ajouter Enseignant</a> 
</body>
</html>