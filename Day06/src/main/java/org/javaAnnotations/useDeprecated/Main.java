package org.javaAnnotations.useDeprecated;

public class Main {
    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();

        // Calling the deprecated method A compiler warning will be generated.
        api.oldFeature();

        // Calling the new method
        api.newFeature();
    }
}
