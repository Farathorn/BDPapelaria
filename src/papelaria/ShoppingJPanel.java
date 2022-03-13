package papelaria;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import net.miginfocom.swing.MigLayout;
import papelaria.entidades.Franquia;
import papelaria.entidades.Shopping;

public class ShoppingJPanel extends TabelaJPanel {

	public ShoppingJPanel () {
		
		super(new Shopping());
		telaAdicionar = new AdicionarTerceiroShoppingJFrame(this);
		
		setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		preencherTable();
		scrollPane.setViewportView(table);
		
		JPanel panel = new JPanel();
		panel.setSize(new Dimension(100, 0));
		add(panel, BorderLayout.WEST);
		panel.setLayout(new BorderLayout (0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		btnAdicionar.setPreferredSize(new Dimension(70, 120));
		panel.add(btnAdicionar, BorderLayout.NORTH);
		panel.add(btnRemover, BorderLayout.CENTER);
		
		JPanel shoppingLabelPanel = new JPanel();
		add(shoppingLabelPanel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Shopping");
		shoppingLabelPanel.add(lblNewLabel);
	}
}
