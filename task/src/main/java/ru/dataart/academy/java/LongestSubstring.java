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
        ArrayList<Integer> _listOfSizes = new ArrayList<>();

        for (char i : str) {
            if (_listOfLetters.contains(i)) {
                _listOfSizes.add(_listOfLetters.size());
                _listOfLetters.clear();
            }
            _listOfLetters.add(i);
        }
        _listOfSizes.add(_listOfLetters.size());

        for (int j = str.length - 1; j > 0; j--) {
            if (_listOfLetters.contains(str[j])) {
                _listOfSizes.add(_listOfLetters.size());
                _listOfLetters.clear();
            }
            _listOfLetters.add(str[j]);
        }
        _listOfSizes.add(_listOfLetters.size());
        return Collections.max(_listOfSizes);
    }
}
