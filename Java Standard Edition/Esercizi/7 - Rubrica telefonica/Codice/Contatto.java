package esercizi.es10;

public class Contatto 
{
	// Attributi della classe
	String nome;
	String cognome;
	String numero;
	
	// Metodo costruttore
	public Contatto(String nome, String cognome, String numero)
	{
		this.nome = nome;
		this.cognome = cognome;
		this.numero = numero;
	}
	
	// Metodi getter e setter
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public String getNome()
	{
		return this.nome;
	}
	
	public void setCognome(String cognome)
	{
		this.cognome = cognome;
	}
	public String getCognome()
	{
		return this.cognome;
	}
	
	public void setNumero(String numero)
	{
		this.numero = numero;
	}
	public String getNumero()
	{
		return this.numero;
	}
	
	// Metodo toString per la stampa
	public String toString()
	{
		return getNome() + " " + getCognome() + ": " + getNumero();
	}
}
