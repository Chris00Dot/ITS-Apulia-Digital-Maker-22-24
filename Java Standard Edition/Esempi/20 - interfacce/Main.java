package Pacchetto1;

public class Main
{
	public static void main(String[] args)
	{
		Leone leone = new Leone();
		Gazzella gazzella = new Gazzella();
		
		leone.caccia();
		gazzella.scappa();
		
		Pesce pesce = new Pesce();
		
		pesce.caccia();
		pesce.scappa();
		
		

	}

}
