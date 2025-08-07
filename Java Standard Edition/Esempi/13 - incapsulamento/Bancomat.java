package esempi.incapsulamento;

public class Bancomat 
{

	public static void main(String[] args)
	{
		ContoCorrente ccGino = new ContoCorrente("23674346723");
		ccGino.versa(300);
		ccGino.preleva(400);
		System.out.println(ccGino.estrattoConto());
		
	}
}
