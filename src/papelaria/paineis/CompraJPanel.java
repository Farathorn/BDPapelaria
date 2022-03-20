package papelaria.paineis;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import papelaria.adicionar.AdicionarCompraJFrame;
import papelaria.adicionar.TelaAdicionarJFrame;
import papelaria.entidades.Entidade;
import papelaria.entidades.ItemComprado;
import papelaria.entidades.Produto;
import papelaria.entidades.Venda;
import papelaria.paineis.TabelaJPanel.AcaoAdicionarButton;
import papelaria.entidades.ItemComprado;

public class CompraJPanel extends TabelaJPanel {

	private Venda venda;
	
	@Override
	protected void preencherTable () {
		
		Entidade[] filtro;
		try {
			filtro = dao.listar(new ItemComprado());
			Entidade[] lista;
			
			String[] colunas = new String[] {"Item", "Valor", "Quantidade"};
			
			if (filtro == null) {
				
				table.setModel(new DefaultTableModel(null, colunas));
			}
			else {
				
				lista = filtro;
				String[][] tabela;
				try {
					tabela = new String[lista.length][colunas.length];
					
					if (lista.length > 0) {
						
						for (int i = 0; i < lista.length; i ++) {
							
							tabela[i][0] = ((Produto) lista[i].getEntidades()[0]).getDescricao();
							tabela[i][1] = Double.toString(((Produto) lista[i].getEntidades()[0]).getPrecoUnitario());
							tabela[i][2] = lista[i].getAttributes()[2];
						}
						
						DefaultTableModel dtm = (DefaultTableModel) table.getModel();
						for (int i = 0; i < table.getRowCount(); i ++) {
							
							dtm.removeRow(i);
						}
						
						dtm = new DefaultTableModel(tabela, colunas) {
							
							public boolean isCellEditable() {
								
								return false;
							}
						};
						
						table.setModel(dtm);
						
						entidades = lista;
						
						table.setVisible(false);
						table.setVisible(true);
					}
				}
				catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				catch (SecurityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (IllegalArgumentException | SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	class AcaoAdicionarButton implements ActionListener {
		
		private TabelaJPanel caller;
		
		public AcaoAdicionarButton(TabelaJPanel caller) {
			
			this.caller = caller;
		}
		
        public void actionPerformed(ActionEvent e) {

        	TelaAdicionarJFrame adicionar;
			try {
				
				adicionar = new AdicionarCompraJFrame(caller, venda);
				adicionar.setLocationRelativeTo(table);
				adicionar.setLocation(300, 300);
				adicionar.setVisible(true);
				
			}
			catch (IllegalArgumentException | SecurityException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
	}

	public CompraJPanel (TabelaJPanel caller) {
		
		super(new ItemComprado());
		this.caller = caller;
		
		int selecionada = caller.getTable().getSelectedRow();
		ArrayList <String> dados = new ArrayList<String>();
		for (int i = 0; i < caller.getTable().getColumnCount(); i ++) {
			
			dados.add((String) caller.getTable().getModel().getValueAt(selecionada, i));
		}
		
		venda = new Venda();
		venda.setAttributes(dados);
		telaAdicionar = new AdicionarCompraJFrame(this, venda);
		
		btnAdicionar.removeActionListener(acaoAdicionar);
		btnAdicionar.addActionListener(new AcaoAdicionarButton(this));
		
		setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		preencherTable();
		scrollPane.setViewportView(table);
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.WEST);
		panel.setLayout(new BorderLayout (0, 0));
		
		JPanel panel_botoes = new JPanel();
		panel.add(panel_botoes, BorderLayout.CENTER);
		panel_botoes.setLayout(new BorderLayout (0, 0));
		
		btnAdicionar.setPreferredSize(new Dimension(70, 120));
		panel.add(btnAdicionar, BorderLayout.NORTH);
		panel.add(btnRemover, BorderLayout.CENTER);
	}
}
