package controleur;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import metier.HashText;
import metier.User;
import persistance.modelDAO.UserDAO;

/**
 *
 * @author Short
 */
//@WebServlet(urlPatterns = {"controleur"})
public class Controleur extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException, NoSuchAlgorithmException {
        response.setContentType("text/html;charset=UTF-8");
        String page = request.getParameter("page");
        RequestDispatcher rd;
        
        switch(page) {
            case "connexion":
                String id = request.getParameter("identifiant");
                String mdp = request.getParameter("mdp");
                
                UserDAO userDAO = new UserDAO();
                List<User> users = userDAO.getUsers();
                System.out.println("taille de users : " + users.size());
                User user = null;
                for (User u : users) {/*
                    if (u.getNom() == id && u.getPassword() == HashText.sha1(mdp)) {
                        user = u;
                        System.out.println(u.getNom() + "\n" + u.getPassword() + "\n" + HashText.sha1(mdp));
                        break;
                    }*/
                    System.out.println("nomBD : " + u.getNom() + "\nmdpBD" + u.getPassword() + "\nmdp" + HashText.sha1(mdp));
                }
                request.setAttribute("identifiant", id);
                if (user != null) {
                    rd = request.getRequestDispatcher("accueil.jsp");
                    rd.forward(request, response);
                    break;
                }
                else {
                    rd = request.getRequestDispatcher("test.jsp");
                    rd.forward(request, response);
                }
            
            default:
                rd = request.getRequestDispatcher("accueil.jsp");
                rd.forward(request, response);
            
        }
        
    }
    protected void GenerePays(String Pays) {
        
    }
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Controleur.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Controleur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Controleur.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Controleur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @Override
    public String getServletInfo() {
        return "Est le controlleur";
    }

}
