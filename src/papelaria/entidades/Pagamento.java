package papelaria.entidades;

import java.util.ArrayList;

public class Pagamento extends Custo {
	
	public static String descriptor = "Pagamento";
	public static int attributeCount = 4;
	
	public String getDescriptor () {
		
		return descriptor;
	}
	
	public String[] listAttributes () {
		
		String[] lista = {"Valor", "Descrição", "Tipo", "Funcionário"};
		
		return lista;
	}
	
	public void setAttributes (ArrayList <String> set) {
		
		if (set.size() == 4) {
			
			setValor(Double.parseDouble(set.get(0)));
			setDescricao(set.get(1));
			tipo = set.get(2);
			funcionario = new Funcionario();
			funcionario.setCodigo(set.get(3));
		}
	}
	
	public int getAttributeCount () {
		
		return attributeCount;
	}
	
	public String[] getAttributes () {
		
		String[] atributos = new String[getAttributeCount()];
		
		atributos[0] = Double.toString(getValor());
		atributos[1] = getDescricao();
		atributos[2] = tipo;
		atributos[3] = funcionario.getCodigo();
		
		return atributos;
	}

	private String tipo;
	private Funcionario funcionario = new Funcionario();
	
	public String getTipo () {
	
		return tipo;
	}
	
	public void setTipo (String tipo) {
	
		this.tipo = tipo;
	}
	
	public Funcionario getFuncionario () {
	
		return funcionario;
	}
	
	public void setFuncionario (Funcionario funcionario) {
	
		this.funcionario = funcionario;
	}
}
