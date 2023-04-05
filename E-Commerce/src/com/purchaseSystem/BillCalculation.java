package com.purchaseSystem;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BillCalculation {

    
        // properties  
        private String id;  
        private String pname; 
      //  private String Description;
/*
		public String getDescription() {
			return Description;
		}
		public void setDescription(String description) {
			Description = description;
}	*/	
        

		//private String descrption;
        private int qty;  
        private double price;  
        private double totalPrice;  
           
        // constructor  
        BillCalculation(String id, String pname, int qty, double price, double totalPrice)   //String Desciption
        {  
            this.id=id;  
            this.pname = pname;
         //   this.descrption=Desciption;
            this.qty = qty;  
            this.price = price;  
            this.totalPrice = totalPrice;  
        }  
            // getter methods  
            public String getId()   
                {  
                    return id;  
                }  
                public String getPname()   
                {  
                    return pname;  
                }  
               
                public int getQty()   
                {  
                    return qty;  
                }  
                public double getPrice()   
                {  
                    return price;  
                }  
                public double getTotalPrice()   
                {  
                    return totalPrice;  
                }  
                //displayFormat  
                public static void displayFormat()   
                {  
                    System.out.format("-----------------------------------------------------------------------------------------------------------------------------------");  
                    System.out.print("\nProduct ID \t\tName\t\t\tQuantity\t\tRate \t\t\t\tTotal Price\n");  
                    System.out.format("-----------------------------------------------------------------------------------------------------------------------------------\n");  
                }  
                   
                // display  
                public  void display()   
                {  
                    System.out.format("   %-9s             %-9s              %5d               %9.2f                       %14.2f\n" ,id, pname,qty ,price, totalPrice);  
                }
				
				
    
     
        	public static void getBillcalulate() throws SQLException{
    //    public static void main(String args[]) throws SQLException   
            {  
                // variables  
                String id = null;  
                String productName = null; 
              //  String Desciption=null;
                int quantity = 0;  
                double price = 0.0;  
                double totalPrice = 0.0;  
                double overAllPrice = 0.0;  
                double subtotal=0.0, discount=0.0;  
                char choice = '\0';  
             
                
                Scanner scan = new Scanner(System.in);  
                System.out.print("\nEnter Customer Name: ");  
                String customername=scan.nextLine();  
                
                List<BillCalculation> product = new ArrayList<BillCalculation>();  
                do   
                    {  
                	
                        System.out.println("\nEnter the product details: ");  
                        System.out.print("\nProduct ID: ");  
                        id = scan.nextLine();  
                        System.out.print("Product Name: ");  
                        productName = scan.nextLine();  
                        
                    //    System.out.println("Product Description");
                    //    Desciption= scan.nextLine();
                        
                        System.out.print("Quantity: ");  
                        quantity = scan.nextInt();  
                        System.out.print("Price (per unit): ");  
                        price = scan.nextDouble();  
                        //calculate total price for a particular product  
                        totalPrice = price * quantity;  
                        //calculates overall price  
                        overAllPrice = overAllPrice + totalPrice;  
                        product.add( new BillCalculation(id, productName, quantity, price, totalPrice) );  
                        System.out.print("Want to add more items? (y or n): ");  
                        choice = scan.next().charAt(0);  
                        scan.nextLine();  
                    }   
                while (choice == 'y' || choice == 'Y');  
                BillCalculation.displayFormat();  
                for (BillCalculation p : product)   
                {  
                    p.display();  
                }  
                System.out.println("\n\t\t\t\t\t\t\t\t\t\tTotal Amount (Rs.) " +overAllPrice);  
               

                discount = overAllPrice*2/100;  
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t    Discount (Rs.) " +discount);  
               
                subtotal = overAllPrice-discount;   
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t          Subtotal "+subtotal);  
                
              
                System.out.println("\t\t\t\t----------------Thank You for Shopping!!-----------------");  
                System.out.println("\t\t\t\t                     Visit Again");  
               
                
                
            }  
            
    }  

        }







