<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link  rel="stylesheet" href="Monstyle.css" type="text/css" media="screen"/>
<title>Saisie Vin</title>
</head>
<body class="corp2">
	<h1 style="color:green"><em>Ma cave à vin </em> </h1>
	<form action="Affiche_form" id="monForm" method="post">
		<label class="formulaire"for="nom"> Nom du vin</label>
		<input type="text" name="nom" id="nom"/> <br>
		<label class="formulaire" for="prix"> Entrez le prix</label>
		<input type="number" name="prix" id="prix"/> <br>
		<label class="formulaire"for="millesime"> Entrez le millesime</label>
		<input type="date" name="millesime" id="millesime"/> <br>
		<label class="formulaire"for="cepage"> Entrez le cepage</label>
		<input type="text" name="cepage" id="cepage"/> <br>
		<label class="formulaire"for="breve"> entrez la breve</label>
		<input type="text" name="breve" id="breve"/> <br>
		<label class="formulaire"for="description"> Description du vin</label>
		<input type="text" name="description" id="description"/> <br>
		<label class="formulaire" for="quantite"> Quantite</label>
		<input type="text" name="quantite" id="quantite"/> <br>
		<label class="formulaire" for="Image">Choisir une image</label><br />
		<input class="formulaire" type="file"
       		id="image" name="image"
       		accept="image/png, image/jpeg,  image/jpg"><br/>
		<input size="25px" class="Valider" type="submit"/>
	</form>
</body>
</html>