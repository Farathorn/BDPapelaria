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


public class VendasJPanel extends TabelaJPanel {

	/**
	 * Create the panel.
	 */
	public VendasJPanel () {
		
		super(new Venda());
		
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
