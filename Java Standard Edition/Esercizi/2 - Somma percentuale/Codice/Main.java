package esercizi.es03;

public class Main 
{
	public static void main(String[] args) 
	{
		//Dichiaro le mie variabili
		double somma = 1000;
		double interesse = 3;
		double aumento1, aumento2, aumento3;
		double risultatoAnno1, risultatoAnno2, risultatoAnno3;
		
		//Calcolo gli incrementi anno dopo anno
		aumento1 = (somma * interesse)/100;
	    risultatoAnno1 = somma + aumento1;
		
		aumento2 = (risultatoAnno1 * interesse)/100;
		risultatoAnno2 = risultatoAnno1  + aumento2;
		
		aumento3 = (risultatoAnno2 * interesse)/100;
		risultatoAnno3 = risultatoAnno2  + aumento3;
		
		//Stampo i risultati finali
		System.out.println("La somma dopo anni 1 è di: " + risultatoAnno1);
		System.out.println("La somma dopo anni 2 è di: " + risultatoAnno2);
		System.out.println("La somma dopo anni 3 è di: " + risultatoAnno3);
	}
}
