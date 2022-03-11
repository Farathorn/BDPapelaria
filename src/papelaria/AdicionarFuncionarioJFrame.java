package papelaria;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.Frame;
import java.awt.Point;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;
import javax.swing.JTextField;
import javax.swing.JLabel;


public class AdicionarFuncionarioJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Create the frame.
	 */
	public AdicionarFuncionarioJFrame () {
		setType(Type.POPUP);
		setAlwaysOnTop(true);
		setResizable(false);

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 650, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(160, 11, 100, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("CPF:");
		lblNewLabel.setBounds(30, 14, 46, 14);
		panel.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(160, 75, 328, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Carteira de Trabalho:");
		lblNewLabel_1.setBounds(30, 78, 125, 14);
		panel.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(160, 106, 100, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Expediente:");
		lblNewLabel_2.setBounds(30, 109, 66, 14);
		panel.add(lblNewLabel_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(160, 42, 328, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Nome:");
		lblNewLabel_3.setBounds(30, 45, 46, 14);
		panel.add(lblNewLabel_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(160, 137, 86, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Sal\u00E1rio:");
		lblNewLabel_4.setBounds(30, 140, 46, 14);
		panel.add(lblNewLabel_4);
		
		textField_5 = new JTextField();
		textField_5.setBounds(160, 168, 86, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Faltas:");
		lblNewLabel_5.setBounds(30, 171, 46, 14);
		panel.add(lblNewLabel_5);
		
		textField_6 = new JTextField();
		textField_6.setBounds(160, 199, 86, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Vendas:");
		lblNewLabel_6.setBounds(30, 202, 46, 14);
		panel.add(lblNewLabel_6);
		
		textField_7 = new JTextField();
		textField_7.setBounds(160, 230, 86, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Ticket M\u00E9dio:");
		lblNewLabel_7.setBounds(30, 233, 110, 14);
		panel.add(lblNewLabel_7);
		
		textField_8 = new JTextField();
		textField_8.setBounds(160, 261, 86, 20);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Franquia:");
		lblNewLabel_8.setBounds(30, 264, 66, 14);
		panel.add(lblNewLabel_8);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton btnAdicionar = new JButton("Adicionar");
		panel_1.add(btnAdicionar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		panel_1.add(btnCancelar);
	}
}
