package papelaria.paineis;

import java.awt.BorderLayout;
import papelaria.dao.TabelaDAO;
import papelaria.entidades.Entidade;
import papelaria.entidades.Estoque;
import papelaria.entidades.Fornecedor;
import papelaria.entidades.Shopping;

import java.awt.Panel;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import javax.swing.BoxLayout;


public class TerceirosJPanel extends TabelaJPanel {

	/**
	 * Create the panel.
	 */
	public TerceirosJPanel () {
		
		super(new Fornecedor());
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		EstoqueJPanel Norte = new EstoqueJPanel();
		add(Norte);
		
		FornecedorJPanel Centro = new FornecedorJPanel();
		add(Centro);
		
		ShoppingJPanel Sul = new ShoppingJPanel();
		add(Sul);
	}
}
