package hibernate_one_to_many_bi;


import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;

//        try {
//            session = factory.getCurrentSession();
//            Department department = new Department("SALES", 300, 1200);
//            Employee employee1 = new Employee("Al", "Ivanov", 800);
//            Employee employee2 = new Employee("Ev", "Sidorov", 300);
//            Employee employee3 = new Employee("Fr", "Arbuzov", 400);
//
//            department.addEmployeeToDepartment(employee1);
//            department.addEmployeeToDepartment(employee2);
//            department.addEmployeeToDepartment(employee3);
//
//            session.beginTransaction();
//
//            session.save(department);
//
//            session.getTransaction().commit();


        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            System.out.println("Get dep");
            Department department = session.get(Department.class, 6);
            System.out.println("show dep");
            System.out.println(department);

            System.out.println("show emps " + department.getEmps().get(0));

            session.getTransaction().commit();
            System.out.println("show emps of the dep");
            System.out.println(department.getEmps());


//        try {
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 5);
//            session.delete(employee);
//
//            session.getTransaction().commit();


        } finally {
            session.close();
            factory.close();
        }
    }
}
