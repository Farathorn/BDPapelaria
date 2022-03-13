package papelaria;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import papelaria.dao.TabelaDAO;
import papelaria.entidades.Entidade;
import papelaria.entidades.Funcionario;


public class FuncionarioJPanel extends TabelaJPanel {
	
	/**
	 * Create the panel.
	 */
	public FuncionarioJPanel () {
		
		super(new Funcionario());
		telaAdicionar = new AdicionarFuncionarioJFrame(this);
		
		setBounds(100, 100, 1016, 861);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(143, 11, 863, 839);
		add(scrollPane);
		
		preencherTable();
		scrollPane.setViewportView(table);
		
				
		btnAdicionar.setBounds(10, 322, 123, 52);
		add(btnAdicionar);
		
		btnRemover.setBounds(44, 385, 89, 23);
		add(btnRemover);

	}

}
