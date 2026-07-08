package com.example.util;

public class StringUtil {
    public static String reverseLetters(String str) {
        char[] symbol = str.toCharArray();
        int left = 0;
        int right = symbol.length - 1;

        while (left < right) {
            if (!Character.isLetter(symbol[left])) {
                left++;
            } else if (!Character.isLetter(symbol[right])) {
                right--;
            } else {
                char temp = symbol[left];
                symbol[left] = symbol[right];
                symbol[right] = temp;
                left++;
                right--;
            }

        }
        return new String(symbol);
    }
}
