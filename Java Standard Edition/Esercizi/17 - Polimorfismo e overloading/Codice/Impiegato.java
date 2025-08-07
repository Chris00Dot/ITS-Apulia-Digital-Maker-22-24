package esercizi.es21;

public class Impiegato extends Dipendente
{
	private int denaroStraordinari = 6;
	
	public Impiegato(String nome, int stipendio)
	{
		super(nome, stipendio);
	}
	
	public int getStipendio(int oreStraordinari)
	{
		return stipendio + (oreStraordinari * this.denaroStraordinari);
	}
}
