package esercizi.es02;

public class Main {

	public static void main(String[] args) 
	{
		// Dichiarazione e inizializzazione le variabili
		int base = 3;
		int altezza = 7;
		int areaR, perimetroR;
		double areaT;
		
		// Calcolo del perimetro del rettangolo e dell'area del triangolo e rettangolo
		areaR = base * altezza;
		perimetroR = (base + altezza) * 2;
		areaT = (double) (base * altezza) / 2;
		
		// Stampo il perimetro e le due aree con l'utilizzo aggiuntivo dell'operatore ternario per comparare base e altezza
		System.out.println("L'area del rettangolo di base " + base + " e altezza " + altezza + " è " + areaR);
		System.out.println("Il perimetro del rettangolo di base " + base + " e altezza " + altezza + " è " + perimetroR);
		System.out.println("Il perimetro del rettangolo di base " + base + " e altezza " + altezza + " è " + areaT);
		System.out.println("La misura dell'altezza è " + ((altezza > base)? "maggiore di quella della base" : "minore di quella della base"));
	}

}
