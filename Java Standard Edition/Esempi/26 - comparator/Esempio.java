package esempi.comparator;
import java.util.ArrayList;
import java.util.Collections;

import esempi.comparable.arraylist.Auto;

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
		
		// Ordine alfabetico di modello
		System.out.println("---------");
		Collections.sort(autoDromo, new ConfrontoAlfabeticoModelloAuto());
		for(Auto a: autoDromo)
		{
			System.out.println(a);
		}
		
		// Ordine numerico di velocità massima
		System.out.println("---------");
		Collections.sort(autoDromo, new ConfrontoVelocitaAuto());
		for(Auto a: autoDromo)
		{
			System.out.println(a);
		}
	}

}
