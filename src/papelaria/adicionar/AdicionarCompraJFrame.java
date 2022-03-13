package papelaria.adicionar;

import papelaria.entidades.Venda;
import papelaria.paineis.TabelaJPanel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AdicionarCompraJFrame extends TelaAdicionarJFrame {

	private JPanel contentPane;
	private Venda venda;
	private JTextField textField_1;
	
	public AdicionarCompraJFrame (TabelaJPanel caller, Venda venda) {
		
		super(caller);
		this.venda = venda;
		
		setType(Type.POPUP);
		setAlwaysOnTop(true);
		setResizable(false);

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
		textField.setBounds(158, 11, 120, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Código do Produto:");
		lblNewLabel.setBounds(30, 14, 100, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Quantidade:");
		lblNewLabel_1.setBounds(30, 40, 100, 14);
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(158, 37, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		panel_1.add(btnAdicionar);
		panel_1.add(btnCancelar);
		
		keyCheckLock();
	}

	@Override
	protected String[] getAttributes () {

		return new String[] {textField.getText(), venda.getCodigo(),
							textField_1.getText()};
	}
}
