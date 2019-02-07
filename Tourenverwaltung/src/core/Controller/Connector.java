package core.Controller;

import java.sql.*;

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
	public void query(String q)
	{
		try {
			this.resultSet = this.statement.executeQuery(q);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Fehler beim Aufrufen der SQl Query: " + q);
		}
	}
	public void close()
	{
		this.close();
	}

}
