package spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
//@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model) {
        model.addAttribute("employee", new Employee());
        return "ask-emp-details";
    }


    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@Valid @ModelAttribute("employee")
                                              Employee employee, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "ask-emp-details";
        } else {
            return "show-emp-details";
        }
//     String name = employee.getName();
//     employee.setName("Obi " + name);
//     String surName = employee.getSurName();
//     employee.setSurName("Mr " + surName);
    }
}
