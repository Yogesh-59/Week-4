package org.javaReflection.createCustomObjectMapper;

import java.lang.reflect.Field;
import java.util.Map;

public class ObjectMapper {
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) throws Exception {
        // Create an instance of the target class
        T instance = clazz.getDeclaredConstructor().newInstance();

        // Iterate over the properties in the Map
        for (Map.Entry<String, Object> entry : properties.entrySet()) {
            String fieldName = entry.getKey();
            Object value = entry.getValue();

            try {
                // Get the Field object for the field name
                Field field = clazz.getDeclaredField(fieldName);

                // Make the field accessible (in case it's private)
                field.setAccessible(true);

                // Set the value of the field on the instance
                field.set(instance, value);
            } catch (NoSuchFieldException e) {
                // Handle the case where the field does not exist in the class
                System.err.println("Field not found: " + fieldName);
            }
        }

        return instance;
    }
}
