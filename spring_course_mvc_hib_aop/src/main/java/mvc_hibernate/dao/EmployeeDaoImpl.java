package mvc_hibernate.dao;

import mvc_hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Employee> getAllEmployeesDao() {
        Session session = sessionFactory.getCurrentSession();
        List<Employee> employees = session.createQuery("from Employee",
                Employee.class).getResultList();
        return employees;
    }

    @Override
    public void saveEmployeeDao(Employee employee) {
        Session session = sessionFactory.getCurrentSession();

        session.saveOrUpdate(employee);
    }

    @Override
    public Employee getEmployeeDao(int id) {
        Session session = sessionFactory.getCurrentSession();
        Employee employee = session.get(Employee.class, id);
        return employee;
    }

    @Override
    public void deleteEmployeeDao(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<Employee> query = session.createQuery("delete from Employee" +
                " where id =:employeeId");
        query.setParameter("employeeId", id);
        query.executeUpdate();
    }


}