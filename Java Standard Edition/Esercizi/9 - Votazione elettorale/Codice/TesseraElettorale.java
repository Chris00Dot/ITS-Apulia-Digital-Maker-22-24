package esercizi.es12;

public class TesseraElettorale 
{
	// Attributo della classe
	boolean timbro;
	
	// Metodo costruttore
	public TesseraElettorale(boolean timbro)
	{
		this.timbro = timbro;
	}
	
	// Imposto il mio timbro per le votazioni
	public void setTimbro()
	{
		this.timbro = true;
	}
	
	// Restituisco il valore del timbro
	public boolean getTimbro()
	{
		return this.timbro;
	}

}
