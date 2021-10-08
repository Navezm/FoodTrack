package be.TechnofuturTIC.foodtrack.controllers;

import be.TechnofuturTIC.foodtrack.services.impl.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }
}
