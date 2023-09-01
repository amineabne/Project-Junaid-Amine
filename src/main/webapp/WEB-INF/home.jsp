<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Home</title>
  <link rel="stylesheet" type="text/css" href="./assets/css/generalStyle.css" />
  <style>
    body {
      background-color: rosybrown;
      font-family: Arial, sans-serif;
      text-align: center;
      margin: 0;
      padding: 0;
    }
    h1 {
      color: white;
      margin-top: 50px;
    }
    p {
      color: white;
      font-size: 18px;
      margin: 20px 0;
    }
    .button-container {
      display: flex;
      justify-content: center;
      margin-top: 20px;
    }
    .button-container form {
      margin-right: 20px;
    }
    .button-container input[type="submit"] {
      background-color: #007bff;
      color: white;
      border: none;
      padding: 10px 20px;
      font-size: 16px;
      cursor: pointer;
      transition: background-color 0.3s;
    }
    .button-container input[type="submit"]:hover {
      background-color: #0056b3;
    }
  </style>
</head>
<body>
<h1>Bienvenue sur notre site internet réservé aux amateurs de cuisine !</h1>
<p>Découvrez de délicieuses recettes et partagez les vôtres avec la communauté.</p>
<div class="button-container">
  <form action="login" method="get">
    <input type="submit" value="Se connecter">
  </form>
  <form action="inscription" method="get">
    <input type="submit" value="S'inscrire">
  </form>
  <form action="recettelist" method="get">
    <input type="submit" value="Voir les recettes">
  </form>
</div>
</body>
</html>
