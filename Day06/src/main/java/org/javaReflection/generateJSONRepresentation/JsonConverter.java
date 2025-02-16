package org.javaReflection.generateJSONRepresentation;

import java.lang.reflect.Field;

public class JsonConverter {
    public static String toJson(Object obj) throws IllegalAccessException {
        // Use a StringBuilder to build the JSON string
        StringBuilder json = new StringBuilder();
        json.append("{");

        // Get the Class object for the object
        Class<?> clazz = obj.getClass();

        // Get all declared fields (including private ones)
        Field[] fields = clazz.getDeclaredFields();

        // Iterate over the fields
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];

            // Make the field accessible (in case it's private)
            field.setAccessible(true);

            // Get the field name and value
            String fieldName = field.getName();
            Object fieldValue = field.get(obj);

            // Append the field name and value to the JSON string
            json.append("\"").append(fieldName).append("\":");

            // Handle different types of field values
            if (fieldValue instanceof String) {
                json.append("\"").append(fieldValue).append("\"");
            } else if (fieldValue instanceof Number || fieldValue instanceof Boolean) {
                json.append(fieldValue);
            } else if (fieldValue == null) {
                json.append("null");
            } else {
                // Recursively convert nested objects
                json.append(toJson(fieldValue));
            }

            // Add a comma if this is not the last field
            if (i < fields.length - 1) {
                json.append(",");
            }
        }

        json.append("}");
        return json.toString();
    }
}
