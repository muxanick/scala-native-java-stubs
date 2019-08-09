package java.util

import java.lang.Object
import java.util.function.{IntConsumer, LongConsumer}

/** A state object for collecting statistics such as count, min, max, sum, and
 *  average.
 * 
 *  This class is designed to work with (though does not require)
 *  streams. For example, you can compute
 *  summary statistics on a stream of longs with:
 *   
 *  LongSummaryStatistics stats = longStream.collect(LongSummaryStatistics::new,
 *                                                   LongSummaryStatistics::accept,
 *                                                   LongSummaryStatistics::combine);
 *  
 * 
 *  LongSummaryStatistics can be used as a
 *  Stream.collect(Collector) reduction}
 *  target for a stream. For example:
 * 
 *   
 *  LongSummaryStatistics stats = people.stream()
 *                                      .collect(Collectors.summarizingLong(Person::getAge));
 * 
 * 
 *  This computes, in a single pass, the count of people, as well as the minimum,
 *  maximum, sum, and average of their ages.
 */
class LongSummaryStatistics extends Object with LongConsumer with IntConsumer {

    /** Records a new int value into the summary information. */
    @stub
    def accept(value: Int): Unit = ???

    /** Records a new long value into the summary information. */
    @stub
    def accept(value: Long): Unit = ???

    /** Combines the state of another LongSummaryStatistics into this
     *  one.
     */
    @stub
    def combine(other: LongSummaryStatistics): Unit = ???

    /** Returns the arithmetic mean of values recorded, or zero if no values have been
     *  recorded.
     */
    @stub
    def getAverage(): Double = ???

    /** Returns the count of values recorded. */
    @stub
    def getCount(): Long = ???

    /** Returns the maximum value recorded, or Long.MIN_VALUE if no
     *  values have been recorded
     */
    @stub
    def getMax(): Long = ???

    /** Returns the minimum value recorded, or Long.MAX_VALUE if no
     *  values have been recorded.
     */
    @stub
    def getMin(): Long = ???

    /** Returns the sum of values recorded, or zero if no values have been
     *  recorded.
     */
    @stub
    def getSum(): Long = ???
}
