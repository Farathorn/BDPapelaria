package papelaria.entidades;

import java.util.ArrayList;

public interface Entidade {
	
	//Entrega o descritor da entidade, como ela é chamada pelo banco de dados.
	public String getDescriptor ();
	
	//Entrega uma lista dos atributos convertidos em String como estão no banco de dados.
	public String[] listAttributes ();
	
	//Configura todos os atributos, os convertendo quando necessário da lista recebida de Strings que representem os valores dos atributos
	public void setAttributes (ArrayList <String> set);
	
	//Retorna quantos atributos a entidade possui
	public int getAttributeCount();
	
	//Retorna os valores dos atributos sequencialmente em um array de Strings
	public String[] getAttributes ();
}
