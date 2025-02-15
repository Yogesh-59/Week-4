package org.javaRegex.findRepeatingWords;

public class Main {
    public static void main(String[] args) {
      String text="This is is a repeated repeated word test.";
      FindRepeatingWord find=new FindRepeatingWord();
        System.out.println(find.findWord(text));
    }
}
