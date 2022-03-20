package papelaria.paineis;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import papelaria.adicionar.AdicionarCustoDiretosJFrame;
import papelaria.dao.TabelaDAO;
import papelaria.entidades.CustoDireto;
import papelaria.entidades.Entidade;


public class CustosDiretosJPanel extends TabelaJPanel {
	
	/**
	 * Create the panel.
	 */
	public CustosDiretosJPanel () {
		
		super(new CustoDireto());
		telaAdicionar = new AdicionarCustoDiretosJFrame(this);
		
		setBounds(100, 100, 1016, 861);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(150, 0, 856, 850);
		add(scrollPane);
		
		scrollPane.setViewportView(table);
		
		preencherTable();
		
		btnAdicionar.setBounds(20, 293, 123, 52);
		add(btnAdicionar);
		
		btnRemover.setBounds(53, 362, 89, 23);
		add(btnRemover);
	}

}
