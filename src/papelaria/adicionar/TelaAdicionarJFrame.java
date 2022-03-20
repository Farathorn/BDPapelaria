package papelaria.adicionar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import papelaria.entidades.Cliente;
import papelaria.entidades.Entidade;
import papelaria.entidades.EntidadeForte;
import papelaria.entidades.Funcionario;
import papelaria.paineis.TabelaJPanel;

public abstract class TelaAdicionarJFrame extends JFrame{

	protected TabelaJPanel caller;
	protected JTextField textField;
	
	JButton btnAdicionar = new JButton("Adicionar");
	JButton btnCancelar = new JButton("Cancelar");
	
	protected abstract String[] getAttributes ();
	
	public TelaAdicionarJFrame () {
		
	}
	
	public TelaAdicionarJFrame (TabelaJPanel caller) {
		
		this.caller = caller;
		
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Entidade inserida;
				try {
					
					inserida = caller.entidade.getClass().getDeclaredConstructor().newInstance();
					inserida.setAttributes(new ArrayList <String> (Arrays.asList(getAttributes())));
					
					caller.adicionarLinha(inserida);
					dispose();
				}
				catch (InstantiationException | IllegalAccessException | IllegalArgumentException
						| InvocationTargetException | NoSuchMethodException | SecurityException e1) {
					
					e1.printStackTrace();
				}
			}
		});
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
	}
	
	protected void keyCheckLock () {
		
		if (caller.entidade instanceof EntidadeForte && !(caller.entidade instanceof Cliente) && !(caller.entidade instanceof Funcionario)) {
			
			textField.setEnabled(false);
			
			int rowCount = caller.getTable().getRowCount();
			if (rowCount > 0) {
				
				textField.setText(Integer.toString(Integer.parseInt((String) caller.getTable().getModel().getValueAt(rowCount - 1, 0)) + 1));
			}
		}
	}
}
