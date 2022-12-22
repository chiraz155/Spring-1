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
<h3>Liste des Affectations</h3>
<table border="1">
  <c:forEach items ="${Affectations}" var="l">
   <tr>
       <td>${ l.matiere.getTitre()}</td>
       <td>${l.enseignant.getPrenom()}</td>
       <td>${ l.nbheure}</td>
       
   </tr>
         
 </c:forEach>




</table>

</body>
</html>