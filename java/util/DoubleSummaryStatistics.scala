package java.util

import java.lang.Object
import java.util.function.DoubleConsumer

// A state object for collecting statistics such as count, min, max, sum, and
// average.
//
// This class is designed to work with (though does not require)
// streams. For example, you can compute
// summary statistics on a stream of doubles with:
//  
// DoubleSummaryStatistics stats = doubleStream.collect(DoubleSummaryStatistics::new,
//                                                      DoubleSummaryStatistics::accept,
//                                                      DoubleSummaryStatistics::combine);
// 
//
// DoubleSummaryStatistics can be used as a
// reduction
// target for a stream. For example:
//
//  
// DoubleSummaryStatistics stats = people.stream()
//     .collect(Collectors.summarizingDouble(Person::getWeight));
//
//
// This computes, in a single pass, the count of people, as well as the minimum,
// maximum, sum, and average of their weights.
class DoubleSummaryStatistics extends Object with DoubleConsumer {

    @stub
    // Records another value into the summary information.
    def accept(value: double): Unit = ???

    @stub
    // Combines the state of another DoubleSummaryStatistics into this
    // one.
    def combine(other: DoubleSummaryStatistics): Unit = ???

    @stub
    // Returns the arithmetic mean of values recorded, or zero if no
    // values have been recorded.
    def getAverage(): double = ???

    @stub
    // Return the count of values recorded.
    def getCount(): Long = ???

    @stub
    // Returns the maximum recorded value, Double.NaN if any recorded
    // value was NaN or Double.NEGATIVE_INFINITY if no values were
    // recorded.
    def getMax(): double = ???

    @stub
    // Returns the minimum recorded value, Double.NaN if any recorded
    // value was NaN or Double.POSITIVE_INFINITY if no values were
    // recorded.
    def getMin(): double = ???

    @stub
    // Returns the sum of values recorded, or zero if no values have been
    // recorded.
    def getSum(): double = ???
}
