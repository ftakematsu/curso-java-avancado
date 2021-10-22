package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {
	
	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_filha = 
					new ConcurrentLinkedQueue<ObjetoFilaThread>();
	
	
	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_filha.add(objetoFilaThread);
	}
	
	@Override
	public void run() {
		System.out.println("Fila rodando");
		
		// Fica num looping infinito
		for (;;) {

			// Bloquear o acesso à esta lista por outros processos
			// Garante apenas que esta Thread acesse esta lista
			// Evita que outro processo acesse o processo (bloqueio)
			synchronized (pilha_filha) {

				Iterator iteracao = pilha_filha.iterator();
				// Enquant houver dados na lista
				while (iteracao.hasNext()) {
					// Pega o objeto atual
					ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();
					/* Processar tarefas */
					System.out.println("-------------------------------");
					System.out.println(processar.getEmail() + "\n" + processar.getNome());
					System.out.println("-------------------------------");
					iteracao.remove(); // Remove da lista
					try {
						Thread.sleep(1000); // Tempo para descarga de memória
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
			// Após processar toda lista, dar tempo para descarga de memória
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
