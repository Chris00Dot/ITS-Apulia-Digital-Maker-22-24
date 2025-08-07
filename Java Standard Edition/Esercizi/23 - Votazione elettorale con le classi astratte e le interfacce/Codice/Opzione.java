package esercizi.es28;
import java.util.Random;

public enum Opzione 
{
	MONARCHIA, REPUBBLICA;
	
	private static Random r = new Random();
	
	public static Opzione sceglieCosaVotare()
	{
		return Opzione.values()[r.nextInt(Opzione.values().length)];
	}
}