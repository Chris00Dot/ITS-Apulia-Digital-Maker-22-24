package esercizi.es28;
import java.util.ArrayList;

public class GestioneScheda 
{
	ArrayList<SchedaElettorale> schede = new ArrayList<SchedaElettorale>();
	
	public void aggiungiScheda(SchedaElettorale scheda)
	{
		schede.add(scheda);	
	}
	
	public void spoglio()
	{
		for(SchedaElettorale c: schede)
		{
			System.out.println(c.getScelta());
		}
	}
}