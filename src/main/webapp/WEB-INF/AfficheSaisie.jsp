<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ page import="metier.*" %>
<jsp:useBean id="DonneeVin" class="metier.DonneeVin" scope="request"></jsp:useBean>
<title>Vin</title>
</head>
<body>
Vin: <%= DonneeVin.getVin().getNom() %> <br>
 <%= DonneeVin.getVin().getPrix() %> <br>
 <%= DonneeVin.getVin().getMillesime() %> <br>
 <%= DonneeVin.getVin().getCepage() %> <br>
 <%= DonneeVin.getVin().getBreve() %> <br>
 <%= DonneeVin.getVin().getDescription() %><br>
Quantité :<%= DonneeVin.getQuantite() %><br>

<a href="accueil.html">retour à l'accueil</a>
</body>
</html>