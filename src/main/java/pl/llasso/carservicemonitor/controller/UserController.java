package pl.llasso.carservicemonitor.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.llasso.carservicemonitor.entities.User;
import pl.llasso.carservicemonitor.service.UserService;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;


    @RequestMapping("/kill")
    @ResponseBody
    public String home() {
        return "hello world !!!";
    }
    @PostMapping(path = "/user")
    void save(@RequestParam String name, @RequestParam String email, @RequestParam String password){
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);

        userService.save(user);
    }


}
