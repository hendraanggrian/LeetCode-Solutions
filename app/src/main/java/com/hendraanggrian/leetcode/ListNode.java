package com.hendraanggrian.leetcode;

public interface ListNode<T> {
  int getValue();

  T getNext();

  void setNext(T node);

  default boolean hasNext() {
    return getNext() != null;
  }
}
