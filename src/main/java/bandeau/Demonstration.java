/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

/**
 *
 * @author nherault
 */
public class Demonstration {
    
    public static void main(String[] args) {
        Scenario scenario1 = new Scenario();
        Bandeau leBandeau = new Bandeau();
        Zoom leZoom = new Zoom(leBandeau);
        DefilementCouleur leDefilement = new DefilementCouleur(leBandeau);
        Clignotant leClignotant = new Clignotant(leBandeau);
        Rotation laRotation = new Rotation(leBandeau);
        ElementScenario lElem1 = new ElementScenario(10,scenario1,leClignotant);
        ElementScenario lElem2 = new ElementScenario(1,scenario1,leZoom);
        ElementScenario lElem3 = new ElementScenario(20,scenario1,leDefilement);
        ElementScenario lElem4 = new ElementScenario(1,scenario1,laRotation);
        scenario1.ajoutEffet(lElem4);
        scenario1.ajoutEffet(lElem1);
        scenario1.ajoutEffet(lElem2);
        scenario1.ajoutEffet(lElem3);
	scenario1.jouer();
    }    
}
