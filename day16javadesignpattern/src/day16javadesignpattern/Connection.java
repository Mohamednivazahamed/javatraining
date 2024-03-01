package day16javadesignpattern;

public class Connection {
	 private static Connection conn= null;
	 
	private Connection() {
		
	}
	
	public static Connection getConnection() {
		if(conn == null) {
		conn= new Connection();
		return conn;
		}
		else 
		return	conn;
	
	
	}
}
