package esercizi.es33;
import java.time.LocalDate;
import java.time.Period;

public class Studente implements Comparable<Studente>
{
	String nome;
	String cognome;
	LocalDate dataDiNascita;
	int eta;
	
	public Studente(String nome, String cognome, LocalDate dataDiNascita)
	{
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = dataDiNascita;
		
		eta = Period.between(dataDiNascita, LocalDate.now()).getYears();
	}
	
	public String toString()
	{
		return cognome + " " + nome + " di " + eta + " anni ";
	}
	
	public int compareTo(Studente s)
	{
		return s.eta - this.eta;
	}
}