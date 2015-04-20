package nl.cwi.timsort.benchmark;

import org.openjdk.jmh.results.format.ResultFormatType;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.ChainedOptionsBuilder;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class Main {

  public static void main(String[] args) throws RunnerException, InterruptedException {
    Class<?>[] classes =
        new Class[] {

        // First default Java ones
        TimSortBenchmarkAllEqualInt.class,
        TimSortBenchmarkAscending10RndAtEndInt.class,
        TimSortBenchmarkAscending3RndExchInt.class,
        TimSortBenchmarkAscendingInt.class,
        TimSortBenchmarkDescendingInt.class,
        TimSortBenchmarkDupsGaloreInt.class,
        TimSortBenchmarkPsuedoAscendingString.class,
        TimSortBenchmarkRandomBigInt.class,
        TimSortBenchmarkRandomInt.class,
        TimSortBenchmarkRandomWithDupsInt.class,
        TimSortBenchmarkWorstCase.class,

        // Then Stijn's work
        StijnSortBenchmarkAllEqualInt.class,
        StijnSortBenchmarkAscending10RndAtEndInt.class,
        StijnSortBenchmarkAscending3RndExchInt.class,
        StijnSortBenchmarkAscendingInt.class,
        StijnSortBenchmarkDescendingInt.class,
        StijnSortBenchmarkDupsGaloreInt.class,
        StijnSortBenchmarkPsuedoAscendingString.class,
        StijnSortBenchmarkRandomBigInt.class,
        StijnSortBenchmarkRandomInt.class,
        StijnSortBenchmarkRandomWithDupsInt.class,
        StijnSortBenchmarkWorstCase.class
        };

    for (Class<?> clazz : classes) {
      String benchmarkName = clazz.getSimpleName();
      ChainedOptionsBuilder ob = new OptionsBuilder().include(benchmarkName)
          .resultFormat(ResultFormatType.CSV).result("/tmp/" + benchmarkName + ".csv");
      new Runner(ob.build()).run();

      System.out.println();
      System.out.println("===");
      System.out.println("=== Benchmark done: " + benchmarkName);
      System.out.println("===");
      System.out.println();

      Thread.sleep(5 * 1000);
    }
  }

}
