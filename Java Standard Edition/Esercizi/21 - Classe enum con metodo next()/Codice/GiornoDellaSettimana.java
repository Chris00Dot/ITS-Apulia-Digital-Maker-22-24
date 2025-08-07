package esercizi.es25;

public enum GiornoDellaSettimana 
{
	LUNEDI, MARTEDI, MERCOLEDI, GIOVEDI, VENERDI, SABATO, DOMENICA;
	
	public GiornoDellaSettimana next()
	{
		return values()[(ordinal() + 1) % values().length];
	}
}