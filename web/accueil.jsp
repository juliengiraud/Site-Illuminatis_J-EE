<%-- 
    Document   : Accueil
    Created on : 14 janv. 2019, 09:03:51
    Author     : Short
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css" />

        <title>JSP Page</title>
    </head>
    <body>
        
        
        <h1> <%= request.getAttribute("identifiant") %></h1>
        <form action="controleur" method="post">
            <input type="text" name="theinput" />
            <select name="pays" onChange="combo(this, 'theinput')">
              <option>Europe</option>
              <option>Ping</option>
              <option>Amérique sud</option>
              <option>'Murica (fuck yeah)</option>
              <option>Internet</option>
              <option>Bordure extérieur</option>
            </select> 
            <select name="arme" onChange="combo(this, 'theinput')">
              <option>Le Canard Jaune</option>
            </select> 
            <input type="hidden" name="page" value="complot" />
            <input type="submit" value="Valider" />
        </form>
        
        <% 
            for(int i =0;i<30;i++)
            {
                out.print("<br/>");
            }
        %>
        
        <h1> Triangle !!!! </h1>
        <form action="controleur" method="post">
            <input type="hidden" name="page" value="triangle" />
            <input type="submit" value="Confidientiel" />
        </form>
    </body>
</html>
