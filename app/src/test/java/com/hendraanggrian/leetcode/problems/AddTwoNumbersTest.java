package com.hendraanggrian.leetcode.problems;

import static com.google.common.truth.Truth.assertThat;

import com.hendraanggrian.leetcode.ProblemTest;
import com.hendraanggrian.leetcode.SinglyListNode;
import org.junit.Test;

public class AddTwoNumbersTest extends ProblemTest<AddTwoNumbers> {
  @Override
  public AddTwoNumbers[] getSolutions() {
    return AddTwoNumbers.values();
  }

  @Test
  public void example1() {
    forEachSolutions(solution ->
        assertThat(solution.addTwoNumbers(
            SinglyListNode.of(2, 4, 3),
            SinglyListNode.of(5, 6, 4)
        )).isEqualTo(SinglyListNode.of(7, 0, 8)));
  }

  @Test
  public void example2() {
    forEachSolutions(solution ->
        assertThat(solution.addTwoNumbers(
            SinglyListNode.ZERO,
            SinglyListNode.ZERO
        )).isEqualTo(SinglyListNode.ZERO));
  }

  @Test
  public void example3() {
    forEachSolutions(solution ->
        assertThat(solution.addTwoNumbers(
            SinglyListNode.of(9, 9, 9, 9, 9, 9, 9),
            SinglyListNode.of(9, 9, 9, 9)
        )).isEqualTo(SinglyListNode.of(8, 9, 9, 9, 0, 0, 0, 1)));
  }
}
