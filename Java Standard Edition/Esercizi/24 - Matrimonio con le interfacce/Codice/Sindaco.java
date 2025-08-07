package esercizi.es29;

public class Sindaco implements Officiante
{
	private String nome;
	
	public Sindaco(String nome)
	{
		this.nome = nome;
	}
	
	public void unisceInMatrimonio(Maschio sposo, Femmina sposa, boolean coniuge)
	{
		System.out.println((coniuge == true) ? "Il sindaco " + nome + " ha sposato in Comune un individuo maschio di nome " + 
	    sposo + " e un individuo femmina di nome " + sposa : "Non ci sarà nessun matrimonio e quindi nessun coniuge");
	}
	
	public String toString()
	{
		return nome;
	}
}