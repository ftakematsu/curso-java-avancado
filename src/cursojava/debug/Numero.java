package cursojava.debug;

public class Numero {
	private int n;

	public Numero(int n) {
		super();
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public boolean isValido() {
		return n>0;
	}
	
	
	public int valorDobro() {
		int x;
		int soma = 0;
		int i=0;
		while (i<n) {
			soma = soma + n;
			i++;
		}
		return soma;
	}
	
}
