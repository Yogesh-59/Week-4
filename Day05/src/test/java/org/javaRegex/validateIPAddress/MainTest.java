package org.javaRegex.validateIPAddress;

import org.junit.jupiter.api.Test;

import static org.javaRegex.validateIPAddress.ValidateIPAddress.validateIP;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
class MainTest {
    @Test
    public void test(){
        ValidateIPAddress validate = new ValidateIPAddress();

        assertTrue(validate.validateIP("192.168.1.1"), "true");
        assertTrue(validate.validateIP("10.0.0.1"), "true");
        assertTrue(validate.validateIP("172.16.0.1"), "true");
        assertTrue(validate.validateIP("8.8.8.8"), "true");
        assertFalse(validate.validateIP("205.05.25.07"), "false");
    }
}