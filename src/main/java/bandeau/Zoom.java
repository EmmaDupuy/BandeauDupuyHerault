package bandeau;

import java.awt.Font;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Zoom extends Effet{
    private Bandeau bandeauZoom ;
    
    public Zoom(Bandeau pbandeau){
        this.bandeauZoom = pbandeau;
    }
    public void afficher(){
        bandeauZoom.setMessage("Zoom");
        for (int i = 5; i < 100 ; i+=5) {
		bandeauZoom.setFont(new Font("Dialog", Font.BOLD, 5+i));
		bandeauZoom.sleep(100);
	}
        bandeauZoom.setFont(new Font("Dialog", Font.BOLD, 25));
    }
}
