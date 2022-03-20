package papelaria.paineis;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import papelaria.adicionar.AdicionarClienteJFrame;
import papelaria.entidades.Cliente;

public class ClienteJPanel extends TabelaJPanel {

	public ClienteJPanel () {
		
		super(new Cliente());
		telaAdicionar = new AdicionarClienteJFrame(this);
		
		setBounds(100, 100, 1016, 861);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(143, 11, 863, 839);
		add(scrollPane);
		
		preencherTable();
		scrollPane.setViewportView(table);
		
				
		btnAdicionar.setBounds(10, 322, 123, 52);
		add(btnAdicionar);
		
		btnRemover.setBounds(10, 385, 123, 23);
		add(btnRemover);
	}
}
