/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistance.modelDAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import metier.Weapon;
import persistance.DAO;
import persistance.interfaceDAO.IWeaponDAO;

/**
 *
 * @author Short
 */

public class WeaponDAO extends DAO implements IWeaponDAO {

    @Override
    public List<Weapon> getWeapons() {
        ResultSet rset;
        Statement stmt;
        List<Weapon> weapons = new ArrayList<>();
        String query = "SELECT * FROM Weapon";
        try {
            stmt = connexionBD.createStatement();
            rset = stmt.executeQuery(query);
            while(rset.next()) {
                weapons.add(new Weapon(rset.getString(1),rset.getInt(2)));
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex.getMessage());
        }
        return weapons;
    }
    
}
