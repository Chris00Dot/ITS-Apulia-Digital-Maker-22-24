package esercizi.es22;

public class Main 
{
	public static void main(String[] args) 
	{
		GestoreAnagrafiche gestoreAnagrafiche = new GestoreAnagrafiche();
		Persona pino = new Persona("Pino", "Daniele", "23/02/1953", "3456789549");
		Persona vasco = new Persona("Vasco", "Rossi", "18/03/1934", "3356583523");
		Persona franco = new Persona("Franco", "Battitato", "12/01/1945", "3393458234");
		
		gestoreAnagrafiche.aggiungiPersona(pino);
		gestoreAnagrafiche.aggiungiPersona(vasco);
		gestoreAnagrafiche.aggiungiPersona(franco);
		
		gestoreAnagrafiche.stampaPersona();
	}
}