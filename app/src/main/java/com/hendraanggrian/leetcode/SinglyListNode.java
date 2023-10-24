package com.hendraanggrian.leetcode;

import java.util.Iterator;

public class SinglyListNode implements ListNode<SinglyListNode>, Iterable<SinglyListNode> {
  private final int val;
  private SinglyListNode next;

  public SinglyListNode(int value) {
    val = value;
  }

  @Override
  public int getValue() {
    return val;
  }

  @Override
  public SinglyListNode getNext() {
    return next;
  }

  @Override
  public void setNext(SinglyListNode node) {
    next = node;
  }

  @Override
  public Iterator<SinglyListNode> iterator() {
    return new ListNodeIterator<>(this);
  }

  public static SinglyListNode of(int... values) {
    if (values.length == 0) {
      throw new IllegalArgumentException("Can't be empty.");
    }
    SinglyListNode head = new SinglyListNode(values[0]);
    SinglyListNode next = head;
    for (int i = 1; i < values.length; i++) {
      next.setNext(new SinglyListNode(values[i]));
      next = next.getNext();
    }
    return head;
  }
}
