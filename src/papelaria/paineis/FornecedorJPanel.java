package papelaria.paineis;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import net.miginfocom.swing.MigLayout;
import papelaria.adicionar.AdicionarTerceiroFornecedorJFrame;
import papelaria.entidades.Fornecedor;
import papelaria.entidades.Franquia;

public class FornecedorJPanel extends TabelaJPanel {

	public FornecedorJPanel () {
		
		super(new Fornecedor());
		telaAdicionar = new AdicionarTerceiroFornecedorJFrame(this);
		
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
		
		JPanel fornecedorLabelPanel = new JPanel();
		add(fornecedorLabelPanel, BorderLayout.NORTH);
		
		JLabel lblFornecedor = new JLabel("Fornecedor");
		fornecedorLabelPanel.add(lblFornecedor);
	}
}
