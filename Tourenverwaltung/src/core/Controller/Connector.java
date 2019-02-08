package core.Controller;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Connector {

	private Connection connect = null;
	private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
	
    private final String connectionURL = "jdbc:mysql://localhost:3306/tourenverwaltung?serverTimezone=Europe/Berlin&user=root";
    
	public Connector() throws Exception {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");			
			connect = DriverManager.getConnection(connectionURL);
			statement = connect.createStatement();
		} catch (Exception e) {
			throw e;
		}
	}
	public ArrayList<ArrayList<String>> query(String q)
	{
		try {
			this.resultSet = this.statement.executeQuery(q);	
			
			return createArrayList();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Fehler beim Aufrufen der SQl Query: " + q);
		}
		return null;
	}
	private ArrayList<ArrayList<String>> createArrayList() throws SQLException
	{
		ArrayList<ArrayList<String>> resultList = new ArrayList<ArrayList<String>>();
		ResultSetMetaData metaData = this.resultSet.getMetaData();
		
		for(int i = 0; i< metaData.getColumnCount();i++)
		{
			resultList.add(new ArrayList<String>());
		}
		
		while(resultSet.next()) {
			for (int i = 1 ; i <= metaData.getColumnCount();i++)
			{
				resultList.get(i-1).add(resultSet.getString(i));				
			}
		}
		
		
		return resultList;
	}
	public void close()
	{
		this.close();
	}

}
