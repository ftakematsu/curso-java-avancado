package cursojava.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GeradorParcela {

	public static void main(String[] args) {
		try {
			Date dataInicial;
			dataInicial = new SimpleDateFormat("dd/MM/yyyy").parse("12/10/2021");
			System.out.println(dataInicial);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(dataInicial);
			
			final int QTD_PARCELAS = 12;
			double valorTotal = 5000;
			
			for (int parcela = 1; parcela <= QTD_PARCELAS; parcela++) {
				calendar.add(Calendar.MONTH,  1);
				System.out.println("Parcela número: " + parcela + " de R$" + String.format("%.2f", valorTotal/QTD_PARCELAS) + " com vencimento em " + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
