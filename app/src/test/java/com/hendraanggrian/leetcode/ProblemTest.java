package com.hendraanggrian.leetcode;

import java.util.function.Consumer;

public abstract class ProblemTest<E extends Enum<E>> {
  public abstract E[] getSolutions();

  public void forEachSolutions(Consumer<E> action) {
    for (E solution : getSolutions()) {
      action.accept(solution);
    }
  }
}
