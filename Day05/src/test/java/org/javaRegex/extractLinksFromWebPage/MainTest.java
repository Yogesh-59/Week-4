package org.javaRegex.extractLinksFromWebPage;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.javaRegex.extractLinksFromWebPage.ExtractLink.linkExtractor;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void test(){
        String text="Visit https://www.google.com and http://example.org for more info.";
        List<String> ans=new ArrayList<>();
        ans.add("https://www.google.com");
        ans.add("http://example.org");
        assertEquals(ans,linkExtractor( text),"Both are Equal");
    }

}