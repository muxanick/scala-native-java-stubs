package java.util

import java.lang.Object
import java.util.function.IntConsumer

/** A state object for collecting statistics such as count, min, max, sum, and
 *  average.
 * 
 *  This class is designed to work with (though does not require)
 *  streams. For example, you can compute
 *  summary statistics on a stream of ints with:
 *   
 *  IntSummaryStatistics stats = intStream.collect(IntSummaryStatistics::new,
 *                                                 IntSummaryStatistics::accept,
 *                                                 IntSummaryStatistics::combine);
 *  
 * 
 *  IntSummaryStatistics can be used as a
 *  reduction
 *  target for a stream. For example:
 * 
 *   
 *  IntSummaryStatistics stats = people.stream()
 *                                     .collect(Collectors.summarizingInt(Person::getDependents));
 * 
 * 
 *  This computes, in a single pass, the count of people, as well as the minimum,
 *  maximum, sum, and average of their number of dependents.
 */
class IntSummaryStatistics extends Object with IntConsumer {

    /** Records a new value into the summary information */
    @stub
    def accept(value: Int): Unit = ???

    /** Combines the state of another IntSummaryStatistics into this one. */
    @stub
    def combine(other: IntSummaryStatistics): Unit = ???

    /** Returns the arithmetic mean of values recorded, or zero if no values have been
     *  recorded.
     */
    @stub
    def getAverage(): Double = ???

    /** Returns the count of values recorded. */
    @stub
    def getCount(): Long = ???

    /** Returns the maximum value recorded, or Integer.MIN_VALUE if no
     *  values have been recorded.
     */
    @stub
    def getMax(): Int = ???

    /** Returns the minimum value recorded, or Integer.MAX_VALUE if no
     *  values have been recorded.
     */
    @stub
    def getMin(): Int = ???

    /** Returns the sum of values recorded, or zero if no values have been
     *  recorded.
     */
    @stub
    def getSum(): Long = ???
}
