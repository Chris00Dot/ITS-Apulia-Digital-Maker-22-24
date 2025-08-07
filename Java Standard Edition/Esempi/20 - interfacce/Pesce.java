package Pacchetto1;

public class Pesce implements Preda, Predatore
{
	@Override
	public void caccia()
	{
		System.out.println("Il pesce grosso caccia quello piu' piccolo");
	}
	
	@Override
	public void scappa()
	{
		System.out.println("Il pesce piccolo scappa da quelli piu' grossi");
	}
}
