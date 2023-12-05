package com.hendraanggrian.leetcode.problems;

import static com.google.common.truth.Truth.assertThat;

import com.google.common.collect.Iterables;
import com.hendraanggrian.leetcode.ProblemTest;
import com.hendraanggrian.leetcode.SinglyListNode;
import org.junit.Test;

public class LinkedListCycleTest extends ProblemTest<LinkedListCycle> {
  @Override
  public LinkedListCycle[] getSolutions() {
    return LinkedListCycle.values();
  }

  @Test
  public void example1() {
    forEachSolutions(solution -> {
      SinglyListNode node = SinglyListNode.of(3, 2, 0, -4);
      Iterables.getLast(node).setNext(Iterables.get(node, 1));
      assertThat(solution.hasCycle(node)).isTrue();
    });
  }

  @Test
  public void example2() {
    forEachSolutions(solution -> {
      SinglyListNode node = SinglyListNode.of(1, 2);
      Iterables.getLast(node).setNext(Iterables.get(node, 0));
      assertThat(solution.hasCycle(node)).isTrue();
    });
  }

  @Test
  public void example3() {
    forEachSolutions(solution -> {
      SinglyListNode node = new SinglyListNode(1);
      assertThat(solution.hasCycle(node)).isFalse();
    });
  }
}
