package esempi.ereditarieta;

public class Cane extends Animale
{
	public Cane()
	{
		super("cane");
	}
	
	@Override
	public Cibo mangia() 
	{
		return new Cibo("crocchette");
	}
}
