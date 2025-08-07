package esercizi.es27;

public abstract class OggettoLanciato {
   
	
	public int numfacce ;

	public OggettoLanciato(int numfacce) {
		
		this.numfacce = numfacce;
	}
	
	
	public abstract void lancio();
	
	
	
	public void print() {
		System.out.println(numfacce);
	}


	
	
	}
	
   
   
   
   
   
   

