package cursojava.date;

import java.time.Duration;
import java.time.Instant;

public class InstantClass {

	public static void main(String[] args) throws InterruptedException {
		Instant inicio = Instant.now();
		Thread.sleep(60000);
		Instant fim = Instant.now();
		
		Duration duracao = Duration.between(inicio, fim);

		System.out.println(" Duração em segundos: " + duracao.toMillis()/1000);
		System.out.println(" Duração em nanossegundos: " + duracao.toNanos());
		System.out.println(" Duração em milisegundos: " + duracao.toMillis());
		System.out.println(" Duração em minutos: " + duracao.toMinutes());
		System.out.println(" Duração em horas: " + duracao.toHours());
		System.out.println(" Duração em dias: " + duracao.toDays());
		
	}

}
