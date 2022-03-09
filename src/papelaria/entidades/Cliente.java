package papelaria.entidades;

import java.util.ArrayList;

public class Cliente implements EntidadeForte {
	
	private String descriptor = "Cliente";
	
	public String getDescriptor () {
		
		return descriptor;
	}
	
	public String[] listAttributes () {
		
		String[] lista = {"CPF", "Nome", "Telefone", "Gasto_Total"};
		
		return lista;
	}
	
	public void setAttributes (ArrayList <String> set) {

		if (set.size() == 4) {
			
			cpf = set.get(0);
			nome = set.get(1);
			telefone = set.get(2);
			gastoTotal = Double.parseDouble(set.get(3));
		}
	}
	
	public int getAttributeCount () {
		
		return 4;
	}
	
	private String cpf;
	private String nome;
	private String telefone;
	private double gastoTotal;
	
	public String getCodigo () {
	
		return cpf;
	}
	
	public void setCodigo (String cpf) {
	
		this.cpf = cpf;
	}
	
	public String getNome () {
	
		return nome;
	}
	
	public void setNome (String nome) {
	
		this.nome = nome;
	}
	
	public String getTelefone () {
	
		return telefone;
	}
	
	public void setTelefone (String telefone) {
	
		this.telefone = telefone;
	}
	
	public double getGastoTotal () {
	
		return gastoTotal;
	}
	
	public void setGastoTotal (double gastoTotal) {
	
		this.gastoTotal = gastoTotal;
	}
}
