package esercizi.es12;

public class Main 
{
	public static void main(String[] args) 
	{	
		// Dichiaro e inizializzo i miei costruttori
		Maggiorenne mario = new Maggiorenne("Mario");
		Maggiorenne nina = new Maggiorenne("Nina");
		Maggiorenne luigi = new Maggiorenne("Luigi");
		Maggiorenne annalisa = new Maggiorenne("Annalisa");
		Maggiorenne luca = new Maggiorenne("Luca");
		Maggiorenne giorgio = new Maggiorenne("Giorgio");
		Maggiorenne luisa = new Maggiorenne("Luisa");
		Maggiorenne marco = new Maggiorenne("Marco");
		
		// Indico il numero di votanti
		mario.vota();
		nina.vota();
		luigi.vota();
		annalisa.vota();
		luca.vota();
		giorgio.vota();
		/* luisa.vota();
		marco.vota(); */
	
		// Stampo a video il numero di elettori, il numero di votanti e conferma la votazione del maggiorenne "Nina" 
		System.out.println("Numero totale elettori:" + Maggiorenne.numeroElettori);
		System.out.println("Numero votanti:" + Maggiorenne.votanti);
		if(nina.haVotato() == true)
		{
			System.out.println(nina.nome + " ha votato!");
		}
	}
}
