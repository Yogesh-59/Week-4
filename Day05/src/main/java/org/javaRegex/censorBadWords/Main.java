package org.javaRegex.censorBadWords;

public class Main {
    public static void main(String[] args) {
        String text="This is a damn bad example with some stupid words.";
        CensorBadWords badWord=new CensorBadWords();
        System.out.println(badWord.censorBadWord(text));
    }
}
