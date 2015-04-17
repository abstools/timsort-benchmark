# TimSort Benchmark

## Setup

This is how I created the project:

```bash
$ mvn archetype:generate -DinteractiveMode=false -DarchetypeGroupId=org.openjdk.jmh -DarchetypeArtifactId=jmh-java-benchmark-archetype -DgroupId=nl.cwi.timsort.benchmark -DartifactId=timsort-benchmark -Dversion=1.0
```

Then prepared the project to be loaded in eclipse by:

```bash
$ cd timsort-benchmark
$ mvn eclipse:eclipse -DdownloadSources=true
```

Now, it's ready to be imported into eclipse.

## Develop

Just have a look at the class `TimSortBenchmark`. 

## Run

Simply run the benchmark by:

```bash
$ ./run.sh
```
