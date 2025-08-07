package esercizi.es10;

public class Main 
{
	public static void main(String[] args) 
	{
		// Istanzio l'oggetto rubrica e gli oggetti contatti
		GestoreRubrica rubrica = new GestoreRubrica();
		Contatto contatto = new Contatto("Roberto", "Baggio", "3334567890");
		Contatto contatto2 = new Contatto("Roberto", "Mancini", "33345645678");
		Contatto contatto3 = new Contatto("Alex", "Del Piero", "3569828402");
		Contatto contatto4 = new Contatto("Francesco", "Totti", "3498726632");
		
		// Stampo a video il contenuto
		rubrica.aggiungiContatto(contatto);
		rubrica.aggiungiContatto(contatto2);
		rubrica.aggiungiContatto(contatto3);
		rubrica.aggiungiContatto(contatto4);
		rubrica.stampa();
	}
}
