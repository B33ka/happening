package com.sweeft.happening.exception;

import org.springframework.security.core.AuthenticationException;

/**
 * Created by Beka Saldadze on 01.09.2020
 */

public class OAuth2AuthenticationProcessingException extends AuthenticationException {
    public OAuth2AuthenticationProcessingException(String msg, Throwable t) {
        super(msg, t);
    }

    public OAuth2AuthenticationProcessingException(String msg) {
        super(msg);
    }
}
