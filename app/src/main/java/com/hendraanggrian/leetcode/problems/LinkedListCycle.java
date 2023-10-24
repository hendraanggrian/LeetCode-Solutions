package com.hendraanggrian.leetcode.problems;

import com.hendraanggrian.leetcode.SinglyListNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/linked-list-cycle/">See problem</a>
 */
enum LinkedListCycle {
  BRUTE_FORCE {
    @Override
    boolean hasCycle(SinglyListNode head) {
      Set<SinglyListNode> set = new HashSet<>();
      SinglyListNode curr = head;
      while (curr != null) {
        if (!set.add(curr)) {
          return true;
        }
        curr = curr.getNext();
      }
      return false;
    }
  },
  TWO_POINTERS {
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
