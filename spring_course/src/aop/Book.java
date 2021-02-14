package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {

    @Value("Crime and punish")
    private String name;
    @Value("Dostoevskiy")
    private String author;
    @Value("1866")
    private int year;


    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
}
