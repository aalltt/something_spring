package security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class MyController {

    @GetMapping("/")
    public String getInfoForAllEmps(){
        return "view-all";
    }

    @GetMapping("/hr_info")
    public String getInforOnlyHr(){
        return "view-for-hr";
    }

    @GetMapping("/manager_info")
    public String getInfoOnlyManagers(){
        return "view-for-managers";
    }

}
