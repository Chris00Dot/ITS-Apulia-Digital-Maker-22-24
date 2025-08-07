public class Blu extends Colore 
{
	public Blu(String tonalita) 
	{
		super(tonalita);	
	}
	
   @Override
   public void colora() 
   {
	    System.out.println("Stai colorando di blu " + tonalita);
   }
}