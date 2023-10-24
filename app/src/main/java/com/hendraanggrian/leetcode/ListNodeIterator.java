package com.hendraanggrian.leetcode;

import java.util.Iterator;

public class ListNodeIterator<T extends ListNode<T>> implements Iterator<T> {
  private T curr;

  ListNodeIterator(T node) {
    curr = node;
  }

  @Override
  public boolean hasNext() {
    return curr != null;
  }

  @Override
  public T next() {
    T temp = curr;
    curr = curr.getNext();
    return temp;
  }
}
