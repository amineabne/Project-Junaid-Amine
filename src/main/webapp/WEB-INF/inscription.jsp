<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Inscription</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: rosybrown;
      text-align: center;
      margin: 0;
      padding: 0;
    }
    h1 {
      color: white;
      margin-top: 20px;
    }
    form {
      background-color: white;
      padding: 20px;
      border-radius: 5px;
      width: 300px;
      margin: 0 auto;
    }
    label {
      display: block;
      margin-top: 10px;
    }
    input[type="text"],
    input[type="email"],
    input[type="password"] {
      width: 100%;
      padding: 10px;
      margin-top: 5px;
      border: 1px solid #ccc;
      border-radius: 3px;
    }
    input[type="submit"] {
      background-color: #007bff;
      color: white;
      border: none;
      padding: 10px 20px;
      font-size: 16px;
      cursor: pointer;
      transition: background-color 0.3s;
    }
    input[type="submit"]:hover {
      background-color: #0056b3;
    }
    p {
      color: white;
      margin-top: 10px;
    }
  </style>
</head>
<body>
<h1>Inscription</h1>
<form action="inscription" method="post">
  <label for="nom">Nom :</label>
  <input type="text" id="nom" name="nom" value="${utilisateur.nom}" required>

  <label for="prenom">Prénom :</label>
  <input type="text" id="prenom" name="prenom" value="${utilisateur.prenom}" required>

  <label for="email">E-mail :</label>
  <input type="email" id="email" name="email" value="${utilisateur.email}" required>

  <label for="motdepasse">Mot de passe :</label>
  <input type="password" id="motdepasse" name="motdepasse" required>

  <input type="submit" value="S'inscrire">
</form>
<p>Déjà inscrit ? <a href="connexion.jsp">Connectez-vous ici</a>.</p>
</body>
</html>
