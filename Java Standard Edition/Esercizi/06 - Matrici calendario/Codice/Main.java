package esercizi.es09;

public class Main 
{
	public static void main(String[] args) 
	{
		// Dichiaro e inizializzo la mia costante e i miei array
		final int NUMERO_MESI = 12;
		int[] numeroGiorniPerMese = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};  // 31 = gennaio, 28 = febbraio, etc...
		String[] weekDay = {"Domenica", "Lunedi", "Martedi", "Mercoledi", "Giovedi", "Venerdi", "Sabato"};
		String[][] calendario = new String[12][31];
		
		// Creo il calendario grazie all'utilizzo di un ciclo annidato
		int j = 0;
		for(int m = 0 ; m < NUMERO_MESI ; m++)
		{
			int max = numeroGiorniPerMese[m];
			for(int i = 0 ; i < max ; i++)
			{
				// 0%7 = 0 vado nell'indice 0 ovvero domenica, incremento e vado a 1, 1%7 = 1 vado nell'indice 1 ovvero lunedi fino a quando non arrivo a 7%7 e riparto dall'indice 0 fino a quando rispetto la condizione del ciclo
				calendario[m][i] = (m + 1) + " " + (i + 1) + " " + weekDay[j % 7];
				j++;
			}
		}	
		
		// Stampo a video il numero del mese, i giorni del mese e il weekDay rispettivamente
		System.out.println(calendario[2][5]);
	}
}
