package com.hendraanggrian.leetcode.problems;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class TwoSumTest {
  @Test
  public void example1() {
    for (TwoSum solution : TwoSum.values()) {
      assertThat(solution.twoSum(new int[]{2, 7, 11, 15}, 9)).asList().containsExactly(0, 1);
    }
  }

  @Test
  public void example2() {
    for (TwoSum solution : TwoSum.values()) {
      assertThat(solution.twoSum(new int[]{3, 2, 4}, 6)).asList().containsExactly(1, 2);
    }
  }

  @Test
  public void example3() {
    for (TwoSum solution : TwoSum.values()) {
      assertThat(solution.twoSum(new int[]{3, 3}, 6)).asList().containsExactly(0, 1);
    }
  }
}
