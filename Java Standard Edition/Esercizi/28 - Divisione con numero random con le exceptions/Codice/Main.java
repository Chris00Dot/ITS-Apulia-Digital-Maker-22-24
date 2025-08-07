package esercizi.es34;

public class Main 
{
    static int numeroRandom = (int)(Math.random()*3);
	
    public static int divisione(int numero)
	{
		int risultato = numero/numeroRandom; 
		if(numeroRandom != 0)
		{
			 System.out.println("Fine" + "\n" + "Il numero non è stato diviso per 0");
		}	
		return risultato;
	}
    
	public static void main(String[] args) 
	{
	    try 
	    {
		    System.out.println(divisione(5));
	    }
	    catch (ArithmeticException e) 
	    {
		    System.err.println("Attenzione divisione per 0" + "\n" + "Fine");
	    }
	}
}