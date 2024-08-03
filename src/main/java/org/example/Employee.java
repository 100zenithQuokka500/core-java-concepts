package org.example;

public class Employee {
    private int id;
    private String name;
    private String jobTitle;
    private int salary;
    public Employee(int id, String name, String jobTitle,int salary) {
        this.id = id;
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary=salary;
    }

    public Employee(String name, String jobTitle, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary=salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }
    public int getSalary(){
        return salary;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle =jobTitle;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }

}
