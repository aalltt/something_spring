package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary library1 = context.getBean("uniLibrary", UniLibrary.class);

           Book book = context.getBean("book", Book.class);
        library1.getBook();
        library1.addBook("Ivanov", book);
        library1.addMagazine();
        //library1.getMagazine();
//        library1.returnMagazine();
//        library1.addBook();
        //     library1.returnBook();

//        SchoolLibrary library2 = context.getBean("schoolLibrary", SchoolLibrary.class);
//        library2.getBook();


        context.close();
    }
}
