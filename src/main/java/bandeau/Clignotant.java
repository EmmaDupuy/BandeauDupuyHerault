/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Font;

public class Clignotant extends Effet{
    private Bandeau bandeauClignotant ;
    
    public Clignotant(Bandeau pbandeau){
        this.bandeauClignotant = pbandeau;
    }
    public void afficherClignotant(int nbClignotement){
        for (int i = 0; i <= nbClignotement; i++) {
            bandeauClignotant.setMessage("Coucou");
            bandeauClignotant.sleep(1000);
            bandeauClignotant.setMessage("");
            bandeauClignotant.sleep(1000);
        }
    }
}
