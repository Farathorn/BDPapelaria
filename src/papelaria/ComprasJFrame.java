package papelaria;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import papelaria.dao.TabelaDAO;
import papelaria.entidades.Entidade;
import papelaria.entidades.ItemComprado;
import papelaria.paineis.CompraJPanel;
import papelaria.paineis.TabelaJPanel;

import javax.swing.JPanel;


public class ComprasJFrame extends JFrame {

	private TabelaJPanel caller;
	/**
	 * Create the frame.
	 */
	public ComprasJFrame (TabelaJPanel caller) {
		
		this.caller = caller;

		setResizable(false);
		setBounds(100, 100, 450, 300);
		
		CompraJPanel panel = new CompraJPanel(caller);
		getContentPane().add(panel, BorderLayout.CENTER);
	}

}
