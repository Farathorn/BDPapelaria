package papelaria.paineis;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import net.miginfocom.swing.MigLayout;
import papelaria.adicionar.AdicionarTerceiroEstoqueJFrame;
import papelaria.entidades.Estoque;
import papelaria.entidades.Franquia;

public class EstoqueJPanel extends TabelaJPanel {

	public EstoqueJPanel () {
		
		super(new Estoque());
		telaAdicionar = new AdicionarTerceiroEstoqueJFrame(this);
		
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
		
		JPanel estoqueLabelPanel = new JPanel();
		add(estoqueLabelPanel, BorderLayout.NORTH);
		
		JLabel lblEstoque = new JLabel("Estoque");
		estoqueLabelPanel.add(lblEstoque);
	}
}
