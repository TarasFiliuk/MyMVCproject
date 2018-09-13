package ua.com.owu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ua.com.owu.models.Manager;
import ua.com.owu.models.User;
import ua.com.owu.service.AccountService.AccountService;

@Controller
public class ManagerController {
    @Autowired
    AccountService accountService;
 @PostMapping("/save/manager")
 public String manager(Manager manager){
     accountService.save(manager);
 return "redirect:/";
 }


    @GetMapping("/create/manager_page")
    public String managerRegistration() {


        return "managerRegistration";
    }

}
