package esercizi.es28;

public class SchedaElettorale 
{
	Opzione scelta;
		
	public SchedaElettorale(Opzione scelta)
	{
		this.scelta = scelta;
	}
	
	public void setScelta(Opzione scelta)
	{
		this.scelta = scelta;
	}
	public Opzione getScelta()
	{
		return this.scelta;
	}
}