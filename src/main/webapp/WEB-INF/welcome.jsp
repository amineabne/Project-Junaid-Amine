<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome</title>
    <link rel="stylesheet" type="text/css" href="./assets/css/generalStyle.css" />
    <style>
        body {
            background-color: lightskyblue;
            font-family: Arial, sans-serif;
            text-align: center;
            margin: 0;
            padding: 0;
        }
        h1 {
            color: white;
            margin-top: 20px;
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
<h1>Bienvenue</h1>
<p>Bienvenue sur notre site internet réservé aux amateurs de cuisine !</p>
<div class="button-container">
    <form action="recettelist" method="get">
        <input type="submit" value="Voir les recettes">
    </form>
    <form action="home" method="get">
        <input type="submit" value="Se déconnecter">
    </form>
</div>
</body>
</html>