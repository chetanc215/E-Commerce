package com.adminOperation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.commonconnection.CommonConnection;

public class AdminFunction {

 public static void userList() throws SQLException {
	Scanner scanner = new Scanner(System.in);
	
	
		
		try {
			Connection connection = CommonConnection.getConnection();
	 PreparedStatement ps=connection.prepareStatement("select firstname from userdetails"); //select firstname from userdetails
						
			
		ResultSet resultset =ps.executeQuery();
		System.out.println("\nRegistered User List\n");

		while(resultset.next()) {
			System.out.println(resultset.getString("firstname"));
			

		}			
			
			
		} 
		catch ( Exception e) {
			e.printStackTrace();
		}
		
	 
}
	

public static void productQuantity () throws SQLException  {
     
	Scanner sc =new Scanner(System.in);
boolean productquantity=false;
	
	do {
		
	
	
	System.out.println("\n\tEnter ProductID>>");
	int ProductID1=sc.nextInt();

	
		
					
		Connection connection;
		try {
			connection = CommonConnection.getConnection();
			
			 PreparedStatement ps=connection.prepareStatement("select ProductQuantity from productdetails where ProductID=?");
				
				ps.setInt(1, ProductID1);

				
				ResultSet resultset =ps.executeQuery();
				
				if(resultset.next()) {
					System.out.println("\nProductQuantity>>" +resultset.getInt("ProductQuantity"));
					 productquantity=true;

					
					
				}else {
					
					System.out.println("Invalid Input...");
					
				}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

	
	
	}while(!productquantity);

}
	

public static void userDetails() throws SQLException {
	Scanner scanner = new Scanner(System.in);
	boolean userdetails=false;
	do {
		
	
	System.out.println("\nEnter the username:");
	String firstname = scanner.next();
	
	

try {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
				
	Connection connection = CommonConnection.getConnection();

	 PreparedStatement ps=connection.prepareStatement("select * from userdetails where firstname=?");
				
	 ps.setString(1, firstname);

ResultSet resultset =ps.executeQuery();

while(resultset.next()) {
	
//	System.out.println("userId>>"+resultset.getInt(1));
	System.out.println("\nFirstName>>\t"+resultset.getString(2));
		System.out.println("LastName>>\t"+resultset.getString(3));
		System.out.println("MobileNO>>\t"+resultset.getString(4));
		System.out.println("Email>>\t"+resultset.getString(5));

		System.out.println("City>>\t"+resultset.getString(5));
		System.out.println("State>>\t"+resultset.getString(6));
		System.out.println("Address>>\t"+resultset.getString(7));

		userdetails=true;
}


} catch (ClassNotFoundException e) {
	e.printStackTrace();
}

}while(!userdetails);
}  
}




