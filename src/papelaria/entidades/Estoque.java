package papelaria.entidades;

import java.util.ArrayList;

public class Estoque implements EntidadeForte {

	private String descriptor = "Estoque";
	
	public String getDescriptor () {
		
		return descriptor;
	}
	
	public String[] listAttributes () {
		
		String[] lista = {"Código", "Contato", "Endereço"};
		
		return lista;
	}
	
	public void setAttributes (ArrayList <String> set) {
		
		if (set.size() == 3) {
			
			codigo = set.get(0);
			contato = set.get(1);
			endereco = set.get(2);
		}
	}
	
	public int getAttributeCount () {
		
		return 3;
	}
	
	private String codigo;
	private String contato;
	private String endereco;
	
	public String getCodigo () {
	
		return codigo;
	}
	
	public void setCodigo (String codigo) {
	
		this.codigo = codigo;
	}
	
	public String getContato () {
	
		return contato;
	}
	
	public void setContato (String contato) {
	
		this.contato = contato;
	}
	
	public String getEndereco () {
	
		return endereco;
	}
	
	public void setEndereco (String endereco) {
	
		this.endereco = endereco;
	}
}