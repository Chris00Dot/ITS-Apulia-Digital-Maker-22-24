package esercizi.es29;

public class Parroco implements Officiante
{
	private String nome;
	
	public Parroco(String nome)
	{
		this.nome = nome;
	}
	
	public void unisceInMatrimonio(Maschio sposo, Femmina sposa, boolean coniuge)
	{
		System.out.println((coniuge == true) ? "Il parroco " + nome + " ha sposato in Chiesa un individuo maschio di nome " + 
	    sposo + " e un individuo femmina di nome " + sposa : "Non ci sarà nessun matrimonio e quindi nessun coniuge");
	}
	
	public String toString()
	{
		return nome;
	}
}