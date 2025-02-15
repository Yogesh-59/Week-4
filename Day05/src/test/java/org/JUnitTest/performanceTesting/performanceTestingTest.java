package org.JUnitTest.performanceTesting;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
class performanceTestingTest {
    public NumberUtils numberUtils = new NumberUtils();

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 7, 9})
    void testIsEven(int number) {
        boolean expected = (number % 2 == 0);
        assertEquals(expected, numberUtils.isEven(number));
    }

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    void testLongRunningTask() throws InterruptedException {
        numberUtils.longRunningTask();
    }
}