package esempi.comparable.arraylist;
import java.util.ArrayList;
import java.util.Collections;


public class Esempio 
{
	public static void main(String[] args)
	{
		Auto astra = new Auto("Opel", "Astra", 180);
		ArrayList<Auto> autoDromo = new ArrayList<>();
		autoDromo.add(astra); autoDromo.add(new Auto("Renault", "Clio", 150));
		autoDromo.add(new Auto("Ford", "Puma", 200));
		
		for(Auto a: autoDromo)
		{
			System.out.println(a);
		}
		
		// Ordine alfabetico di marca
		System.out.println("---------");
		Collections.sort(autoDromo);
		for(Auto a: autoDromo)
		{
			System.out.println(a);
		}
		
	}

}
