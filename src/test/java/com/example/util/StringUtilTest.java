package com.example.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class StringUtilTest {


    @Test
    public void returnEmptyStringWhenInputIsEmpty() {
        //Arrange

        String input = "";
        String expected = "";


        // Act
        String actual = StringUtil.reverseLetters(input);

        // Assert
        assertEquals(actual, expected);
    }

    @Test
    public void returnOneCharWhenInputIsChar(){
        String input = "A";
        String expected = "A";

        String actual = StringUtil.reverseLetters(input);

        assertEquals(expected, actual);
    }

    @Test
    public void returnTwoCharWhenInputIsChar(){
        String input = "AB";
        String expected = "BA";

        String actual = StringUtil.reverseLetters(input);

        assertEquals(expected, actual);
    }

    @Test
    public void returnCharAndSpace(){
        String input = "A V";
        String expected = "V A";

        String result = StringUtil.reverseLetters(input);

        assertEquals(expected, result);
    }

    @Test
    public void returnCharAndSymbol(){
        String print = "A1B";
        String output = "B1A";

        String result = StringUtil.reverseLetters(print);

        assertEquals(output, result);
    }



    @Test
    public void returnSymbolWhenNotChar(){
        String input = "@@@@";
        String output = "@@@@";

        String result = StringUtil.reverseLetters(input);

        assertEquals(output, result);
    }


    @Test
    public void returnSymbol() {
        String input = "W@S@S@$";
        String output = "S@S@W@$";

        String result = StringUtil.reverseLetters(input);

        assertEquals(output, result);
    }


    @Test
    public void returnOddChar(){
        String input = "ADC";
        String output = "CDA";

        String result = StringUtil.reverseLetters(input);

        assertEquals(output, result, "ТРУ");
    }
}
