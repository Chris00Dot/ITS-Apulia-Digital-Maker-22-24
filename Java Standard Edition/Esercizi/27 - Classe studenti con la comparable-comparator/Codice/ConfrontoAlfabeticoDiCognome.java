package esercizi.es33;
import java.util.Comparator;

public class ConfrontoAlfabeticoDiCognome implements Comparator<Studente>
{
	@Override
	public int compare(Studente o1, Studente o2)
	{
		return o1.cognome.compareTo(o2.cognome);
	}
}