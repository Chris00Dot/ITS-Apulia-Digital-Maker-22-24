package esercizi.es19;

public class Main 
{
	public static void main(String[] args)
	{
		double cateto1 = 4.0;
		double cateto2 = 3.0;
				
		TriangoloRettangolo triangoloRettangolo = new TriangoloRettangolo(cateto1, cateto2);
				
		System.out.println("L'area di un " + triangoloRettangolo + " è " + triangoloRettangolo.area());
		System.out.println("Il perimetro di un " + triangoloRettangolo + " è " + triangoloRettangolo.perimetro());
	}
}
