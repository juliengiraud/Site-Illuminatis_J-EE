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
        <title>JSP Page</title>
    </head>
    <body>
        <form action="/Controleur" method="post">
            <input type="text" id="theinput" name="theinput" />
            <select name="thelist" onChange="combo(this, 'theinput')">
              <option>un</option>
              <option>deux</option>
              <option>trois</option>
            </select> 
            <input type="submit" value="Valider" />
        </form>
    </body>
</html>
