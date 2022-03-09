package papelaria.entidades;

import java.util.ArrayList;

public class CustoIndireto extends Custo {

	private String descriptor = "CustoIndireto";
	
	public String getDescriptor () {
		
		return descriptor;
	}
	
	public String[] listAttributes () {
		
		String[] lista = {"Valor", "Descrição", "Fornecedor", "Estoque"};
		
		return lista;
	}
	
	public void setAttributes (ArrayList <String> set) {
		
		if (set.size() == 4) {
			
			setValor(Double.parseDouble(set.get(0)));
			setDescricao(set.get(1));
			fornecedor.setCodigo(set.get(2));
			estoque.setCodigo(set.get(3));
		}
	}
	
	public int getAttributeCount () {
		
		return 4;
	}
	
	private Fornecedor fornecedor;
	private Estoque estoque;
	
	public Fornecedor getFornecedor () {
	
		return fornecedor;
	}
	
	public void setFornecedor (Fornecedor fornecedor) {
	
		this.fornecedor = fornecedor;
	}
	
	public Estoque getEstoque () {
	
		return estoque;
	}
	
	public void setEstoque (Estoque estoque) {
	
		this.estoque = estoque;
	}
}
