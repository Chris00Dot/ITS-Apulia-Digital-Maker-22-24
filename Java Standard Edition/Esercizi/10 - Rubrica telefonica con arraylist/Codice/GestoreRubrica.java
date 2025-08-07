package esercizi.es13;

import java.util.ArrayList;
import java.util.Iterator;

public class GestoreRubrica 
{
	// Dichiaro e inizializzo il mio arraylist
	ArrayList<Contatto> contatti = new ArrayList<Contatto>();
		
	// Aggiungo i contatti nel mio arraylist
	public void aggiungiContatto(Contatto contatto)
	{
		contatti.add(contatto);
	}
	
	// Cerco un contatto nel mio arraylist grazie ai valori attuali nel main
	public void cercaNumero(String nome, String cognome)
	{
		for(Contatto c: contatti)
		{
			if(c.getNome().equals(nome) && c.getCognome().equals(cognome))
			{
				System.out.println("Contatto trovato: " + c.toString());
				return;
			}
		}
		System.out.println("Nessun contatto trovato tra i dati inseriti!");
		System.out.println();	
	}
	
	// Rimuovo un contatto nel mio arraylist grazie ai valori attuali nel main
	public void rimuoviContatto(String nome, String cognome)
	{
		Iterator<Contatto> it = contatti.iterator();
		while(it.hasNext())
		{
			Contatto a = it.next();
			if(a.nome == nome && a.cognome == cognome)
			{
				it.remove();
			}
		}
	}
	
	// Ciclo il contenuto del mio arraylist grazie all'utilizzo di un iteratore
	public void stampa()
	{
		System.out.println("Rubrica: \n");
		System.out.println("--------------------------------------");
		Iterator<Contatto> it = contatti.iterator();
		while(it.hasNext())
		{
			Contatto contatti = it.next();
			System.out.println(contatti);
		}
	}
}
