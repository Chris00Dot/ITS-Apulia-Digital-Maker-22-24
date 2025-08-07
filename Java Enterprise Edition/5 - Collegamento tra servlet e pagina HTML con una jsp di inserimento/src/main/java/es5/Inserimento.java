package es5;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class inserimento
 */
@WebServlet(name = "/inserimento" ,  urlPatterns = { "/inserimento" })
public class Inserimento extends HttpServlet {
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher rd = request.getRequestDispatcher("index.html");
		rd.forward(request,  response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		String eta = request.getParameter("eta");
		String email = request.getParameter("email");
		
		if(nome.isEmpty() || cognome.isEmpty() || eta.isEmpty() || email.isEmpty())
		{
			request.setAttribute("messaggio", "Dati mancanti, inserimento non riuscito");
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Inserimento.jsp");
			dispatcher.forward(request, response);
		}
		else
		{
			request.setAttribute("messaggio", "L'insegnante(studente) " + nome + " è stato assegnato(iscritto) al corso");
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Inserimento.jsp");
			dispatcher.forward(request, response);
		}	
	}
}