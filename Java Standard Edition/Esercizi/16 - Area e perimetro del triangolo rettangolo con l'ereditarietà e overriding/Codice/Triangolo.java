package esercizi.es19;

public class Triangolo 
{
	protected double latoA;
	protected double latoB;
	protected double latoC;
	
	public Triangolo(double latoA, double latoB, double latoC)
	{
		this.latoA = latoA;
		this.latoB = latoB;
		this.latoC = latoC;
	}
	
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
	
	public String classificazione()
	{
		String tipoTriangolo;
		if(latoA == latoB && latoB == latoC)
		{
			tipoTriangolo = "equilatero";
		}
		else if(latoA == latoB || latoB == latoC || latoA == latoC)
		{
			tipoTriangolo = "isoscele";
		}
		else
		{
			tipoTriangolo = "scaleno";
		}
		return tipoTriangolo;
	}
	
	public double perimetro()
	{
		double risultato = latoA + latoB + latoC;
		return risultato;
	}
	
	public String toString()
	{
		return classificazione() + " di lati " + latoA + ", " + latoB + ", " + latoC;
	}
}