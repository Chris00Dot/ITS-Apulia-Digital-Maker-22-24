package esempi.comparator;
import java.util.Comparator;

import esempi.comparable.arraylist.Auto;

public class ConfrontoVelocitaAuto implements Comparator<Auto> 
{
	@Override
	public int compare(Auto o1, Auto o2)
	{
		return o1.velocitaMax - o2.velocitaMax;
	}
}
