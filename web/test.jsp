<%-- 
    Document   : test
    Created on : 16 janv. 2019, 10:34:20
    Author     : p1702401
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Désolé <%= request.getAttribute("identifiant") %>, vous n'êtes pas connectés !</h1>
        <form action="controleur" method="post">   
            <input type="text" name="identifiant" placeholder="Ex : Roger" size="30" maxlength="10" />
            <input type="text" name="mdp" placeholder="Ex : Je suis pas un reptilien" size="30" maxlength="10" />
            <input type="hidden" name="page" value="connexion" />
            <input type="submit" value="Valider" />
    </body>
</html>
