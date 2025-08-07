package esercizi.es11;

public class Rettangolo 
{
	// Attributi della classe
	double base;
	double altezza;
	
	// Metodo costruttore
	public Rettangolo(double base, double altezza)
	{
		this.base = base;
		this.altezza = altezza;
	}
	
	// Metodi setter e getter
	public void setBase(double base)
	{
		this.base = base;
	}
	public double getBase()
	{
		return this.base;
	}
	
	public void setAltezza(double altezza)
	{
		this.altezza = altezza;
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
	
	// Metodo toString che richiamo nel main
	public String toString()
	{
		return "rettangolo di base " + getBase() + " e altezza " + getAltezza();
	}
}