package esempi.stringhe;

public class Stringhe 
{

	public static void main(String[] args) 
	{
		String stringa1 = "stringa";
		
		String stringa2 = new String("stringa");
		
		String stringa3 = "string" + "a";
		
		char[] array = {'s', 't', 'r', 'i', 'n', 'g', 'a'};
		String stringa4 = new String(array);
		
		// Stringa vuota & null
		String stringaVuota = "";
		String stringaNull = null;
		String stringa;
		
		System.out.println("lunghezza " + stringaVuota.length());
		// System.out.println("lunghezza " + stringaNull.length());
	    // System.out.println("lunghezza " + stringa.length());
		
		// Contenuto uguale ma oggetti diversi perchè inizializziamo con la new
		String s1 = new String ("uguale");
		String s1b = "uguale";
		String s1c = "uguale";
		System.out.print("s1==s1b? ");
		System.out.println(s1 == s1b);
		System.out.print("s1c==s1b? ");
		System.out.println(s1c == s1b);
		
		// Anche se abbiamo inizializzato la variabile s1 con new il contenuto è quello che conta, quuindi s1 e s1b sarà true
		System.out.print(s1.intern()==s1b);
		
		String s1d = s1;
		System.out.print("s1 == s1d? ");
		System.out.println(s1 == s1d);
		
		//Compariamo gli oggetti
		String s2 = "ugua";
		String s3 = s2 + "le";
		System.out.println(s1 + "=" + s2 + "?" + s1==s2);		
		System.out.println(s1==s3);
		System.out.println(s1 + " = " + s3 + " ? " + s1.equals(s3));
		
		// Ignoro il confronto tra lettere maiuscole e minuscole
		String s4 = "prova";
		String s5 = "Prova";
		System.out.println(s4.equalsIgnoreCase(s5));
		
		String s2b = s2;
		System.out.println("s2b == s2?");
		System.out.println(s2b == s2);
		
		
	}
}
