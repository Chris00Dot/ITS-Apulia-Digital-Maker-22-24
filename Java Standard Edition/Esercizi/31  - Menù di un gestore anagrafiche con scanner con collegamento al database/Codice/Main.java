package esercizi.es45;

public class Main 
{
	public static void main(String[] args) 
	{
		GestoreAnagrafica gestoreAnagrafica = new GestoreAnagrafica();
		GestoreLogica gestoreLogica = new GestoreLogica(gestoreAnagrafica);
		
		gestoreLogica.init();
	}
}