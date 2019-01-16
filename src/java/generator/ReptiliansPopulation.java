/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generator;

import metier.Weapon;

/**
 *
 * @author Short
 */
public class ReptiliansPopulation {
    private static int nbReptilians;
    public static int getNbReptilians() {return nbReptilians;}
    public static void killReptilians(Weapon weapon)
    {
        nbReptilians -= weapon.getPuissance();
        if(nbReptilians < 0)
        {
            nbReptilians = 0;
        }
    }
    
}
