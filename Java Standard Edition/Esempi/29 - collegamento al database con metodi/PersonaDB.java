package esempi.db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonaDB
{
	private String url;
	private String user;
	private String password;
	
	// METTENDOLO PRIVATE NON MI FARA' RIPETERE LA STESSA CONNECTION
	private Connection conn;
	
	public PersonaDB(String url, String user, String password)
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
	
	public int insertPersona(Persona persona)
	{
		String insert = "INSERT INTO persona (nome) VALUES (?)";
		try(PreparedStatement stmt = conn.prepareStatement(insert))
		{
			// 1, PERCHE' ABBIAMO SOLO (nome), mentre (?) è gino
			stmt.setString(1, persona.nome);
			return stmt.executeUpdate();
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		return 0;
	}
	
	public int updatePersonaById(int id, String nome)
	{
		String update = "UPDATE persona SET nome = ? WHERE id = ?";
		try(PreparedStatement stmt = conn.prepareStatement(update))
		{
			stmt.setString(1, nome);
			stmt.setInt(2, id);
			return stmt.executeUpdate();
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}	
		return 0;
	}
	
	public int deletePersonaById(int id)
	{
		String delete = "DELETE from persona WHERE id = ?";
		try(Connection conn = DriverManager.getConnection(url, user, password);
		PreparedStatement stmt = conn.prepareStatement(delete))
		{
			stmt.setInt(1, id);
			return stmt.executeUpdate();
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}	
		return 0;
	}
	
	public List<Persona> selectPersonaByNome(String nome)
	{
		String select = "SELECT id, nome FROM persona WHERE nome = ?";
		List<Persona> esempi = new ArrayList<Persona>();
		try(Connection conn = DriverManager.getConnection(url, user, password);
		PreparedStatement stmt = conn.prepareStatement(select))
		{
			stmt.setString(1, nome);	
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next())
			{
				int id = rs.getInt("id");
				String nomePersona = rs.getString("nome");
		        System.out.println(id + " " + nome);
		        esempi.add(new Persona(nomePersona));
			}
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}	
		return esempi;
	}
}