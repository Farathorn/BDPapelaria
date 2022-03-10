package papelaria.entidades;

import java.util.ArrayList;

public class Vendas implements EntidadeForte {
	
	private String descriptor = "Vendas";
	
	public String getDescriptor () {
		
		return descriptor;
	}
	
	public String[] listAttributes () {
		
		String[] lista = {"Código", "Tipo", "Valor", "Forma_de_pagamento", "Parcelamento","Funcionário","Cliente", "Fraquia"};
		
		return lista;
	}
	
	public void setAttributes (ArrayList <String> set) {
		
		if (set.size() == 6) {
			
			codigo = set.get(0);
			tipo = Integer.parseInt(set.get(1));
			valor = Double.parseDouble(set.get(2));
			formadepagamento = Double.parseDouble(set.get(3));
			parcelamento = Double.parseDouble(set.get(4));
			funcionario = (set.get(5));
			cliente = set.get(6);
			fraquia = set.get(7);
		}
	}
	
	public int getAttributeCount () {
		
		return 8;
	}

	private String codigo;
	private int tipo;
	private double valor;
	private double formadepagamento;
	private double parcelamento;
	private String funcionario;
	private String cliente;
	private String fraquia;
	
	public String getCodigo () {
		
		return codigo;
	}
	
	public void setCodigo (String codigo) {
	
		this.codigo = codigo;
	}
	
	public int getTipo () {
	
		return tipo;
	}
	
	public void setTipo (int tipo) {
	
		this.tipo = tipo;
	}
	
	public double getValor () {
	
		return valor;
	}
	
	public void setValor (double valor) {
	
		this.valor = valor;
	}
	
	public double getFormadepagamento () {
	
		return formadepagamento;
	}
	
	public void setFormadepagamento (double formadepagamento) {
	
		this.formadepagamento = formadepagamento;
	}
	
	public double getParcelamento () {
	
		return parcelamento;
	}
	
	public void setParcelamento (double parcelamento) {
	
		this.parcelamento = parcelamento;
	}
	
	public String getFuncionario () {
	
		return funcionario;
	}
	
	public void setFuncionario (String funcionario) {
	
		this.funcionario = funcionario;
	}
	
	public String getCliente () {
	
		return funcionario;
	}
	
	public void setCliente (String cliente) {
	
		this.cliente = cliente;
	}
	
	public String getFraquia () {
	
		return funcionario;
	}
	
	public void setFraquia (String fraquia) {
	
		this.fraquia = fraquia;
	}
}


}
