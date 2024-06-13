package com.example.lab10_api.utils;

public class ValidationUtils {
    public static boolean isValidEmail(String email) {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

}
