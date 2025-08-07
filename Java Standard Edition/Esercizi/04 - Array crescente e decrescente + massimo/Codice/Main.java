package esercizi.es07;
import java.util.Arrays;

public class Main 
{
	public static void main(String[] args) 
	{
		//Dichiaro e inizializzo il primo vettore e la variabile massimo
		int vettore[] = {34, 12, 25, 67, 39, 47, 51, 7, 22, 30};
		int max = 0;
		
		//Trovo il numero massimo e lo stampo a video
		for(int i = 0 ; i < vettore.length ; i++)
		{
			if(i == 0)
			{
				max = vettore[i];
			}
			if(vettore[i] > max)
			{
				max = vettore[i];
			}
		}
		System.out.println("Il massimo tra gli elementi dell'array è " + max);
		
		//Ordino l'array dal più piccolo al più grande e lo stampo a video
		Arrays.sort(vettore);
		System.out.println("L'array ordinato in maniera crescente è " + Arrays.toString(vettore));
		
		//Ordino un nuovo array dal più grande al più piccolo e lo stampo a video
		int vettore2[] = {24, 53, 12, 8, 65, 42, 6, 27, 90, 52};
		Arrays.sort(vettore2);
		int appoggio[] = new int[10];

		int i = 0;
		System.out.print("L'array ordinato in maniera descrescente è ");
		for(int j = vettore2.length-1 ; j >= 0 ; j--)
		{
				appoggio[i++] = vettore2[j];	
		}
		System.out.println(Arrays.toString(appoggio));
	}
}