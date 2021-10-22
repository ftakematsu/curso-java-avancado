package cursojava.interfacethread;

import java.awt.Dimension;
import javax.swing.JDialog;

public class TelaTimeThread extends JDialog {
	
	/**
	 * Execu��o durante a abertura da tela
	 */
	public TelaTimeThread() {
		// Configura��es iniciais
		setTitle("Minha tela de time com Thread");
		setSize(new Dimension(300, 300));
		setLocationRelativeTo(null);
		setResizable(false);
		
		// Cria��o de componentes
		
		setVisible(true); // Sempre o �ltimo a ser executado, para tornar a tela vis�vel ao usu�rio
	}
	
}
