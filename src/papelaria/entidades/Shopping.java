package papelaria.entidades;

import java.util.ArrayList;

public class Shopping implements EntidadeForte {
	
	private String descriptor = "Shopping";
	
	public String getDescriptor () {
		
		return descriptor;
	}
	
	public String[] listAttributes () {
		
		String[] lista = {"C�digo", "Nome", "Endere�o", "Aluguel"};
		
		return lista;
	}
	
	public void setAttributes (ArrayList <String> set) {
		
		if (set.size() == 4) {
			
			codigo = set.get(0);
			nome = set.get(1);
			endereco = set.get(2);
			aluguel = Double.parseDouble(set.get(3));
		}
	}
	
	public int getAttributeCount () {
		
		return 4;
	}
	
	private String codigo;
	private String nome;
	private String endereco;
	private double aluguel;
	
	public String getCodigo () {
		
		return codigo;
	}
	
	public void setCodigo (String codigo) {
		
		this.codigo = codigo;
	}
	
	public String getNome () {
		
		return nome;
	}
	
	public void setNome (String nome) {
		
		this.nome = nome;
	}
	
	public String getEndereco () {
		
		return endereco;
	}
	
	public void setEndereco (String endereco) {
		
		this.endereco = endereco;
	}
	
	public double getAluguel () {
		
		return aluguel;
	}
	
	public void setAluguel (double aluguel) {
		
		this.aluguel = aluguel;
	}
}