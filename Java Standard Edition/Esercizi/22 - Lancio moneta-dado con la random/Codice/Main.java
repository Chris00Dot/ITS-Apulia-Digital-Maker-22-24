package esercizi.es27;



public class Main {

	public static void main(String[] args) {

		Moneta moneta = new Moneta(2);
		Dado dado = new Dado(6);

		
		dado.lancio();
		moneta.lancio();
		dado.print();
		
	}

}
