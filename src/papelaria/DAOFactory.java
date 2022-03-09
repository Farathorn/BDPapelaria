package papelaria;

import papelaria.dao.TabelaDAO;
import papelaria.dao.mySQL.TabelaDAOImpl;

public class DAOFactory {

	public static TabelaDAO createDAO() {
	
		return new TabelaDAOImpl();
	}
}
