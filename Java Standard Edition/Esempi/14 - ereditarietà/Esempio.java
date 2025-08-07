package esempi.ereditarieta;

public class Esempio 
{
	public static void main(String[] args) 
	{
		Animale animale = new Animale("gatto");
		Cane cane = new Cane();
		Cavallo cavallo = new Cavallo();
		
		animale.mangia();
		System.out.println(animale + " mangia " + animale.mangia());
		System.out.println(cane + " mangia " + cane.mangia());
		System.out.println(cavallo.specie + " mangia " + cavallo.mangia());
	}
}
