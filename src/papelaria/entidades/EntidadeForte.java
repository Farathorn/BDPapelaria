package papelaria.entidades;

import java.util.ArrayList;

public interface EntidadeForte extends Entidade {

	public String getDescriptor ();
	
	public String[] listAttributes ();
	
	public void setAttributes (ArrayList <String> set);
	
	public int getAttributeCount ();
	
	public String getCodigo ();
	
	public void setCodigo (String codigo);
}
