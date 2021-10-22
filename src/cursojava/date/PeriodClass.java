package cursojava.date;

import java.time.LocalDate;
import java.time.Period;

public class PeriodClass {
	public static void main(String args[]) {
		LocalDate dataAntiga = LocalDate.of(2019, 2, 7);
		LocalDate dataNova = LocalDate.of(2021, 7, 4);
		
		System.out.println(dataAntiga.isAfter(dataNova));
		System.out.println(dataAntiga.isBefore(dataNova));
		System.out.println(dataAntiga.isEqual(dataNova));
		System.out.println("É ano bissexto? " + dataAntiga.isLeapYear());
		
		Period periodo = Period.between(dataAntiga, dataNova);
		System.out.print("O período é de " + periodo.getDays() + " dias ");
		System.out.print(periodo.getMonths() + " meses e ");
		System.out.println(periodo.getYears() + " anos.");
		System.out.println("Período total de meses: " + periodo.toTotalMonths());
	}
}
