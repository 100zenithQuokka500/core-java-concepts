package org.example;
import java.sql.*;
public class ConnectionJDBC {
    public static void main(String[] args) throws ClassNotFoundException{
        String url="jdbc:mysql://127.0.0.1:3306/core_java";
        String username="root";
        String password="himangi";
      //  String query="INSERT INTO employees(id,name,job_title,salary) VALUES (3,'Harshit','Full stack developer',87000.0)";
       // String query="DELETE FROM employees";
        String query="UPDATE employees SET job_title='Full stack Developer',salary=70000.0 WHERE id=2;";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Drivers loaded succssfully");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try {
            Connection con=DriverManager.getConnection(url,username,password);
            System.out.println("connection established successfully");
            Statement stmt=con.createStatement();
           // ResultSet rs=stmt.executeQuery("select * from employees");
             ResultSet rs=stmt.executeQuery("select id,name,job_title,salary from employees where job_title='Full stack developer';");
            //int rowsaffected =stmt.executeUpdate(query);
           // if(rowsaffected>0){
                //System.out.println("Insert successfull "+rowsaffected+" row(s) affected.");
                //  System.out.println("DELETION successful "+rowsaffected+" row(s) affected.");
              //  System.out.println("UPDATE successful "+rowsaffected+" row(s) affected.");
          //  }else{
              //  System.out.println("DELETION failed!");
               // System.out.println("UPDATE  failed");

          //  }
            while(rs.next()){
                int id=rs.getInt("id");
                String name=rs.getString("name");
                String job_title=rs.getString("job_title");
                double salary=rs.getDouble("salary");

                System.out.println("ID:"+id);
                System.out.println("Name:"+name);
                System.out.println("Job title:"+job_title);
                System.out.println("Salary:"+salary);
            }
            rs.close();
            stmt.close();
            con.close();
            System.out.println();
            System.out.println("Connection closed successfully");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
