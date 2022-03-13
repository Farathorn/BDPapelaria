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
import papelaria.entidades.Pagamento;


public class PagamentosJPanel extends TabelaJPanel {

	/**
	 * Create the panel.
	 */
	public PagamentosJPanel () {
		
		super(new Pagamento());
		telaAdicionar = new AdicionarCustoPagamentosJFrame(this);

		setBounds(100, 100, 1016, 861);
		setLayout(null);
		
		btnAdicionar.setBounds(10, 244, 111, 83);
		add(btnAdicionar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(130, 0, 876, 850);
		add(scrollPane);
		
		scrollPane.setViewportView(table);
		
		preencherTable();
		
		btnRemover.setBounds(44, 345, 75, 53);
		add(btnRemover);
	}

}
