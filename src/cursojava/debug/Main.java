package cursojava.debug;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		String valorDigitado = "";
		
		
		valorDigitado = JOptionPane.showInputDialog("N?mero");
		
		int x = Integer.parseInt(valorDigitado);

		Numero num = new Numero(x);
		
		if (num.isValido())
			System.out.println(num.valorDobro());
		else
			System.out.println("N?mero inv?lido");
	}

}
