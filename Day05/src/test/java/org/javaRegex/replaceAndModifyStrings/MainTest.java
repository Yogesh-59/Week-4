package org.javaRegex.replaceAndModifyStrings;

import org.junit.jupiter.api.Test;

import static org.javaRegex.replaceAndModifyStrings.ReplaceAndModifyString.replaceAndModify;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void test(){
        String text="This  is   an example  with multiple  spaces.";
        String ans="This is an example with multiple spaces.";
        assertEquals(ans,replaceAndModify(text),"The test is passed");
    }

}