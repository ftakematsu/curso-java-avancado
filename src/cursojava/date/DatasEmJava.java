package cursojava.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date date = new Date();
		
		
		System.out.println("Data em milisegundos: " + date.getTime());
		
		System.out.println("Dia do mês: " + date.getDate());
		
		System.out.println("Dia da semana: " + date.getDay());
		
		System.out.println("Hora do dia: " + date.getHours());
		
		System.out.println("Minuto da hora: " + date.getMinutes());
		
		System.out.println("Segundos: " + date.getSeconds());
		
		System.out.println("Ano: " + (1900 + date.getYear()));
	
		// Formatador de data
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); // yyyy-MM-dd
		
		System.out.println("Data em formato padrão: " + simpleDateFormat.format(date));
		
		simpleDateFormat.applyPattern("yyyy-MM-dd hh:mm.SS");
		System.out.println("Data em formato para banco de dados: " + simpleDateFormat.format(date));
	
		Date data2 = new Date();
		try {
			data2 = simpleDateFormat.parse("1987-10-18 10:30.000");
			System.out.println("Objeto Date: " + data2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	
	
	}
	

}
