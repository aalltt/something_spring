package aop;

import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;

@Component
public class Uni {
    private List<Student> students = new ArrayList<>();

    public void addStudents(){
        Student s1 = new Student("Ivanov", 4, 7.5);
        Student s2 = new Student("Petrov", 2, 8.3);
        Student s3 = new Student("Sidorov", 1, 9.1);
        students.add(s1);
        students.add(s2);
        students.add(s3);
    }

    public List<Student> getStudents (){
        System.out.println("Begining of working getStudents");
       // System.out.println(students.get(3));
        System.out.println("info from method getStudents");
        System.out.println(students);
        return students;
    }

}
