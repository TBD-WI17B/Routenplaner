package core.Controller;

import java.sql.*;

public class Connector {

	private Connection connect = null;
	private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
	
	public Connector() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/tourenverwaltung?serverTimezone=Europe/Berlin", "root", "0815");
			statement = connect.createStatement();
			resultSet=statement.executeQuery("SELECT ID, content FROM test");
			
			while(resultSet.next())
			{
				String content = resultSet.getString("content");
				System.out.println(content);
			}
			
//			resultSet = statement.executeQuery("SELECT * FROM test");
//			ResultSetMetaData  resultSetMeta = resultSet.getMetaData();
//			int columnCount = resultSetMeta.getColumnCount();
		
			
			connect.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void query(String q)
	{
		try {
			this.resultSet = this.statement.executeQuery(q);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void close()
	{
		this.close();
	}

}
