package esempi.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) 
	{
		Gatto gino = new Gatto("Gino");
		
		if(gino.getClass().isAnnotationPresent(MoltoImportante.class))
		{
			System.out.println("classe importante");
		}
		
		for(Method metodo : gino.getClass().getDeclaredMethods())
		{
			if(metodo.isAnnotationPresent(DaEseguirePiùVolte.class))
			{
				DaEseguirePiùVolte annotation = metodo.getAnnotation(DaEseguirePiùVolte.class);
				for(int i = 0 ; i < annotation.ripetiPer() ; i++)
				{
					try 
					{
						metodo.invoke(gino);
					} 
					catch (IllegalAccessException | InvocationTargetException e) 
					{
						e.printStackTrace();
					}
				}
			}
		}
	}
}