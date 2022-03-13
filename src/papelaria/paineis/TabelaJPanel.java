package papelaria.paineis;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import papelaria.DAOFactory;
import papelaria.adicionar.TelaAdicionarJFrame;
import papelaria.dao.TabelaDAO;
import papelaria.entidades.Entidade;
import papelaria.entidades.Franquia;
import papelaria.entidades.Venda;

public class TabelaJPanel extends JPanel {
	
	protected JTable table;
	public Entidade entidade;
	protected TelaAdicionarJFrame telaAdicionar;
	protected TabelaJPanel caller;
	
	protected JButton btnAdicionar;
	protected JButton btnRemover;
	
	protected ActionListener acaoAdicionar;

	public JTable getTable() {
		return table;
	}

	protected TabelaDAO dao = DAOFactory.createDAO();
	
	protected void preencherTable () {
		
		Entidade[] filtro;
		try {
			filtro = dao.listar(entidade.getClass().getDeclaredConstructor().newInstance());
			Entidade[] lista;
			if (filtro == null) {
				
				table.setModel(new DefaultTableModel(null, entidade.getClass().getDeclaredConstructor().newInstance().listAttributes()));
			}
			else {
				
				lista = filtro;
				String[][] tabela;
				try {
					tabela = new String[lista.length][entidade.getClass().getDeclaredConstructor().newInstance().getAttributeCount()];
					
					if (lista.length > 0) {
						
						for (int i = 0; i < lista.length; i ++) {
							
							tabela[i] = lista[i].getAttributes();
						}
						
						DefaultTableModel dtm = (DefaultTableModel) table.getModel();
						for (int i = 0; i < table.getRowCount(); i ++) {
							
							dtm.removeRow(i);
						}
						
						dtm = new DefaultTableModel(tabela, entidade.getClass().getDeclaredConstructor().newInstance().listAttributes()) {
							
							public boolean isCellEditable() {
								
								return false;
							}
						};
						
						table.setModel(dtm);
						
						table.setVisible(false);
						table.setVisible(true);
					}
				} catch (InstantiationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NoSuchMethodException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SecurityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e1) {
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
				
				adicionar = caller.telaAdicionar.getClass().getDeclaredConstructor(new Class[] {TabelaJPanel.class}).newInstance(caller);
				adicionar.setLocationRelativeTo(table);
				adicionar.setLocation(300, 300);
				adicionar.setVisible(true);
				
			}
			catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException | NoSuchMethodException | SecurityException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
	}
	
	public boolean adicionarLinha (Entidade entidade) {
		
		if (dao.adicionar(entidade, entidade.listAttributes(), entidade.getAttributes())) {
			
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			
			table.removeAll();
			preencherTable();
			
			return true;
		}
		
		return false;
	}
	
	public TabelaJPanel (Entidade entidade) {
		
		this.entidade = entidade;
		
		table = new JTable();
		btnAdicionar = new JButton("Adicionar");
		btnRemover= new JButton("Remover");
		
		btnAdicionar.setVisible(false);
		btnAdicionar.setVisible(true);
		
		acaoAdicionar = new AcaoAdicionarButton(this);
		btnAdicionar.addActionListener(acaoAdicionar);
	}
}
