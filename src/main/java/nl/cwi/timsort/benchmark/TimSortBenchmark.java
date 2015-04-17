package nl.cwi.timsort.benchmark;

import java.util.Comparator;
import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;

@Fork(1)
// @BenchmarkMode({Mode.Throughput, Mode.SampleTime})
@BenchmarkMode({Mode.SampleTime})
@Warmup(iterations = 32, time = 64, timeUnit = TimeUnit.MILLISECONDS)
@Measurement(iterations = 10, time = 5, timeUnit = TimeUnit.SECONDS)
@State(Scope.Benchmark)
public class TimSortBenchmark {
    private static final Comparator<Object> NATURAL_ORDER =
            new Comparator<Object>() {
                @SuppressWarnings("unchecked")
                public int compare(Object first, Object second) {
                    return ((Comparable<Object>)first).compareTo(second);
                }
            };
            
  Object[] data;
  
  private static final int LENGTH=1000000;

  /*
  @Setup
  public void setUp() {
    // Prepare your target array
	  data = ArrayBuilder.RANDOM_BIGINT.build(LENGTH);
	  System.out.println("setup");
  }*/

  /** Stijnsort benchmarks */
/*
  @Benchmark
  public void stijnsort_RANDOM_INT() {
	  data = ArrayBuilder.RANDOM_INT.build(LENGTH);
	  StijnSort.sort(data, NATURAL_ORDER);
  }

  @Benchmark
  public void stijnsort_DESCENDING_INT() {
	  data = ArrayBuilder.DESCENDING_INT.build(LENGTH);
	  StijnSort.sort(data, NATURAL_ORDER);
  }
*/
  @Benchmark
  public void stijnsort_ASCENDING_INT() {
	  data = ArrayBuilder.ASCENDING_INT.build(LENGTH);
	  StijnSort.sort(data, NATURAL_ORDER);
  }
/*
  @Benchmark
  public void stijnsort_ASCENDING_3_RND_EXCH_INT() {
	  data = ArrayBuilder.ASCENDING_3_RND_EXCH_INT.build(LENGTH);
	  StijnSort.sort(data, NATURAL_ORDER);
  }

  @Benchmark
  public void stijnsort_ASCENDING_10_RND_AT_END_INT() {
	  data = ArrayBuilder.DESCENDING_INT.build(LENGTH);
	  StijnSort.sort(data, NATURAL_ORDER);
  }

  @Benchmark
  public void stijnsort_ALL_EQUAL_INT() {
	  data = ArrayBuilder.ALL_EQUAL_INT.build(LENGTH);
	  StijnSort.sort(data, NATURAL_ORDER);
  }

  @Benchmark
  public void stijnsort_DUPS_GALORE_INT() {
	  data = ArrayBuilder.DUPS_GALORE_INT.build(LENGTH);
	  StijnSort.sort(data, NATURAL_ORDER);
  }

  @Benchmark
  public void stijnsort_RANDOM_WITH_DUPS_INT() {
	  data = ArrayBuilder.RANDOM_WITH_DUPS_INT.build(LENGTH);
	  StijnSort.sort(data, NATURAL_ORDER);
  }

  @Benchmark
  public void stijnsort_PSEUDO_ASCENDING_STRING() {
	  data = ArrayBuilder.PSEUDO_ASCENDING_STRING.build(LENGTH);
	  StijnSort.sort(data, NATURAL_ORDER);
  }

  @Benchmark
  public void stijnsort_RANDOM_BIGINT() {
	  data = ArrayBuilder.RANDOM_BIGINT.build(LENGTH);
	  StijnSort.sort(data, NATURAL_ORDER);
  }
  @Benchmark
  public void stijnsort_WORST_CASE() {
	  data = ArrayBuilder.WORST_CASE.build(LENGTH);
	  StijnSort.sort(data, NATURAL_ORDER);
  }
*/
  
  
  
  
  
  
  

  /** Timsort benchmarks */
/*
  @Benchmark
  public void timsort_RANDOM_INT() {
	  data = ArrayBuilder.RANDOM_INT.build(LENGTH);
	  TimSort.sort(data, NATURAL_ORDER);
  }

  @Benchmark
  public void timsort_DESCENDING_INT() {
	  data = ArrayBuilder.DESCENDING_INT.build(LENGTH);
	  TimSort.sort(data, NATURAL_ORDER);
  }
*/
  @Benchmark
  public void timsort_ASCENDING_INT() {
	  data = ArrayBuilder.ASCENDING_INT.build(LENGTH);
	  TimSort.sort(data, NATURAL_ORDER);
  }
/*
  @Benchmark
  public void timsort_ASCENDING_3_RND_EXCH_INT() {
	  data = ArrayBuilder.ASCENDING_3_RND_EXCH_INT.build(LENGTH);
	  TimSort.sort(data, NATURAL_ORDER);
  }

  @Benchmark
  public void timsort_ASCENDING_10_RND_AT_END_INT() {
	  data = ArrayBuilder.DESCENDING_INT.build(LENGTH);
	  TimSort.sort(data, NATURAL_ORDER);
  }

  @Benchmark
  public void timsort_ALL_EQUAL_INT() {
	  data = ArrayBuilder.ALL_EQUAL_INT.build(LENGTH);
	  TimSort.sort(data, NATURAL_ORDER);
  }

  @Benchmark
  public void timsort_DUPS_GALORE_INT() {
	  data = ArrayBuilder.DUPS_GALORE_INT.build(LENGTH);
	  TimSort.sort(data, NATURAL_ORDER);
  }

  @Benchmark
  public void timsort_RANDOM_WITH_DUPS_INT() {
	  data = ArrayBuilder.RANDOM_WITH_DUPS_INT.build(LENGTH);
	  TimSort.sort(data, NATURAL_ORDER);
  }

  @Benchmark
  public void timsort_PSEUDO_ASCENDING_STRING() {
	  data = ArrayBuilder.PSEUDO_ASCENDING_STRING.build(LENGTH);
	  TimSort.sort(data, NATURAL_ORDER);
  }

  @Benchmark
  public void timsort_RANDOM_BIGINT() {
	  data = ArrayBuilder.RANDOM_BIGINT.build(LENGTH);
	  TimSort.sort(data, NATURAL_ORDER);
  }
  @Benchmark
  public void timsort_WORST_CASE() {
	  data = ArrayBuilder.WORST_CASE.build(LENGTH);
	  TimSort.sort(data, NATURAL_ORDER);
  }
*/

}
