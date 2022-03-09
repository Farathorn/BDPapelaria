package papelaria.entidades;

import java.util.ArrayList;

public interface Entidade {
	
	public String getDescriptor ();
	
	public String[] listAttributes ();
	
	public void setAttributes (ArrayList <String> set);
	
	public int getAttributeCount ();
}
