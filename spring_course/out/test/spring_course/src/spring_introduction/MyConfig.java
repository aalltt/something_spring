package spring_introduction;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("myApp.properties")
public class MyConfig {

    @Bean
    @Scope("singleton")
    public Pet catBean(){
        return new Cat();
    }

    @Bean
    public Person personBean(){
        return new Person(catBean());
    }



}
