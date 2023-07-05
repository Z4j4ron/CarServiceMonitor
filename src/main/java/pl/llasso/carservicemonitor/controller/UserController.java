package pl.llasso.carservicemonitor.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.llasso.carservicemonitor.entities.User;
import pl.llasso.carservicemonitor.service.UserService;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @Autowired
    private final PasswordEncoder passwordEncoder;

    @GetMapping(path = "/user/form")
    String showAddUserForm(@ModelAttribute("user") User user){
        return "user/add";
    }

//    @GetMapping(path = "/user/form")
//    String showAddUserForm(Model model){
//        model.addAttribute("user", new User());
//        return "user/add";
//    }

    @PostMapping(path = "/user/form")
    String processAddUserForm(@Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "user/add";
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userService.save(user);

        return "redirect:/user/list";
    }
    @GetMapping(path = "/user/list")
    String showUserList(Model model){
        List<User> users = userService.findAll();
        model.addAttribute("users", users);

        return "user/list";
    }

    @GetMapping(path = "/user/edit")
    String showUserEditForm(@RequestParam Long id, Model model){
        User user = userService.findById(id);
        model.addAttribute("user", user);

        return "user/edit";
    }

    @PostMapping(path = "/user/edit")
    String processUserEditForm(User user){
        userService.save(user);
        return "redirect:/user/list";
    }

    @GetMapping(path = "/user/remove")
    String deleteById(@RequestParam Long id){userService.deleteById(id); return "redirect:/user/list";}
}
