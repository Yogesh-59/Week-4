package org.JUnitTest.testingDateFormatter;
import java.text.SimpleDateFormat;
import java.util.*;
import java.text.ParseException;

public class TestingDateFormatter {
    String formatDate(String inputDate) throws ParseException {
        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = inputFormat.parse(inputDate);
        return outputFormat.format(date);
    }
}
