package esercizi.esercizio14;

public class Atleta {
	
	private String nome;
	private Medaglia medaglia;
    
	
	public Atleta(String nome) {
		this.nome = nome;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Atleta [nome=" + nome + ", medaglia=" + medaglia + "]";
	}


	public void getMedaglia(Medaglia medaglia) { 	
		 this.medaglia = medaglia;
	}


		
		
}
	
	


