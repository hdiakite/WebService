<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ page import="metier.DonneeVin" %>
<%@ page import="metier.Vin" %>
<jsp:useBean id="liste" class="java.util.ArrayList" scope="request"></jsp:useBean>
<title>Liste</title>
</head>
<body>
<% 
for(Object d : liste)
	   out.println("VIN: ");
	   out.println("NOM :"+ ((DonneeVin)d).getVin().getNom());
	   out.println("PRIX :"+((DonneeVin)d).getVin().getPrix());
	   out.println(" MILLESIME :"+((DonneeVin)d).getVin().getMillesime());
	   out.println("CEPAGE" + ((DonneeVin)d).getVin().getCepage());
	   out.println("BREVE :"+((DonneeVin)d).getVin().getBreve());
	   out.println("DESCRIPTION :"+((DonneeVin)d).getVin().getDescription());
	   out.println("IMAGE"+ "<a href="+((DonneeVin)d).getVin().getImage() + ">-</a><br>");
	   out.println("QUANTITE: " +((DonneeVin)d).getVin().getQuantite()+" <a href=Affiche_form?type=del&id="+((DonneeVin)d).getId() +">-</a><br>");
%>
<a href="accueil.html">retour à la page d'accuiel</a>
</body>
</html>