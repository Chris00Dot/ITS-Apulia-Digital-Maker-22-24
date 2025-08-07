package esercizi.es16;

public class Main 
{
	public static void main(String[] args)
	{
		// Dichiaro e inizializzo le mie variabili lato1, lato2, lato3
		double lato1 = 7.0;
		double lato2 = 7.0;
		double lato3 = 7.0;
		
		// Istanzio l'oggetto della classe Triangolo con lato1, lato2 e lato3 come valori attuali
		Triangolo triangolo = new Triangolo(lato1, lato2, lato3);
		
		// Stampo a video il risultato di perimetro grazie al metodo toString che mi ritorna i valori dei lati
		System.out.println("Il perimetro del " + triangolo + " è " + triangolo.perimetro());
	}
}
