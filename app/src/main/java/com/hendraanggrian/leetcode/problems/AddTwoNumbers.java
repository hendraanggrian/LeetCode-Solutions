package com.hendraanggrian.leetcode.problems;

import com.hendraanggrian.leetcode.SinglyListNode;
import com.hendraanggrian.leetcode.tags.TwoPointers;

/**
 * <a href="https://leetcode.com/problems/add-two-numbers/">See problem</a>.
 */
enum AddTwoNumbers {
  @TwoPointers
  DEFAULT {
    @Override
    public SinglyListNode addTwoNumbers(SinglyListNode l1, SinglyListNode l2) {
      final SinglyListNode dummy = new SinglyListNode();
      SinglyListNode next1 = l1;
      SinglyListNode next2 = l2;
      SinglyListNode curr = dummy;
      int carry = 0;
      while (next1 != null || next2 != null) {
        // calculate total and carry
        int val = carry;
        if (next1 != null) {
          val += next1.getValue();
          next1 = next1.getNext();
        }
        if (next2 != null) {
          val += next2.getValue();
          next2 = next2.getNext();
        }
        carry = val / 10;

        // create list
        curr.setNext(new SinglyListNode(val % 10));
        curr = curr.getNext();
      }
      // create remaining carry
      if (carry > 0) {
        curr.setNext(new SinglyListNode(carry));
      }
      return dummy.getNext();
    }
  };

  public abstract SinglyListNode addTwoNumbers(SinglyListNode l1, SinglyListNode l2);
}
