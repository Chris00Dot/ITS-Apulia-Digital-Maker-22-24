package esercizi.es22;
import java.util.ArrayList;
import java.util.Iterator;

public class GestoreAnagrafiche 
{
	ArrayList<Persona> persone = new ArrayList<Persona>();
	
	public void aggiungiPersona(Persona persona)
	{
		persone.add(persona);
	}
	
	public void stampaPersona()
	{
		Iterator<Persona> it = persone.iterator();
		while(it.hasNext())
		{
			Persona persone = it.next();
			System.out.println(persone);
		}
	}
}