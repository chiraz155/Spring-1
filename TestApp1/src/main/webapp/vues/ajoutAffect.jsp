<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Departement GCR</title>
</head>
<body>
<h3>affecter une matiere</h3>
<form:form methode="POST" action ="${cxt}/addAffect" modelAttribute="affect">
       
        <p>matiere:<form:select path=   "mat.id" items="${Matieres}" itemLabel="titre" itemValue="id"/></p>
        <p>enseignant :<form:select path=   "Enseignants.id" items="${Enseignants}" itemLabel="Prenom" itemValue="id"/></p>
 
        <p>nbheure :<form:input path="nbheure"/></p>
        <input type="submit" value="enregistrer"/>
 
  </form:form>  


</body>
</html>