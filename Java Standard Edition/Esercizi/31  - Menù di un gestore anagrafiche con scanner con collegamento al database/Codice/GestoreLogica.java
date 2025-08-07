package esercizi.es45;
import java.util.Scanner;

public class GestoreLogica 
{
	private GestoreAnagrafica gestoreAnagrafica;
	private Scanner s = new Scanner(System.in);
	
	public GestoreLogica(GestoreAnagrafica gestoreAnagrafica) 
	{
		this.gestoreAnagrafica = gestoreAnagrafica;	
	}
	
	public void init() 
	{
		int scelta = -1;
		do
		{
			System.out.println("\n\nSCELTA OPERAZIONE:\n"
							  +"1 - INSERISCI ANAGRAFICA\n"
							  +"2 - MOSTRA ANAGRAFICA\n"
							  +"3 - AGGIORNA PER ID\n"
							  +"4 - ELIMINA RIGA PER ID\n"
							  +"5 - ELIMINA TUTTE LE RIGHE\n"
							  +"0 - EXIT\n");
			
			System.out.println("Quale operazione desideri effettuare?");
			
			try 
			{
				 scelta = s.nextInt(); 
			}
			catch(java.util.InputMismatchException e)
			{
				System.out.println("Scelta non disponibile");
			}
			
			s.nextLine();
			
			switch(scelta) 
			{
			    case -1: break;
			    
				case 1: System.out.println("Inserire nome: ");  
			        	String nome = s.nextLine();
			        	
			        	System.out.println("Inserire cognome: ");  
			        	String cognome = s.nextLine();
			        	
			        	System.out.println("Inserire data di nascita: ");  
			        	String dataDiNascita = s.nextLine();
			        	
			        	System.out.println("Inserire numero di telefono: ");  
			        	String telefono = s.nextLine();
			        	
			        	gestoreAnagrafica.aggiungi(nome, cognome, dataDiNascita, telefono); break;
		        
				case 2: gestoreAnagrafica.stampaTutti();break;	
		
				case 3: System.out.println("Inserire id: ");
			        	int id = s.nextInt(); s.nextLine();
			        	
			        	System.out.println("Inserire nome: ");  
			        	nome = s.nextLine();
			        	
			        	System.out.println("Inserire cognome: ");  
			        	cognome = s.nextLine();
			        	
			        	System.out.println("Inserire data di nascita: ");  
			        	dataDiNascita = s.nextLine();
			        	
			        	System.out.println("Inserire numero di telefono: ");  
			        	telefono = s.nextLine();
			       
			        	gestoreAnagrafica.updateById(id, nome, cognome, dataDiNascita, telefono); break;
			        
				case 4: System.out.println("Inserire id da eliminare: ");
	        			id = s.nextInt(); s.nextLine();
	        			
	        			gestoreAnagrafica.deleteRow(id); break;    
			
				case 5: gestoreAnagrafica.deleteAllRows(); break;
				
				case 0: s.close(); break;
					
				default: System.out.println("Scelta non disponibile");
			}
		}
		while(scelta!=0);
		System.out.println("Connessione al database terminata\nFine Programma");
	}
}