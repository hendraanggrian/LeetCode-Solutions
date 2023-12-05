package com.hendraanggrian.leetcode.problems;

import static com.google.common.truth.Truth.assertThat;

import com.hendraanggrian.leetcode.ProblemTest;
import org.junit.Test;

public class PalindromeNumberTest extends ProblemTest<PalindromeNumber> {
  @Override
  public PalindromeNumber[] getSolutions() {
    return PalindromeNumber.values();
  }

  @Test
  public void example1() {
    forEachSolutions(solution -> assertThat(solution.isPalindrome(121)).isTrue());
  }

  @Test
  public void example2() {
    forEachSolutions(solution -> assertThat(solution.isPalindrome(-121)).isFalse());
  }

  @Test
  public void example3() {
    forEachSolutions(solution -> assertThat(solution.isPalindrome(10)).isFalse());
  }
}
