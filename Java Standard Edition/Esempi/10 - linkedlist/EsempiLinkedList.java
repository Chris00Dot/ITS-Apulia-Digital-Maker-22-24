package esempi.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import esempi.arraylist.Alunno;

public class EsempiLinkedList 
{
	public static void main(String[] args)
	{
		Alunno rino = new Alunno("Rino");
		Alunno pino = new Alunno("Pino");
		
		Alunno[] classeArray = new Alunno[4];
		Arrays.fill(classeArray, rino);
		System.out.println(Arrays.toString(classeArray));
		
		// Dichiarazione e instanziazione di arraylist e linkedlist
		ArrayList<Alunno> arrayList = new ArrayList<Alunno>();
		
		LinkedList<Alunno> linkedList = new LinkedList<Alunno>();
		
		// Inizializzazione arraylist e linkedlist
		/* ArrayList<Alunno> classe = new ArrayList<Alunno>(Collections.nCopies(4, rino));
		System.out.println(classe);
		ArrayList<Alunno> classe1 = new ArrayList<Alunno>(Arrays.asList(classeArray));
		System.out.println(classe1);
		ArrayList<Alunno> classe2 = new ArrayList<Alunno>(Collections.nCopies(4,  rino));
		System.out.println(classe2);
		ArrayList<Alunno> classe3 = new ArrayList<>(List.of(new Alunno("Nina"), new Alunno("Pina"), rino, pino)); */
		
		LinkedList<Alunno> classe = new LinkedList<Alunno>(Collections.nCopies(4, rino));
		System.out.println(classe);
		LinkedList<Alunno> classe1 = new LinkedList<Alunno>(Arrays.asList(classeArray));
		System.out.println(classe1);
		LinkedList<Alunno> classe2 = new LinkedList<Alunno>(Collections.nCopies(4,  rino));
		System.out.println(classe2);
		LinkedList<Alunno> classe3 = new LinkedList<>(List.of(new Alunno("Nina"), new Alunno("Pina"), rino, pino));
		
		// Mi restituisce un array di tipo Object
		Object listToArray[] = classe.toArray();
		System.out.println(Arrays.toString(listToArray));
		
		System.out.println();
		
		// Ciclare col for-each
		for(Alunno a: classe)
		{
			System.out.println(a);
		}
		
		//Metodo lambda collegato al for-each
		System.out.println("-------");
		classe3.forEach((a) -> System.out.println(a));
		
		System.out.println("-------");
		classe3.forEach(System.out::println);
		
	}
}
