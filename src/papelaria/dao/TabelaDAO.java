package papelaria.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;
import java.util.List;

import papelaria.entidades.Entidade;
import papelaria.entidades.EntidadeForte;

public abstract class TabelaDAO {

	protected Connection connection;
	
	protected boolean abreConexao () {
		
		try {
			
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/lucasbd", "root", "123");
			return true;
		}
		catch (SQLTimeoutException sqlTimeoutException) {
			
			System.out.print("CONNECTION TIMEOUT\n");
		}
		catch (SQLException sqlException) {
			
			System.out.print("DATABASE ACCESS ERROR\n");
		}
		
		return false;
	}
	
	public abstract boolean adicionar (Entidade t, String where, String[] fields, String[] values);
	
	public abstract boolean atualizar (Entidade t, String where, String[] fields, String[] values);
	
	public abstract int deletar (Entidade t, String where, String value);
	
	public abstract int deletar (EntidadeForte t);
	
	public abstract List <Entidade> listar (Entidade t);
}