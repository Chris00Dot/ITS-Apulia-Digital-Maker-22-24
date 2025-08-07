package esercizi.es11;

public class Main 
{
	public static void main(String[] args) 
	{
		// Dichiaro e inizializzo le mie variabili base e altezza
		double base = 4.0;
		double altezza = 3.0;
		
		// Dichiaro il  costruttore della classe Rettangolo con base e altezza come valori attuali
		Rettangolo rettangolo = new Rettangolo(base, altezza);
		
		// Stampo a video il risultato di area e perimetro grazie al metodo toString che mi ritorna i valori di base e altezza
		System.out.println("L'area di un " + rettangolo.toString() + " è " + rettangolo.area());
		System.out.println("Il perimetro di un " + rettangolo.toString() + " è " + rettangolo.perimetro());
	}
}
