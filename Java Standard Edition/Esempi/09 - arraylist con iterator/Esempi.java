package esempi.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Esempi 
{
	public static void main(String[] args) 
	{
		// Esempio di array
		int numeriArray[] = new int[23];
		numeriArray[0] = 7;
		System.out.println(numeriArray.length);
		System.out.println(numeriArray[0]);
		System.out.println(Arrays.toString(numeriArray));
		
		System.out.println();
		
		// Esempio di arraylist
		ArrayList<Integer> numeriList = new ArrayList<Integer>();
		// List<Integer> numeriList = new ArrayList<>();
		numeriList.add(1);
		numeriList.add(2);
		numeriList.add(3);
		System.out.println(numeriList);
		
		System.out.println();
		
		Alunno pino = new Alunno("pino");
		Alunno gino = new Alunno("gino");
		
		// Dichiarazione ArrayList di 23 copie, simile a: "int numeriArray[] = new int[23]"
		ArrayList<Alunno> classe = new ArrayList<Alunno>(Collections.nCopies(3, pino));
		
		// Inizializzazione simile a quella di un array: "int numeriArray[] = {}
		List<Alunno> classe2 = new ArrayList<>(List.of(new Alunno("pina"), new Alunno("nina")));
		List<Alunno> classe3 = new ArrayList<>(List.of(new Alunno("nino"), new Alunno("tino")));
		
		classe.add(gino);
		classe2.add(gino);
		classe3.add(gino);
		
		// Corrispondente della length "numeriArray.length" in arraylist
		System.out.println("Dimensione e elementi dell'arraylist classe 2:");
		System.out.println(classe2.size());
		System.out.println(classe2);
		
		System.out.println();
		
		System.out.println("Elemento dell'indice 0 della classe 2: ");
		System.out.println(classe2.get(0));
		
		System.out.println();
		
		// Sposto gino nella posizione 2
		System.out.println("Aggiungo elemento alla posizione 2: ");
		classe2.add(2, new Alunno("rino"));
		System.out.println(classe2);
		
		System.out.println();
		
		// Rimuovere un elemento
		System.out.println("Rimuovo elemento alla posizione 0: ");
		classe2.remove(0);
		System.out.println(classe2);
		
		// Alternativa
		classe2.remove(new Alunno("gino"));
		System.out.println(classe2);
		
		System.out.println();
		
		// Elimino tutti gli elementi dell'arraylist
		// classe2.clear();
		// System.out.println(classe2);
		
		// Ciclo gli elementi del mio arraylist
		System.out.println("For-each: ");
		for(Alunno a: classe2)
		{
			System.out.println(a);
		}
		
		System.out.println();
		
		// Alternativa al ciclo for-each
		System.out.println("Iteratore: ");
		Iterator<Alunno> it = classe2.iterator();
		while(it.hasNext())
		{
			Alunno a = it.next();
			if(a.nome ==  "gino")
			{
				it.remove();
			}
			System.out.println(a);
		}
		
		System.out.println();
		
		System.out.println("Nuovo contenuto della classe 2:  \n" + classe2);
	}
}