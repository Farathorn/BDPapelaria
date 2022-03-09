package papelaria.dao.mySQL;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;
import java.util.ArrayList;
import java.util.List;

import papelaria.dao.TabelaDAO;
import papelaria.entidades.Entidade;
import papelaria.entidades.EntidadeForte;

public class TabelaDAOmySQL implements TabelaDAO {
	
	protected Connection connection;
	
	protected boolean abreConexao () {
		
		try {
			
			//Faz a conex�o com o banco de dados naquele ip, usu�rio e senha
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
	
	
	@Override
	//Adiciona uma entidade a uma tabela sem se preocupar com campos obrigat�rios, quem chamar este m�todo deve saber quais s�o NON NULL no banco.
	public boolean adicionar (Entidade entidade, String[] fields, String[] values) {

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
			
			//Executa a instru��o sql e retorna true se nenhum erro ocorre
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
	//recebe o lugar ONDE ser� atualizado na tabela, e recebe um os campos a serem trocados e os valores que seram inseridos nesses campos, o n�mero de campos e valores deve ser igual
	public boolean atualizar (Entidade entidade, String where, String[] fields, String[] values) {

		String sql = "UPDATE " + entidade.getDescriptor() + "\nSET ";
		
		for (int i = 0; i < fields.length; i ++) {
			
			sql.concat(fields[i] + " = (\'" + values[i] + "\'), ");
		}
		
		sql = sql.substring(0, sql.length() - 2);
		
		sql.concat("\nWHERE " + where + ';');
		
		try {
			
			//Executa a instru��o sql de atualizar e retorna verdadeiro se nenhum erro ocorreu
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
	
	//Faz um 'DELETE FROM' de uma entidade espec�fica procurando por um valor espec�fico
	public int deletar (Entidade entidade, String where, String value) {

		String sql = "DELETE FROM " + entidade.getDescriptor() + " WHERE " + where + "=" + value + ';';
		
		try {
			
			//Executa a instru��o sql no banco de dados e retorna quantas linhas de tabela foram afetadas
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

	//Faz um 'DELETE FROM' de uma entidade espec�fica usando a chave �nica da entidade, EntidadeForte � aquela que possui chave �nica.
	@Override
	public int deletar (EntidadeForte entidade) {

		//Aqui no c�digo, toda interface utiliza do m�todo getCodigo e setCodigo, mas no banco de dados o nome desses campos � "CPF" para seres humanos.
		String codigo = "C�digo";
		if (entidade.getDescriptor() == "Funcion�rio" || entidade.getDescriptor() == "Cliente") {
			
			codigo = "CPF";
		}
		
		String sql = "DELETE FROM " + entidade.getDescriptor() + " WHERE " + codigo + " = " + entidade.getCodigo() + ';';
		
		try {
			
			//Executa a instru��o sql no banco de dados e retorna quantas linhas de tabela foram afetadas
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
	// Retorna uma lista de entidades numa tabela do banco, ou seja, retorna a tabela inteira em forma de lista.
	public List <Entidade> listar (Entidade entidade) {
		
		ArrayList <Entidade> lista = new ArrayList <Entidade> ();
		
		String sql = "SELECT * FROM " + entidade.getDescriptor() + ';';
		
		try {
			//Recebe o conjunto ResultSet da consulta SQL, ResultSet pode ser compreendido como um List de Entidades da tabela, cada item do ResultSet sendo uma linha da tabela.
			ResultSet set =  connection.createStatement().executeQuery(sql);
			//Recebe os metadados da tabela em que a consulta foi feita
			ResultSetMetaData meta = set.getMetaData();
			
			while (set.next()) {
				
				//Cria uma Entidade da mesma exata classe do par�metro 'entidade'
				Entidade nova = entidade.getClass().getDeclaredConstructor().newInstance();
				//Um array para armazenar cada valor da linha inteira
				ArrayList <String> row = new ArrayList <String> ();
				
				for (int i = 1; i < meta.getColumnCount() + 1; i ++) {
					
					//Adiciona cada valor da linha no array
					row.add(set.getString(i));
				}
				
				//Atribui os valores coletados para a classe exata, qualquer que seja ela, setAttributes � parte da interface Entidade, e portanto funciona para qualquer que seja a implementa��o de Entidade
				nova.setAttributes(row);
				//Adiciona � lista que ser� retornada uma Entidade espec�fica com valores salvos.
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
