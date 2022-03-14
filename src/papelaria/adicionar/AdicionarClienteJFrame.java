package papelaria.adicionar;

import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import papelaria.paineis.TabelaJPanel;

import java.awt.BorderLayout;
import java.awt.Window.Type;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AdicionarClienteJFrame extends TelaAdicionarJFrame {
	
	JPanel contentPane;
	
	JTextField textField_1;
	JTextField textField_2;
	JTextField textField_3;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	
	public AdicionarClienteJFrame (TabelaJPanel caller) {
		
		super(caller);
		getContentPane().setLayout(null);
		
		setType(Type.POPUP);
		setAlwaysOnTop(true);
		setResizable(false);

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(180, 11, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(180, 42, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(180, 73, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(180, 104, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		lblNewLabel = new JLabel("Gasto Total:");
		lblNewLabel.setBounds(49, 107, 121, 14);
		panel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Telefone:");
		lblNewLabel_1.setBounds(49, 76, 121, 14);
		panel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Nome:");
		lblNewLabel_2.setBounds(49, 45, 117, 14);
		panel.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("CPF:");
		lblNewLabel_3.setBounds(49, 20, 117, 14);
		panel.add(lblNewLabel_3);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		panel_1.add(btnAdicionar);
		panel_1.add(btnCancelar);
	}

	@Override
	protected String[] getAttributes () {

		return new String[] {textField.getText(), textField_1.getText(),
							textField_2.getText(), textField_3.getText()};
	}
}
