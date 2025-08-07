package esempi.protected_;
import esempi.ereditarieta.Animale;
import esempi.ereditarieta.Cane;

public class Esempio 
{
	public static void main(String[] args)
	{
		// Animale giraffa = new Giraffa();
		// System.out.println(giraffa + " mangia " + giraffa.mangia());
		
		// Non funziona perchè essendo un ogetto di tipo animale potrà usare solo i metodi della classe padre Animale
		// System.out.println(giraffa + " mangia " + giraffa.mangiaFoglieAlte());
		
		Giraffa giraffa = new Giraffa();
		GiraffaDelleNevi giraffaDelleNevi = new  GiraffaDelleNevi();
		Cane cane = new Cane();
		
		Animale animali[] = {giraffa, cane};
		
		for(Animale a : animali)
		{
			System.out.println(a + " mangia " + a.mangia());
		}
		
		aCaso(giraffa);
		
		System.out.println(giraffa.getSpecie());
		giraffa.mangiaFoglieAlte();
		
		giraffaDelleNevi.scia();
	}
	
	public static void aCaso(Animale animale)
	{
		
	}
}
