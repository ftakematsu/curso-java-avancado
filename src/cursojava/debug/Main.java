package cursojava.debug;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		String valorDigitado = "";
		
		
		valorDigitado = JOptionPane.showInputDialog("Número");
		
		int x = Integer.parseInt(valorDigitado);
		Numero num = new Numero(x);
		
		
		System.out.println(num.valorDobro());
		
	}

}
