package esempi.operatori;

public class Main 
{

	public static void main(String[] args) 
	{
		// ESEMPIO DI VALORE ASSOLUTO
		int a = -13;
		int valoreAssoluto = (a < 0) ? -a : a;
		System.out.println("valore assoluto di " + a + ": " + valoreAssoluto);
		System.out.println("a è " + ((a < 0)? "negativo" : "positivo"));

	}

}
