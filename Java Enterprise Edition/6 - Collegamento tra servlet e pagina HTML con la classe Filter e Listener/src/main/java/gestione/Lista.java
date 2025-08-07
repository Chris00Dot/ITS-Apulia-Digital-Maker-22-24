package gestione;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class Lista
 *
 */
@WebListener
public class Lista implements HttpSessionListener 
{
	int utenti = 0;
    /**
     * Default constructor. 
     */
    public Lista() 
    {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent arg0)  
    { 
       System.out.println("utenti attivi : "+ ++utenti);
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0)  
    { 
    	System.out.println("utenti attivi : "+ --utenti);
    }	
}