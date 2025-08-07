package esercizi.es32;

public class Rettangolo implements Comparable<Rettangolo>
{
	Double base;
	Double altezza;
	
	public Rettangolo(Double base, Double altezza)
	{
		this.base = base;
		this.altezza = altezza;
	}

	public Double getBase()
	{
		return this.base;
	}
	public Double getAltezza()
	{
		return this.altezza;
	}
	
	public Double area()
	{
		return base * altezza;
	}
	public double perimetro()
	{
		return (2 * base) + (2 * altezza);
	}
	
	@Override
	public String toString()
	{
		return "rettangolo di base " + getBase() + " e altezza " + getAltezza();
	}
	
	@Override
	public int compareTo(Rettangolo r)
	{
		return this.area().compareTo(r.area());
	}
}
