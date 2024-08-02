package org.example;

import java.util.List;

public interface EmployeeDao {
    public int save(Employee employee);
    public int update(Employee employee, int id);
    public int delete(int id);
    public Employee find(int id);
    public List<Employee> findAll();

}
