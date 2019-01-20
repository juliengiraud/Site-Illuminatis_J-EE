<%-- 
    Document   : complot
    Created on : 20 janv. 2019, 13:19:22
    Author     : Short
--%>

<%@page import="metier.Weapon"%>
<%@page import="generator.ReptiliansPopulation"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LE COMPLOT REPTILIEN</title>
        <link rel="stylesheet" href="style.css" />
    </head>
    <body>
        <h1> Plan de destruction des reptiliens</h1>
        
        <%
            ReptiliansPopulation rp = new ReptiliansPopulation(request.getParameter("pays"));
            Weapon wp = new Weapon(request.getParameter("arme"));
            
            
            out.println("Avant : "+rp.getNbReptilians());
            out.println("Illuminati utilise "+wp.getNom());
            out.println("Après : "+rp.killReptilians(wp));
            if(rp.getNbReptilians() == 0 )
            {
                out.println("It's super effective !");
            }
        %>
        
    </body>
</html>
