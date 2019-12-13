/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

public class ElementScenario {
    private int nbRepetitions;
    private Scenario scenario;
    private Effet effet;
    
    public ElementScenario(int prepetition, Scenario pscenario, Effet peffet){
        this.nbRepetitions = prepetition;
        this.scenario = pscenario;
        this.effet = peffet;
    }
    
    public Effet getEffet(){return this.effet;}
    public void setEffet(Effet p_effet){this.effet = p_effet;}
    
    public Scenario getScenario(){return this.scenario;}
    public void setScenario(Scenario p_scenario){this.scenario = p_scenario;}
    
    public int getRepetition(){ return nbRepetitions;}
    public void setRepatition(int nb){nbRepetitions = nb;}
}
