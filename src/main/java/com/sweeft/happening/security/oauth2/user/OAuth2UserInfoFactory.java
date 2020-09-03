package com.sweeft.happening.security.oauth2.user;

import com.sweeft.happening.exception.OAuth2AuthenticationProcessingException;
import com.sweeft.happening.model.AuthProvider;

import java.util.Map;

/**
 * Created by Beka Saldadze on 01.09.2020
 */

public class OAuth2UserInfoFactory {

    public static OAuth2UserInfo getOAuth2UserInfo(String registrationId, Map<String, Object> attributes) {
        if(registrationId.equalsIgnoreCase(AuthProvider.google.toString())) {
            return new GoogleOAuth2UserInfo(attributes);
        } else if (registrationId.equalsIgnoreCase(AuthProvider.facebook.toString())) {
            return new FacebookOAuth2UserInfo(attributes);
        } else {
            throw new OAuth2AuthenticationProcessingException("Sorry! Login with " + registrationId + " is not supported yet.");
        }
    }
}
