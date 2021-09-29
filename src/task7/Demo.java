package task7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Demo {
	static final String DB_URL = "jdbc:postgresql://localhost/Test";
	static final String USER = "postgres";
	static final String PASS = "root";
	public static void main(String[] args) throws SQLException {
		Person p = new Person("Sarah", 24);
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("PostgreSQL JDBC Driver is not found. Include it in your library path ");
			e.printStackTrace();
			return;
		}

		System.out.println("PostgreSQL JDBC Driver successfully connected");
		Connection connection = null;
	 
		try {
			connection = DriverManager
			.getConnection(DB_URL, USER, PASS);
	 
		} catch (SQLException e) {
			System.out.println("Connection Failed");
			e.printStackTrace();
			return;
		}
	 
		if (connection != null) {
			System.out.println("You successfully connected to database now");
		} else {
			System.out.println("Failed to make connection to database");
		}
		
		Statement con = connection.createStatement();
		String s = "INSERT INTO Person " + "VALUES ('" + p.getName() + "', " + p.getAge()+");";
		con.executeUpdate(s);
		Person p2 = null;
		String s2 = "SELECT * FROM person";
		ResultSet rs =  con.executeQuery(s2);
		while (rs.next()) {
			String name = rs.getString("name");
			p2.setName(name);
			int age = rs.getInt("age");
			p2.setAge(age);
			System.out.println(p2);
		}
	}

}
