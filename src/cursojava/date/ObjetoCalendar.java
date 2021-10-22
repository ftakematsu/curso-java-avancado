package cursojava.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ObjetoCalendar {
	public static void main(String args[]) {
		Calendar calendar = Calendar.getInstance();
		
		System.out.println("Calendar em ms: " + calendar.getTimeInMillis());
		
		System.out.println("Calendar do mês: " + calendar.get(Calendar.DAY_OF_MONTH));
		
		// 0 domingo, 1 segunda, 2 terça, 3 quarta, 4 quinta, 5 sexta, 6 sabado
		System.out.println("Calendar da semana: " + (calendar.get(Calendar.DAY_OF_WEEK)-1));
		
		System.out.println("Calendar número da semana no mês: " + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		System.out.println("Calendar Hora do dia (0 a 12): " + calendar.get(Calendar.HOUR));
		System.out.println("Calendar Hora do dia (0 a 23): " + calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("Calendar Minuto do dia: " + calendar.get(Calendar.MINUTE));
		System.out.println("Calendar Segundo do dia: " + calendar.get(Calendar.SECOND));
	
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		// getTime() retorna o objeto Calendar em formato Date
		System.out.println(calendar.getTime());
		System.out.println("Data em Calendar formatada: " + simpleDateFormat.format(calendar.getTime()));
		
	}
}
