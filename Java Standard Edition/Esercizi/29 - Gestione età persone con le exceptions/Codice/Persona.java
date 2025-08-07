package esercizi.es35;
import java.time.LocalDate;
import java.time.Period;

public class Persona 
{
	String nome;
	LocalDate dataDiNascita;
	
	public Persona(String nome, LocalDate dataDiNascita)
	{
		this.nome = nome;
		this.dataDiNascita = dataDiNascita;
	}
	
	public String getNome()
	{
		return this.nome;
	}
	public LocalDate getDataDiNascita()
	{
		return this.dataDiNascita;
	}
	
	public int getEta() throws LuogoComuneException
	{
		return Period.between(dataDiNascita, LocalDate.now()).getYears();
	}
	
	@Override
	public String toString()
	{
		return nome;
	}
}