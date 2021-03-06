package papelaria.entidades;

import java.util.ArrayList;

public class CustoIndireto extends Custo {

	public static String descriptor = "Custo_Indireto";
	public static int attributeCount = 4;
	public static int entityCount = 2;
	
	public String getDescriptor () {
		
		return descriptor;
	}
	
	public String[] listAttributes () {
		
		String[] lista = {"Valor", "Descri\u00E7\u00C3o", "Fornecedor", "Estoque"};
		
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
		
		return attributeCount;
	}
	
	public String[] getAttributes () {
		
		String[] atributos = new String[getAttributeCount()];
		
		atributos[0] = Double.toString(getValor());
		atributos[1] = getDescricao();
		atributos[2] = fornecedor.getCodigo();
		atributos[3] = estoque.getCodigo();
		
		return atributos;
	}
	
	public void linkEntities (ArrayList <Entidade> entities) {
		
		fornecedor = (Fornecedor) entities.get(0);
		estoque = (Estoque) entities.get(1);
	}
	
	public EntidadeForte[] getEntidades () {
		
		return new EntidadeForte[] {fornecedor, estoque};
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
