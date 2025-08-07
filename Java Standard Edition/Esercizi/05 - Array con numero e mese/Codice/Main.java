package esercizi.es08;

public class Main 
{

	public static void main(String[] args) 
	{
		// Array con i numeri del mese
		int numeri[] = new int[31];
		for(int i = 0 ; i < numeri.length; i++)
		{
			numeri[i] = i + 1;
		}
		
		// Array con i giorni della settimana
		String giorni[] = {"Lunedi", "Martedi", "Mercoledi", "Giovedi", "Venerdi", "Sabato", "Domenica"};
		
		for(int i = 0, j = 6 ; i < 31 ; i++, j++)
		{
			System.out.println(numeri[i] + " Gennaio " + giorni[j]);
			if(j == 6)
			{
				j = - 1;
			}
		}	
	}
}
