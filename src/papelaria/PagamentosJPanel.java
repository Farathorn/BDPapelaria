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


public class PagamentosJPanel extends JPanel {
	private JTable table;
	TabelaDAO dao = DAOFactory.createDAO();

	private void preencherTable () {
		
		Entidade[] filtro = dao.listar(new Pagamento());
		Entidade[] lista;
		if (filtro == null) {
			
			table.setModel(new DefaultTableModel(null, new String[] {
					"Valor", "Descri\u00E7\u00E3o", "Tipo", "Funcion\u00E1rio"
			}));
		}
		else {
			
			lista = filtro;
			String[][] tabela = new String[lista.length][new Pagamento().getAttributeCount()];
			
			if (lista.length > 0) {
				
				for (int i = 0; i < lista.length; i ++) {
					
					tabela[i] = lista[i].getAttributes();
				}
				
				DefaultTableModel dtm = (DefaultTableModel) table.getModel();
				for (int i = 0; i < table.getRowCount(); i ++) {
					
					dtm.removeRow(i);
				}
				
				table.setModel(new DefaultTableModel(tabela, new String[] {
						"Valor", "Descri\u00E7\u00E3o", "Tipo", "Funcion\u00E1rio"
				}));
			}
		}
	}

	/**
	 * Create the panel.
	 */
	public PagamentosJPanel () {

		setBounds(100, 100, 1016, 861);
		setLayout(null);
		
		JButton btnAdicionar = new JButton("Adicionar");

		btnAdicionar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

				AdicionarCustoPagamentosJFrame adicionar = new AdicionarCustoPagamentosJFrame();
                adicionar.requestFocus();
                adicionar.setLocationRelativeTo(table);
                adicionar.setLocation(300, 300);
                adicionar.setVisible(true);
            }
        });
		
		btnAdicionar.setBounds(10, 244, 111, 83);
		add(btnAdicionar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(130, 0, 876, 850);
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
				"Valor", "Descri\u00E7\u00E3o", "Tipo", "Funcion\u00E1rio"
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
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.setBounds(44, 345, 75, 53);
		add(btnRemover);
	}

}
