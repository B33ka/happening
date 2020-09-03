package com.sweeft.happening.payload;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * Created by Beka Saldadze on 01.09.2020
 */

public class LoginRequest {
    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
