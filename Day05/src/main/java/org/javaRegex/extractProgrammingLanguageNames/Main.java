package org.javaRegex.extractProgrammingLanguageNames;

public class Main {
    public static void main(String[] args) {
        String text="I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        ExtractProLangNames name=new ExtractProLangNames();
        System.out.println(name.extractProLang(text));
    }
}
