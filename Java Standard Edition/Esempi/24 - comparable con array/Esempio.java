package esempi.comparable.array;
import java.util.Arrays;

public class Esempio 
{
	public static void main(String[] args)
	{
		Auto astra = new Auto("Opel", "Astra", 180);
		Auto[] autoSalone = {new Auto("Renault", "Clio", 150), new Auto("Ford", "Puma", 200), astra, new Auto("Volkswagen", "Golf", 190)};
		
		for(Auto a: autoSalone)
		{
			System.out.println(a);
		}
		
		// Ordine alfabetico di marca
		System.out.println("---------");
		Arrays.sort(autoSalone);
		for(Auto a: autoSalone)
		{
			System.out.println(a);
		}
	}
}
