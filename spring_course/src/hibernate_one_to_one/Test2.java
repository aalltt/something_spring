package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();
//        Employee employee = new Employee("vanda", "baba", "sochi", 2222);
//        Detail detail = new Detail("Wasd", "1ewewe2", "vanda@mail.com");
//
//        employee.setEmpDetail(detail);
//        detail.setEmployee(employee);
            session.beginTransaction();

            Detail detail = session.get(Detail.class, 1);
            detail.getEmployee().setEmpDetail(null);
//            System.out.println(detail.getEmployee());
            session.delete(detail);



            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}
