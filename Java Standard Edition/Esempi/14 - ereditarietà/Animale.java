package esempi.ereditarieta;

public class Animale 
{
	protected String specie = "animale"; 
	
	public Animale(){}
	
	public Animale(String specie) 
	{
		this.specie = specie;
	}

	public Cibo mangia()
	{
		return new Cibo("cibo per " + specie);
	}
	
	public String toString()
	{
		return specie;
	}
}
