package core.Controller;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.mysql.cj.jdbc.exceptions.MysqlDataTruncation;

/**
 * Klasse die die Verbindung und Abfragen mit der SQL Datenbank verwaltet.
 * Kein Objekt der Klasse notwenig, da satische Funktionen.
 */
public class Connector {
	/**
	 * Connection URL für die Verbindung mit der MySQL Datenbank.
	 * Es muss der Login ohne Passwort aktiviert werden.
	 */
	private final static String connectionURL = "jdbc:mysql://localhost:3306/tourenverwaltung?serverTimezone=Europe/Berlin&user=root";
	private static Connection connect = null;
	private static Statement statement = null;
    private static ResultSet resultSet = null;
	
    /**
     * Senden von einfachen SELECT Querys an die SQL Datenbank.
     * @param query SELECT Statement
     * @return Map mit allen Daten
     * @throws SQLException
     */
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
			JOptionPane.showMessageDialog(new JFrame(), e.toString(), "SQLException",
			        JOptionPane.ERROR_MESSAGE);
			System.out.println("Fehler beim Aufrufen der SQl Query: " + query);
		}
		throw new SQLException("Fehler beim Aufrufen der SQl Query: " + query);
	}
	/**
	 * Senden eines UPDATE Statements an die SQL Datenbank
	 * @param query UPDATE Statement
	 * @throws SQLException
	 */
	public static void updateTable(String query) throws SQLException{
		if(connect == null)connect = DriverManager.getConnection(connectionURL);
		if(statement == null)statement = connect.createStatement();
		statement.executeUpdate(query);
	}
	/**
	 * Senden eines INSERT Statements an die SQL Datenbank
	 * @param query INSERT Statement
	 * @return Wenn eine ID generiert wurde, ansonsten 0 oder -1 bei Fehler
	 * @throws SQLException
	 */
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
			JOptionPane.showMessageDialog(new JFrame(), e.toString(), "MysqlDataTruncation",
			        JOptionPane.ERROR_MESSAGE);
			System.out.println("Länge eines Feldes ist zu lang bitte überprüfen");
		}
		return -1;
	}
	/**
	 * Senden eines DELETE Statements an die Datenbank
	 * @param query DELETE Statement
	 * @throws SQLException
	 */
	public static void deleteRecordFromTable(String query) throws SQLException{
		if(connect == null)connect = DriverManager.getConnection(connectionURL);
		if(statement == null)statement = connect.createStatement();
		statement.executeUpdate(query);
	}
	
}