package com.hendraanggrian.leetcode.problems;

import static com.google.common.truth.Truth.assertThat;

import com.hendraanggrian.leetcode.ProblemTest;
import org.junit.Test;

public class LongestSubstringWithoutRepeatingCharactersTest
    extends ProblemTest<LongestSubstringWithoutRepeatingCharacters> {
  @Override
  public LongestSubstringWithoutRepeatingCharacters[] getSolutions() {
    return LongestSubstringWithoutRepeatingCharacters.values();
  }

  @Test
  public void example1() {
    forEachSolutions(solution ->
        assertThat(solution.lengthOfLongestSubstring("abcabcbb")).isEqualTo(3));
  }

  @Test
  public void example2() {
    forEachSolutions(solution ->
        assertThat(solution.lengthOfLongestSubstring("bbbbb")).isEqualTo(1));
  }

  @Test
  public void example3() {
    forEachSolutions(solution ->
        assertThat(solution.lengthOfLongestSubstring("pwwkew")).isEqualTo(3));
  }
}
