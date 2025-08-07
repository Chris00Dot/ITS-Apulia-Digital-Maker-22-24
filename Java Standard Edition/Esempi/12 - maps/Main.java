package esempi.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main 
{
	public static void main(String[] args)
	{
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		
		// Inserimento
		map1.put("uno", 1);
		map1.put("due", 2);
		map1.put("tre", 3);
		map1.put("quattro", 4);
		map1.put("cinque", 5);
		
		// Stampo a video la map
		System.out.println(map1);
		
		System.out.println();
		
		// Restiuisce un set di entry che andiamo a ciclare
		Set<Entry<String, Integer>> entrySet = map1.entrySet();
		for(var set : entrySet)
		{
			System.out.println("Key: " + set.getKey() + " val: " +set.getValue());
		}
		
		System.out.println();
		
		
		var map2 = new HashMap<String, Integer>();
		map2.put("sei", 6);
		System.out.println(map2);
		// Inserisco il contenuto della map1 nel map2
		map2.putAll(map1);
		System.out.println(map2);
		
		System.out.println();
		
		// Sostituisco il valore dell'elemento
		map2.put("cinque", 55);
		System.out.println(map2);
		
		System.out.println();
		
		// Cicliamo e ci restituisce un set di chiavi
		var entries = map1.keySet();
		for(var key : entries)
		{
			System.out.println("Key: " + key + " val: " + map2.get(key));
		}
		
		System.out.println();
		
		// Iteratore di stringhe che mi cicla una colelction con remove
		Iterator<String> it = map2.keySet().iterator();
		while(it.hasNext())
		{
			String a = it.next();
			if(a.equals("due"))
			{
				it.remove();
			}
			System.out.println("Key: " + a + " val: " + map2.get(a));
		}
		
		System.out.println();
		
		// Altre operazioni
		System.out.println(map1.get("cinque"));
		System.out.println(map1.containsKey("cinque"));
		System.out.println(map1.containsValue(3));
		System.out.println(map1.size());
		
		System.out.println();
		
		// Lambda con remove
		map1.forEach((k, v) -> 
		{
			System.out.println(k + " " + v);
		});
		map1.remove("cinque");
		
		System.out.println();
		
		// Operazione clear
		map2.clear();
		System.out.println(map2);
	}
}
