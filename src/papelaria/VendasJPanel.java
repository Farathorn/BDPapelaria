package papelaria;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import papelaria.dao.TabelaDAO;
import papelaria.entidades.Entidade;
import papelaria.entidades.Venda;


public class VendasJPanel extends JPanel {
	private JTable table;
	TabelaDAO dao = DAOFactory.createDAO();

	private void preencherTable () {
		
		Entidade[] filtro = dao.listar(new Venda());
		Entidade[] lista;
		if (filtro == null) {
			
			table.setModel(new DefaultTableModel(null, new String[] {
					"C\u00F3digo", "Tipo", "Valor", "Forma de Pagamento", "Parcelamento", "Funcion\u00E1rio", "Cliente", "Franquia"
			}));
		}
		else {
			
			lista = filtro;
			String[][] tabela = new String[lista.length][new Venda().getAttributeCount()];
			
			if (lista.length > 0) {
				
				for (int i = 0; i < lista.length; i ++) {
					
					tabela[i] = lista[i].getAttributes();
				}
				
				DefaultTableModel dtm = (DefaultTableModel) table.getModel();
				for (int i = 0; i < table.getRowCount(); i ++) {
					
					dtm.removeRow(i);
				}
				
				table.setModel(new DefaultTableModel(tabela, new String[] {
						"C\u00F3digo", "Tipo", "Valor", "Forma de Pagamento", "Parcelamento", "Funcion\u00E1rio", "Cliente", "Franquia"
				}));
			}
		}
	}
	
	public boolean adicionarLinha (Entidade entidade) {
		
		if (dao.adicionar(entidade, entidade.listAttributes(), entidade.getAttributes())) {
			
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.addRow(entidade.getAttributes());
			return true;
		}
		
		return false;
	}
	
	class AcaoAdicionarVendaButton implements ActionListener {
		
		private JPanel caller;
		
		public AcaoAdicionarVendaButton(JPanel caller) {
			
			this.caller = caller;
		}
		
        public void actionPerformed(ActionEvent e) {

        	AdicionarTerceiroShoppingJFrame adicionar = new AdicionarTerceiroShoppingJFrame(caller);
        	adicionar.setLocationRelativeTo(table);
			adicionar.setLocation(300, 300);
			adicionar.setVisible(true);
        }
	}

	/**
	 * Create the panel.
	 */
	public VendasJPanel () {
		
		setBounds(100, 100, 1016, 861);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(143, 11, 863, 839);
		add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"C\u00F3digo", "Tipo", "Valor", "Forma de Pagamento", "Parcelamento", "Funcion\u00E1rio", "Cliente", "Franquia"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(table);
		
		preencherTable();
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new AcaoAdicionarVendaButton(this));
		btnAdicionar.setBounds(10, 300, 123, 52);
		add(btnAdicionar);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.setBounds(44, 370, 89, 23);
		add(btnRemover);
		
		JButton btnNewButton = new JButton("Produtos da\n Compra");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Qual venda foi selecionada ainda n�o est� implementado
				ComprasJFrame itens = new ComprasJFrame();
				itens.setTitle("Itens da venda " + "");
				itens.setVisible(true);
						
			}
		});
		btnNewButton.setBounds(10, 464, 123, 52);
		add(btnNewButton);

	}
}
