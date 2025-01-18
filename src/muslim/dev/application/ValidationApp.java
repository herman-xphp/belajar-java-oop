package application;

import data.LoginRequest;
import error.ValidationException;
import util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("null", "null");

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        } catch (ValidationException | NullPointerException e) {
            System.out.println("Data tidak valid: " + e.getMessage());
        } finally {
            System.out.println("Error Gak Error, Tetap Dipanggil");
        }
    }
}
