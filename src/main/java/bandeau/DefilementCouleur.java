/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Color;
import java.util.Random;

public class DefilementCouleur extends Effet{
    private Bandeau bandeauCouleur ;
    
    public DefilementCouleur (Bandeau bandeau){
        this.bandeauCouleur = bandeau;
    }
    public void afficher(){
        bandeauCouleur.setMessage("Défilement");
        Random rand = new Random();
        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();
        Color randomColor = new Color(r, g, b);
        bandeauCouleur.setForeground(randomColor);
        bandeauCouleur.sleep(500);
    }
}
