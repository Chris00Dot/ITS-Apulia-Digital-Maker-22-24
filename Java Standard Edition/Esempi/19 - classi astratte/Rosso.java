public class Rosso extends Colore 
{
	public Rosso(String tonalita) 
	{
		super(tonalita);	
	}

	@Override
	public void colora() 
	{
		System.out.println("Stai colorando di rosso " + tonalita);	
	}
}