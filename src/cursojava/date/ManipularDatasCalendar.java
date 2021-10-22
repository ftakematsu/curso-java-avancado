package cursojava.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.text.SimpleAttributeSet;

public class ManipularDatasCalendar {

	public static void main(String[] args) throws ParseException {
		Calendar dataHoje = Calendar.getInstance(); // Data atual
		
		// data vem do BD
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date(2020, 10, 5));
		calendar.setTime(new SimpleDateFormat("yyyy-MM-dd").parse("2021-03-10"));
		
		System.out.println("Data: " + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		
		// Adicionando dias
		calendar.add(Calendar.DAY_OF_MONTH, 15);
		
		// Adicionando meses
		calendar.add(Calendar.MONTH, 1);
		
		// Adicionando anos
		calendar.add(Calendar.YEAR, 2);
		
		// Incrementa alguma unidade de um campo sem alterar os outros campos
		calendar.roll(Calendar.MONTH, 12);
		
		System.out.println("Data: " + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		
	}

}
