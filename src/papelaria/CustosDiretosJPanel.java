package papelaria;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import papelaria.dao.TabelaDAO;
import papelaria.entidades.CustoDireto;
import papelaria.entidades.Entidade;
import papelaria.entidades.Funcionario;


public class CustosDiretosJPanel extends JPanel {
	private JTable table;
	TabelaDAO dao = DAOFactory.createDAO();

	private void preencherTable () {
		
		Entidade[] filtro = dao.listar(new CustoDireto());
		Entidade[] lista;
		if (filtro == null) {
			
			table.setModel(new DefaultTableModel(null, new String[] {
					"Valor", "Descri\u00E7\u00E3o", "Shopping"
			}));
		}
		else {
			
			lista = filtro;
			
			String[][] tabela = new String[lista.length][new CustoDireto().getAttributeCount()];
			
			if (lista.length > 0) {
				
				for (int i = 0; i < lista.length; i ++) {
					
					tabela[i] = lista[i].getAttributes();
				}
				
				DefaultTableModel dtm = (DefaultTableModel) table.getModel();
				for (int i = 0; i < table.getRowCount(); i ++) {
					
					dtm.removeRow(i);
				}
				
				table.setModel(new DefaultTableModel(tabela, new String[] {
						"Valor", "Descri\u00E7\u00E3o", "Shopping"
				}));
			}
		}
	}
	
	/**
	 * Create the panel.
	 */
	public CustosDiretosJPanel () {
		
		setBounds(100, 100, 1016, 861);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(150, 0, 856, 850);
		add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
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
			},
			new String[] {
				"Valor", "Descri\u00E7\u00E3o", "Shopping"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(table);
		
		preencherTable();
		
		JButton btnAdicionar = new JButton("Adicionar");

		btnAdicionar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

				AdicionarCustoDiretosJFrame adicionar = new AdicionarCustoDiretosJFrame();
                adicionar.requestFocus();
                adicionar.setLocationRelativeTo(table);
                adicionar.setLocation(300, 300);
                adicionar.setVisible(true);
            }
        });
		btnAdicionar.setBounds(20, 293, 123, 52);
		add(btnAdicionar);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.setBounds(53, 362, 89, 23);
		add(btnRemover);
		
		
	}

}
