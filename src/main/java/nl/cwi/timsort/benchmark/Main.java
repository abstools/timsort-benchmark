package nl.cwi.timsort.benchmark;

import org.openjdk.jmh.results.format.ResultFormatType;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.ChainedOptionsBuilder;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class Main {

  public static void main(String[] args) throws RunnerException {
    ChainedOptionsBuilder ob = new OptionsBuilder().include(TimSortBenchmark.class.getSimpleName())
        .resultFormat(ResultFormatType.CSV)
        .result("/tmp/timsort-" + (System.currentTimeMillis() / 1000) + ".csv");
    new Runner(ob.build()).run();
  }

}
