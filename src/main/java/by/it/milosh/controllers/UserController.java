package by.it.milosh.controllers;

import by.it.milosh.model.User;
import by.it.milosh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/listAll")
    String index(){
        User user = new User("sasha");
        userService.saveUser(user);
        List<User> users = userService.findAll();
        return "index";
    }

}
