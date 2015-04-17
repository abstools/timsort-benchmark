package nl.cwi.timsort.benchmark;

import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;

@Fork(1)
@BenchmarkMode({Mode.Throughput})
@Warmup(iterations = 32, time = 64, timeUnit = TimeUnit.MILLISECONDS)
@Measurement(iterations = 10, time = 5, timeUnit = TimeUnit.SECONDS)
@State(Scope.Benchmark)
public class TimSortBenchmarkPsuedoAscendingString extends AbstractBenchmark {

  @Benchmark
  public void timsortPsuedoAscendingString() {
    copyData();
    TimSort.sort(data, NATURAL_ORDER);
  }

  @Override
  protected ArrayBuilder getBuilderType() {
    return ArrayBuilder.PSEUDO_ASCENDING_STRING;
  }
}
