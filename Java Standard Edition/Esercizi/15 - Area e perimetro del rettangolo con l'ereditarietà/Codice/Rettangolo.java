package esercizi.es18;

public class Rettangolo 
{
	double base;
	double altezza;
	
	public Rettangolo(double base, double altezza)
	{
		this.base = base;
		this.altezza = altezza;
	}
	
	public double getBase()
	{
		return this.base;
	}
	public double getAltezza()
	{
		return this.altezza;
	}
	
	public double area()
	{
		return base * altezza;
	}
	public double perimetro()
	{
		return (2 * base) + (2 * altezza);
	}
	
	public String toString()
	{
		return "rettangolo di base " + getBase() + " e altezza " + getAltezza();
	}
}
