package esempi.db2;
import java.util.List;

public class Main 
{
	public static void main(String[] args) 
	{
		String url = "jdbc:postgresql://localhost:5432/db_anagrafiche";
		String user = "postgres";
		String password = "postgres";
		
		Persona gino = new Persona("Gino");
		PersonaDB gestorePersonaDB = new PersonaDB(url, user, password);
		
		gestorePersonaDB.insertPersona(gino);
		gestorePersonaDB.updatePersonaById(1, "Tino");
		gestorePersonaDB.deletePersonaById(3);
		gestorePersonaDB.selectPersonaByNome("Gino");
		
		List<Persona> persone = gestorePersonaDB.selectPersonaByNome("Gino");
		
		for(Persona p: persone)
		{
			System.out.println(p);
		}
	}
}
