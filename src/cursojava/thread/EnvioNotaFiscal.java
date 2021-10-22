package cursojava.thread;

public class EnvioNotaFiscal implements Runnable {

	@Override
	public void run() { // Executa o que for feito em threading
		// Código da rotina
		/* Codigo da rotina que quero executar em paralelo */
		for (int pos=0; pos<10; pos++) {
			try {						
				/* Quero executar esse envio com tempo determinado */
				System.out.println("Executando alguma rotina. Enviando nota fiscal...");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} /* Delay em milissegundos */
		}
		/* Fim do código em paralelo */
	};

}
