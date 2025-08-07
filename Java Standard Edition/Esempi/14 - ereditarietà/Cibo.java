package esempi.ereditarieta;

public class Cibo 
{	
	private String tipo;
	
	public Cibo(String tipo) 
	{
		this.tipo = tipo;
	}

	@Override
	public String toString()
	{
		return tipo;
	}

}
