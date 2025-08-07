package esempi.hashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class EsempioHashSet 
{
	public static void main(String[] args) 
	{
		// Dichiarazione list e hashset
		List<Integer> tantiNumeri = new ArrayList<>(List.of(1, 4, 7, 3, -4, -8, 4, 1, -8, 7, 1));
		
		HashSet<Integer> numeri = new HashSet<Integer>();
		for(Integer i : tantiNumeri)
		{
			numeri.add(i);
		}
		
		System.out.println(numeri);
	}
}
