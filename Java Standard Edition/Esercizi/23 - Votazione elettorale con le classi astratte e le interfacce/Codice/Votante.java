package esercizi.es28;

public interface Votante 
{
	public SchedaElettorale vota(Votazione votazione1, Opzione scelta);
	public boolean haVotato();
	public boolean nonHaVotato();
}
