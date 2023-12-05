package com.hendraanggrian.leetcode.problems;

import com.hendraanggrian.leetcode.SinglyListNode;
import com.hendraanggrian.leetcode.tags.FastSlow;
import com.hendraanggrian.leetcode.tags.Memoization;
import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/linked-list-cycle/">See problem</a>.
 */
enum LinkedListCycle {
  @Memoization
  BRUTE_FORCE {
    @Override
    boolean hasCycle(SinglyListNode head) {
      // visited nodes
      final Set<SinglyListNode> visits = new HashSet<>();

      for (SinglyListNode node : head) {
        if (!visits.add(node)) {
          return true;
        }
      }
      return false;
    }
  },
  @FastSlow
  OVERLAPPING {
    @Override
    boolean hasCycle(SinglyListNode head) {
      if (head == null || !head.hasNext()) {
        return false;
      }
      SinglyListNode slow = head.getNext();
      SinglyListNode fast = head.getNext().getNext();
      while (fast != null && fast.hasNext() && slow != fast) {
        slow = slow.getNext();
        fast = fast.getNext().getNext();
      }
      return slow == fast;
    }
  };

  abstract boolean hasCycle(SinglyListNode head);
}
