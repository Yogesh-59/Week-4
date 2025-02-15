package org.javaRegex.extractProgrammingLanguageNames;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractProLangNames {
    public static List<String> extractProLang(String text) {
        List<String> language = new ArrayList<>();
        String regex = "\\b(Java|Python|JavaScript|Go|C|C#|Ruby|Swift|Kotlin|Rust|PHP|TypeScript)\\b";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);

        while(m.find()){
            language.add(m.group());
        }
        return language;
    }
}
