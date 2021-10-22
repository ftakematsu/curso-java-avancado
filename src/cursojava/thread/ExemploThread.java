package cursojava.thread;

import javax.swing.JOptionPane;

public class ExemploThread {
	
	private static Runnable thread1 = new Runnable() {

		@Override
		public void run() { // Executa o que for feito em threading
			// Código da rotina
			/* Codigo da rotina que quero executar em paralelo */
			for (int pos=0; pos<10; pos++) {
				try {						
					/* Quero executar esse envio com tempo determinado */
					System.out.println("Executando alguma rotina. Enviando e-mail...");
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} /* Delay em milissegundos */
			}
			/* Fim do código em paralelo */
		};
		
	};
	
	
	private static EnvioNotaFiscal thread2 = new EnvioNotaFiscal();
	
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
		
		Thread threadNotaFiscal = new Thread(thread2);
		threadNotaFiscal.start();
		
		// Modo inicial de invocar uma thread (not recommended because is messy)
		/*new Thread() {
			public void run() { // Executa o que for feito em threading
				// Código da rotina
				for (int pos=0; pos<10; pos++) {
					try {						
						System.out.println("Executando alguma rotina. Enviando nota fiscal...");
						Thread.sleep(4000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					} 
				}
			};
		}.start(); // Liga a thread que fica processando paralelamente em background
		*/
		
		/* Aqui indica que um codigo do sistema do usuário continua o fluxo de trabalho */
		System.out.println("Chegou ao fim do teste de thread");
		
		/* Fluxo do sistema, exemplo: cadastro, emissão relatório */
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");
		
	}
	
	
	
	
}
