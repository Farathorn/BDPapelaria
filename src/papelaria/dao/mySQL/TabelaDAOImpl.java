package papelaria.dao.mySQL;

import java.lang.reflect.InvocationTargetException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;
import java.util.ArrayList;
import java.util.List;

import papelaria.dao.TabelaDAO;
import papelaria.entidades.Entidade;
import papelaria.entidades.EntidadeForte;

public class TabelaDAOImpl extends TabelaDAO {
	
	@Override
	public boolean adicionar (Entidade entidade, String where, String[] fields, String[] values) {

		String sql = "INSERT INTO " + entidade.getDescriptor() + " VALUES (";
		
		for (int i = 0; i < fields.length; i ++) {
			
			sql.concat(fields[i] + ", ");
		}
		
		sql = sql.substring(0, sql.length() - 2);
		sql.concat(")\n VALUES (");
		
		for (int i = 0; i < fields.length; i ++) {
			
			sql.concat("\'" + values[i] + "\', ");
		}
		
		sql = sql.substring(0, sql.length() - 2);		
		sql.concat(");");
		
		try {
			
			connection.createStatement().execute(sql);
			return true;
		}
		catch (SQLTimeoutException sqlTimeoutException) {
			
			System.out.print("ACCESS TIMEOUT");
		}
		catch (SQLException sqlException) {
			
			System.out.print("DATABASE ERROR");
		}
		
		return false;
	}

	@Override
	public boolean atualizar (Entidade entidade, String where, String[] fields, String[] values) {

		String sql = "UPDATE " + entidade.getDescriptor() + "\nSET ";
		
		for (int i = 0; i < fields.length; i ++) {
			
			sql.concat(fields[i] + " = (\'" + values[i] + "\'), ");
		}
		
		sql = sql.substring(0, sql.length() - 2);
		
		sql.concat("\nWHERE " + where + ';');
		
		try {
			
			connection.createStatement().executeUpdate(sql);
			return true;
		}
		catch (SQLTimeoutException sqlTimeoutException) {
			
			System.out.print("ACCESS TIMEOUT");
		}
		catch (SQLException sqlException) {
			
			System.out.print("DATABASE ERROR");
		}
		
		return false;
	}
	
	public int deletar (Entidade entidade, String where, String value) {

		String sql = "DELETE FROM " + entidade.getDescriptor() + " WHERE " + where + "=" + value + ';';
		
		try {
			
			return connection.createStatement().executeUpdate(sql);
		}
		catch (SQLTimeoutException sqlTimeoutException) {
			
			System.out.print("ACCESS TIMEOUT");
		}
		catch (SQLException sqlException) {
			
			System.out.print("DATABASE ERROR");
		}
		
		return 0;
	}

	@Override
	public int deletar (EntidadeForte entidade) {

		String codigo = "Código";
		if (entidade.getDescriptor() == "Funcionário" || entidade.getDescriptor() == "Cliente") {
			
			codigo = "CPF";
		}
		String sql = "DELETE FROM " + entidade.getDescriptor() + " WHERE " + codigo + " = " + entidade.getCodigo() + ';';
		
		try {
			
			return connection.createStatement().executeUpdate(sql);
		}
		catch (SQLTimeoutException sqlTimeoutException) {
			
			System.out.print("ACCESS TIMEOUT");
		}
		catch (SQLException sqlException) {
			
			System.out.print("DATABASE ERROR");
		}
		
		return 0;
	}

	@Override
	public List <Entidade> listar (Entidade entidade) {
		
		ArrayList <Entidade> lista = new ArrayList <Entidade> ();
		
		String sql = "SELECT * FROM " + entidade.getDescriptor() + ';';
		
		try {
			
			ResultSet set =  connection.createStatement().executeQuery(sql);
			ResultSetMetaData meta = set.getMetaData();
			
			while (set.next()) {
				
				Entidade nova = entidade.getClass().getDeclaredConstructor().newInstance();
				ArrayList <String> row = new ArrayList <String> ();
				
				for (int i = 1; i < meta.getColumnCount() + 1; i ++) {
					
					row.add(set.getString(i));
				}
				
				nova.setAttributes(row);
				lista.add(nova);
			}
		}
		catch (SQLTimeoutException sqlTimeoutException) {
			
			System.out.print("ACCESS TIMEOUT");
		}
		catch (SQLException sqlException) {
			
			System.out.print("DATABASE ERROR");
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lista;
	}

	
}
