package util;

import data.LoginRequest;
import error.ValidationException;

public class ValidationUtil {

    public static void validate(LoginRequest LoginRequest) throws ValidationException, NullPointerException {
        if (LoginRequest.username() == null) {
            throw new NullPointerException("Username tidak boleh null");
        } else if (LoginRequest.username().isBlank()) {
            throw new ValidationException("Username tidak boleh blank");
        } else if (LoginRequest.password() == null) {
            throw new NullPointerException("Password tidak boleh null");
        } else if (LoginRequest.password().isBlank()) {
            throw new ValidationException("Password tidak boleh blank");
        }
    }
}
