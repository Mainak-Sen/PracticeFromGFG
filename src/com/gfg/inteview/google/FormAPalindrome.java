package com.gfg.inteview.google;

import java.util.HashMap;
import java.util.Map;

public class FormAPalindrome {

    
    static int countMin(String str) {
        Map<Character, Integer> frequency = new HashMap<>();
        for (char c : str.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }

        int oddFrequencyCount = 0;
        for (int value : frequency.values()) {
            if (value % 2 != 0) {
                oddFrequencyCount++;
            }
        }

        return oddFrequencyCount - 1;
    }

    public static void main(String[] args) {

        System.out.println(countMin("abcd"));
    }
}
