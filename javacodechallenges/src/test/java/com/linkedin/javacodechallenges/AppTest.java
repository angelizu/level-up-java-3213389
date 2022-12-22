package com.linkedin.javacodechallenges;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void isComplex_true() {
        assertTrue(App.isPasswordComplex("Happy12"));
        assertTrue(App.isPasswordComplex("01Sall£y6"));
        assertTrue(App.isPasswordComplex("2Passw@rd1"));
        assertTrue(App.isPasswordComplex("Happy12"));
    }

    @Test
    public void isComplex_false() {
        assertFalse(App.isPasswordComplex("happy123"));
        assertFalse(App.isPasswordComplex("Password"));
        assertFalse(App.isPasswordComplex("LOLOL"));
        
    }
        
}
