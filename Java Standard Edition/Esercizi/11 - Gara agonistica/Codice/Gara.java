package esercizi.esercizio14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Gara {

	 private ArrayList<Atleta> atleti = new ArrayList<>(List.of(
	    new Atleta("Pino"),
		new Atleta("Gino"),
		new Atleta("Nino"),
		new Atleta("Roberto"),
		new Atleta("Mario"),
		new Atleta("Marco"),
		new Atleta("Rosalba"),
		new Atleta("Alex"),
		new Atleta("Giusy")));
	 
	 private LinkedList<Medaglia> medaglie = new LinkedList<>(List.of
			 (new Medaglia("oro"),
		      new Medaglia("argento"),
			  new Medaglia("bronzo")));
	 
     GestoreMedaglie gestoreMedaglie = new GestoreMedaglie();
		
	public void premiazione() {
		
		System.out.println("Sul tavolo sono rimaste " + medaglie.size() + " medaglie");
		
		for(int i=2; i>=0; i--) {
			System.out.println(atleti.get(i).getNome() + " sale sul podio");
			System.out.println(atleti.get(i).getNome() + " riceve la medaglia di " + gestoreMedaglie.daiMedaglia(medaglie.get(i)));
			atleti.get(i).getMedaglia(medaglie.get(i));
			medaglie.remove(i);
		}
		
		System.out.println("Sul tavolo sono rimaste " + medaglie.size() + " medaglie");
	}
	
	

}
