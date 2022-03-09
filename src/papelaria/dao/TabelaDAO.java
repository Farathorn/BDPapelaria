package papelaria.dao;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;
import java.util.List;

import papelaria.entidades.Entidade;
import papelaria.entidades.EntidadeForte;

public interface TabelaDAO {
	
	public boolean adicionar (Entidade t, String[] fields, String[] values);
	
	public boolean atualizar (Entidade t, String where, String[] fields, String[] values);
	
	public int deletar (Entidade t, String where, String value);
	
	public int deletar (EntidadeForte t);
	
	public List <Entidade> listar (Entidade t);
}