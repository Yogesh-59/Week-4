package org.javaRegex.replaceAndModifyStrings;

public class Main {
    public static void main(String[] args) {
        String text="This  is   an example  with multiple  spaces.";
        ReplaceAndModifyString replace=new ReplaceAndModifyString();
        System.out.println(replace.replaceAndModify(text));
    }
}
