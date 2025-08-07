public class TriangoloRettangolo 
{
	// Attributi della classe
	double cateto1;
	double cateto2;
    
	// Metodo costruttore della classe
	public TriangoloRettangolo(double cateto1, double cateto2) 
	{
		this.cateto1 = cateto1;
		this.cateto2 = cateto2;
	}
    
	// Metodi getter
	public double getCateto1() 
	{
		return cateto1;
	}
	public double getCateto2() 
	{
		return cateto2;
	}
    
	// Metodo in cui mi calcolo l'ipotenusa
	public double calcolaIpotenusa() 
	{
		return Math.sqrt(Math.pow(cateto1,2) + Math.pow(cateto2,2));
	}
    
	// Metodo in cui mi calcolo il perimetro
	public double perimetro() 
	{
		return cateto1 + cateto2 + calcolaIpotenusa();
	}
    
	// Metodo in cui mi calcolo l'area
	public double area() 
	{
		return (cateto1 * cateto2) / 2;
	}
    
	// Metodo toString che richiamo nel main
	public String toString() 
	{
		return "triangolo rettangolo di cateti " + getCateto1() + " e " + getCateto2() + " e ipotenusa " + calcolaIpotenusa();
	}
}