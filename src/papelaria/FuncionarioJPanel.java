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
import papelaria.entidades.Funcionario;


public class FuncionarioJPanel extends JPanel {
	private JTable table;
	TabelaDAO dao = DAOFactory.createDAO();

	private void preencherTable () {
		
		Entidade[] filtro = dao.listar(new Funcionario());
		Entidade[] lista;
		if (filtro == null) {
			
			table.setModel(new DefaultTableModel(null, new String[] {
					"CPF", "Nome", "Carteira de Trabalho", "Cargo", "Expediente", "Sal\u00E1rio Base", "Faltas", "Venda do M\u00EAs", "Ticket M\u00E9dio", "Franquia"
			}));
		}
		else {
			
			lista = filtro;
			String[][] tabela = new String[lista.length][new Funcionario().getAttributeCount()];
			
			if (lista.length > 0) {
				
				for (int i = 0; i < lista.length; i ++) {
					
					tabela[i] = lista[i].getAttributes();
				}
				
				DefaultTableModel dtm = (DefaultTableModel) table.getModel();
				for (int i = 0; i < table.getRowCount(); i ++) {
					
					dtm.removeRow(i);
				}
				
				table.setModel(new DefaultTableModel(tabela, new String[] {
						"CPF", "Nome", "Carteira de Trabalho", "Cargo", "Expediente", "Sal\u00E1rio Base", "Faltas", "Venda do M\u00EAs", "Ticket M\u00E9dio", "Franquia"
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

        	AdicionarFuncionarioJFrame adicionar = new AdicionarFuncionarioJFrame(caller);
        	adicionar.setLocationRelativeTo(table);
			adicionar.setLocation(300, 300);
			adicionar.setVisible(true);
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
	
	/**
	 * Create the panel.
	 */
	public FuncionarioJPanel () {
		
		setBounds(100, 100, 1016, 861);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(143, 11, 863, 839);
		add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"CPF", "Nome", "Carteira de Trabalho", "Cargo", "Expediente", "Sal\u00E1rio Base", "Faltas", "Venda do M\u00EAs", "Ticket M\u00E9dio", "Franquia"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(table);
		
		preencherTable();
		
		JButton btnAdicionar = new JButton("Adicionar");
		
		btnAdicionar.addActionListener(new AcaoAdicionarButton(this));
		btnAdicionar.setBounds(10, 322, 123, 52);
		add(btnAdicionar);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.setBounds(44, 385, 89, 23);
		add(btnRemover);

	}

}
