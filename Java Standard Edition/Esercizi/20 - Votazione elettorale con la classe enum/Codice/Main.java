package esercizi.es24;

public class Main 
{
	public static void main(String[] args) 
	{
		GestioneScheda gestioneScheda = new GestioneScheda();
		Maggiorenne mario = new Maggiorenne("Mario");
		
		Maggiorenne nina = new Maggiorenne("Nina");
		SchedaElettorale scheda1 = nina.vota(new Votazione(), Opzione.REPUBBLICA);
		
		Maggiorenne luigi = new Maggiorenne("Luigi");
		
		Maggiorenne gianluca = new Maggiorenne("Gianluca");
		SchedaElettorale scheda2 = gianluca.vota(new Votazione(), Opzione.MONARCHIA);
		
		Maggiorenne annalisa = new Maggiorenne("Annalisa");
		Maggiorenne luca = new Maggiorenne("Luca");
		Maggiorenne giorgio = new Maggiorenne("Giorgio");
		
		Maggiorenne tommaso = new Maggiorenne("Tommaso");
		SchedaElettorale scheda3 = tommaso.vota(new Votazione(), Opzione.MONARCHIA);
		
		mario.nonHaVotato();
		gestioneScheda.aggiungiScheda(scheda1);
		luigi.nonHaVotato();
		gestioneScheda.aggiungiScheda(scheda2);
		annalisa.nonHaVotato();
		luca.nonHaVotato();
		giorgio.nonHaVotato();
		gestioneScheda.aggiungiScheda(scheda3);
			
		System.out.println("Referendum: 'Vuoi la Monarchia o la Repubblica?' \n" + "Spoglio:");
		gestioneScheda.spoglio();
		
		System.out.println("Numero totale elettori:" + Maggiorenne.numeroElettori);
		System.out.println("Numero votanti:" + Votazione.getNumeroVotanti());
		if(nina.haVotato() == true)
		{
			System.out.println(nina + " ha votato!");
		}
	}
}