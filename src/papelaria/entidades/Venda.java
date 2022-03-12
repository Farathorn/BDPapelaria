package papelaria.entidades;

import java.util.ArrayList;

public class Venda implements EntidadeForte {
	
	public static String descriptor = "Venda";
	public static int attributeCount = 8;
	
	public String getDescriptor() {
		
		return descriptor;
	}
	
	public String[] listAttributes () {
		
		return new String[] {"Código", "Tipo", "Valor", "Forma_de_Pagamento", "Parcelamento", "Funcionário", "Cliente", "Franquia"};
	}
	
	public void setAttributes (ArrayList <String> set) {
		
		if (set.size() == 8) {
			
			codigo = set.get(0);
			tipo = set.get(1);
			valor = Double.parseDouble(set.get(2));
			pagamento = set.get(3);
			parcelamento = set.get(4);
			funcionario = new Funcionario();
			funcionario.setCodigo(set.get(5));
			cliente = new Cliente();
			cliente.setCodigo(set.get(6));
			franquia = new Franquia();
			franquia.setCodigo(set.get(7));
		}
	}
	
	public int getAttributeCount () {
		
		return attributeCount;
	}
	
	public String[] getAttributes () {
		
		String[] atributos = new String[getAttributeCount()];
		
		atributos[0] = codigo;
		atributos[1] = tipo;
		atributos[2] = Double.toString(valor);
		atributos[3] = pagamento;
		atributos[4] = parcelamento;
		atributos[5] = funcionario.getCodigo();
		atributos[6] = cliente.getCodigo();
		atributos[7] = franquia.getCodigo();
		
		return atributos;
	}
	
	private String codigo;
	private String tipo;
	private double valor;
	private String pagamento;
	private String parcelamento;
	private Funcionario funcionario;
	private Cliente cliente;
	private Franquia franquia;
	
	
	public String getCodigo () {
	
		return codigo;
	}
	
	public void setCodigo (String codigo) {
	
		this.codigo = codigo;
	}
	
	public String getTipo () {
	
		return tipo;
	}
	
	public void setTipo (String tipo) {
	
		this.tipo = tipo;
	}
	
	public double getValor () {
	
		return valor;
	}
	
	public void setValor (double valor) {
	
		this.valor = valor;
	}
	
	public String getPagamento () {
	
		return pagamento;
	}
	
	public void setPagamento (String pagamento) {
	
		this.pagamento = pagamento;
	}
	
	public String getParcelamento () {
	
		return parcelamento;
	}
	
	public void setParcelamento (String parcelamento) {
	
		this.parcelamento = parcelamento;
	}
	
	public Funcionario getFuncionario () {
	
		return funcionario;
	}
	
	public void setFuncionario (Funcionario funcionario) {
	
		this.funcionario = funcionario;
	}
	
	public Cliente getCliente () {
	
		return cliente;
	}
	
	public void setCliente (Cliente cliente) {
	
		this.cliente = cliente;
	}
	
	public Franquia getFranquia () {
	
		return franquia;
	}
	
	public void setFranquia (Franquia franquia) {
	
		this.franquia = franquia;
	}
}
