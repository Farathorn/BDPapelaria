package papelaria.entidades;

public interface EntidadeForte extends Entidade {
	
	//Toda entidade forte pode ser únicamente identificada por uma chave, este método retorna esta chave
	public String getCodigo ();
	
	//Este método configura a chave
	public void setCodigo (String codigo);
}
