package com.purchaseSystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.commonconnection.CommonConnection;

public class ViewProduct {

	public static  void viewproduct() throws SQLException  {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nEnter ProductName: ");
		String ProductName = scanner.next();
			
				// load Driver class

				
					
					try {
					Connection	connection = CommonConnection.getConnection();
					
					
					PreparedStatement preparedStatement = connection.prepareStatement("select * from productdetails where ProductName=? ");
					
					preparedStatement.setString(1, ProductName);
					
				
					
					ResultSet resultSet = preparedStatement.executeQuery();
					
					//List product = null;
					//Collections.sort(product);
					while(resultSet.next()) {
					System.out.println("\nProductId: \t\t"+resultSet.getInt(1));
					System.out.println("ProductName: \t\t"+resultSet.getString(2));
					System.out.println("ProductDescription: \t"+resultSet.getString(3));
					System.out.println("ProductQuantity: \t"+resultSet.getInt(4));
					System.out.println("ProductPrice: \t\t"+resultSet.getInt(5));
				//	System.out.println("ProductTotalPrice"+resultSet.getDouble(6));
				
				}
					
		
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	
			
					BillCalculation.getBillcalulate();
				} 
}






	

