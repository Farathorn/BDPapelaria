package papelaria.adicionar;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import papelaria.paineis.TabelaJPanel;


public class AdicionarFuncionarioJFrame extends TelaAdicionarJFrame {
	
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
	private JTextField textField_9;

	/**
	 * Create the frame.
	 */
	public AdicionarFuncionarioJFrame (TabelaJPanel caller) {
		
		super(caller);
		
		setType(Type.POPUP);
		setAlwaysOnTop(true);
		setResizable(false);

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 650, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(160, 10, 120, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("CPF:");
		lblNewLabel.setBounds(30, 10, 46, 14);
		panel.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(160, 40, 300, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setBounds(30, 40, 300, 14);
		panel.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(160, 70, 120, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Carteira de Trabalho:");
		lblNewLabel_2.setBounds(30, 70, 120, 14);
		panel.add(lblNewLabel_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(160, 100, 300, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Cargo:");
		lblNewLabel_3.setBounds(30, 100, 300, 14);
		panel.add(lblNewLabel_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(160, 130, 120, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Expediente:");
		lblNewLabel_4.setBounds(30, 130, 120, 14);
		panel.add(lblNewLabel_4);
		
		textField_5 = new JTextField();
		textField_5.setBounds(160, 160, 120, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Sálario Base:");
		lblNewLabel_5.setBounds(30, 160, 100, 14);
		panel.add(lblNewLabel_5);
		
		textField_6 = new JTextField();
		textField_6.setBounds(160, 190, 120, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Faltas:");
		lblNewLabel_6.setBounds(30, 190, 100, 14);
		panel.add(lblNewLabel_6);
		
		textField_7 = new JTextField();
		textField_7.setBounds(160, 220, 120, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Venda do Mês:");
		lblNewLabel_7.setBounds(30, 220, 100, 14);
		panel.add(lblNewLabel_7);
		
		textField_8 = new JTextField();
		textField_8.setBounds(160, 250, 120, 20);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Ticket Médio:");
		lblNewLabel_8.setBounds(30, 250, 100, 14);
		panel.add(lblNewLabel_8);

		textField_9 = new JTextField();
		textField_9.setBounds(160, 280, 120, 20);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Franquia:");
		lblNewLabel_9.setBounds(30, 280, 100, 14);
		panel.add(lblNewLabel_9);
		
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

	@Override
	protected String[] getAttributes () {

		return new String[] {textField.getText(), textField_1.getText(),
							textField_2.getText(), textField_3.getText(),
							textField_4.getText(), textField_5.getText(),
							textField_6.getText(), textField_7.getText(),
							textField_8.getText(), textField_9.getText()};
	}
}
