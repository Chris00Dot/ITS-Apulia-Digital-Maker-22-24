package esercizi.es23;
import java.time.Duration;
import java.time.LocalDateTime;

public class Main 
{
	public static void main(String[] args) 
	{
		 LocalDateTime start = LocalDateTime.now();
		 LocalDateTime now;
		 Duration durata;
		 
		 do
		 {
			 now = LocalDateTime.now();
			 durata = Duration.between(start, now);
		 }
		 while(durata.getSeconds() <= 4);

		 System.out.println("Sono passati 5 secondi!");
	}
}
