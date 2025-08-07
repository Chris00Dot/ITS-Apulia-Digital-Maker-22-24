package esercizi.es30;

public class Bottiglia<T>
{
	private T quantita;
	
	public Bottiglia(T quantita)
	{
		this.quantita = quantita;
	}
	
	public T getQuantita()
	{
		return quantita;
	} 
}