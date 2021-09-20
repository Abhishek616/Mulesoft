package sqlitedemo;

import java.sql.*;

public class DBconnect {

	public static Connection connect() {
		
		Connection c = null;
		
		try {
			
			Class.forName("org.sqlite.JDBC");
			
			c = DriverManager.getConnection("jdbc:sqlite:test.db");
			
			System.out.println("SQLite DB connected");
			
		}catch(Exception e) {
			System.out.println(e);
		}

		return c;
	}

}
