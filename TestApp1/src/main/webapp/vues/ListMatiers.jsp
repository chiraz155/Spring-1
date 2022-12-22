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
<h3>Liste des Matieres</h3>
<table border="1">
  <c:forEach items ="${Matieres}" var="l">
   <tr>
       <td>${ l.titre}</td>
       <td>${l.niveau}</td>
       <td>${ l.nbheure}</td>
       
   </tr>
         
 </c:forEach>




</table>
<a href="${cxt}/Ajoutermatiere"> Ajouter matiere</a> 
</body>
</html>