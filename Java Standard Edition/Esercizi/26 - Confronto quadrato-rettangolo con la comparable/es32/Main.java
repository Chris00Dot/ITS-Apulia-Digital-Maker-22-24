package esercizi.es32;
import java.util.Arrays;

public class Main 
{
	public static void main(String[] args) 
	{
		Quadrato quadrato = new Quadrato(4.1);
		Rettangolo rettangolo = new Rettangolo(8.1, 2.0);
		Rettangolo confrontoGeometrico[] = {rettangolo, quadrato, new Rettangolo(2.0, 8.0)};
		
		// ORDINE CRESCENTE DEL RISULTATO DELLE AREE
		Arrays.sort(confrontoGeometrico);
		for(Rettangolo a: confrontoGeometrico)
		{
			System.out.println(a);
		}
	}
}