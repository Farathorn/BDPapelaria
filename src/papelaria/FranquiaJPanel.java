package papelaria;

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
import papelaria.dao.TabelaDAO;
import papelaria.entidades.Entidade;
import papelaria.entidades.Franquia;


public class FranquiaJPanel extends JPanel {
	
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
	
	private JTable table;
	TabelaDAO dao = DAOFactory.createDAO();
	
	private void preencherTable () {
		
		Entidade[] filtro = dao.listar(new Franquia());
		Entidade[] lista;
		if (filtro == null) {
			
			table.setModel(new DefaultTableModel(null, new String[] {
					"C\u00F3digo", "Endere\u00E7o", "Cofre"
			}));
		}
		else {
			
			lista = filtro;
			String[][] tabela = new String[lista.length][new Franquia().getAttributeCount()];
			
			if (lista.length > 0) {
				
				for (int i = 0; i < lista.length; i ++) {
					
					tabela[i] = lista[i].getAttributes();
				}
				
				DefaultTableModel dtm = (DefaultTableModel) table.getModel();
				for (int i = 0; i < table.getRowCount(); i ++) {
					
					dtm.removeRow(i);
				}
				
				table.setModel(new DefaultTableModel(tabela, new String[] {
						"C\u00F3digo", "Endere\u00E7o", "Cofre"
				}));
			}
		}
		
	}
	
	class AcaoAdicionarButton implements ActionListener {
		
		private JPanel caller;
		
		public AcaoAdicionarButton(JPanel caller) {
			
			this.caller = caller;
		}
		
        public void actionPerformed(ActionEvent e) {

        	AdicionarFranquiaJFrame adicionar = new AdicionarFranquiaJFrame(caller);
        	adicionar.setLocationRelativeTo(table);
			adicionar.setLocation(300, 300);
			adicionar.setVisible(true);
        }
	}

	public FranquiaJPanel () {
		
		setBounds(100, 100, 1016, 861);
		setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setModel(new DefaultTableModelExtension(new Object[][] {
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
		}, new String[] {
			"Código", "Endereço", "Cofre"
		}));
		scrollPane.setViewportView(table);
		
		preencherTable();
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.WEST);
		panel.setLayout(new MigLayout("", "[77px]", "[23px][][][][][][][][][][][][][]"));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, "cell 0 0,alignx left,aligny top");
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new AcaoAdicionarButton(this));
		btnAdicionar.setPreferredSize(new Dimension(70, 120));
		panel.add(btnAdicionar, "cell 0 12");
		
		JButton btnRemover = new JButton("Remover");
		panel.add(btnRemover, "cell 0 13");

	}
}
