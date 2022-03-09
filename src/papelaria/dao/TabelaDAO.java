package papelaria.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;
import java.util.List;

import papelaria.entidades.Entidade;
import papelaria.entidades.EntidadeForte;

public interface TabelaDAO {
	
	public abstract boolean adicionar (Entidade t, String where, String[] fields, String[] values);
	
	public abstract boolean atualizar (Entidade t, String where, String[] fields, String[] values);
	
	public abstract int deletar (Entidade t, String where, String value);
	
	public abstract int deletar (EntidadeForte t);
	
	public abstract List <Entidade> listar (Entidade t);
}