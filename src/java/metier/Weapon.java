/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *
 * @author Short
 */
public class Weapon {
    private String nom;
    private int puissance;
    public Weapon(String nom, int puissance)
    {
        this.nom = nom;
        this.puissance = puissance;
    }
    public int getPuissance()
    {
        return puissance;
    }
    public String getNom()
    {
        return nom;
    }
}
