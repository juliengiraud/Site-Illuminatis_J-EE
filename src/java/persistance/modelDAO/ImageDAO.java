/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistance.modelDAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import metier.Image;
import persistance.DAO;
import persistance.interfaceDAO.IImageDAO;

/**
 *
 * @author Short
 */
public class ImageDAO extends DAO implements IImageDAO{
    @Override
    public Image getImage() {
        ResultSet rset;
        Statement stmt;
        Image img = null;
        String query = "SELECT * FROM Weapon";
        try {
            stmt = connexionBD.createStatement();
            rset = stmt.executeQuery(query);
            if(rset.next()) {
                img = new Image(rset.getString(1),rset.getString(2));
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex.getMessage());
        }
        return img;
    }
}
