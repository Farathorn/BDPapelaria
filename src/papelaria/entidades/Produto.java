package papelaria.entidades;

import java.util.ArrayList;

public class Produto implements EntidadeForte {
	
	private String descriptor = "Produto";
	
	public String getDescriptor () {
		
		return descriptor;
	}
	
	public String[] listAttributes () {
		
		String[] lista = {"Código", "Quantidade", "Descrição", "Preço_Unitário", "Preço_Total", "Estoque"};
		
		return lista;
	}
	
	public void setAttributes (ArrayList <String> set) {
		
		if (set.size() == 6) {
			
			codigo = set.get(0);
			quantidade = Integer.parseInt(set.get(1));
			descricao = set.get(2);
			precoUnitario = Double.parseDouble(set.get(3));
			precoTotal = Double.parseDouble(set.get(4));
			estoque.setCodigo(set.get(5));
		}
	}
	
	public int getAttributeCount () {
		
		return 6;
	}

	private String codigo;
	private int quantidade;
	private String descricao;
	private double precoUnitario;
	private double precoTotal;
	private Estoque estoque;
	
	public String getCodigo () {
	
		return codigo;
	}
	
	public void setCodigo (String codigo) {
	
		this.codigo = codigo;
	}
	
	public int getQuantidade () {
	
		return quantidade;
	}
	
	public void setQuantidade (int quantidade) {
	
		this.quantidade = quantidade;
	}
	
	public String getDescricao () {
	
		return descricao;
	}
	
	public void setDescricao (String descricao) {
	
		this.descricao = descricao;
	}
	
	public double getPrecoUnitario () {
	
		return precoUnitario;
	}
	
	public void setPrecoUnitario (double precoUnitario) {
	
		this.precoUnitario = precoUnitario;
	}
	
	public double getPrecoTotal () {
	
		return precoTotal;
	}
	
	public void setPrecoTotal (double precoTotal) {
	
		this.precoTotal = precoTotal;
	}
	
	public Estoque getEstoque () {
	
		return estoque;
	}
	
	public void setEstoque (Estoque estoque) {
	
		this.estoque = estoque;
	}
}
