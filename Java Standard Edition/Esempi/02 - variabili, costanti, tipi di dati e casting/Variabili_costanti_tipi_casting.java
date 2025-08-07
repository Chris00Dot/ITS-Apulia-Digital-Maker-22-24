package esempi.variabili;

public class Variabili 
{
	static final int COSTANTE_C = 3;     // SNAKECASE, variabile statica
	int  numero = 40;  // variabile d'istanza
	
	public static void metodo()
	{
		int numero = 41;  //variabile locale
	}

	public static void main(String[] args) 
	{
		int variabileEsplicativa = 2;    // variabili lowerCamelCase
		int numero = 42;
		
		
		Auto fiatPanda = new Auto("Fiat", "Panda");
		Armadio armadioGiallo = new Armadio("Giallo");
		Fiat panda = new Fiat("Panda");
		
		Variabili.metodo();
		System.out.println(numero);
		
		boolean ilBoolean = true;
		byte IlByte = 127;
		short loShort = 34;
		int LInt = 1_626_325_264;
		long ilLong = 8903L;
		float ilFloat = 2.6786F;
		double ilDouble = 2.453454;
		char ilChar = 'c';
		String stringa = "ciao";
		
		// CASTING IMPLICITO
		int a = 33;
		double b = a;
		System.out.println(b);
		
		// CASTING ESPLICITO
		int c = (int) b;
		System.out.println(c);
		
	}

}
