package com.hendraanggrian.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/two-sum/">See problem</a>
 */
enum TwoSum {
  BRUTE_FORCE {
    @Override
    int[] twoSum(int[] nums, int target) {
      for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
          if (nums[j] == target - nums[i]) {
            return new int[]{i, j};
          }
        }
      }
      return null;
    }
  },
  DYNAMIC_PROGRAMMING {
    @Override
    int[] twoSum(int[] nums, int target) {
      Map<Integer, Integer> map = new HashMap<>();
      int index = -1;
      for (int i = 0; i < nums.length; i++) {
        if (!map.containsKey(nums[i])) {
          map.put(target - nums[i], i);
        } else {
          index = i;
          break;
        }
      }
      return new int[]{map.get(nums[index]), index};
    }
  };

  abstract int[] twoSum(int[] nums, int target);
}
