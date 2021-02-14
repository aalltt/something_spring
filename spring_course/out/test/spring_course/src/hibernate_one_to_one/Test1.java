package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;

        try {
//        Session session = factory.getCurrentSession();
//        Employee employee = new Employee("Tony", "Stark", "Comp", 1000);
//        Detail detail = new Detail("NY", "234234234", "stark@mail.com");
//        employee.setEmpDetail(detail);
//        session.beginTransaction();
//        session.save(employee);


//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Jack", "Sparrow", "pirates", 200);
//            Detail detail = new Detail("buhta", "666", "depp@mail.com");
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//            session.save(employee);


//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 1);
//            System.out.println(employee.getEmpDetail());


            session = factory.getCurrentSession();
            session.beginTransaction();
            Employee employee = session.get(Employee.class, 2);
            session.delete(employee);




            session.getTransaction().commit();}
        finally {
            session.close();
            factory.close();
        }
    }
}
