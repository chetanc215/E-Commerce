package com.guest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.commonconnection.CommonConnection;

public class Guest {
	
	 public static void productList() throws SQLException {
			Scanner scanner = new Scanner(System.in);
			
			
				
				try {
					Connection connection = CommonConnection.getConnection();
			 PreparedStatement ps=connection.prepareStatement("select * from productdetails"); 
								
					
				ResultSet resultset =ps.executeQuery();
				
				System.out.println("Products Present In Inventory:\n");

				while(resultset.next()) {
					
					System.out.println("Product Name: \t"+resultset.getString("ProductName"));
					System.out.println("Quantity: \t"+resultset.getString("ProductQuantity"));
					

				}			
					
					
				} 
				catch ( Exception e) {
					e.printStackTrace();
				}
				
			
		}
			

}
