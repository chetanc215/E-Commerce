package com.loginSystem;

import java.sql.SQLException;
import java.util.Scanner;

import com.guest.Guest;

public class LoginSystem {
	
	
public static void loginSystem() throws SQLException {
		
		Scanner scanner = new Scanner(System.in);
	   boolean loginSystem = false;
	   
		do {
			
	    System.out.println("Welcome to the login system!\n");
	    
	    System.out.println("Please choose an option:\n");
	    
	    System.out.println("Enter 1 for user Registration");
	    System.out.println("Enter 2 for User login");
	    System.out.println("Enter 3 for Admin Login");
	    System.out.println("Enter 4 for Guest Login \n");
	    System.out.print("Option: ");
	    int option = scanner.nextInt();
	    
	    switch(option) {
	    
	        case 1:
	        	UserRegistration.userDetails();
	        	 loginSystem=true;
	            break;
	            
	        case 2:
	        	UserLogin.userLogin();
	            loginSystem=true;
	            break;
	            
	        case 3: 
	        	AdminLogin.adminLogin();
	        	loginSystem=true;
	        	break;
	        	
	        case 4:   
	        	Guest.productList();
	        	loginSystem=true;
	        	break;
	            
	            
	        default:
	            System.out.println("Invalid option selected.");

			
		}
		}while(!loginSystem);
	}
		
	}



			
	




