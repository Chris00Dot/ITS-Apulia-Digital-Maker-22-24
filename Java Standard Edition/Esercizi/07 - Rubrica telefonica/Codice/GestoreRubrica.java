package esercizi.es10;

public class GestoreRubrica 
{
	// Dichiaro e inizializzo il mio array
	Contatto contatti[] = new Contatto[200];
	int i = 0;
	
	// Definisco gli indici in base a quanti oggetti "contatto" ho istanziato 
	public void aggiungiContatto(Contatto contatto)
	{
		contatti[i] = contatto;
		i++;
	}
	
	// Stampo le info dei contatti, ed essendo un array di 200 indici con solo 4 contatti istanziati, utilizzerò una selezione per evitare che mi vengano i 196 indici vuoti "null"
	public void stampa()
	{
		System.out.println("Rubrica: \n");
		System.out.println("--------------------------------------");
		for(int i = 0 ; i < contatti.length ; i++)
		{
			if(contatti[i] != null)
			{
				System.out.println(contatti[i]);
			}
		}
	}
}
