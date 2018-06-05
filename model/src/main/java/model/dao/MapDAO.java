package model.dao;

import model.Map;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * MapDAO.java created for lorann
 *
 * @author Julien
 * @version 1.0
 * @since 04/06/2018
 */
public abstract class MapDAO extends AbstractDAO {

    private static final String sqlMapByName =
            "SELECT map.id, map.name, map.width, map.height, map.map_data, map.pawn_data FROM map WHERE name = ?";

    public static Map getMapByName(final String name) throws SQLException {
        final CallableStatement statement = prepareCall(sqlMapByName);
        statement.setString(1, name);
        return getMap(statement, null);
    }

    private static Map getMap(CallableStatement callStatement, Map map) throws SQLException {
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            if (result.first()) {
                map = new Map(
                        result.getInt(1),
                        result.getString(2),
                        result.getInt(3),
                        result.getInt(4),
                        result.getString(5),
                        result.getString(6)
                );
            }
            result.close();
        }
        return map;
    }
}
