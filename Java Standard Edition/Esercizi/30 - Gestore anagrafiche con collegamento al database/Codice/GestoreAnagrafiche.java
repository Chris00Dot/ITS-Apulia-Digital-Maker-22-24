package esercizi.es44;
import java.util.ArrayList;
import java.util.Iterator;

public class GestoreAnagrafiche
{
	ArrayList<Anagrafica> persone = new ArrayList<Anagrafica>();
	
	public void aggiungiAnagrafica(Anagrafica anagrafica)
	{
		persone.add(anagrafica);
	}
	
	public void stampaAnagrafica()
	{
		Iterator<Anagrafica> it = persone.iterator();
		while(it.hasNext())
		{
			Anagrafica persone = it.next();
			System.out.println(persone);
		}
	}
}