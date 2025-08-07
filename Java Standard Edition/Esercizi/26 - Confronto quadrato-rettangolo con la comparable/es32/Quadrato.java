package esercizi.es32;

public class Quadrato extends Rettangolo 
{
	public Quadrato(double lato) 
	{
		super(lato, lato);
	}
	
	@Override
	public String toString()
	{
		return "quadrato di lato " + base;
	}
}