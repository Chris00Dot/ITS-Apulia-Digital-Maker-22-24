package esercizi.es44;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Anagrafica
{
	String nome;
	String cognome;
	LocalDate dataDiNascita;
	String numero;
	DateTimeFormatter formatter;
	
	public Anagrafica(String nome, String cognome, String dataDiNascita, String numero)
	{
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = formattazioneData(dataDiNascita);
		this.numero = numero;
	}
	
	public LocalDate formattazioneData(String dataDiNascita)
	{
		formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataParsata = LocalDate.parse(dataDiNascita, formatter);
		return dataParsata;
	}
	public String stampaFormattazione()
	{
		String dataParsataFormattata = dataDiNascita.format(formatter);
		return dataParsataFormattata;
	}
	
	public String toString()
	{
		return "[" + nome + "|" + cognome + "|" + stampaFormattazione() + "|" + numero + "]";
	}
}