package com.hendraanggrian.leetcode.problems;

import com.google.common.collect.Iterables;
import com.hendraanggrian.leetcode.SinglyListNode;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LinkedListCycleTest {
  @Test
  public void example1() {
    for (LinkedListCycle solution : LinkedListCycle.values()) {
      SinglyListNode node = SinglyListNode.of(3, 2, 0, -4);
      Iterables.getLast(node).setNext(Iterables.get(node, 1));
      assertTrue(solution.hasCycle(node));
    }
  }

  @Test
  public void example2() {
    for (LinkedListCycle solution : LinkedListCycle.values()) {
      SinglyListNode node = SinglyListNode.of(1, 2);
      Iterables.getLast(node).setNext(Iterables.get(node, 0));
      assertTrue(solution.hasCycle(node));
    }
  }

  @Test
  public void example3() {
    for (LinkedListCycle solution : LinkedListCycle.values()) {
      SinglyListNode node = SinglyListNode.of(1);
      assertFalse(solution.hasCycle(node));
    }
  }
}
