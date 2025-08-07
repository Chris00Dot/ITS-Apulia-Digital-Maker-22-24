package esempi.nuovoHelloWorld;

public class Programma 
{
	public static void main(String[] args) 
	{
		// Creo l'oggetto di classe messaggio e stampo il contenuto del metodo
		Messaggio msg = new Messaggio("Hello World!");
		System.out.println(msg.stampaMessaggio());
	}
}
