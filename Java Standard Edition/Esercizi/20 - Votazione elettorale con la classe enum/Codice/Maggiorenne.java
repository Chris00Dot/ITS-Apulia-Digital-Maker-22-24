package esercizi.es24;

public class Maggiorenne
{
	String nome;
	TesseraElettorale tesseraElettorale;
	static int numeroElettori = 0;
	
	public Maggiorenne(String nome)
	{
		this.nome = nome;
		this.tesseraElettorale = new TesseraElettorale(true);
		numeroElettori++;
	}
	
	public SchedaElettorale vota(Votazione votazione1, Opzione scelta)
	{
		this.tesseraElettorale.setTimbro(true);
		Votazione.aggiungiNumeroVotanti();
		SchedaElettorale scheda = new SchedaElettorale(scelta);
		return scheda;
	}
	
	public boolean haVotato()
	{
		return this.tesseraElettorale.getTimbro();
	}
	public boolean nonHaVotato()
	{
		return this.tesseraElettorale.nonVoto();
	}
	
	public String toString()
	{
		return this.nome;
	}
}