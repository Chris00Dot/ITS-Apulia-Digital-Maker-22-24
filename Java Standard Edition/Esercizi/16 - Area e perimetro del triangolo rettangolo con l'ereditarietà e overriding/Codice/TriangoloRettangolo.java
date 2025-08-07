package esercizi.es19;

public class TriangoloRettangolo extends Triangolo
{	
	public TriangoloRettangolo(double cateto1, double cateto2) 
	{
		super(cateto1, cateto2, calcolaIpotenusa(cateto1, cateto2));
	}
	
	private static double calcolaIpotenusa(double cateto1, double cateto2) 
	{
		return Math.sqrt(Math.pow(cateto1,2) + Math.pow(cateto2,2));
	}
	
	public double area()
	{
		double risultato = (latoA * latoB)/2;
		return risultato; 
	}
    
	public String toString() 
	{
		return "triangolo rettangolo " + classificazione() + " di cateti " + latoA + " e " + latoB + " e ipotenusa " + latoC;
	}
}