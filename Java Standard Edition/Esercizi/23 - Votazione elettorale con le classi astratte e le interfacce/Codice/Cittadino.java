package esercizi.es28;

public abstract class Cittadino 
{
	protected String nome;
	
	public Cittadino(String nome)
	{
		this.nome = nome;
	}
	
	public String toString()
	{
		return nome;
	}
}