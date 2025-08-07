package esempi.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main 
{
	public static void main(String[] args)
	{
		String url = "jdbc:postgresql://localhost:5432/db_anagrafiche";
		String user = "postgres";
		String password = "postgres";
		
		try(Connection conn = DriverManager.getConnection(url, user, password))
		{
			System.out.println("Connessione avvenuta!");
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("--------------------------------------------------");
		
		String insert = "INSERT INTO esempio (nome) VALUES (?)";
		try(Connection conn = DriverManager.getConnection(url, user, password);
		PreparedStatement stmt = conn.prepareStatement(insert))
		{
			// 1, PERCHE' ABBIAMO SOLO (nome), mentre (?) è gino
			stmt.setString(1, "gino");
			stmt.executeUpdate();
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}	
		
		System.out.println("--------------------------------------------------");
		
		String update = "UPDATE esempio SET nome = ? WHERE id = ?";
		try(Connection conn = DriverManager.getConnection(url, user, password);
		PreparedStatement stmt = conn.prepareStatement(update))
		{
			stmt.setString(1, "tino");
			stmt.setInt(2, 1);
			stmt.executeUpdate();
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}	
		
		System.out.println("--------------------------------------------------");
		
		ArrayList<Persona> persone = new ArrayList<>();
		String select = "SELECT id, nome FROM esempio WHERE nome = ?";
		try(Connection conn = DriverManager.getConnection(url, user, password);
		PreparedStatement stmt = conn.prepareStatement(select))
		{
			stmt.setString(1, "tino");	
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next())
			{
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				// System.out.println(id + " " + nome);
				persone.add(new Persona(nome));
			}
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}	
		
		for(Persona p: persone)
		{
			System.out.println(p);
		}
	}
}