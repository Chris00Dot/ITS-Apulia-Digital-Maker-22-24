package esercizi.es25;

public class Main 
{
	public static void main(String[] args)
	{
		GiornoDellaSettimana oggi = GiornoDellaSettimana.GIOVEDI;
		
		System.out.println("oggi è " + oggi);
		System.out.println("domani è " + oggi.next());
		System.out.println("dopodomani è " + oggi.next().next());
	}
}