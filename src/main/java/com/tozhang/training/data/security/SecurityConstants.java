package com.tozhang.training.data.security;

public class SecurityConstants {
    public static final String GuestSECRET = "WoshiniBaBa";
    public static final String AdminSECRET = "LiangGeSecret";
    public static final long EXPIRATION_TIME = 864_000_000; // 10 days
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String SIGN_UP_URL = "/guest/signUp";
    public static final String SIGN_IN_URL = "/guest/signIn";
}
