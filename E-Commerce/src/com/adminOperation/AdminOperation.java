package com.adminOperation;

import java.sql.SQLException;
import java.util.Scanner;

public class AdminOperation {

public static void adminOperations() throws SQLException {
		
		Scanner scanner = new Scanner(System.in);
		   boolean loginSystem = false;
		   boolean operation=false;
		   
		   while(!operation) {
			   
		   
			do {
		    
		    System.out.println("\nPlease choose an option:\n");
		    
		    System.out.println("Enter 1 To Display User List");
		    System.out.println("Enter 2 To Display Quantity By Product ID");
		    System.out.println("Enter 3 TO Check The UserDetails By Name");
		    System.out.println("Enter 4 To LogOut");

		    
		    System.out.print("\nOption: ");
		    int option = scanner.nextInt();
		    
		    switch(option) {
		    
		        case 1:
		        	AdminFunction.userList();
		        	 loginSystem=true;
		            break;
		        case 2:
		        	AdminFunction.productQuantity();
		            loginSystem=true;
		            break;
		        case 3:
		        	AdminFunction.userDetails();
		        	loginSystem=true;
		        	break;
		           
		        case 4:
		        	System.out.println("\nLogOut successfull");
		        	operation=true;
		        	break;

		            
		        default:
		            System.out.println("\nInvalid option selected.");

				
			}
			
			
		}while(!loginSystem);
			
			
		   }
	}
		
	}


	

