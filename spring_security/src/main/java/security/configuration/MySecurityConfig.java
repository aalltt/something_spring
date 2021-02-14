package security.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;

import javax.sql.DataSource;

@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    DataSource dataSource;



    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        User.UserBuilder userBuilder = User.withDefaultPasswordEncoder();
//        auth.inMemoryAuthentication()
//                .withUser(userBuilder.username("bober").password("bober")
//                .roles("employee"));
//
//        auth.inMemoryAuthentication()
//                .withUser(userBuilder.username("bober2").password("bober2")
//                        .roles("hr"));
//
//        auth.inMemoryAuthentication()
//                .withUser(userBuilder.username("bober3").password("bober3")
//                        .roles("sale", "manager"));

        auth.jdbcAuthentication().dataSource(dataSource);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/")
                .hasAnyRole("employee", "hr", "manager")

                .antMatchers("/hr_info")
                .hasRole("hr")

                .antMatchers("/manager_info/**")
                .hasRole("manager")

                .and().formLogin().permitAll();
    }
}
