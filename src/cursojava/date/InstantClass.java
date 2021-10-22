package cursojava.date;

import java.time.Duration;
import java.time.Instant;

public class InstantClass {

	public static void main(String[] args) throws InterruptedException {
		Instant inicio = Instant.now();
		Thread.sleep(60000);
		Instant fim = Instant.now();
		
		Duration duracao = Duration.between(inicio, fim);

		System.out.println(" Dura��o em segundos: " + duracao.toMillis()/1000);
		System.out.println(" Dura��o em nanossegundos: " + duracao.toNanos());
		System.out.println(" Dura��o em milisegundos: " + duracao.toMillis());
		System.out.println(" Dura��o em minutos: " + duracao.toMinutes());
		System.out.println(" Dura��o em horas: " + duracao.toHours());
		System.out.println(" Dura��o em dias: " + duracao.toDays());
		
	}

}
