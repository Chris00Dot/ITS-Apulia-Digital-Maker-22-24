package esercizi.es18;

public class Quadrato extends Rettangolo 
{
	public Quadrato(double lato) 
	{
		super(lato, lato);
	}
	
	public String toString()
	{
		return "quadrato di lato " + base;
	}
}
