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
 * Servlet Filter implementation class FilterEta
 */
@WebFilter("/inserimento")
public class FilterEta implements Filter 
{

    /**
     * Default constructor. 
     */
    public FilterEta() 
    {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() 
	{
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		// TODO Auto-generated method stub
		// place your code here
		if (request.getParameter("eta")!= null ) 
		{
			String eta = request.getParameter("eta");
			int etaN = Integer.parseInt(eta);
			String tipo = request.getParameter("tipo");
			if (etaN > 45 && tipo.equals("studente"))
			{
				request.setAttribute("messaggio", "Iscrizione non riuscita, l'eta dello " + tipo + " supera i 45 anni");
				request.getRequestDispatcher("messaggio.jsp").forward(request, response);
			}
		}
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException 
	{
		// TODO Auto-generated method stub
	}
}