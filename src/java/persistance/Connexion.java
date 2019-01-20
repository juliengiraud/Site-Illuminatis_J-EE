package persistance;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.mariadb.jdbc.MariaDbDataSource;

public class Connexion extends MariaDbDataSource {
    
    private static Connexion mds;

    private Connexion() {}

    public static Connexion getMdbDataSource() {
    
        if (mds == null) {
            try {
               
                mds = new Connexion ();
                mds.setPortNumber(3306);
                mds.setServerName("iutdoua-web.univ-lyon1.fr");
                mds.setDatabaseName("p1704709");
                mds.setUser("p1704709");
                mds.setPassword("cpe7ay5u");
            }
            catch (SQLException ex) {
                Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            //System.out.println("---(la source de data existe deja)") ;
        }
        return mds;
        
    } // de getMdbDataSource()

}
