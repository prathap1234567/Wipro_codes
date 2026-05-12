package com.wipro.Jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
    	int option=1;

        while(option!=9){
            System.out.println("--Menu--");
            System.out.println("--1. add employee");
            System.out.println("--2. print employee");
            System.out.println("--9 Exit");

            Scanner sc=new Scanner(System.in);
            option=sc.nextInt();
            if(option==1){
                addEmployee();
            }
            else if(option==2){
                printEmployee();
            }
            System.out.println("--Menu--");
        }
    }
    static void addEmployee(){
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter name: ");
            String name= sc.next();

            System.out.println("Enter salary: ");
            double salary= sc.nextDouble();
            Connection con= getConnection();
            String sql= "insert into employee (name, salary) values (?, ?)";
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setString(1,name);
            ps.setDouble(2,salary);
            ps.execute();
            System.out.println("Employee added ");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    static void printEmployee(){
        try {
            Connection con =getConnection();
            Statement stm=con.createStatement();
            String sql= "select * from employee";
            ResultSet rs=stm.executeQuery(sql);
            while(rs.next()){
                System.out.println(
                    "id=" + rs.getInt("id") + " - " +
                    "name=" + rs.getString("name") + " - " +
                    "salary=" + rs.getDouble("salary")
                );
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

static Connection getConnection(){
	String url="jdbc:mysql://localhost:3306/wipro_train_assignment2?allowPublicKeyRetrieval=true&useSSL=false";
	String userId="root";
	String password="8188mlbs";
	Connection con=null;
	try{
		con=DriverManager.getConnection(url,userId,password);
	}
	catch(Exception ex) {
		ex.printStackTrace();
	}
	return con;
	
}
}