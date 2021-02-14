package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {


    public void getBook(){
        System.out.println("We take book from UNI ");
        System.out.println("--------------------------");
    }

    public String returnBook(){
        int a = 10/0;
        System.out.println("we return book at UNI");
      //  System.out.println("--------------------------");
        return "World and Peace";
    }

    public void getMagazine(){
        System.out.println("We take magazine from UNI");
        System.out.println("--------------------------");
    }

    public void returnMagazine(){
        System.out.println("we return magazine at UNI");
        System.out.println("--------------------------");
    }

    public void addBook(String person_name, Book book ){
        System.out.println("We add book in UNI ");
        System.out.println("--------------------------");
    }

    public void addMagazine(){
        System.out.println("We add magazine from UNI ");
        System.out.println("--------------------------");
    }




}
