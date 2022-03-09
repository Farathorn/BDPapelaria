package papelaria.entidades;

public interface EntidadeForte extends Entidade {
	
	//Toda entidade forte pode ser �nicamente identificada por uma chave, este m�todo retorna esta chave
	public String getCodigo ();
	
	//Este m�todo configura a chave
	public void setCodigo (String codigo);
}
