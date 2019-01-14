package persistance.modelDAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import metier.User;
import persistance.DAO;
import persistance.interfaceDAO.IUserDAO;

public class UserDAO extends DAO implements IUserDAO {
    
    public UserDAO() throws SQLException {
        super();
    }

    @Override
    public User getUser() {
        
        ResultSet rset;
        Statement stmt;
        User user = null;
        String query = "SELECT * FROM User";
        try {
            stmt = connexionBD.createStatement();
            rset = stmt.executeQuery(query);
            if (rset.next()) {
                user = new User(rset.getString(1), rset.getString(2));
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex.getMessage());
        }
        return user;
    }
    
}
