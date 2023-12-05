package com.hendraanggrian.leetcode.problems;

import static com.google.common.truth.Truth.assertThat;

import com.hendraanggrian.leetcode.ProblemTest;
import org.junit.Test;

public class TwoSumTest extends ProblemTest<TwoSum> {
  @Override
  public TwoSum[] getSolutions() {
    return TwoSum.values();
  }

  @Test
  public void example1() {
    forEachSolutions(solution ->
        assertThat(solution.twoSum(new int[]{2, 7, 11, 15}, 9)).asList().containsExactly(0, 1));
  }

  @Test
  public void example2() {
    forEachSolutions(solution ->
        assertThat(solution.twoSum(new int[]{3, 2, 4}, 6)).asList().containsExactly(1, 2));
  }

  @Test
  public void example3() {
    forEachSolutions(solution ->
        assertThat(solution.twoSum(new int[]{3, 3}, 6)).asList().containsExactly(0, 1));
  }
}
