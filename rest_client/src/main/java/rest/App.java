package rest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import rest.configuration.MyConfig;
import rest.entity.Employee;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);
//get
                List<Employee> allEmployees = communication.getAllEmployees();
        System.out.println(allEmployees);
//getbyid
//        Employee empById = communication.getEmployee(1);
//save
//        Employee employee = new Employee("Sokol", "Sokolovskiy", "HR", 7777);
//        employee.setId(8); //was updated
//        communication.saveEmployee(employee);
//delete
//        communication.deleteEmployee(8);
    }
}
