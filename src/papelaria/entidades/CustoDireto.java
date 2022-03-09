package papelaria.entidades;

import java.util.ArrayList;

public class CustoDireto extends Custo {

	private String descriptor = "CustoDireto";
	
	public String getDescriptor () {
		
		return descriptor;
	}
	
	public String[] listAttributes () {
		
		String[] lista = {"Valor", "Descrição", "Shopping"};
		
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
		
		return 3;
	}
	
	private Shopping shopping;
	
	public Shopping getShopping () {
	
		return shopping;
	}

	
	public void setShopping (Shopping shopping) {
	
		this.shopping = shopping;
	}
}
