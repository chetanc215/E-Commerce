package com.commonconnection;


	import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

	public class CommonConnection {

		

		
			
			public static Connection getConnection() throws SQLException {
				
				Connection connection = null;
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					
					connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/e-commercedatabase","root","Root@123root");
					
					
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				
				return connection;
				
				
			}

			public static List<Map<String, Object>> select(String viewCartQuery) {
				// TODO Auto-generated method stub
				return null;
			}

		}



		




