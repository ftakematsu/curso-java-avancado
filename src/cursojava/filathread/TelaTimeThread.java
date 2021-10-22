package cursojava.filathread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import cursojava.thread.ImplementacaoFilaThread;
import cursojava.thread.ObjetoFilaThread;

public class TelaTimeThread extends JDialog {
	
	private JPanel jPanel = new JPanel(new GridBagLayout()); // Painel de componentes
	
	private JLabel descricaoNome = new JLabel("Nome");
	private JTextField mostraNome = new JTextField();
	
	private JLabel descricaoEmail = new JLabel("E-mail");
	private JTextField mostraEmail = new JTextField();
	
	private JButton jButton = new JButton("Add list");
	private JButton jButton2 = new JButton("Stop");
	
	private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();
	
	
	/**
	 * Execução durante a abertura da tela
	 */
	public TelaTimeThread() {
		// Configurações iniciais
		setTitle("Fila de Thread");
		setSize(new Dimension(300, 300));
		setLocationRelativeTo(null);
		setResizable(false);
		
		// Criação de componentes
		GridBagConstraints gridBagConstraints = new GridBagConstraints(); // Controlador de posicionamento de componentes
		// Inicia na posição (0,0)
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		gridBagConstraints.anchor = GridBagConstraints.WEST;
		
		descricaoNome.setPreferredSize(new Dimension(250, 25));
		jPanel.add(descricaoNome, gridBagConstraints);
		mostraNome.setPreferredSize(new Dimension(250, 25));
		
		// Posiciona o próximo componente para o outro grid
		gridBagConstraints.gridy++;
		jPanel.add(mostraNome, gridBagConstraints);
	
		descricaoEmail.setPreferredSize(new Dimension(250, 25));
		gridBagConstraints.gridy++;
		jPanel.add(descricaoEmail, gridBagConstraints);
		
		gridBagConstraints.gridy++;
		mostraEmail.setPreferredSize(new Dimension(250, 25));
		jPanel.add(mostraEmail, gridBagConstraints);
		
		gridBagConstraints.gridwidth = 1;
		gridBagConstraints.gridy++;
		jButton.setPreferredSize(new Dimension(118, 25));
		jPanel.add(jButton, gridBagConstraints);
		
		gridBagConstraints.gridx++;
		jButton2.setPreferredSize(new Dimension(118, 25));
		jPanel.add(jButton2, gridBagConstraints);
		
		// Ações do botão
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (fila==null) {
					fila = new ImplementacaoFilaThread();
					fila.start();
				}
				
				// Gera lotess
				for (int qtd=0; qtd<100; qtd++) {
				
					// Colocar na lista
					ObjetoFilaThread filaThread = new ObjetoFilaThread();
					filaThread.setNome(mostraNome.getText());
					filaThread.setEmail(mostraEmail.getText() + " - " + qtd);
					fila.add(filaThread);
				}
			}
		});
		
		jButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				fila.stop();
				fila = null; // Remove o objeto
			}
		});
		
		fila.start();
		
		// Coloca o painel e seu conteúdo na janela principal
		add(jPanel, BorderLayout.WEST);
		
		setVisible(true); // Sempre o último a ser executado, para tornar a tela visível ao usuário
	}
	
}
