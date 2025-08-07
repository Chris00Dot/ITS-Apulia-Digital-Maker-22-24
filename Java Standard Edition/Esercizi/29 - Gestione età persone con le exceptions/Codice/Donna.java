package esercizi.es35;
import java.time.LocalDate;

public class Donna extends Persona 
{
	public Donna(String nome, LocalDate dataDiNascita)
	{
		super(nome, dataDiNascita);
	}
	
	@Override
	public int getEta() throws LuogoComuneException 
	{
		int eta = super.getEta();
		if(eta > 40)
		{
			throw new LuogoComuneException("Non si chiede l'età ad una signora");
		}
		else
		{
			return eta;	
		}
	}
}