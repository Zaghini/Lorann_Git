package model;

import model.dao.MapDAO;

import java.sql.SQLException;
import java.util.List;

/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public final class ModelFacade implements IModel {

	/**
	 * Search by Name the table Map in the DB
	 */
    @Override
    public Map getMapByName(String name) throws SQLException {
        return MapDAO.getMapByName(name);
    }
}
