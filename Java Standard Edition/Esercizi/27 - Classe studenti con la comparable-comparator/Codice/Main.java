package esercizi.es33;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Main 
{
	public static void main(String[] args) 
	{
		Studente mario = new Studente("Mario", "Rossi", LocalDate.of(1982, 04, 11));
		Studente giorgio = new Studente("Giorgio", "Rossi", LocalDate.of(1981, 02, 20));
		Studente stefano = new Studente("Stefano", "Bianchi", LocalDate.of(1983, 05, 16));
		Studente anna = new Studente("Anna", "Verdi", LocalDate.of(1982, 02, 17));
		
		ArrayList<Studente> classe = new ArrayList<Studente>();
		classe.add(mario);
		classe.add(giorgio);
		classe.add(stefano);
		classe.add(anna);
		
		
		// ORDINE DI ETA' DECRESCENTE
		System.out.println("Ordine di età: \n");
		Collections.sort(classe);
		for(Studente s: classe)
		{
			System.out.println(s);
		}
		
		System.out.println();
		
		// ORDINE ALFABETICO PER COGNOME NOME
		System.out.println("Ordine alfabetico: \n");
		Collections.sort(classe, new ConfrontoAlfabeticoDiCognome());
		for(Studente s: classe)
		{
			System.out.println(s);
		}
	}
}