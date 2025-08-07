package esercizi.es45;
import java.util.LinkedList;
import java.util.List;

public class GestoreAnagrafica 
{
	private String url = "jdbc:postgresql://localhost:5432/db_anagrafiche";
	private String user= "postgres";
	private String password= "pgadmin";
	AnagraficaDB anagraficaDb = new AnagraficaDB(url, user, password);
	private List<Anagrafica> anagrafiche = new LinkedList<>();

	public void aggiungi(String nome, String cognome, String dataDiNascita, String numeroDiTelefono) 
	{
		Anagrafica anagrafica = new Anagrafica(nome, cognome, dataDiNascita, numeroDiTelefono);
		anagrafiche.add(anagrafica);
		System.out.println(anagraficaDb.insertAnagrafica(anagrafica) + " insert ok");
	}
	
	public void stampaTutti() 
	{
		List<Anagrafica> anagrafiche = anagraficaDb.selectAnagrafiche();	
		for(Anagrafica a : anagrafiche) 
		{
			System.out.println(a);
		}
	}

	public void deleteAllRows() 
	{
		anagraficaDb.deleteAllRows();	             	
	}

	public void updateById(int id, String nome, String cognome, String dataDiNascita, String telefono) 
	{
		anagraficaDb.updateById(id, nome, cognome, dataDiNascita, telefono);	
	}

	public void deleteRow(int id) 
	{
		anagraficaDb.deleteRow(id);		
	}
}