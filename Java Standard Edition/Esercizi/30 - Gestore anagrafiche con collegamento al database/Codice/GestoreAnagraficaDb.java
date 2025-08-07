package esercizi.es44;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GestoreAnagraficaDb 
{
	private String url;
	private String user;
	private String password;
	
	// METTENDOLO PRIVATE NON MI FARA' RIPETERE LA STESSA CONNECTION
	private Connection conn;
	
	public GestoreAnagraficaDb(String url, String user, String password)
	{
		this.url = url;
		this.user = user;
		this.password = password;
		getConnection();
	}
	
	public void getConnection()
	{	
		try
		{
			this.conn = DriverManager.getConnection(url, user, password);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	public int aggiungiAnagrafica(Anagrafica anagrafica)
	{
		String insert = "INSERT INTO anagrafica (nome, cognome, data_di_nascita, numero) VALUES (?, ?, ?, ?)";
		try(PreparedStatement stmt = conn.prepareStatement(insert))
		{
			stmt.setString(1, anagrafica.nome);
			stmt.setString(2, anagrafica.cognome);
			stmt.setDate(3, Date.valueOf(anagrafica.dataDiNascita));
			stmt.setString(4, anagrafica.numero);
			return stmt.executeUpdate();
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		return 0;
	}
	
	public void stampaAnagrafica()
	{
		List<Anagrafica> anagrafiche = new ArrayList<Anagrafica>();
		Iterator<Anagrafica> it = anagrafiche.iterator();
		while(it.hasNext())
		{
			Anagrafica a = it.next();
			System.out.println(a);
		}
	}
}