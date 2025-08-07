package esercizi.es05;

public class Main 
{
	public static void main(String[] args)
	{
		//Dichiaro il valore numerico di un mese
		int mese = 6;
		
		//Costrutto switch-case
		switch(mese){
		
		case 1: case 2:
			System.out.println("Inverno");
			break;
		case 3: case 4:
			System.out.println("Inverno o Primavera");
			break;
		case 5:
			System.out.println("Primavera");
			break;
		case 6:
			System.out.println("Primavera o Estate");
			break;
		case 7: case 8:
			System.out.println("Estate");
			break;
		case 9:
			System.out.println("Estate o Autunno");
			break;
		case 10: case 11:
			System.out.println("Autunno");
			break;
		case 12:
			System.out.println("Autunno o Inverno");
			break;
		default:
			System.out.println("Nessun mese");
			
		}
	}
}
