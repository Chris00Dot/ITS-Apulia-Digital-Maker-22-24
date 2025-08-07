package esercizi.es29;

public class Main 
{
	public static void main(String[] args) 
	{
		Parroco donDino = new Parroco("Don Dino");
		Sindaco gianni = new Sindaco("Gianni");
		
		Maschio gino = new Maschio("Gino");
		Maschio nino = new Maschio("Nino");
		
		Femmina peppa = new Femmina("Peppa");
		Femmina lina = new Femmina("Lina");
		
		donDino.unisceInMatrimonio(gino, peppa, true);
		gianni.unisceInMatrimonio(nino, lina, true);
		gino.coniuge(gino, peppa, true);
	}
}