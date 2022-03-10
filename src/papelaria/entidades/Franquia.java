package papelaria.entidades;

import java.util.ArrayList;

public class Franquia implements EntidadeForte {
	
	private String descriptor = "Franquia";
	
	public String getDescriptor () {
		
		return descriptor;
	}
	
	public String[] listAttributes () {
		
		String[] lista = {"Código", "Endereço", "Cofre"};
		
		return lista;
	}
	
	public void setAttributes (ArrayList <String> set) {
		
		if (set.size() == 3) {
			
			codigo = set.get(0);
			endereco = set.get(1);
			cofre = Double.parseDouble(set.get(2));
		}
	}
	
	public int getAttributeCount () {
		
		return 3;
	}
	
	public String[] getAttributes () {
		
		String[] atributos = new String[getAttributeCount()];
		
		atributos[0] = codigo;
		atributos[1] = endereco;
		atributos[2] = Double.toString(cofre);
		
		return atributos;
	}
	
	private String codigo;
	private String endereco;
	private double cofre;
	
	public String getCodigo () {
		
		return codigo;
	}
	
	public void setCodigo (String codigo) {
		
		this.codigo = codigo;
	}
	
	public String getEndereco () {
		
		return endereco;
	}
	
	public void setEndereco (String endereco) {
		
		this.endereco = endereco;
	}
	
	public double getCofre () {
		
		return cofre;
	}
	
	public void setCofre (double cofre) {
		
		this.cofre = cofre;
	}
	
	
}
