package gestione;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class inserimento
 */
@WebServlet("/inserimento")
public class Inserimento extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Inserimento() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		String tipo = request.getParameter("tipo");
		if (tipo.equals("studente")) 
		{
			response.sendRedirect("form_studente.html");
		}
		else if (tipo.equals("insegnante")) 
		{
			response.sendRedirect("form_insegnante.html");

		} 
		else 
		{
			response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Tipo non valido");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String eta = request.getParameter("eta");
		int etaN = Integer.parseInt(eta);	
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		String email = request.getParameter("email");
		String citta = request.getParameter("citta");
		String tipo = request.getParameter("tipo");
		
		
		if(nome.isEmpty() || cognome.isEmpty() || eta.isEmpty() || etaN <= 3 || email.isEmpty() || citta.isEmpty()) 
		{	
			request.setAttribute("messaggio", "campi mancanti o non correttamente inseriti");
			request.getRequestDispatcher("messaggio.jsp").forward(request, response);
		} 
		else if (request.getParameter("tipo").equalsIgnoreCase("insegnante"))
		{	
			request.setAttribute("messaggio", "L' " + tipo + " " + nome + " è stato assegnato nella citta di " + citta);
			request.getRequestDispatcher("messaggio.jsp").forward(request, response);
		} 
		else if (request.getParameter("tipo").equalsIgnoreCase("studente")) 
		{	
			request.setAttribute("messaggio", "Lo " + tipo + " " +  nome + " è stato aggiunto nella citta di " + citta);
			request.getRequestDispatcher("messaggio.jsp").forward(request, response);
		}
	}
}