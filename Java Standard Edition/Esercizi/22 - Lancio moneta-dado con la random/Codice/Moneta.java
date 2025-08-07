package esercizi.es27;



public class Moneta extends OggettoLanciato {
	public enum faccia{
		TESTA,
		CROCE;
	}
	
	
	public Moneta(int numfacce) {
		super(numfacce);
		

}

	@Override
	public void lancio() {
		numfacce=(int)(Math.random()* 2);
		if(numfacce ==0) {
			System.out.println("Testa");
		}else {
			System.out.println("Croce");
		}
	}
}
