package java.util

import java.io.Serializable
import java.lang.Object
import java.util.stream.{DoubleStream, IntStream, LongStream}
import scala.scalanative.annotation.stub

/** An instance of this class is used to generate a stream of
 *  pseudorandom numbers. The class uses a 48-bit seed, which is
 *  modified using a linear congruential formula. (See Donald Knuth,
 *  The Art of Computer Programming, Volume 2, Section 3.2.1.)
 *  
 *  If two instances of Random are created with the same
 *  seed, and the same sequence of method calls is made for each, they
 *  will generate and return identical sequences of numbers. In order to
 *  guarantee this property, particular algorithms are specified for the
 *  class Random. Java implementations must use all the algorithms
 *  shown here for the class Random, for the sake of absolute
 *  portability of Java code. However, subclasses of class Random
 *  are permitted to use other algorithms, so long as they adhere to the
 *  general contracts for all the methods.
 *  
 *  The algorithms implemented by class Random use a
 *  protected utility method that on each invocation can supply
 *  up to 32 pseudorandomly generated bits.
 *  
 *  Many applications will find the method Math.random() simpler to use.
 * 
 *  Instances of java.util.Random are threadsafe.
 *  However, the concurrent use of the same java.util.Random
 *  instance across threads may encounter contention and consequent
 *  poor performance. Consider instead using
 *  ThreadLocalRandom in multithreaded
 *  designs.
 * 
 *  Instances of java.util.Random are not cryptographically
 *  secure.  Consider instead using SecureRandom to
 *  get a cryptographically secure pseudo-random number generator for use
 *  by security-sensitive applications.
 */
class Random extends Object with Serializable {

    /** Creates a new random number generator. */
    @stub
    def this() = ???

    /** Creates a new random number generator using a single long seed. */
    @stub
    def this(seed: Long) = ???

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

    /** Returns the next pseudorandom, uniformly distributed
     *  boolean value from this random number generator's
     *  sequence.
     */
    @stub
    def nextBoolean(): Boolean = ???

    /** Generates random bytes and places them into a user-supplied
     *  byte array.
     */
    @stub
    def nextBytes(bytes: Array[Byte]): Unit = ???

    /** Returns the next pseudorandom, uniformly distributed
     *  double value between 0.0 and
     *  1.0 from this random number generator's sequence.
     */
    @stub
    def nextDouble(): Double = ???

    /** Returns the next pseudorandom, uniformly distributed float
     *  value between 0.0 and 1.0 from this random
     *  number generator's sequence.
     */
    @stub
    def nextFloat(): Float = ???

    /** Returns the next pseudorandom, Gaussian ("normally") distributed
     *  double value with mean 0.0 and standard
     *  deviation 1.0 from this random number generator's sequence.
     */
    @stub
    def nextGaussian(): Double = ???

    /** Returns the next pseudorandom, uniformly distributed int
     *  value from this random number generator's sequence.
     */
    @stub
    def nextInt(): Int = ???

    /** Returns a pseudorandom, uniformly distributed int value
     *  between 0 (inclusive) and the specified value (exclusive), drawn from
     *  this random number generator's sequence.
     */
    @stub
    def nextInt(bound: Int): Int = ???

    /** Returns the next pseudorandom, uniformly distributed long
     *  value from this random number generator's sequence.
     */
    @stub
    def nextLong(): Long = ???

    /** Sets the seed of this random number generator using a single
     *  long seed.
     */
    @stub
    def setSeed(seed: Long): Unit = ???
}
