package esercizi.esercizio14;

public class GestoreMedaglie {
	
	public String daiMedaglia(Medaglia medaglia) {
		String stato;
		
		switch(medaglia.getMetallo()) {
		
		case "oro" : stato = medaglia.getMetallo(); break;
		
		case "argento": stato = medaglia.getMetallo(); break;
		
		case "bronzo": stato = medaglia.getMetallo(); break;
		
		default: stato = "Non esiste";
		
		}
		
		return stato;
			
	}
	

	

}
