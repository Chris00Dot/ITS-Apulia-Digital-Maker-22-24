package esempi.mouse;

public class Mouse 
{
	Rotellina rotellina = new Rotellina();
	Tasto tastiFunzionali[] = new Tasto[2];
	Tasto tastoSinistro;
	Tasto tastoDestro;
	
	public Mouse()
	{
		tastiFunzionali[0] = tastoSinistro;
	    tastiFunzionali[1] = tastoDestro;
	}
}

class Tasto
{
	public Tasto()
	{
		
	}
}

class Rotellina
{
	public Rotellina()
	{
		
	}
}
