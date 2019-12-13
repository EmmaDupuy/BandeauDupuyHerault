/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Color;

public class DefilementCouleur extends Effet{
    private Bandeau bandeauCouleur ;
    
    public DefilementCouleur (Bandeau bandeau){
        this.bandeauCouleur = bandeau;
    }
    public void afficherDefilementCouleur(){
        bandeauCouleur.setMessage("Defilement couleur");
        bandeauCouleur.sleep(500);
        bandeauCouleur.setForeground(Color.red);
        bandeauCouleur.sleep(500);
        bandeauCouleur.setForeground(Color.yellow);
        bandeauCouleur.sleep(500);
        bandeauCouleur.setForeground(Color.blue);
        bandeauCouleur.sleep(500);
        bandeauCouleur.setForeground(Color.green);
        bandeauCouleur.sleep(500);
        bandeauCouleur.setForeground(Color.PINK);
        bandeauCouleur.sleep(500);
        bandeauCouleur.setForeground(Color.magenta);        
    }
}
