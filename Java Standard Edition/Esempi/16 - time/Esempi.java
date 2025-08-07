package esempi.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAdjusters;

public class Esempi 
{
	public static void main(String[] args) 
	{
		LocalDate dataDiNascita = LocalDate.of(2010, 1, 1);
		LocalDate dataDiNascita2 = LocalDate.of(2010, Month.APRIL, 1);
		
		LocalTime oraDelGiorno = LocalTime.of(12, 30);
		
		// Stampo a video la data di nascita che ho inserito
		System.out.println(dataDiNascita);
		
		// Stampo a video la data odierna
		LocalDate primoCompleanno = dataDiNascita.plusYears(1);
		LocalDate oggi = LocalDate.now();
		System.out.println();
		System.out.println(oggi);
		
		// Stampo a video la differenza di anni dalla data di nascita e la data odierna
		System.out.println();
		System.out.println(Period.between(primoCompleanno, oggi).getYears());
		
		// Stampo a video se le due date di nascita sono uguali o no
		System.out.println();
		System.out.println("sono uguali? " + (dataDiNascita == dataDiNascita2));
		System.out.println("sono uguali? " + (dataDiNascita.equals(dataDiNascita2)));
		
		// Stampo a video l'ultimo giorno del mese odierno e di quello di giugno
		System.out.println();
		System.out.println("with...");
		LocalDate ultimoDelMese = oggi.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println(ultimoDelMese);
		System.out.println(ultimoDelMese.with(Month.JUNE));
		
		// Stampo a video la data odierna convertendo il formato
		System.out.println();
		System.out.println("from...");
		LocalDateTime adesso = LocalDateTime.now();
		oggi = LocalDate.from(adesso);
		System.out.println(oggi);
		
		// Stampo a video un passaggio pattern di data rendendola una stringa, convertendo la data italiana in quella anglosassone
		System.out.println();
		System.out.println("DateTimeFormatter...");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String data = "03/06/2023";
		LocalDate dataParsata = LocalDate.parse(data, formatter);
		System.out.println(dataParsata);
		
		// Stampo a video una formattazione pattern di data rendendola una stringa, convertendo la data anglosassone in quella italiana
		System.out.println();
		String dataParsataFormattata = dataParsata.format(formatter);
		System.out.println(dataParsataFormattata);
		
		// Alternative al dateTimeFormatter
		System.out.println();
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd - MMMM - yy");
		DateTimeFormatter formatter3 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
	}
}