import java.util.InputMismatchException;
import java.util.Scanner;


public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		try
		{
			System.out.println("Inserire il primo numero: ");
			int x = scanner.nextInt();
			
			System.out.println("Inserire il secondo numero: ");
			int y = scanner.nextInt();
			
			int result = x / y;
			System.out.println("Risultato: " + result);
		}
		//Nel caso dividiamo per zero
		catch(ArithmeticException e)
		{
			System.out.println("Non puoi dividere per zero");
		}
		//Nel caso dividiamo per una stringa
		catch(InputMismatchException e)
		{
			System.out.println("Non puoi dividere un numero per una stringa");
		}
		catch(Exception e)
		{
			System.out.println("C'è stato un problema");
		}
		finally
		{
			System.out.println("Eseguito comunque");
			scanner.close();
		}
	}

}
