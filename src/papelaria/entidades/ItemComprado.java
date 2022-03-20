package papelaria.entidades;

import java.util.ArrayList;

public class ItemComprado implements Entidade {

	public static String descriptor = "Itens_da_Venda";
	public static int attributeCount = 3;
	public static int entityCount = 2;
	
	public String getDescriptor () {
		
		return descriptor;
	}
	
	public String[] listAttributes () {
		
		return new String[] {"Item", "Venda", "Quantidade"};
	}
	
	public void setAttributes (ArrayList <String> set) {
		
		if (set.size() == attributeCount) {
			
			produto = new Produto();
			produto.setCodigo(set.get(0));
			venda = new Venda();
			venda.setCodigo(set.get(1));
			quantidade = Integer.parseInt(set.get(2));
		}
	}
	
	public int getAttributeCount () {
		
		return attributeCount;
	}
	
	public String[] getAttributes () {
		
		String[] atributos = new String[getAttributeCount()];
		
		atributos[0] = produto.getCodigo();
		atributos[1] = venda.getCodigo();
		atributos[2] = Integer.toString(quantidade);
		
		return atributos;
	}
	
	public void linkEntities (ArrayList <Entidade> entities) {
	
		produto = (Produto) entities.get(0);
		venda = (Venda) entities.get(1);
	}
	
	public int getEntityCount () {
		
		return entityCount;
	}
	
	public EntidadeForte[] getEntidades () {
		
		return new EntidadeForte[] {produto, venda};
	}
	
	private Produto produto;
	private Venda venda;
	private int quantidade;
	
	public int getQuantidade () {
	
		return quantidade;
	}
	
	public void setQuantidade (int quantidade) {
	
		this.quantidade = quantidade;
	}

	public Produto getProduto () {
	
		return produto;
	}
	
	public void setProduto (Produto produto) {
	
		this.produto = produto;
	}
	
	public Venda getVenda () {
	
		return venda;
	}
	
	public void setVenda (Venda venda) {
	
		this.venda = venda;
	}
}
