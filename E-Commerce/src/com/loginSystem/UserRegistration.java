package com.loginSystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.commonconnection.CommonConnection;

public class UserRegistration {
	
	
		
	
	public static void userDetails() throws SQLException {
		
		 String firstname;
	 String lastname;
		 String password;
		 int mobileNumber ;
		 String email;
		 String city;
		 String state;
		 String	Address;
		
		
		Scanner scanner = new Scanner(System.in);
		boolean registration=false;
		
		do {
			
		
		System.out.println("Enter the First Name: ");
		firstname = scanner.next();
		
		System.out.println("Enter the Last Name: ");
		lastname = scanner.next();
		
		System.out.println("Enter new Password (case sensitive): ");
		password = scanner.next();
		
		
		System.out.println("Enter the mobileNumber: ");
		 mobileNumber = scanner.nextInt();
		
		System.out.println("Enter the email: ");
	       email = scanner.next();
		
		System.out.println("Enter the city: ");
		city = scanner.next();
		
		System.out.println("Enter the State: ");
		state = scanner.next();
		
		System.out.println("Enter the Address: ");
		Address = scanner.next();
		
	
		
		System.out.println("\n If you want to confirm registration press Y or Press N to repeat....");
		char ch =Character.toUpperCase(scanner.next().charAt(0));
		
		if(ch=='Y') {
		registration=true;
		}else if (ch=='N') {
			System.out.println("Enter the details again....\n");
		}
			
		}while(!registration);
		
		try {
		Connection connection = CommonConnection.getConnection();
		
		PreparedStatement preparedStatement = connection.prepareStatement("insert into userdetails(firstname, lastname,password,mobileNumber,email,city,state,Address)values(?,?,?,?,?,?,?,?)");
		
		preparedStatement.setString(1,firstname );

		preparedStatement.setString(2, lastname);
		preparedStatement.setString(3, password);
		preparedStatement.setInt(4, mobileNumber);
		preparedStatement.setString(5, email);
		preparedStatement.setString(6, city);
		preparedStatement.setString(7, state);
		preparedStatement.setString(8, Address);
	//	preparedStatement.setString(8, username);
		
		
		preparedStatement.execute();
		
		
		System.out.println("Registration Successful.....\n");
	
	}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		
	}
		LoginSystem.loginSystem();
	}
}










