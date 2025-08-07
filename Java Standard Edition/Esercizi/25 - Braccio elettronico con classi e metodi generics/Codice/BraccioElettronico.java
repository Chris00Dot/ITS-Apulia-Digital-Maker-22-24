package esercizi.es30;

public class BraccioElettronico
{
	public void versaContenuto(Bottiglia<?> liquido, String quantita)
	{
		System.out.println("Sto versando il contenuto di una bottiglia di " + liquido.getQuantita() + "\n" + quantita + " di " + liquido.getQuantita());
	}
}