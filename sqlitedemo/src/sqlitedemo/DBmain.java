package sqlitedemo;

import java.sql.*;

public class DBmain {

	public static void main(String[] args) {
		
		
		
		insert("Deadpool", "Ryan Reynolds", "Morena Baccarin", "2016", "Tim Miller");
		
	}
	
	private static void insert(String MovieName, String LeadActor, String LeadActress, String YearofRelease, String DirectorName) {
		
		Connection c = DBconnect.connect();
		
		PreparedStatement ps = null;
		
		try {
			
			String sql = "INSERT INTO Movies(MovieName, LeadActor, LeadActress, YearofRelease, DirectorName) VALUES(?, ?, ?, ?, ?)";
			
			ps = c.prepareStatement(sql);
			
			ps.setString(1, MovieName);
			
			ps.setString(2, LeadActor);
			
			ps.setString(3, LeadActress);
			
			ps.setString(4, YearofRelease);
			
			ps.setString(5, DirectorName);
			
			ps.execute();
			
			System.out.println("Data has been inserted");
			
		}catch(Exception e) {
			
			System.out.println(e.toString());
			
		}
		
	}

	private static PreparedStatement setString(int i, String movieName) {
		// TODO Auto-generated method stub
		return null;
	}

}
