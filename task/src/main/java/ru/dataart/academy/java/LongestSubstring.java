package ru.dataart.academy.java;

import java.util.ArrayList;

public class LongestSubstring {
    /**
     * @param checkString - input string to check
     * @return - length of max substring without repeatable characters
     * Example: dnmdncbb  -> 5 (mdncb)
     * amam -> 2 (am)
     */

    public int getLengthOfLongestSubstring(String checkString) {
        char[] str = checkString.toCharArray();
        ArrayList<Character> _listOfLetters = new ArrayList<>();
        for (char item : str) {
            if (!_listOfLetters.contains(item)) _listOfLetters.add(item);
        }
        return _listOfLetters.size();
    }
}
