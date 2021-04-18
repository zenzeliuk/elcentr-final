package com.elcentr.service.impl;

import com.elcentr.service.PasswordEncoderService;

import java.util.Base64;

public class PasswordEncoderServiceImpl implements PasswordEncoderService {
    @Override
    public String encode(CharSequence rawPassword) {
        return Base64.getEncoder().encodeToString(rawPassword.toString().getBytes());
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return Base64.getEncoder().encodeToString(rawPassword.toString().getBytes()).equals(encodedPassword);
    }
}
