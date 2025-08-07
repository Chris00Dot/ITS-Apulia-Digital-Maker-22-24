package esercizi.es15;

public class Contatto 
{
	    // Attributi della classe
		String nome;
		String cognome;
		String numero;
		
		// Metodo costruttore
		public Contatto(String nome, String cognome, String numero)
		{
			this.nome = nome;
			this.cognome = cognome;
			this.numero = numero;
		}
		
		// Metodi getter
		public String getNome()
		{
			return this.nome;
		}
		public String getCognome()
		{
			return this.cognome;
		}
		public String getNumero()
		{
			return this.numero;
		}
		
		// Metodo toString per la stampa
		public String toString()
		{
			return getNumero();
		}
}

