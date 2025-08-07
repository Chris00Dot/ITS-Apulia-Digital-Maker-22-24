package esercizi.es16;

public class Triangolo 
{
	// Attributi della classe
	private double latoA;
	private double latoB;
	private double latoC;
	double risultato;
	String tipoTriangolo;
	
	// Metodo costruttore della classe
	public Triangolo(double latoA, double latoB, double latoC)
	{
		this.latoA = latoA;
		this.latoB = latoB;
		this.latoC = latoC;
	}
	
	// Metodi getter
	public double getLatoA()
	{
		return this.latoA;
	}
	public double getLatoB()
	{
		return this.latoB;
	}
	public double getLatoC()
	{
		return this.latoC;
	}
	
	// Metodo in cui controllo grazie ad una serie di selezioni la tipologia del triangolo
	public String classificazione()
	{
		if(latoA == latoB && latoB == latoC)
		{
			tipoTriangolo = "triangolo equilatero";
		}
		else if(latoA == latoB || latoB == latoC || latoA == latoC)
		{
			tipoTriangolo = "triangolo isoscele";
		}
		else
		{
			tipoTriangolo = "triangolo scaleno";
		}
		
		return tipoTriangolo;
	}
	
	// Metodo in cui calcolo il perimetro del triangolo specifico
	public double perimetro()
	{
		risultato = latoA + latoB + latoC;
		return risultato;
	}
	
	// Metodo toString che richiamo nel main
	public String toString()
	{
		return classificazione() + " di lati " + latoA + ", " + latoB + ", " + latoC;
	}
}
