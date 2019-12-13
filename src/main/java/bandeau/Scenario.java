/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.util.ArrayList;

/**
 *
 * @author nherault
 */
public class Scenario {
    private ArrayList<ElementScenario> effets;
    
    public Scenario(){
        effets = new ArrayList<ElementScenario>();
    }
    public void ajoutEffet(ElementScenario es){
        effets.add(es);
    }
    public void jouer(){
        for (ElementScenario ligneEffet: effets) {
            for (int i=1 ; i <= ligneEffet.getRepetition(); i++){
                ligneEffet.getEffet().afficher();
            }
        }
    }
}
