package cursojava.date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ApiLocalDate {
	
	public static void main(String args[]) {
		// Nova API de data (> Java 8)
		LocalDate dataAtual = LocalDate.now();
		System.out.println("Data atual: " + dataAtual);
		
		// Nova API de hora (> Java 8)
		LocalTime horaAtual = LocalTime.now();
		System.out.println("Hora atual: " + horaAtual);
		
		LocalDateTime dataHoraAtual = LocalDateTime.now();
		System.out.println("Data e hora atual: " + dataHoraAtual);
		
		
		System.out.println("Dia do mês: " + dataHoraAtual.getDayOfMonth());
		System.out.println("Mês atual: " + dataHoraAtual.getMonth());
		
		System.out.println("Data formatada (ISO): " + dataHoraAtual.format(DateTimeFormatter.BASIC_ISO_DATE));
		System.out.println("Data formatada (padrão BR): " + dataHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("Hora formatada: " + horaAtual.format(DateTimeFormatter.ofPattern("HH:mm")));
		System.out.println("Data e hora formatada: " + dataHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss")));

	}
	
	
}
