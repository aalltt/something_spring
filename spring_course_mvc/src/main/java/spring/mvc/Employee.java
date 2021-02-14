package spring.mvc;

import spring.mvc.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;


public class Employee {
    @Size(min = 2, message = "Name must be from 2 to 10")
    private String name;
    @NotEmpty(message = "must not be empty")
    @NotBlank(message = "must not be empty")
    private String surName;
    @Min(value = 500, message = "must be more 500")
    @Max(value = 1000, message = "must be less 1000")
    private int salary;
    private String department;
    private String car;
    private String[] lang;

    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "phone must be correct")
    private String phone;

   // @CheckEmail(value = "abc.com", message = "must be abc.com")
    @CheckEmail
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String[] getLang() {
        return lang;
    }

    public void setLang(String[] lang) {
        this.lang = lang;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    private Map<String, String> departments;
    private Map<String, String> cars;
    private Map<String, String> langs;

    public Map<String, String> getLangs() {
        return langs;
    }

    public void setLangs(Map<String, String> langs) {
        this.langs = langs;
    }

    public Map<String, String> getCars() {
        return cars;
    }

    public void setCars(Map<String, String> cars) {
        this.cars = cars;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "IT all");
        departments.put("HR", "HR all");
        departments.put("Sales", "Sales all");

        cars = new HashMap<>();
        cars.put("BMW", "BMW");
        cars.put("AUDI", "AUDI");

        langs = new HashMap<>();
        langs.put("En", "English");
        langs.put("Sp", "Span ish");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
