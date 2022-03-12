package papelaria.entidades;

import java.util.ArrayList;

public class CustoDireto extends Custo {

	public static String descriptor = "Custo_Direto";
	public static int attributeCount = 3;
	public static int entityCount = 1;
	
	public String getDescriptor () {
		
		return descriptor;
	}
	
	public String[] listAttributes () {
		
		String[] lista = {"Valor", "Descri\u00E7u00C3o", "Shopping"};
		
		return lista;
	}
	
	public void setAttributes (ArrayList <String> set) {
		
		if (set.size() == 3) {
			
			setValor(Double.parseDouble(set.get(0)));
			setDescricao(set.get(1));
			shopping.setCodigo(set.get(2));
		}
	}
	
	public int getAttributeCount () {
		
		return attributeCount;
	}
	
	public String[] getAttributes () {
		
		String[] atributos = new String[getAttributeCount()];
		
		atributos[0] = Double.toString(getValor());
		atributos[1] = getDescricao();
		atributos[2] = shopping.getCodigo();
		
		return atributos;
	}
	
	public void linkEntities (ArrayList <Entidade> entities) {
		
		shopping = (Shopping) entities.get(0);
	}
	
	public EntidadeForte[] getEntidades () {
		
		return new EntidadeForte[] {shopping};
	}
	
	private Shopping shopping;
	
	public Shopping getShopping () {
	
		return shopping;
	}
	
	public void setShopping (Shopping shopping) {
	
		this.shopping = shopping;
	}
}
