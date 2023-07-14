package dev.rulex.authservicedemogrpcclient.controller;

import dev.rulex.authservicedemogrpcclient.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class Controller {

    @Autowired
    AuthService authService;

    @GetMapping("/auth")
    public ResponseEntity<String> auth(@RequestParam("username") String username, @RequestParam("password") String password) {
        String result = authService.authorize(username, password);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
