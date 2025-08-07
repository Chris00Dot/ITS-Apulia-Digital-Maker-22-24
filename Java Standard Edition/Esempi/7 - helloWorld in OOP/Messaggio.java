package esempi.nuovoHelloWorld;

public class Messaggio 
{
	// Attributo messaggio
	String frase;
	
	// Metodo costruttore
	public Messaggio(String frase)
	{
		this.frase = frase;
	}
	
	// Metodo che mi restituisce la stringa da stampare
	public String stampaMessaggio()
	{
		return this.frase;
	}
}
