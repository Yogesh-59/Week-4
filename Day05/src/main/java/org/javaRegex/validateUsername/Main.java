package org.javaRegex.validateUsername;
import java.util.*;

import static org.javaRegex.validateUsername.UsernameValidate.validate;

public class Main {
    public static void main(String[] args) {
        System.out.println(validate("user_123"));
        System.out.println(validate("123user"));
        System.out.println(validate("us"));
    }
}
