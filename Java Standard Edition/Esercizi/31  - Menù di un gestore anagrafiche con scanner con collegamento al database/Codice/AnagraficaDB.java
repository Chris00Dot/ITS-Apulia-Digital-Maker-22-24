package esercizi.es45;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class AnagraficaDB 
{
	private String password;
	private String user;
	private String url;
	private Connection conn;

	public AnagraficaDB(String url, String user, String password) 
	{
		this.url = url;
		this.user = user;
		this.password = password;
		getConnection();
	}

	// CONNESSIONE
	private void getConnection() 
	{
		try 
		{
			this.conn = DriverManager.getConnection(url, user, password);
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
	
	// INSERIMENTO
	public int insertAnagrafica(Anagrafica anagrafica) 
	{
		String insert = "INSERT INTO anagrafica(nome,cognome,data_di_nascita,telefono) VALUES (?,?,?,?)";
		try(PreparedStatement stmt = conn.prepareStatement(insert)) 
		{
			stmt.setString(1, anagrafica.getNome());
			stmt.setString(2, anagrafica.getCognome());
			stmt.setDate(3, Date.valueOf(anagrafica.getDataDiNascita()));
			stmt.setString(4, anagrafica.getNumeroDiTelefono());
			return stmt.executeUpdate();
			
		} 
		catch (SQLException e) 
		{
			System.out.println(e.getMessage());
		}
		return 0;
	}
	
	// VISUALIZZAZIONE
	public List<Anagrafica> selectAnagrafiche() 
	{
		String select = "SELECT * FROM anagrafica";
		List<Anagrafica> anagrafiche = new ArrayList<Anagrafica>();
		try(Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(select);) 
		{
			boolean isEmpty=true;
			while(rs.next()) 
			{
				int id = rs.getInt("id");
				String nomeAnagrafica = rs.getString("nome");
				String cognomeAnagrafica = rs.getString("cognome");
				LocalDate dataDiNascAnagrafica = rs.getDate("data_di_nascita").toLocalDate();
				String telefonoAnagrafica = rs.getString("telefono");
				anagrafiche.add(new Anagrafica(id,nomeAnagrafica, cognomeAnagrafica, dataDiNascAnagrafica, telefonoAnagrafica));
				isEmpty=false;
			}
			if(isEmpty)
			{
				System.out.println("La tabella è vuota");
			}
		} 
		catch (SQLException e) 
		{
			System.out.println(e.getMessage());
		}
		
		return anagrafiche;
	}

	// ELIMINAZIONE DI TUTTE LE RIGHR
	public void deleteAllRows() 
	{	
		String deleteAllRows = "DELETE FROM anagrafica";
			
		try (Statement stmt = conn.createStatement();)
		{ 
			stmt.executeQuery(deleteAllRows);
		}
	    catch (SQLException e) 
		{
			e.getMessage();
		}
	}
	
	// ELIMINAZIONE RIGA
	public void deleteRow(int id) 
	{	
		String deleteRow = "DELETE FROM anagrafica WHERE id = ?";		
		try (PreparedStatement stmt = conn.prepareStatement(deleteRow);)
		{ 
			stmt.setInt(1, id);
			stmt.executeUpdate();
		}
		catch (SQLException e) 
		{
			System.out.println(e.getMessage());
		}
	}
	
	// AGGIORNAMENTO BY ID
	public void updateById(int id, String nome, String cognome, String dataDiNascita, String telefono) 
	{
		String update = "UPDATE anagrafica SET nome=?,cognome=?,data_Di_Nascita=?,telefono=?  WHERE id = ?"; 
		try (PreparedStatement stmt = conn.prepareStatement(update);)
		{ 
			stmt.setString(1, nome);
			stmt.setString(2, cognome);
			LocalDate dataDiNascitaLD = LocalDate.parse(dataDiNascita, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			stmt.setDate(3, Date.valueOf(dataDiNascitaLD));
			stmt.setString(4, telefono);
			stmt.setInt(5, id);
			stmt.executeUpdate();
		}
		catch (SQLException e) 
		{
			System.out.println(e.getMessage());
		}
	}
}