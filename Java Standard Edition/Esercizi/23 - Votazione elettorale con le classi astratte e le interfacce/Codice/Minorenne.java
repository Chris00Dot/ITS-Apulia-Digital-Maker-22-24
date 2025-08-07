package esercizi.es28;

public class Minorenne extends Cittadino
{
	String nome;
	
	public Minorenne(String nome)
	{
		super(nome);
		this.nome = nome;
	}
	
	public String toString()
	{
		return this.nome;
	}
}