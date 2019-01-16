package metier;


public class User {
    
    private String nom;
    private String password;
    
    public User(String newNom, String newPassword) {
        this.nom = newNom;
        this.password = newPassword;
    }
    
    public String getNom() {
        return this.nom;
    }
    
    public String getPassword() {
        return this.password;
    }
    
}
