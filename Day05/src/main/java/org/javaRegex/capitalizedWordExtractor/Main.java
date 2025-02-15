package org.javaRegex.capitalizedWordExtractor;

public class Main {
    public static void main(String[] args) {
        CapitalizedWords capital=new CapitalizedWords();
        String text="The Eiffel Tower Is In Paris And the Statue of Liberty is in New York.";
        System.out.println(capital.extractCapitalizedWords(text));
    }
}
