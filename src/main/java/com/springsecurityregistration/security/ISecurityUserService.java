package com.springsecurityregistration.security;

public interface ISecurityUserService {

    String validatePasswordResetToken(String token);

}
