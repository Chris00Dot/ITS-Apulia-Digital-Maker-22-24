package esercizi.es21;

public class Dipendente 
{
	String nome;
	int stipendio;
	
	public Dipendente(String nome, int stipendio)
	{
		this.nome = nome;
		this.stipendio = stipendio;
	}
	
	public String getNome()
	{
		return this.nome;
	}
	public int getStipendio()
	{
		return this.stipendio;
	}
	
	public String toString()
	{
		return getNome();
	}
}
