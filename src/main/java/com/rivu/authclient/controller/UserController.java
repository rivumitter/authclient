package com.rivu.authclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    @GetMapping("/user")
    public Map<String, String> getUserDetails(Principal principal) {

        return Map.of("user", principal.getName());
    }
}
