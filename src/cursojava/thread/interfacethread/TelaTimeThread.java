package cursojava.thread.interfacethread;

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

public class TelaTimeThread extends JDialog {
	
	private JPanel jPanel = new JPanel(new GridBagLayout()); // Painel de componentes
	
	private JLabel descricaoHora = new JLabel("Time Thread 1");
	private JTextField mostraTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel("Time Thread 2");
	private JTextField mostraTempo2 = new JTextField();
	
	private JButton jButton = new JButton("Start");
	private JButton jButton2 = new JButton("Stop");
	
	// Objeto Runnable
	private Runnable thread1 = new Runnable() {

		@Override
		public void run() {
			// Vai sempre rodar, enquanto a Thread estiver rodando
			while (true) {
				mostraTempo.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} // Pause de 1 segundo
			}
		}
	};
	
	private Runnable thread2 = new Runnable() {

		@Override
		public void run() {
			// Vai sempre rodar, enquanto a Thread estiver rodando
			while (true) {
				mostraTempo2.setText(new SimpleDateFormat("dd/MM/yy hh:mm:ss").format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} // Pause de 1 segundo
			}
		}
	};
	
	// Criando a Thread
	private Thread thread1Time, thread2Time;
	
	
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
		GridBagConstraints gridBagConstraints = new GridBagConstraints(); // Controlador de posicionamento de componentes
		// Inicia na posição (0,0)
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		gridBagConstraints.anchor = GridBagConstraints.WEST;
		
		descricaoHora.setPreferredSize(new Dimension(250, 25));
		jPanel.add(descricaoHora, gridBagConstraints);
		mostraTempo.setPreferredSize(new Dimension(250, 25));
		mostraTempo.setEditable(false);
		
		// Posiciona o próximo componente para o outro grid
		gridBagConstraints.gridy++;
		jPanel.add(mostraTempo, gridBagConstraints);
	
		descricaoHora2.setPreferredSize(new Dimension(250, 25));
		gridBagConstraints.gridy++;
		jPanel.add(descricaoHora2, gridBagConstraints);
		
		gridBagConstraints.gridy++;
		mostraTempo2.setPreferredSize(new Dimension(250, 25));
		jPanel.add(mostraTempo2, gridBagConstraints);
		mostraTempo2.setEditable(false);
		
		gridBagConstraints.gridwidth = 1;
		gridBagConstraints.gridy++;
		jButton.setPreferredSize(new Dimension(118, 25));
		jPanel.add(jButton, gridBagConstraints);
		
		gridBagConstraints.gridx++;
		jButton2.setPreferredSize(new Dimension(118, 25));
		jPanel.add(jButton2, gridBagConstraints);
		jButton2.setEnabled(false);
		
		// Ações do botão
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// Colocando a thread para rodar 
				// Uma Thread roda um Runnable
				thread1Time = new Thread(thread1);
				thread1Time.start();
				
				thread2Time = new Thread(thread2);
				thread2Time.start();
				
				jButton.setEnabled(false);
				jButton2.setEnabled(true);
			}
		});
		
		jButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				thread1Time.stop();
				thread2Time.stop();
				
				jButton.setEnabled(true);
				jButton2.setEnabled(false);
			}
		});
		
		
		// Coloca o painel e seu conteúdo na janela principal
		add(jPanel, BorderLayout.WEST);
		
		setVisible(true); // Sempre o último a ser executado, para tornar a tela visível ao usuário
	}
	
}
