package org.mybanko.controller;

import org.mybanko.model.User.User;
import org.mybanko.model.User.UserView;
import org.mybanko.service.userservice.UserService;
import org.mybanko.service.userservice.UserServiceImpl;
import org.mybanko.utils.log.LogUtil;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<UserView> getUserById(@PathVariable int id) {
        UserView userView = userService.getUserView(id);

        if (userView == null) {
            return ResponseEntity.status(HttpStatus.OK).body(null);
        }

        return ResponseEntity.status(HttpStatus.OK).body(userView);
    }

    @GetMapping("/login")
    public String userLogin() {
        return null;
    }
}
