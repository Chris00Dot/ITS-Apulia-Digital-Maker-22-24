package esempi.incapsulamento;

public class ContoCorrente 
{
	private String iban;
	private int deposito = 0;
	
	public ContoCorrente(String iban)
	{
		this.iban = iban;
	}
	
	public void versa(int contanti)
	{
		this.deposito += contanti;
	}
	
	public void preleva(int contanti)
	{
		if(contanti <= this.deposito)
		{
			this.deposito -= contanti;
		}
		else
		{
			System.err.println("Impossibile erogare perchè non c'è abbastanza denaro nel conto!");
		}
	}
	
	public int  estrattoConto()
	{
		return deposito;
	}

}
