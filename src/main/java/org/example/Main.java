package org.example;
import java.util.List;
/*import java.sql.*;
import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;*/
public class Main {
    public static void main(String[] args) {
       /* String url= "jdbc:mysql://localhost:3306/core_java" ;
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
        */
        Employee employee=new Employee(6,"dao","full stack developer",75000);
        EmployeeDaoImpl emp=new EmployeeDaoImpl();
        //emp.save(employee);
        emp.update(employee,5);
        //emp.delete(5);
        Employee foundEmployee = emp.find(1);
        if (foundEmployee != null) {
            System.out.println("Found employee: Name" + foundEmployee.getName() + ", Job-Title: " + foundEmployee.getJobTitle()+" Salary:"+foundEmployee.getSalary());
        } else {
            System.out.println("Employee not found");
        }

        List<Employee> allEmployees = emp.findAll();
        System.out.println("All Employees:");
        for (Employee empl : allEmployees) {
            System.out.println("ID: " + empl.getId() + ", Name: " + empl.getName() + ", Job-Title: " + empl.getJobTitle()+" ,salary:"+empl.getSalary());
        }
    }
}
