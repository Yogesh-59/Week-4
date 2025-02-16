package org.javaReflection.accessModifyStaticFields;

public class Configuration {
    private static String API_KEY = "default_key";

    // Public method to get the API_KEY (for comparison)
    public static String getApiKey() {
        return API_KEY;
    }
}
