package papelaria.entidades;

import java.util.ArrayList;

public class Shopping implements EntidadeForte {
	
	public static String descriptor = "Shopping";
	public static int attributeCount = 4;
	public static int entityCount = 0;
	
	public String getDescriptor () {
		
		return descriptor;
	}
	
	public String[] listAttributes () {
		
		String[] lista = {"C\u00F3digo", "Nome", "Endere\u00E7o", "Aluguel"};
		
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
		
		return attributeCount;
	}
	
	public String[] getAttributes () {
		
		String[] atributos = new String[getAttributeCount()];
		
		atributos[0] = codigo;
		atributos[1] = nome;
		atributos[2] = endereco;
		atributos[3] = Double.toString(aluguel);
		
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
