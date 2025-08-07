package esempi.arrays;

import java.util.Arrays;

public class EsempiArrays 
{

	public static void main(String[] args) 
	{
		int numeri[] = new int[3];
		int[] numeri2 = new int[3];
		int[] numeri3 = {1, 6, 3};
		/* int errore[];
		errore[0] = 1; */
		
		// Length è un attributo che applichiamo sull'array e non un metodo, quindi non vanno messe le parentesi
		System.out.println(numeri.length);
		System.out.println();
		
		// Con il sort ordino gli indici dell'array
		Arrays.sort(numeri3);
		for(int i = 0 ; i < numeri3.length ; i++)
		{
			System.out.println("Indice " + i + ": " + numeri3[i]);
		}
		System.out.println();
		
		// Ci indica direttamente il contenuto dell'array
		System.out.println(Arrays.toString(numeri3));
		System.out.println();
		
		// Mi stampa l'indice della cella in base al contenuto di essa che scrivo, e funziona solo con previo ordinamento con sort
		System.out.println(Arrays.binarySearch(numeri3, 3));
		System.out.println();
		
		// Ci riempe l'array non ancora inizializzato con il numero che inseriamo, in questo caso 0
		Arrays.fill(numeri, 0);
		System.out.println(Arrays.toString(numeri));
		System.out.println();
		
		String nomi[] = {"Gino", "Antonio", "Michele", "Pippo"};
		Arrays.sort(nomi);
		System.out.println(Arrays.toString(nomi));
		System.out.println(Arrays.binarySearch(nomi, "Michele"));
		System.out.println();
		
		//Esempio di array bidimensionali (matrici)
		int amd[][] = new int [3][3];
		amd[0][0] = 2;
		amd[0][1] = 22;
		amd[0][2] = 87;
		amd[1][0] = 56;
		amd[1][1] = 2;
		amd[1][2] = 7;
		amd[2][0] = 4;
		amd[2][1] = 3;
		amd[2][2] = 12;
		
		for(int i = 0 ; i < 3 ; i++)
		{
			for(int j = 0 ; j < 3 ; j++)
			{
				System.out.print(amd[i][j] + " ");
			}
			System.out.println();
		}
	}

}
