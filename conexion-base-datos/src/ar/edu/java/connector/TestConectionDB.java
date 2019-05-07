package ar.edu.java.connector;

public class TestConectionDB {

	public static void main(String[] args) {
        try {
        	
        	Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
        	
        	System.out.println("Where is your MySQL JDBC Driver?");
        	e.printStackTrace();
        	return;
        	
        }
		
	}

}
