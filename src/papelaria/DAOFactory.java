package papelaria;

import papelaria.dao.TabelaDAO;
import papelaria.dao.mySQL.TabelaDAOmySQL;

public class DAOFactory {

	public static TabelaDAO createDAO() {
	
		return new TabelaDAOmySQL();
	}
}
