public class Main 
{
	public static void main(String[] args) 
	{
		// Dichiaro e inizializzo le mie variabili cateto1 e cateto2
		double cateto1 = 4.0;
		double cateto2 = 3.0;
		
		// Istanzio l'oggetto della classe Triangolo con cateto1 e cateto2 come valori attuali
		TriangoloRettangolo triangoloRettangolo = new TriangoloRettangolo(cateto1, cateto2);
		
		// Stampo a video il risultato di perimetro, area e ipotenusa grazie al metodo toString 
		System.out.println("L'area di un " + triangoloRettangolo + " è " + triangoloRettangolo.area());
		System.out.println("Il perimetro di un " + triangoloRettangolo + " è " + triangoloRettangolo.perimetro());
	}

}