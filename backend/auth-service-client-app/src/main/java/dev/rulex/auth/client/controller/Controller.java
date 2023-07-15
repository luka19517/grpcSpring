package dev.rulex.auth.client.controller;

import dev.rulex.auth.client.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth-api")
@CrossOrigin
public class Controller {

    @Autowired
    AuthService authService;

    @GetMapping("/auth")
    public ResponseEntity<String> auth(@RequestParam("username") String username, @RequestParam("password") String password) {
        String result = authService.authorize(username, password);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping("/test")
    public ResponseEntity<String> test(@RequestParam("name") String name) {
        String result = "Hello from server: " + name;
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
