package papelaria.entidades;

import java.util.ArrayList;

public class Custo implements Entidade {
	
	public static String descriptor = "Custo";
	public static int attributeCount = 2;
	public static int entityCount = 0;
	
	public String getDescriptor () {
		
		return descriptor;
	}
	
	public String[] listAttributes () {
		
		String[] lista = {"Valor", "Descri\00E7\u00C3o"};
		
		return lista;
	}
	
	public void setAttributes (ArrayList <String> set) {
		
		if (set.size() == 2) {
			
			valor = Double.parseDouble(set.get(0));
			descricao = set.get(1);
		}
	}
	
	public int getAttributeCount () {
		
		return attributeCount;
	}
	
	public String[] getAttributes () {
		
		String[] atributos = new String[getAttributeCount()];
		
		atributos[0] = Double.toString(valor);
		atributos[1] = descricao;
		
		return atributos;
	}
	
	public void linkEntities (ArrayList <Entidade> entities) {
		
	}
	
	public int getEntityCount () {
		
		return entityCount;
	}
	
	public EntidadeForte[] getEntidades () {
	
		return null;
	}
	
	private double valor;
	private String descricao;
	
	public double getValor () {
	
		return valor;
	}
	
	public void setValor (double valor) {
	
		this.valor = valor;
	}
	
	public String getDescricao () {
	
		return descricao;
	}
	
	public void setDescricao (String descricao) {
	
		this.descricao = descricao;
	}

}
