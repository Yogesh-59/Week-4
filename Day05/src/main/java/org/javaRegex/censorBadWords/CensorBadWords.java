package org.javaRegex.censorBadWords;
import java.util.*;
public class CensorBadWords {
  public static String censorBadWord(String text){
      List<String> badWord=Arrays.asList("damn","stupid");
      String regex="\\b("+String.join("|",badWord)+")\\b";
      return text.replaceAll(regex,"****");

  }
}
