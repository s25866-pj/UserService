package com.example.UserManagment.Controller;

import com.example.UserManagment.Model.UserModel;
import com.example.UserManagment.Service.UserService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/user")
@EnableWebMvc
@ComponentScan(basePackages = "com.example.UserManagment")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/getUser")
    public Optional<UserModel> showUser(@RequestParam Long id){
        return userService.findById(id);
    }
    @GetMapping("/getAllUsers")
    public String showAllUser(Model model){
        List<UserModel> users = userService.getAll();
        model.addAttribute("users",users);

        return "src/main/WEB-INF/jsp/user/getAllUsers";
    }

}
