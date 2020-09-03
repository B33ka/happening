package com.sweeft.happening.controller;

import com.sweeft.happening.exception.ResourceNotFoundException;
import com.sweeft.happening.model.User;
import com.sweeft.happening.repository.UserRepository;
import com.sweeft.happening.security.CurrentUser;
import com.sweeft.happening.security.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Beka Saldadze on 01.09.2020
 */

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/me")
    @PreAuthorize("hasRole('USER')")
    public User getCurrentUser(@CurrentUser UserPrincipal userPrincipal) {
        return userRepository.findById(userPrincipal.getId())
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", userPrincipal.getId()));
    }
}
