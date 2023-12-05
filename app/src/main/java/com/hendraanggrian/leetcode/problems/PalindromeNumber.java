package com.hendraanggrian.leetcode.problems;

import com.hendraanggrian.leetcode.tags.TwoPointers;

/**
 * <a href="https://leetcode.com/problems/palindrome-number/">See problem</a>.
 */
enum PalindromeNumber {
  BRUTE_FORCE {
    @Override
    boolean isPalindrome(int x) {
      final String s = String.valueOf(x);
      return s.contentEquals(new StringBuilder(s).reverse());
    }
  },
  @TwoPointers
  CHECK_HALF {
    @Override
    boolean isPalindrome(int x) {
      final String s = String.valueOf(x);
      int start = 0;
      int end = s.length() - 1;
      while (start < end) {
        if (s.charAt(start) != s.charAt(end)) {
          return false;
        }
        start++;
        end--;
      }
      return true;
    }
  };

  abstract boolean isPalindrome(int x);
}
