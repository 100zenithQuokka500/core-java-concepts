package org.example;

public class Employee {
    private int id;
    private String name;
    private String job_title;
    private int salary;
    public Employee(int id, String name, String job_title,int salary) {
        this.id = id;
        this.name = name;
        this.job_title = job_title;
        this.salary=salary;
    }

    public Employee(String name, String job_title, int salary) {
        this.name = name;
        this.job_title = job_title;
        this.salary=salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getJob_title() {
        return job_title;
    }
    public int getSalary(){
        return salary;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setJob_title(String job_title) {
        this.job_title =job_title;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }

}
