package esercizi.es29;

public class Femmina 
{
	private String nome;
	
	public Femmina(String nome)
	{
		this.nome = nome;
	}
	
	public String toString()
	{
		return nome;
	}
	
	public void coniuge(Maschio sposo, Femmina sposa, boolean coniuge)
	{
		System.out.println((coniuge == true) ? "Il coniuge di un individuo maschio di nome " + 
		sposo + " è un individuo femmina di nome " + sposa : "Non ci sarà nessun coniuge");
	}
}