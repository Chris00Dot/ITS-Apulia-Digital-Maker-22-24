package esercizi.es28;
import java.util.ArrayList;

public class Votazione
{
	private static int numeroVotanti = 0;
	ArrayList<SchedaElettorale> schede = new ArrayList<SchedaElettorale>();
	
	public static int getNumeroVotanti()
	{
		return numeroVotanti;
	}
	
	public static void aggiungiNumeroVotanti()
	{
		numeroVotanti = numeroVotanti + 1;
	}
	
	public void aggiungiSchede(SchedaElettorale scheda)
	{
		schede.add(scheda);
	}
	
	public void spoglioSchede()
	{
		for(SchedaElettorale c: schede)
		{
			System.out.println(c.getScelta());
		}
	}
}