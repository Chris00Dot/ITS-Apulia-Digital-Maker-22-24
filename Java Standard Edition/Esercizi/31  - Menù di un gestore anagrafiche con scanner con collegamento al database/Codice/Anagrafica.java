package esercizi.es45;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Anagrafica 
{
	private int id;
	private String nome;
	private String cognome;
	private LocalDate dataDiNascita;
	private String numeroDiTelefono;
	private DateTimeFormatter formatter;
	
	public Anagrafica( String nome, String cognome, String dataDiNascita, String numeroDiTelefono)
	{		
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = formattazioneInEntrata(dataDiNascita);
		this.numeroDiTelefono = numeroDiTelefono;		
	}

	public Anagrafica(int id, String nome, String cognome, LocalDate dataDiNascita, String numeroDiTelefono) 
	{
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = dataDiNascita;
		this.numeroDiTelefono = numeroDiTelefono;	
	}

	public String getNome() 
	{
		return nome;
	}
	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public String getCognome() 
	{
		return cognome;
	}
	public void setCognome(String cognome) 
	{
		this.cognome = cognome;
	}

	public LocalDate getDataDiNascita() 
	{
		return dataDiNascita;
	}
	public void setDataDiNascita(LocalDate dataDiNascita) 
	{
		this.dataDiNascita = dataDiNascita;
	}

	public String getNumeroDiTelefono() 
	{
		return numeroDiTelefono;
	}
	public void setNumeroDiTelefono(String numeroDiTelefono) 
	{
		this.numeroDiTelefono = numeroDiTelefono;
	}

	private LocalDate formattazioneInEntrata(String dataDiNascita) 
	{
		formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataParsata = LocalDate.parse(dataDiNascita, formatter);
		return dataParsata;
	}
	public String stampaDataFormattataInString() 
	{	
		String dataParsataFormatter = dataDiNascita.format(formatter);
		return dataParsataFormatter;
	}
	
	@Override
	public String toString() 
	{
		return  "[" + id + "|" + nome + "|" + cognome + "|" + dataDiNascita + "|" + numeroDiTelefono + "]";
	}
}