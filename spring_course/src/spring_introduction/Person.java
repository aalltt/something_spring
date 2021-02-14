package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



public class Person {
    //    @Autowired
//    @Qualifier("catBean")
    private Pet pet;
       @Value("${person.surname}")
    private String surname;
      @Value("${person.age}")
    private int age;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("DI1");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("DI2");
        this.age = age;
    }

        public Person(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }

//    @Autowired
//    public Person(@Qualifier("catBean") Pet pet) {
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }


//    public Person() {
//        System.out.println("Person bean is created");
//    }

    //    @Autowired
//    @Qualifier("dog")
    public void setPet(Pet pet) {
        System.out.println("Class Person: set Pet");
        this.pet = pet;
    }

    public void callYouPet() {
        System.out.println("Hello, Pet!");
        pet.say();
    }
}
