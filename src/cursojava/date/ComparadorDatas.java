package cursojava.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ComparadorDatas {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataVencimento = simpleDateFormat.parse("06/10/2021");
		
		Date dataHoje = new Date();
		
		if (dataVencimento.after(dataHoje)) { // Equivale ao data1 > data2
			System.out.println("Boleto não vencido. Vencimento para " + simpleDateFormat.format(dataVencimento));
		}
		else if (dataVencimento.before(dataHoje)) { // Equivale ao data1 <= data2
			System.out.println("Boleto já está vencido");
		}

	}

}
