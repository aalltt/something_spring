package mvc_hibernate.dao;

import mvc_hibernate.entity.Employee;

import java.util.List;

public interface EmployeeDao {
    public List<Employee> getAllEmployeesDao();

   public void saveEmployeeDao(Employee employee);

    public Employee getEmployeeDao(int id);

    void deleteEmployeeDao(int id);

}
