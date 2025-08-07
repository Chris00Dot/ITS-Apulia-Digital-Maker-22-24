package esercizi.esercizio14;

public class Medaglia {

	private String metallo;
	
	public Medaglia(String metallo) {
		this.metallo = metallo;
	}
	
	public String getMetallo() {
		return metallo;
	}
	
	public void setMetallo(String metallo) {
		this.metallo = metallo;
	}

	@Override
	public String toString() {
		return "Medaglia [metallo=" + metallo + "]";
	}
	
	
}
