package com.purchaseSystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.commonconnection.CommonConnection;

public class Inventory {
	
	 public static void productList() throws SQLException {
			Scanner scanner = new Scanner(System.in);
			
			
				
				try {
					Connection connection = CommonConnection.getConnection();
			 PreparedStatement ps=connection.prepareStatement("select * from productdetails order by ProductPrice asc"); 
								
					
				ResultSet resultset =ps.executeQuery();
				
				while(resultset.next()) {
					System.out.println("\nProduct Name: \t\t"+resultset.getString("ProductName"));
					System.out.println("Product Quantity: \t\t"+resultset.getString("ProductQuantity"));
					System.out.println("Product Description: \t"+resultset.getString("ProductDescription"));
					System.out.println("Product Price: \t\t"+resultset.getString("ProductPrice"));


				}			
					
					
				} 
				catch ( Exception e) {
					e.printStackTrace();
				}
				
						 
			ViewProduct.viewproduct();
		}
			

}



