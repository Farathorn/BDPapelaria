package papelaria;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.AbstractAction;
import javax.swing.Action;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Insets;
import java.awt.Component;
import java.awt.SystemColor;
import java.awt.Rectangle;
import java.awt.CardLayout;


public class TelaJFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main (String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run () {

				try {
					TelaJFrame frame = new TelaJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void clearContentPane () {
		
		contentPane.setVisible(false);
		contentPane.setVisible(true);
	}
	
	private void switchPane (Component comp) {
		
		contentPane.removeAll();
		contentPane.add(comp);
		clearContentPane();
	}

	/**
	 * Create the frame.
	 */
	public TelaJFrame () {
		setTitle("Papelaria");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1016, 861);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorder(null);
		menuBar.setBorderPainted(false);
		menuBar.setBackground(SystemColor.window);
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Programa");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Sair");
		mntmNewMenuItem.setBorder(null);
		mntmNewMenuItem.setPreferredSize(new Dimension(60, 26));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("Tabelas");
		mnNewMenu_1.setBorder(null);
		mnNewMenu_1.setMargin(new Insets(2, 2, 0, 2));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmMenuItem_1 = new JMenuItem("Franquia");
		mntmMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contentPane.removeAll();
				contentPane.add(new FranquiaJPanel ());
				clearContentPane();
			}
		});
		mntmMenuItem_1.setBorder(null);
		mntmMenuItem_1.setMargin(new Insets(0, 0, 0, 0));
		mnNewMenu_1.add(mntmMenuItem_1);
		
		JMenuItem mntmMenuItem_2 = new JMenuItem("Funcion\u00E1rio");
		mntmMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				switchPane(new FuncionarioJPanel ());
			}
		});
		mntmMenuItem_2.setMargin(new Insets(0, 0, 0, 0));
		mntmMenuItem_2.setBorder(null);
		mntmMenuItem_2.setOpaque(true);
		mnNewMenu_1.add(mntmMenuItem_2);
		
		JMenuItem mntmMenuItem_3 = new JMenuItem("Vendas");
		mntmMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				switchPane(new VendasJPanel());
			}
		});
		mntmMenuItem_3.setMargin(new Insets(0, 0, 0, 0));
		mntmMenuItem_3.setBorder(null);
		mnNewMenu_1.add(mntmMenuItem_3);
		
		JMenuItem mntmMenuItem_4 = new JMenuItem("Produtos");
		mntmMenuItem_4.setMargin(new Insets(0, 0, 0, 0));
		mntmMenuItem_4.setBorder(null);
		mnNewMenu_1.add(mntmMenuItem_4);
		
		JMenuItem mntmMenuItem_5 = new JMenuItem("Custos Diretos");
		mntmMenuItem_5.setMargin(new Insets(0, 0, 0, 0));
		mntmMenuItem_5.setBorder(null);
		mnNewMenu_1.add(mntmMenuItem_5);
		
		JMenuItem mntmMenuItem_6 = new JMenuItem("Custos Indiretos");
		mntmMenuItem_6.setMargin(new Insets(0, 0, 0, 0));
		mntmMenuItem_6.setBorder(null);
		mnNewMenu_1.add(mntmMenuItem_6);
		
		JMenuItem mntmMenuItem_7 = new JMenuItem("Pagamentos");
		mntmMenuItem_7.setMargin(new Insets(0, 0, 0, 0));
		mntmMenuItem_7.setBorder(null);
		mnNewMenu_1.add(mntmMenuItem_7);
		
		JMenuItem mntmMenuItem_8 = new JMenuItem("Terceiros");
		mntmMenuItem_8.setMargin(new Insets(0, 0, 0, 0));
		mntmMenuItem_8.setBorder(null);
		mnNewMenu_1.add(mntmMenuItem_8);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, "name_158698346478000");
		
		JButton btnNewButton = new JButton("New button");
		panel.add(btnNewButton);
	}
}
