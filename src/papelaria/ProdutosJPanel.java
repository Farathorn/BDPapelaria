package papelaria;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import papelaria.dao.TabelaDAO;
import papelaria.entidades.Entidade;
import papelaria.entidades.Produto;


public class ProdutosJPanel extends TabelaJPanel {

	/**
	 * Create the panel.
	 */
	public ProdutosJPanel () {
		
		super(new Produto());
		telaAdicionar = new AdicionarProdutosJFrame(this);
		
		setBounds(100, 100, 1016, 861);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(133, 0, 873, 850);
		add(scrollPane);
		
		
		scrollPane.setViewportView(table);
		
		preencherTable();
		
		btnAdicionar.setBounds(0, 291, 123, 52);
		add(btnAdicionar);
		
		btnRemover.setBounds(34, 354, 89, 23);
		add(btnRemover);
	}
}
