package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Uni uni = context.getBean("uni", Uni.class);
        uni.addStudents();
        try {
            List<Student> students = uni.getStudents();
            System.out.println(students);
        } catch (Exception e) {
            System.out.println(e);
        }

        context.close();
    }
}
