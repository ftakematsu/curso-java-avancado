package cursojava.interfacethread;

import java.awt.Dimension;
import javax.swing.JDialog;

public class TelaTimeThread extends JDialog {
	
	/**
	 * Execução durante a abertura da tela
	 */
	public TelaTimeThread() {
		// Configurações iniciais
		setTitle("Minha tela de time com Thread");
		setSize(new Dimension(300, 300));
		setLocationRelativeTo(null);
		setResizable(false);
		
		// Criação de componentes
		
		setVisible(true); // Sempre o último a ser executado, para tornar a tela visível ao usuário
	}
	
}
