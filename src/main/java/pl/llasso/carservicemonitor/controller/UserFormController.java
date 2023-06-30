package pl.llasso.carservicemonitor.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.llasso.carservicemonitor.entities.User;
import pl.llasso.carservicemonitor.service.UserService;

@Controller
@RequiredArgsConstructor
public class UserFormController {
    private final UserService userService;

    @GetMapping(path = "/user/form")
    String showAddUserForm(@ModelAttribute("user") User user){
        return "user/add";
    }

    @PostMapping(path = "/user/form")
    String processAddUserForm(User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "user/add";
        }

        userService.save(user);

        return "redirect:/user/list";
    }
}
