package esempi.enum_;

public enum Stagione 
{
	AUTUNNO(10), INVERNO(5), PRIMAVERA(15), ESTATE(25);
	private int temperaturaMedia;
	
	Stagione(int temperaturaMedia)
	{
		this.temperaturaMedia = temperaturaMedia;
	}
	
	public int getTemperaturaMedia()
	{
		return temperaturaMedia;
	}
	
	public String toString()
	{
		return name() + ":" + getTemperaturaMedia();
	}
	
	public static void main(String[] args)
	{
		Stagione autunno = Stagione.AUTUNNO;
		Stagione inverno = Stagione.INVERNO;
		System.out.println(autunno);
		System.out.println(inverno);
	}
}

