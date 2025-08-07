package esercizi.es27;



public class Dado extends OggettoLanciato {

	
	
	public Dado(int numfacce) {
		super(numfacce);
		
		
	}

	@Override
	public void lancio() {
		numfacce=(1+(int)(Math.random()* 6));
	}


	
}
