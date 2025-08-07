package esempi.annotation;

@MoltoImportante
public class Gatto 
{
	private String nome;
	
	public Gatto(String nome)
	{
		this.nome = nome;
	}
	
	@DaEseguirePiùVolte(ripetiPer = 3)
	public void mangia()
	{
		System.out.println("gnam");
	}

}
