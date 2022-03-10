package papelaria.entidades;

import java.util.ArrayList;

public class Funcionario implements EntidadeForte{
	
	private String descriptor = "Funcionário";
	
	public String getDescriptor () {
		
		return descriptor;
	}
	
	public String[] listAttributes () {
		
		String[] lista = {"CPF", "Nome", "Carteira_de_Trabalho", "Cargo", "Expediente", "Salário_Base", "Faltas", "Venda_do_Mês", "Ticket_Médio", "Franquia"};
		
		return lista;
	}
	
	public void setAttributes (ArrayList <String> set) {
		
		if (set.size() == 10) {
			
			cpf = set.get(0);
			nome = set.get(1);
			carteiraDeTrabalho = set.get(2);
			cargo = set.get(3);
			expediente = set.get(4);
			salarioBase = Double.parseDouble(set.get(5));
			faltas = Integer.parseInt(set.get(6));
			vendasDoMes = Double.parseDouble(set.get(7));
			ticketMedio = Double.parseDouble(set.get(8));
			franquia.setCodigo(set.get(9));
		}
		
	}
	
	public int getAttributeCount () {
		
		return 10;
	}
	
	public String[] getAttributes () {
		
		String[] atributos = new String[getAttributeCount()];
		
		atributos[0] = cpf;
		atributos[1] = nome;
		atributos[2] = carteiraDeTrabalho;
		atributos[3] = cargo;
		atributos[4] = expediente;
		atributos[5] = Double.toString(salarioBase);
		atributos[6] = Integer.toString(faltas);
		atributos[7] = Double.toString(vendasDoMes);
		atributos[8] = Double.toString(ticketMedio);
		atributos[9] = franquia.getCodigo();
		
		return atributos;
	}

	private String cpf;
	private String nome;
	private String carteiraDeTrabalho;
	private String cargo;
	private String expediente;
	private double salarioBase;
	private int faltas;
	private double vendasDoMes;
	private double ticketMedio;
	private Franquia franquia;
	
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
	
	public String getCarteiraDeTrabalho () {
	
		return carteiraDeTrabalho;
	}
	
	public void setCarteiraDeTrabalho (String carteiraDeTrabalho) {
	
		this.carteiraDeTrabalho = carteiraDeTrabalho;
	}
	
	public String getCargo () {
	
		return cargo;
	}
	
	public void setCargo (String cargo) {
	
		this.cargo = cargo;
	}
	
	public String getExpediente () {
	
		return expediente;
	}
	
	public void setExpediente (String expediente) {
	
		this.expediente = expediente;
	}
	
	public double getSalarioBase () {
	
		return salarioBase;
	}
	
	public void setSalarioBase (double salarioBase) {
	
		this.salarioBase = salarioBase;
	}
	
	public int getFaltas () {
	
		return faltas;
	}
	
	public void setFaltas (int faltas) {
	
		this.faltas = faltas;
	}
	
	public double getVendasDoMes () {
	
		return vendasDoMes;
	}
	
	public void setVendasDoMes (double vendasDoMes) {
	
		this.vendasDoMes = vendasDoMes;
	}
	
	public double getTicketMedio () {
	
		return ticketMedio;
	}
	
	public void setTicketMedio (double ticketMedio) {
	
		this.ticketMedio = ticketMedio;
	}
	
	public Franquia getFranquia () {
	
		return franquia;
	}
	
	public void setFranquia (Franquia franquia) {
	
		this.franquia = franquia;
	}
}
