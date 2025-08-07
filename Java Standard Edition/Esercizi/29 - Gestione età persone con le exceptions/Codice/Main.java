package esercizi.es35;

import java.time.LocalDate;

public class Main 
{
	public static void main(String[] args) 
	{
		Uomo gino = new Uomo("Gino", LocalDate.of(1968, 02, 25));
		Donna pina = new Donna("Pina", LocalDate.of(1953, 10, 21));
		Donna nina = new Donna("Nina", LocalDate.of(1998, 01, 10));
		
		Persona persone[] = {gino, pina, nina};
		
		for(Persona p: persone) 
		{
			try 
			{
				System.out.print("Quanti anni hai "+ p + "? ");
				System.out.println(p.getEta());
			} 
			catch (LuogoComuneException e) 
			{
				System.out.println(e.getMessage());
			}
	    }
     }
}