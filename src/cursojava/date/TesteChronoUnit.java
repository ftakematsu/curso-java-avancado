package cursojava.date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TesteChronoUnit {

	public static void main(String[] args) {
		String dataStr = "2020-09-01";
		long diferencaDias = ChronoUnit.DAYS.between(LocalDate.parse(dataStr), LocalDate.now());
		long diferencaSemanas = ChronoUnit.WEEKS.between(LocalDate.parse(dataStr), LocalDate.now());
		long diferencaMeses = ChronoUnit.MONTHS.between(LocalDate.parse(dataStr), LocalDate.now());
		long diferencaAnos = ChronoUnit.YEARS.between(LocalDate.parse(dataStr), LocalDate.now());
	
		System.out.println("Diferenša de dias: " + diferencaDias);
		System.out.println("Diferenša de semanas: " + diferencaSemanas);
		System.out.println("Diferenša de meses: " + diferencaMeses);
		System.out.println("Diferenša de ano: " + diferencaAnos);
		
	}

}
