package esercizi.es12;

public class Maggiorenne 
{
	// Attributi della classe
	String nome;
    TesseraElettorale tesseraElettorale = new TesseraElettorale(false);
    static int numeroElettori;
    static int votanti;
	
	// Metodo costruttore + calcolo del numero di elettori
	public Maggiorenne(String nome)
	{
		this.nome = nome;
		numeroElettori++;
	}
	
	// Calcolo il numero di votanti
	public void vota()
	{
		tesseraElettorale.setTimbro();
		votanti++;
	}
	
	// Metodo per verificare chi ha votato grazie all'utilizzo di una selezione con l'attributo booleano "tesseraElettoriale"
	public boolean haVotato()
	{
		return tesseraElettorale.getTimbro();
	}
}
