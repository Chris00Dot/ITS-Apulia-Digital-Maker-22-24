package esercizi.es24;

public class TesseraElettorale 
{
	boolean timbro;
	boolean nonVoto;
	
	public TesseraElettorale(boolean timbro)
	{
		this.timbro = timbro;
	}
	
	public void setTimbro(boolean timbro)
	{
		this.timbro = timbro;
	}
	public boolean getTimbro()
	{
		return this.timbro;
	}
	
	public boolean nonVoto()
	{
		return this.nonVoto;
	}
}