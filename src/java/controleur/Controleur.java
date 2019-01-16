package controleur;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Short
 */
@WebServlet(urlPatterns = {"/Controleur"})
public class Controleur extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("/Accueil.jsp");
        rd.forward(request, response);
        
        String action = (String)request.getAttribute("toDo");
        switch(action)
        {
            case "":GenerePays((String)request.getAttribute("pays"));
                    break;
            default: break;
        }
    }
    protected void GenerePays(String Pays)
    {
        
    }
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException      
    {
        processRequest(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Est le controlleur";
    }

}
