package org.JUnitTest.testingParameterized;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class testingParameterizedTest {
    public NumberUtils numberUtils = new NumberUtils();
    @Test
    void testIsEven() {
        int []number={2, 4, 6, 7, 9};
        for(int num:number) {
            boolean expected = (num % 2 == 0);
            assertEquals(expected, numberUtils.isEven(num));
        }
    }

}