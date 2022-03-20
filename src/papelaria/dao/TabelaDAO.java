package papelaria.dao;

import papelaria.entidades.Entidade;
import papelaria.entidades.EntidadeForte;

public interface TabelaDAO {
	
	public boolean adicionar (Entidade t, String[] fields, String[] values);
	
	public boolean atualizar (Entidade t, String where, String[] fields, String[] values);
	
	public int deletar (Entidade t, String[] where, String[] value);
	
	public int deletar (EntidadeForte t);
	
	public Entidade[] listar (Entidade t);
}