package com;

public class Extra {
  public static boolean isPasswordComplex(String password) {
    boolean hasLowercase = false;
    boolean hasUppercase = false;
    boolean hasNumber = false;

    // can do it much quicker this way
    // return password.length() >= 6 &&
    // password.matches(".*\\d.*") &&
    // password.matches(".*[a-z].*") &&
    // password.matches(".*[A-Z].*");

    if ((password.length() < 6)) {
      return false;
    }

    for (int i = 0; i < password.length() || !hasLowercase
        && !hasUppercase && !hasNumber; i++) {
      char current = password.charAt(i);
      if (Character.isDigit(current)) {
        hasNumber = true;
      } else if (Character.isUpperCase(current)) {
        hasUppercase = true;
      } else if (Character.isLowerCase(current)) {
        hasLowercase = true;
      }
    }

    return hasNumber && hasLowercase && hasUppercase;
  }
  
}
