package core.Controller;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Connector {
	private final static String connectionURL = "jdbc:mysql://localhost:3306/tourenverwaltung?serverTimezone=Europe/Berlin&user=root";
	private static Connection connect = null;
	private static Statement statement = null;
    private static PreparedStatement preparedStatement = null;
    private static ResultSet resultSet = null;
	
    
    
	public Connector() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");			
			connect = DriverManager.getConnection(connectionURL);
			statement = connect.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public ResultSet query(String q)
	{
		try {
			this.resultSet = this.statement.executeQuery(q);	
			
			return this.resultSet;
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Fehler beim Aufrufen der SQl Query: " + q);
		}
		return null;
	}
	public static ResultSet test(String q) throws ClassNotFoundException {		
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			if(connect == null)connect = DriverManager.getConnection(connectionURL);
			if(statement == null)statement = connect.createStatement();
			resultSet = statement.executeQuery(q);	
			
			
			return resultSet;
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Fehler beim Aufrufen der SQl Query: " + q);
		}
		return null;
		
	}
	
	public static Map<String,String[]> getQueryResult(String query) throws Exception{
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
					System.out.println(columnName);
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
		throw new Exception("Fehler beim Aufrufen der SQl Query: " + query);
	}
	
	public void close()
	{
		this.close();
	}
}