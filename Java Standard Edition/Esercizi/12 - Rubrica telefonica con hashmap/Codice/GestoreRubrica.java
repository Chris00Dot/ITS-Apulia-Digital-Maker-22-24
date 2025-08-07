package esercizi.es15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class GestoreRubrica 
{
	// Dichiaro e inizializzo la mia hashmap
	Map<String, Contatto> contatti = new HashMap<String, Contatto>();
		
	// Aggiungo i contatti nella mia hashmap
	public void aggiungiContatto(Contatto contatto, Contatto numero)
	{
		contatti.put(contatto.getNome() + " " + contatto.getCognome(), numero);
	}
	
	// Ciclo il contenuto della mia hashmap grazie all'utilizzo di un iteratore
	public void stampa()
	{
		System.out.println("Rubrica: \n");
		System.out.println("--------------------------------------");
		Iterator<String> it = contatti.keySet().iterator();
		while(it.hasNext())
		{
			String a = it.next();
			System.out.println("Chiave: " + a + "," + " Valore: " + contatti.get(a));
		}
	}
}

