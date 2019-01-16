/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generator;

/**
 *
 * @author Short
 */
public class TriangleFinder {
    private float nbTriangle;
    private String pays;
    private int nbReptilien;
    
    private TriangleFinder(String pays)
    {
        this.pays = pays;
        this.nbReptilien = (int)Math.random() * 1000;
    }
    
    private float findTriangle()
    {
        for(char c : pays.toCharArray())
        {
            nbTriangle += c + (int)Math.random()*1000;
        }
        nbTriangle/= nbReptilien;
        
        return nbTriangle;
    }
    
}
