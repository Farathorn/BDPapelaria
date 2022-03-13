package papelaria.paineis;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import papelaria.adicionar.AdicionarCustoIndiretosJFrame;
import papelaria.dao.TabelaDAO;
import papelaria.entidades.CustoIndireto;
import papelaria.entidades.Entidade;


public class CustosIndiretosJPanel extends TabelaJPanel {

	/**
	 * Create the panel.
	 */
	public CustosIndiretosJPanel () {
		
		super(new CustoIndireto());
		telaAdicionar = new AdicionarCustoIndiretosJFrame(this);

		setBounds(100, 100, 1016, 861);
		setLayout(null);
		
		btnAdicionar.setBounds(10, 290, 123, 52);
		add(btnAdicionar);
		
		btnRemover.setBounds(43, 350, 89, 23);
		add(btnRemover);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(140, 11, 866, 839);
		add(scrollPane);
		
		scrollPane.setViewportView(table);
		
		preencherTable();
	}
}
