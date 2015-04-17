package nl.cwi.timsort.benchmark;

import java.util.Comparator;

import org.openjdk.jmh.annotations.Setup;

public abstract class AbstractBenchmark {

  protected static final Comparator<Object> NATURAL_ORDER = new Comparator<Object>() {
    @SuppressWarnings("unchecked")
    public int compare(Object first, Object second) {
      return ((Comparable<Object>) first).compareTo(second);
    }
  };

  protected static final int LENGTH = 1000000;

  protected Object[] rawData;
  protected Object[] data;

  @Setup
  public void setUp() {
    rawData = getBuilderType().build(LENGTH);
  }

  protected void copyData() {
    data = new Object[rawData.length];
    System.arraycopy(rawData, 0, data, 0, rawData.length);
  }

  protected abstract ArrayBuilder getBuilderType();
}
