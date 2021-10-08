package be.TechnofuturTIC.foodtrack.controllers;

import be.TechnofuturTIC.foodtrack.services.impl.UserService;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @Secured("{ROLE_ADMIN}")
    @RequestMapping("/home")
    public String homepage(Model view) {
        return "layout";
    }
}
