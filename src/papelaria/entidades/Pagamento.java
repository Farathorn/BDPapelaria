package papelaria.entidades;

import java.util.ArrayList;

public class Pagamento extends Custo {
	
	private String descriptor = "Pagamento";
	
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
			Tipo = set.get(2);
			funcionario.setCodigo(set.get(3));
		}
	}
	
	public int getAttributeCount () {
		
		return 4;
	}

	private String Tipo;
	private Funcionario funcionario;
	
	public String getTipo () {
	
		return Tipo;
	}
	
	public void setTipo (String tipo) {
	
		Tipo = tipo;
	}
	
	public Funcionario getFuncionario () {
	
		return funcionario;
	}
	
	public void setFuncionario (Funcionario funcionario) {
	
		this.funcionario = funcionario;
	}
}
