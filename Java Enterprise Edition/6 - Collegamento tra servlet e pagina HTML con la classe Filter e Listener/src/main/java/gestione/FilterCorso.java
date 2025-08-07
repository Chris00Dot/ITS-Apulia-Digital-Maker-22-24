package gestione;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class FilterCorso
 */
@WebFilter("/inserimento")
public class FilterCorso implements Filter {

    /**
     * Default constructor. 
     */
    public FilterCorso() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		String citta = request.getParameter("citta");
		String tipo = request.getParameter("tipo");
		
		if (citta != null) {
			if (tipo.equalsIgnoreCase("studente") 
					&& citta.equalsIgnoreCase("lecce") 
					|| citta.equalsIgnoreCase("taranto")) {
				request.setAttribute("messaggio", "Iscrizione non riuscita, raggiunto il numero massimo di iscritti" + "\n" + "selezionare una sede diversa da " + citta);
				request.getRequestDispatcher("messaggio.jsp").forward(request, response);
			}
		} 
		
		chain.doFilter(request, response);
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}