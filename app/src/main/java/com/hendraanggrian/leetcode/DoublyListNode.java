package com.hendraanggrian.leetcode;

import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public final class DoublyListNode extends ListNode<DoublyListNode>
    implements Iterable<DoublyListNode> {
  private final int val;
  private DoublyListNode prev;
  private DoublyListNode next;

  public DoublyListNode() {
    val = 0;
  }

  public DoublyListNode(int value) {
    val = value;
  }

  @Override
  public int getValue() {
    return val;
  }

  public DoublyListNode getPrevious() {
    return prev;
  }

  public void setPrevious(DoublyListNode node) {
    prev = node;
  }

  @Override
  public DoublyListNode getNext() {
    return next;
  }

  @Override
  public void setNext(DoublyListNode node) {
    next = node;
  }

  @Override
  public Iterator<DoublyListNode> iterator() {
    return new ListNodeIterator<>(this);
  }

  public Stream<DoublyListNode> stream() {
    return StreamSupport.stream(spliterator(), false);
  }

  public static DoublyListNode asDoubly(int... values) {
    if (values.length == 0) {
      throw new IllegalArgumentException("Can't be empty.");
    }
    DoublyListNode head = new DoublyListNode(values[0]);
    DoublyListNode prev = null;
    DoublyListNode next = head;
    for (int i = 1; i < values.length; i++) {
      DoublyListNode temp = next;

      next.setPrevious(prev);
      next.setNext(new DoublyListNode(values[i]));
      next = next.getNext();

      prev = temp;
    }
    return head;
  }
}
