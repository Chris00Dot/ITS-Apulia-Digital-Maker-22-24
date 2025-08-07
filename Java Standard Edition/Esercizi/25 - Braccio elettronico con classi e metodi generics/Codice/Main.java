package esercizi.es30;

public class Main 
{
	public static void main(String[] args) 
	{
		BraccioElettronico braccioElettronico = new BraccioElettronico();
		Bottiglia<Acqua> acqua = new Bottiglia<Acqua>(new Acqua());
		Bottiglia<Olio> olio = new Bottiglia<Olio>(new Olio());
		
		braccioElettronico.versaContenuto(acqua, "1.0l");
		braccioElettronico.versaContenuto(olio, "0.5l");
	}
}