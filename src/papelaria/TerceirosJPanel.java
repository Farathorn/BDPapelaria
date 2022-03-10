package papelaria;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import net.miginfocom.swing.MigLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Panel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;


public class TerceirosJPanel extends JPanel {
	private JTable table_1;
	private JTable table_2;
	private JTable table;

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
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
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
				"C\u00F3digo", "Contato", "Endere\u00E7o"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.setPreferredScrollableViewportSize(new Dimension(600, 200));
		scrollPane.setViewportView(table);
		
		Panel panel_8 = new Panel();
		panel.add(panel_8, BorderLayout.NORTH);
		
		JLabel lblNewLabel_1 = new JLabel("Estoque");
		panel_8.add(lblNewLabel_1);
		
		Panel panel_3 = new Panel();
		panel.add(panel_3, BorderLayout.WEST);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JButton btnAdicionar_1 = new JButton("Adicionar");
		btnAdicionar_1.setPreferredSize(new Dimension(77, 130));
		panel_3.add(btnAdicionar_1, BorderLayout.CENTER);
		
		JButton btnRemover_1 = new JButton("Remover");
		btnRemover_1.setPreferredSize(new Dimension(75, 130));
		panel_3.add(btnRemover_1, BorderLayout.SOUTH);
		
		Panel panel_1 = new Panel();
		add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_3 = new JScrollPane();
		panel_1.add(scrollPane_3);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
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
				"C\u00F3digo", "Nome", "Endere\u00E7o", "Aluguel"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_2.setPreferredScrollableViewportSize(new Dimension(600, 200));
		scrollPane_3.setViewportView(table_2);
		
		Panel panel_7 = new Panel();
		panel_1.add(panel_7, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Shopping");
		panel_7.add(lblNewLabel);
		
		Panel panel_5 = new Panel();
		panel_1.add(panel_5, BorderLayout.WEST);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JButton btnAdicionar = new JButton("Adicionar");
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
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
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
				"C\u00F3digo", "Contato", "Endere\u00E7o"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_1.setPreferredScrollableViewportSize(new Dimension(600, 200));
		scrollPane_2.setViewportView(table_1);
		
		Panel panel_6 = new Panel();
		panel_2.add(panel_6, BorderLayout.NORTH);
		
		JLabel lblFornecedor = new JLabel("Fornecedor");
		panel_6.add(lblFornecedor);
		
		Panel panel_4 = new Panel();
		panel_2.add(panel_4, BorderLayout.WEST);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JButton btnAdicionar_2 = new JButton("Adicionar");
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
