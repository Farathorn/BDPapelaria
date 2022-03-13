package papelaria;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import papelaria.entidades.Entidade;

public abstract class TelaAdicionarJFrame extends JFrame{

	private TabelaJPanel caller;
	
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
				} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
						| InvocationTargetException | NoSuchMethodException | SecurityException e1) {
					// TODO Auto-generated catch block
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
}
