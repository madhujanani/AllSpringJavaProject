package org.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class JdbcDemo {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");//Control+shift+t
		
		con= DriverManager.getConnection("Jdbc:mysql://localhost:3306/mars_sep", "root", "Gsmjkvk@123");//url+db name(mars_sep),username/pasword
		if (con!=null) {
			System.out.println("Connection is sucessfull");
			
		} else {
			System.out.println("Connection is NOTT sucessfull");
		}
		
		 PreparedStatement crst = con.prepareStatement("SELECT * FROM PRODUCT");	//	
		ResultSet rs = crst.executeQuery();
	      ArrayList<Product> arrayList =new ArrayList<>();

		while (rs.next()) {
	         Product prd = new Product();
	         prd.setProductId(rs.getInt(1));
	         prd.setProductName(rs.getString(2));
	         prd.setProductDescription(rs.getString(3));
	         prd.setProductCategory(rs.getString(4));
	         prd.setPrice(rs.getInt(5));
	         prd.setQuantity(rs.getInt(5));
	         arrayList.add(prd);
			//System.out.println(rs.getInt(1)+":=====>"+rs.getString(2)+":=====>"+rs.getString(4)+":======>"+rs.getInt(5));			
		}
		arrayList.stream().filter(prod->prod.getProductCategory().contains("ENERGY")).map(pre->pre+pre.getProductCategory()+" & HEALTH").forEach(System.out::println);
		//arrayList.stream().filter(prod->prod.getProductCategory().toLowerCase()=="energy").map(pre->pre+"HEALTH").forEach(System.out::println);


//		for (Product obj : arrayList) {
//			 System.out.print("Prod_ID: "+obj.getProductId()+", ");
//	         System.out.print("Name: "+obj.getProductName()+", ");
//	         System.out.print("description: "+obj.getProductDescription()+", ");
//	         System.out.print("Category: "+obj.getProductCategory()+", ");
//	         System.out.print("Price: "+obj.getPrice()+", ");
//	         System.out.print("Quantity: "+obj.getQuantity());
//	         System.out.println();			
//		}
		
//		PreparedStatement prst = con.prepareStatement("INSERT INTO PRODUCT VALUES(?,?,?,?,?,?) ");	//we are going to inset 6 values so 6 ?
//		prst.setInt(1, 15);prst.setString(2, "TRACKER");prst.setString(3, "FOUND YOU");prst.setString(4, "ELECTRONICS");prst.setInt(5, 987);prst.setInt(6, 3);
//		int exup = prst.executeUpdate();
//		System.out.println(exup+" record inserted");
	
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	finally {
		con.close();//need to intialize otherwise error
	}

	}

}
