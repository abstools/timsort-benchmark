#!/bin/bash

# Build and run the benchmarch
# Make sure you have Java available in PATH

mvn clean install
cd target
java -jar timsort-benchmark-standalone.jar
