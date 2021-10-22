package cursojava.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatasEmJava9 {
	public static void main(String args[]) {
		
		LocalDate dataBase = LocalDate.parse("2021-12-10");
		System.out.println("Mais 5 dias: " + dataBase.plusDays(5));
		System.out.println("Mais 5 semanas: " + dataBase.plusWeeks(5));
		System.out.println("Mais 5 meses: " + dataBase.plusMonths(5));
		System.out.println("Mais 5 anos: " + dataBase.plusYears(5));
		System.out.println("Menos 5 dias: " + dataBase.plusDays(-5));
		System.out.println("Menos 1 ano: " + (dataBase = dataBase.plusYears(-1)));
		System.out.println("Mais 1 dia: " + (dataBase = dataBase.plusDays(1)));
		
		LocalDate datatInicio = LocalDate.parse("2019-10-05");
		double valorTotal = 5000;
		int numParcelas = 12;
		for (int mes = 0; mes < numParcelas; mes++) {
			datatInicio = datatInicio.plusMonths(1);
			System.out.println("Valor: R$ " + String.format("%.2f", (valorTotal/numParcelas)) + " Vencimento: " + datatInicio.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		}
		
		
		
	}
}
