package core.Controller;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.mysql.cj.jdbc.exceptions.MysqlDataTruncation;

public class Connector {
	private final static String connectionURL = "jdbc:mysql://localhost:3306/tourenverwaltung?serverTimezone=Europe/Berlin&user=root";
	private static Connection connect = null;
	private static Statement statement = null;
    private static ResultSet resultSet = null;
	
	public static Map<String,String[]> getQueryResult(String query) throws SQLException{
		try {
			if(connect == null)connect = DriverManager.getConnection(connectionURL);
			if(statement == null)statement = connect.createStatement();
			resultSet = statement.executeQuery(query);	
			Map<String,String[]> result = new HashMap<String,String[]>();
			ArrayList[] columnsContent = new ArrayList[resultSet.getMetaData().getColumnCount()];
			//Ist ein Array welches ArrayList hat um die Verschiedene Columns parallel zu bekommen
			for(int i = 0; i<columnsContent.length;i++) {
				columnsContent[i] = new ArrayList<String>();
			}
			while(resultSet.next()) {
				//Einzele ArrayList füllen
				for(int i = 0;i<resultSet.getMetaData().getColumnCount();i++) {
					String columnName = resultSet.getMetaData().getColumnLabel(i+1);
					columnsContent[i].add(resultSet.getString(columnName));
				}	
			}
			//ArrayList zu map und name umwandeln
			for(int i = 0; i<columnsContent.length;i++) {
				String columnName = resultSet.getMetaData().getColumnLabel(i+1);
				result.put(columnName, (String[]) columnsContent[i].toArray(new String[0]));
			}
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Fehler beim Aufrufen der SQl Query: " + query);
		}
		throw new SQLException("Fehler beim Aufrufen der SQl Query: " + query);
	}
	
	public static void updateTable(String query) throws SQLException{
		if(connect == null)connect = DriverManager.getConnection(connectionURL);
		if(statement == null)statement = connect.createStatement();
		statement.executeUpdate(query);
	}
	
	public void close()
	{
		this.close();
	}
	public static int insertIntoTable(String query)throws SQLException {
		if(connect == null)connect = DriverManager.getConnection(connectionURL);
		if(statement == null)statement = connect.createStatement();
		
		PreparedStatement ps = connect.prepareStatement(query,statement.RETURN_GENERATED_KEYS);
		try {
			ps.execute();
			ResultSet rs = ps.getGeneratedKeys();
			int generatedKey = 0;
			if(!rs.next()) return 0;
			return rs.getInt(1);
		}catch(MysqlDataTruncation e) {
			System.out.println("Länge eines Feldes ist zu lang bitte überprüfen");
		}
		return -1;
	}
	
	public static void deleteRecordFromTable(String query) throws SQLException{
		if(connect == null)connect = DriverManager.getConnection(connectionURL);
		if(statement == null)statement = connect.createStatement();
		statement.executeUpdate(query);
	}
	
}