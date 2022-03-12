package papelaria;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import papelaria.dao.TabelaDAO;
import papelaria.entidades.CustoIndireto;
import papelaria.entidades.Entidade;


public class CustosIndiretosJPanel extends JPanel {
	private JTable table;
	TabelaDAO dao = DAOFactory.createDAO();

	private void preencherTable () {
		
		Entidade[] filtro = dao.listar(new CustoIndireto());
		Entidade[] lista;
		if (filtro == null) {
			
			table.setModel(new DefaultTableModel(null, new String[] {
					"Valor", "Descri\u00E7\u00E3o", "Fornecedor", "Estoque"
			}));
		}
		else {
			
			lista = filtro;
			
			String[][] tabela = new String[lista.length][new CustoIndireto().getAttributeCount()];
			
			if (lista.length > 0) {
				
				for (int i = 0; i < lista.length; i ++) {
					
					tabela[i] = lista[i].getAttributes();
				}
				
				DefaultTableModel dtm = (DefaultTableModel) table.getModel();
				for (int i = 0; i < table.getRowCount(); i ++) {
					
					dtm.removeRow(i);
				}
				
				table.setModel(new DefaultTableModel(tabela, new String[] {
						"Valor", "Descri\u00E7\u00E3o", "Fornecedor", "Estoque"
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

        	AdicionarCustoIndiretosJFrame adicionar = new AdicionarCustoIndiretosJFrame(caller);
            adicionar.requestFocus();
            adicionar.setLocationRelativeTo(table);
            adicionar.setLocation(300, 300);
            adicionar.setVisible(true);
        }
	}

	/**
	 * Create the panel.
	 */
	public CustosIndiretosJPanel () {

		setBounds(100, 100, 1016, 861);
		setLayout(null);
		
		JButton btnAdicionar = new JButton("Adicionar");

		btnAdicionar.addActionListener(new AcaoAdicionarButton(this));
		btnAdicionar.setBounds(10, 290, 123, 52);
		add(btnAdicionar);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.setBounds(43, 350, 89, 23);
		add(btnRemover);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(140, 11, 866, 839);
		add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Valor", "Descri\u00E7\u00E3o", "Fornecedor", "Estoque"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(table);
		
		preencherTable();
	}
}
