package papelaria;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import papelaria.dao.TabelaDAO;
import papelaria.entidades.Entidade;
import papelaria.entidades.Funcionario;
import papelaria.entidades.Produto;


public class ProdutosJPanel extends JPanel {
	private JTable table;
	TabelaDAO dao = DAOFactory.createDAO();

	private void preencherTable () {
		
		Entidade[] filtro = dao.listar(new Produto());
		Entidade[] lista;
		if (filtro == null) {
			
			table.setModel(new DefaultTableModel(null, new String[] {
					"C\u00F3digo", "Quantidade", "Descri\u00E7\u00E3o", "Pre\u00E7o Unit\u00E1rio", "Pre\u00E7o Total", "Estoque"
			}));
		}
		else {
			
			lista = filtro;
			String[][] tabela = new String[lista.length][new Produto().getAttributeCount()];
			
			if (lista.length > 0) {
				
				for (int i = 0; i < lista.length; i ++) {
					
					tabela[i] = lista[i].getAttributes();
				}
				
				DefaultTableModel dtm = (DefaultTableModel) table.getModel();
				for (int i = 0; i < table.getRowCount(); i ++) {
					
					dtm.removeRow(i);
				}
				
				table.setModel(new DefaultTableModel(tabela, new String[] {
						"C\u00F3digo", "Quantidade", "Descri\u00E7\u00E3o", "Pre\u00E7o Unit\u00E1rio", "Pre\u00E7o Total", "Estoque"
				}));
			}
		}
	}

	/**
	 * Create the panel.
	 */
	public ProdutosJPanel () {
		
		setBounds(100, 100, 1016, 861);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(133, 0, 873, 850);
		add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"C\u00F3digo", "Quantidade", "Descri\u00E7\u00E3o", "Pre\u00E7o Unit\u00E1rio", "Pre\u00E7o Total", "Estoque"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(table);
		
		preencherTable();
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(0, 291, 123, 52);
		add(btnAdicionar);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.setBounds(34, 354, 89, 23);
		add(btnRemover);
	}
}
