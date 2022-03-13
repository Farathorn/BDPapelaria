package papelaria.paineis;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import net.miginfocom.swing.MigLayout;
import papelaria.adicionar.AdicionarFranquiaJFrame;
import papelaria.dao.TabelaDAO;
import papelaria.entidades.Entidade;
import papelaria.entidades.Franquia;


public class FranquiaJPanel extends TabelaJPanel {
	
	private final class DefaultTableModelExtension extends DefaultTableModel {
		Class[] columnTypes = new Class[] {
			String.class, String.class, String.class
		};
		boolean[] columnEditables = new boolean[] {
			false, false, false
		};

		private DefaultTableModelExtension(Object[][] arg0, Object[] arg1) {
			super(arg0, arg1);
		}

		public Class getColumnClass(int columnIndex) {
			return columnTypes[columnIndex];
		}

		public boolean isCellEditable(int row, int column) {
			return columnEditables[column];
		}
	}

	public FranquiaJPanel () {
		
		super(new Franquia());
		telaAdicionar = new AdicionarFranquiaJFrame(this);
		
		setBounds(100, 100, 1016, 861);
		setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		preencherTable();
		scrollPane.setViewportView(table);
		
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.WEST);
		panel.setLayout(new MigLayout("", "[77px]", "[23px][][][][][][][][][][][][][]"));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, "cell 0 0,alignx left,aligny top");
		panel_1.setLayout(new BorderLayout(0, 0));
		
		btnAdicionar.setPreferredSize(new Dimension(70, 120));
		panel.add(btnAdicionar, "cell 0 9");
		panel.add(btnRemover, "cell 0 13");

	}
}
