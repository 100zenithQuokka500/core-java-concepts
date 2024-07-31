package org.example;
import java.sql.*;
import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String url= "jdbc:mysql://localhost:3306/core_java" ;
        String user="root";
        String password="himangi";
        Connection connection=null;
        try{
            connection=DriverManager.getConnection(url,user,password);
            System.out.println("Connection to the database established successfully!");
        } catch(SQLException e){
            e.printStackTrace();
        } finally {
            if(connection!=null){
                try{
                    connection.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        if(StringUtils.isBlank(str)){
            System.out.println("string is blank");
        }else{
            System.out.println("String is not blank");
        }
        sc.close();
    }
}
