/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

public class Rotation extends Effet{
    private Bandeau bandeauRotation ;
    
    public Rotation (Bandeau rbandeau){
        this.bandeauRotation = rbandeau;
    }
    public void afficherRotation(){
     	bandeauRotation.setMessage("Le texte tourne");
	for (int i = 0; i <= 100; i++) {
            bandeauRotation.setRotation(2*Math.PI*i / 100);
            bandeauRotation.sleep(100);
        }
    }
}
