package org.javaRegex.extractDates;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        DateExtractor extractor=new DateExtractor();
        String date="The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        System.out.println(extractor.dateExtractor(date));
    }
}
