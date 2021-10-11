package ru.dataart.academy.java;

import java.util.stream.IntStream;

public class TwoSums {
    /**
     * @param nums   - sorted in ascending order array of integer values >=0
     * @param target - integer value >= 0
     * @return - array of two numbers from nums which sum equals to target
     * Example: nums = [1, 4, 6, 7, 10], target = 10
     * Result - [4, 6]
     * Example: nums = [1, 4, 6, 7, 10], target = 2
     * Result - []
     */
    public int[] getTwoSum(int[] nums, int target) {
        for (int i : nums) {
            int diff = target - i;
            if (IntStream.of(nums).anyMatch(x -> x == diff)) {
                return new int[]{i, diff};
            }
            if(diff + i > target) return new int[0];
        }
        return new int [0];
    }
}
