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

  // test
    // assertTrue(App.isPasswordComplex("Happy12"));
    // assertTrue(App.isPasswordComplex("01Sall£y6"));
    // assertTrue(App.isPasswordComplex("2Passw@rd1"));
    // assertTrue(App.isPasswordComplex("Happy12"));

    // assertFalse(App.isPasswordComplex("happy123"));
    // assertFalse(App.isPasswordComplex("Password"));
    // assertFalse(App.isPasswordComplex("LOLOL"));


  
}
