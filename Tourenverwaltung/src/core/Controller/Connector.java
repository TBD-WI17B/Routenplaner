package core.Controller;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Connector {

	private Connection connect = null;
	private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
	
    private final String connectionURL = "jdbc:mysql://localhost:3306/tourenverwaltung?serverTimezone=Europe/Berlin&user=root";
    
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
	public void close()
	{
		this.close();
	}
}