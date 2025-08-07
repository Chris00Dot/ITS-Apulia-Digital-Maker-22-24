package esercizi.es44;

public class Main 
{
	public static void main(String[] args) 
	{
		String url = "jdbc:postgresql://localhost:5432/db_anagrafiche";
		String user = "postgres";
		String password = "postgres";
		
		GestoreAnagraficaDb gestoreAnagraficaDb = new GestoreAnagraficaDb(url, user, password);
		GestoreAnagrafiche gestoreAnagrafiche = new GestoreAnagrafiche();
		
		Anagrafica pino = new Anagrafica("Pino", "Daniele", "23/02/1953", "3456789549");
		Anagrafica vasco = new Anagrafica("Vasco", "Rossi", "18/03/1934", "3356583523");
		Anagrafica franco = new Anagrafica("Franco", "Battitato", "12/01/1945", "3393458234");
		
		gestoreAnagrafiche.aggiungiAnagrafica(pino);
		gestoreAnagrafiche.aggiungiAnagrafica(vasco);
		gestoreAnagrafiche.aggiungiAnagrafica(franco);
		
		gestoreAnagraficaDb.aggiungiAnagrafica(pino);
		gestoreAnagraficaDb.aggiungiAnagrafica(vasco);
		gestoreAnagraficaDb.aggiungiAnagrafica(franco);
		
		// STAMPA SU ECLIPSE
		gestoreAnagrafiche.stampaAnagrafica();
		
		// STAMPA SU DATABASE
		gestoreAnagraficaDb.stampaAnagrafica();
	}
}