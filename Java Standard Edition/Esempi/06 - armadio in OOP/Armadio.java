package esempi.classi;

public class Armadio
{
	int numeroAnte;
	Anta ante[];
	
	public Armadio(int numeroAnte)
	{
		this.numeroAnte = numeroAnte;
		ante = new Anta[numeroAnte];
	}
	
	public void apri(int numeroAnta) 
	{
		Anta anta = ante[numeroAnta];
		anta.apri();
	}
	
}
