package esempi.comparable.array;

public class Auto implements Comparable<Auto>
{
	public String marca;
	private String modello;
	private int velocitaMax;
	
	public Auto(String marca, String modello, int velocitaMax)
	{
		this.marca = marca;
		this.modello = modello;
		this.velocitaMax = velocitaMax;
	}
	
	@Override
	public String toString()
	{
		return marca + " " + modello + " " + velocitaMax + "km/h";
	}
	
	@Override
	public int compareTo(Auto o)
	{
		return this.marca.compareTo(o.marca);
	}
	
	/* Per comparare in ordine decrescente
	public int compareTo(Auto o)
	{
		return this.velocitaMax - o.velocitaMax;
	}*/
}
