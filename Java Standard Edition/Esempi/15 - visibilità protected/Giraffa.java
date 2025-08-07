package esempi.protected_;
import esempi.ereditarieta.Animale;
import esempi.ereditarieta.Cibo;

public class Giraffa extends Animale
{
	public Giraffa()
	{
		super("giraffa");
	}
	
	@Override
	public Cibo mangia()
	{
		return new Cibo("foglie");
	}
	
	public void mangiaFoglieAlte()
	{
		System.out.println("mangia foglie alte");
	}
	
	public String getSpecie()
	{
		return super.specie;
	}
}
