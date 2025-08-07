package esercizi.es18;

public class Main 
{
	public static void main(String[] args) 
	{
		double lato = 4.0;
		Quadrato quadrato = new Quadrato(lato);
		
		quadrato.area();
		quadrato.perimetro();

		System.out.println("L'area di un " + quadrato + " è " + quadrato.area());
		System.out.println("Il perimetro di un " + quadrato + " è " + quadrato.perimetro());
	}
}
