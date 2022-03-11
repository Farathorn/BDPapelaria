package papelaria;

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


public class TerceirosJPanel extends JPanel {
	private JTable fornecedorTable;
	private JTable shoppingTable;
	private JTable estoqueTable;
	TabelaDAO dao = DAOFactory.createDAO();

	private void preencherTableEstoque () {
		
		Entidade[] filtro = dao.listar(new Estoque());
		Entidade[] lista;
		if (filtro == null) {
			
			estoqueTable.setModel(new DefaultTableModel(null, new String[] {
					"C\u00F3digo", "Contato", "Endere\u00E7o"
			}));
		}
		else {
			
			lista = filtro;
			String[][] tabela = new String[lista.length][new Estoque().getAttributeCount()];
			
			if (lista.length > 0) {
				
				for (int i = 0; i < lista.length; i ++) {
					
					tabela[i] = lista[i].getAttributes();
				}
				
				DefaultTableModel dtm = (DefaultTableModel) estoqueTable.getModel();
				for (int i = 0; i < estoqueTable.getRowCount(); i ++) {
					
					dtm.removeRow(i);
				}
				
				estoqueTable.setModel(new DefaultTableModel(tabela, new String[] {
						"C\u00F3digo", "Contato", "Endere\u00E7o"
				}));
			}
		}
	}

	private void preencherTableFornecedor () {
		
		Entidade[] filtro = dao.listar(new Fornecedor());
		Entidade[] lista;
		if (filtro == null) {
			
			fornecedorTable.setModel(new DefaultTableModel(null, new String[] {
					"C\u00F3digo", "Contato", "Endere\u00E7o"
			}));
		}
		else {
			
			lista = filtro;
			String[][] tabela = new String[lista.length][new Fornecedor().getAttributeCount()];
			
			if (lista.length > 0) {
				
				for (int i = 0; i < lista.length; i ++) {
					
					tabela[i] = lista[i].getAttributes();
				}
				
				DefaultTableModel dtm = (DefaultTableModel) fornecedorTable.getModel();
				for (int i = 0; i < fornecedorTable.getRowCount(); i ++) {
					
					dtm.removeRow(i);
				}
				
				fornecedorTable.setModel(new DefaultTableModel(tabela, new String[] {
						"C\u00F3digo", "Contato", "Endere\u00E7o"
				}));
			}
		}		
	}

	private void preencherTableShopping () {
		
		Entidade[] filtro = dao.listar(new Shopping());
		Entidade[] lista;
		if (filtro == null) {
			
			shoppingTable.setModel(new DefaultTableModel(null, new String[] {
					"C\u00F3digo", "Nome", "Endere\u00E7o", "Aluguel"
			}));
		}
		else {
			
			lista = filtro;
			String[][] tabela = new String[lista.length][new Shopping().getAttributeCount()];
			
			if (lista.length > 0) {
				
				for (int i = 0; i < lista.length; i ++) {
					
					tabela[i] = lista[i].getAttributes();
				}
				
				DefaultTableModel dtm = (DefaultTableModel) shoppingTable.getModel();
				for (int i = 0; i < shoppingTable.getRowCount(); i ++) {
					
					dtm.removeRow(i);
				}
				
				shoppingTable.setModel(new DefaultTableModel(tabela, new String[] {
						"C\u00F3digo", "Nome", "Endere\u00E7o", "Aluguel"
				}));
			}
		}
	}

	/**
	 * Create the panel.
	 */
	public TerceirosJPanel () {

		setBounds(100, 100, 1016, 861);
		setLayout(new BorderLayout(0, 0));
		
		Panel panel = new Panel();
		add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane);
		
		estoqueTable = new JTable();
		estoqueTable.setModel(new DefaultTableModel(
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
			},
			new String[] {
				"Código", "Contato", "Endereço"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		estoqueTable.setPreferredScrollableViewportSize(new Dimension(600, 200));
		scrollPane.setViewportView(estoqueTable);
		
		preencherTableEstoque();
		
		Panel panel_8 = new Panel();
		panel.add(panel_8, BorderLayout.NORTH);
		
		JLabel lblNewLabel_1 = new JLabel("Estoque");
		panel_8.add(lblNewLabel_1);
		
		Panel panel_3 = new Panel();
		panel.add(panel_3, BorderLayout.WEST);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JButton btnAdicionar_1 = new JButton("Adicionar");

		btnAdicionar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AdicionarTerceiroEstoqueJFrame adicionar = new AdicionarTerceiroEstoqueJFrame();
				adicionar.setLocationRelativeTo(estoqueTable);
				adicionar.setLocation(300, 300);
				adicionar.setVisible(true);
			}
		});

		btnAdicionar_1.setPreferredSize(new Dimension(40, 100));
		panel_3.add(btnAdicionar_1, BorderLayout.CENTER);
		
		JButton btnRemover_1 = new JButton("Remover");
		btnRemover_1.setPreferredSize(new Dimension(100, 40));
		panel_3.add(btnRemover_1, BorderLayout.SOUTH);
		
		Panel panel_1 = new Panel();
		add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_3 = new JScrollPane();
		panel_1.add(scrollPane_3);
		
		shoppingTable = new JTable();
		shoppingTable.setModel(new DefaultTableModel(
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
			},
			new String[] {
				"Código", "Nome", "Endereço", "Aluguel"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		shoppingTable.setPreferredScrollableViewportSize(new Dimension(600, 200));
		scrollPane_3.setViewportView(shoppingTable);
		
		preencherTableShopping();
		
		Panel panel_7 = new Panel();
		panel_1.add(panel_7, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Shopping");
		panel_7.add(lblNewLabel);
		
		Panel panel_5 = new Panel();
		panel_1.add(panel_5, BorderLayout.WEST);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JButton btnAdicionar = new JButton("Adicionar");

		btnAdicionar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

				AdicionarTerceiroShoppingJFrame adicionar = new AdicionarTerceiroShoppingJFrame();
                adicionar.requestFocus();
                adicionar.setLocationRelativeTo(shoppingTable);
                adicionar.setLocation(300, 300);
                adicionar.setVisible(true);
            }
        });
		btnAdicionar.setPreferredSize(new Dimension(77, 130));
		panel_5.add(btnAdicionar, BorderLayout.CENTER);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.setPreferredSize(new Dimension(75, 130));
		panel_5.add(btnRemover, BorderLayout.SOUTH);
		
		Panel panel_2 = new Panel();
		add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_2 = new JScrollPane();
		panel_2.add(scrollPane_2);
		
		fornecedorTable = new JTable();
		fornecedorTable.setModel(new DefaultTableModel(
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
			},
			new String[] {
				"Código", "Contato", "Endereço"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		fornecedorTable.setPreferredScrollableViewportSize(new Dimension(600, 200));
		scrollPane_2.setViewportView(fornecedorTable);
		
		preencherTableFornecedor();
		
		Panel panel_6 = new Panel();
		panel_2.add(panel_6, BorderLayout.NORTH);
		
		JLabel lblFornecedor = new JLabel("Fornecedor");
		panel_6.add(lblFornecedor);
		
		Panel panel_4 = new Panel();
		panel_2.add(panel_4, BorderLayout.WEST);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JButton btnAdicionar_2 = new JButton("Adicionar");

		btnAdicionar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AdicionarTerceiroEstoqueJFrame adicionar = new AdicionarTerceiroEstoqueJFrame();
				adicionar.setLocationRelativeTo(estoqueTable);
				adicionar.setLocation(300, 300);
				adicionar.setVisible(true);
			}
		});
		btnAdicionar_2.setMaximumSize(new Dimension(77, 130));
		btnAdicionar_2.setPreferredSize(new Dimension(77, 130));
		panel_4.add(btnAdicionar_2, BorderLayout.CENTER);
		
		JButton btnRemover_2 = new JButton("Remover");
		btnRemover_2.setMinimumSize(new Dimension(75, 230));
		btnRemover_2.setMaximumSize(new Dimension(75, 230));
		btnRemover_2.setPreferredSize(new Dimension(75, 130));
		panel_4.add(btnRemover_2, BorderLayout.SOUTH);
	}

}
