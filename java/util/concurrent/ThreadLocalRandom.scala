package java.util.concurrent

import java.lang.Object
import java.util.Random
import java.util.stream.{DoubleStream, IntStream, LongStream}
import scala.scalanative.annotation.stub

/** A random number generator isolated to the current thread.  Like the
 *  global Random generator used by the Math class, a ThreadLocalRandom is initialized
 *  with an internally generated seed that may not otherwise be
 *  modified. When applicable, use of ThreadLocalRandom rather
 *  than shared Random objects in concurrent programs will
 *  typically encounter much less overhead and contention.  Use of
 *  ThreadLocalRandom is particularly appropriate when multiple
 *  tasks (for example, each a ForkJoinTask) use random numbers
 *  in parallel in thread pools.
 * 
 *  Usages of this class should typically be of the form:
 *  ThreadLocalRandom.current().nextX(...) (where
 *  X is Int, Long, etc).
 *  When all usages are of this form, it is never possible to
 *  accidently share a ThreadLocalRandom across multiple threads.
 * 
 *  This class also provides additional commonly used bounded random
 *  generation methods.
 * 
 *  Instances of ThreadLocalRandom are not cryptographically
 *  secure.  Consider instead using SecureRandom
 *  in security-sensitive applications. Additionally,
 *  default-constructed instances do not use a cryptographically random
 *  seed unless the system property
 *  java.util.secureRandomSeed is set to true.
 */
class ThreadLocalRandom extends Random {

    /** Returns an effectively unlimited stream of pseudorandom double values, each between zero (inclusive) and one
     *  (exclusive).
     */
    @stub
    def doubles(): DoubleStream = ???

    /** Returns an effectively unlimited stream of pseudorandom double values, each conforming to the given origin (inclusive) and bound
     *  (exclusive).
     */
    @stub
    def doubles(randomNumberOrigin: Double, randomNumberBound: Double): DoubleStream = ???

    /** Returns a stream producing the given streamSize number of
     *  pseudorandom double values, each between zero
     *  (inclusive) and one (exclusive).
     */
    @stub
    def doubles(streamSize: Long): DoubleStream = ???

    /** Returns a stream producing the given streamSize number of
     *  pseudorandom double values, each conforming to the given origin
     *  (inclusive) and bound (exclusive).
     */
    @stub
    def doubles(streamSize: Long, randomNumberOrigin: Double, randomNumberBound: Double): DoubleStream = ???

    /** Returns an effectively unlimited stream of pseudorandom int
     *  values.
     */
    @stub
    def ints(): IntStream = ???

    /** Returns an effectively unlimited stream of pseudorandom int values, each conforming to the given origin (inclusive) and bound
     *  (exclusive).
     */
    @stub
    def ints(randomNumberOrigin: Int, randomNumberBound: Int): IntStream = ???

    /** Returns a stream producing the given streamSize number of
     *  pseudorandom int values.
     */
    @stub
    def ints(streamSize: Long): IntStream = ???

    /** Returns a stream producing the given streamSize number
     *  of pseudorandom int values, each conforming to the given
     *  origin (inclusive) and bound (exclusive).
     */
    @stub
    def ints(streamSize: Long, randomNumberOrigin: Int, randomNumberBound: Int): IntStream = ???

    /** Returns an effectively unlimited stream of pseudorandom long
     *  values.
     */
    @stub
    def longs(): LongStream = ???

    /** Returns a stream producing the given streamSize number of
     *  pseudorandom long values.
     */
    @stub
    def longs(streamSize: Long): LongStream = ???

    /** Returns an effectively unlimited stream of pseudorandom long values, each conforming to the given origin (inclusive) and bound
     *  (exclusive).
     */
    @stub
    def longs(randomNumberOrigin: Long, randomNumberBound: Long): LongStream = ???

    /** Returns a stream producing the given streamSize number of
     *  pseudorandom long, each conforming to the given origin
     *  (inclusive) and bound (exclusive).
     */
    @stub
    def longs(streamSize: Long, randomNumberOrigin: Long, randomNumberBound: Long): LongStream = ???

    /** Generates the next pseudorandom number. */
    @stub
    protected def next(bits: Int): Int = ???

    /** Returns a pseudorandom boolean value. */
    @stub
    def nextBoolean(): Boolean = ???

    /** Returns a pseudorandom double value between zero
     *  (inclusive) and one (exclusive).
     */
    @stub
    def nextDouble(): Double = ???

    /** Returns a pseudorandom double value between 0.0
     *  (inclusive) and the specified bound (exclusive).
     */
    @stub
    def nextDouble(bound: Double): Double = ???

    /** Returns a pseudorandom double value between the specified
     *  origin (inclusive) and bound (exclusive).
     */
    @stub
    def nextDouble(origin: Double, bound: Double): Double = ???

    /** Returns a pseudorandom float value between zero
     *  (inclusive) and one (exclusive).
     */
    @stub
    def nextFloat(): Float = ???

    /** Returns the next pseudorandom, Gaussian ("normally") distributed
     *  double value with mean 0.0 and standard
     *  deviation 1.0 from this random number generator's sequence.
     */
    @stub
    def nextGaussian(): Double = ???

    /** Returns a pseudorandom int value. */
    @stub
    def nextInt(): Int = ???

    /** Returns a pseudorandom int value between zero (inclusive)
     *  and the specified bound (exclusive).
     */
    @stub
    def nextInt(bound: Int): Int = ???

    /** Returns a pseudorandom int value between the specified
     *  origin (inclusive) and the specified bound (exclusive).
     */
    @stub
    def nextInt(origin: Int, bound: Int): Int = ???

    /** Returns a pseudorandom long value. */
    @stub
    def nextLong(): Long = ???

    /** Returns a pseudorandom long value between zero (inclusive)
     *  and the specified bound (exclusive).
     */
    @stub
    def nextLong(bound: Long): Long = ???

    /** Returns a pseudorandom long value between the specified
     *  origin (inclusive) and the specified bound (exclusive).
     */
    @stub
    def nextLong(origin: Long, bound: Long): Long = ???

    /** Throws UnsupportedOperationException. */
    @stub
    def setSeed(seed: Long): Unit = ???
}

object ThreadLocalRandom {
    /** Returns the current thread's ThreadLocalRandom. */
    @stub
    def current(): ThreadLocalRandom = ???
}
