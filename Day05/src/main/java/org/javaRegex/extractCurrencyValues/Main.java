package org.javaRegex.extractCurrencyValues;

import static org.javaRegex.extractCurrencyValues.ExtractCurrencyValue.currencyValue;

public class Main {
    public static void main(String[] args) {
        String text="The price is $45.99, and the discount is 10.50.";
        ExtractCurrencyValue value=new ExtractCurrencyValue();
        System.out.println(currencyValue(text));
    }
}
