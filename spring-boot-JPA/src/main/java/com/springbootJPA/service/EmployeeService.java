package com.springbootJPA.service;



import com.springbootJPA.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    Employee getEmployee(int id);


    void deleteEmployee(int id);

    public List<Employee> findAllByName(String name);
}
