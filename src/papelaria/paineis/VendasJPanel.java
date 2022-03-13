package papelaria.paineis;

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

import papelaria.ComprasJFrame;
import papelaria.adicionar.AdicionarVendaJFrame;
import papelaria.dao.TabelaDAO;
import papelaria.entidades.Entidade;
import papelaria.entidades.Venda;


public class VendasJPanel extends TabelaJPanel {

	class AcaoMostrarCompra implements ActionListener {
		
		private TabelaJPanel caller;
		
		public AcaoMostrarCompra (TabelaJPanel caller) {

			this.caller = caller;
		}
		
		public void actionPerformed(ActionEvent e) {
			
			//Qual venda foi selecionada ainda n�o est� implementado
			if (table.getSelectedRows().length == 1) {
				
				ComprasJFrame itens = new ComprasJFrame(caller);
				itens.setTitle("Itens da venda " + "");
				itens.setVisible(true);
			}
					
		}
	}
	
	/**
	 * Create the panel.
	 */
	public VendasJPanel () {
		
		super(new Venda());
		telaAdicionar = new AdicionarVendaJFrame(this);
		
		setBounds(100, 100, 1016, 861);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(143, 11, 863, 839);
		add(scrollPane);
		
		scrollPane.setViewportView(table);
		
		preencherTable();
		
		btnAdicionar.setBounds(10, 300, 123, 52);
		add(btnAdicionar);
		
		btnRemover.setBounds(44, 370, 89, 23);
		add(btnRemover);
		
		JButton btnNewButton = new JButton("Produtos da\n Compra");
		btnNewButton.addActionListener(new AcaoMostrarCompra(this));
		btnNewButton.setBounds(10, 464, 123, 52);
		add(btnNewButton);

	}
}
