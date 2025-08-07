package esercizi.es21;

public class Main 
{
	public static void main(String[] args) 
	{
		Funzionario pino = new Funzionario("Pino", 2000);
		Impiegato gino = new Impiegato("Gino", 1200);
		
		System.out.println(gino + " questo mese ha guadagnato " + gino.getStipendio(20) + "€");
	    System.out.println(pino + " questo mese ha guadaganto " + pino.getStipendio() + "€");
	}
}
