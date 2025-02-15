package org.javaRegex.extractLinksFromWebPage;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ExtractLink extract=new ExtractLink();
        String text="Visit https://www.google.com and http://example.org for more info.";
        System.out.println(extract.linkExtractor(text));
    }
}
