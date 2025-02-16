package org.javaAnnotations.useDeprecated;

public class LegacyAPI {
    @Deprecated
    public void oldFeature() {
        System.out.println("Executing old feature deprecated.");
    }

    public void newFeature() {
        System.out.println("Executing new feature.");
    }
}
