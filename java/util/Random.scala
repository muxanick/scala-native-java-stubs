package java.util

import java.io.Serializable
import java.lang.Object
import java.util.stream.{DoubleStream, IntStream, LongStream}

// An instance of this class is used to generate a stream of
// pseudorandom numbers. The class uses a 48-bit seed, which is
// modified using a linear congruential formula. (See Donald Knuth,
// The Art of Computer Programming, Volume 2, Section 3.2.1.)
// 
// If two instances of Random are created with the same
// seed, and the same sequence of method calls is made for each, they
// will generate and return identical sequences of numbers. In order to
// guarantee this property, particular algorithms are specified for the
// class Random. Java implementations must use all the algorithms
// shown here for the class Random, for the sake of absolute
// portability of Java code. However, subclasses of class Random
// are permitted to use other algorithms, so long as they adhere to the
// general contracts for all the methods.
// 
// The algorithms implemented by class Random use a
// protected utility method that on each invocation can supply
// up to 32 pseudorandomly generated bits.
// 
// Many applications will find the method Math.random() simpler to use.
//
// Instances of java.util.Random are threadsafe.
// However, the concurrent use of the same java.util.Random
// instance across threads may encounter contention and consequent
// poor performance. Consider instead using
// ThreadLocalRandom in multithreaded
// designs.
//
// Instances of java.util.Random are not cryptographically
// secure.  Consider instead using SecureRandom to
// get a cryptographically secure pseudo-random number generator for use
// by security-sensitive applications.
class Random extends Object with Serializable {

    @stub
    // Creates a new random number generator.
    def this() = ???

    @stub
    // Returns an effectively unlimited stream of pseudorandom double values, each between zero (inclusive) and one
    // (exclusive).
    def doubles(): DoubleStream = ???

    @stub
    // Returns an effectively unlimited stream of pseudorandom double values, each conforming to the given origin (inclusive) and bound
    // (exclusive).
    def doubles(randomNumberOrigin: double, randomNumberBound: double): DoubleStream = ???

    @stub
    // Returns a stream producing the given streamSize number of
    // pseudorandom double values, each between zero
    // (inclusive) and one (exclusive).
    def doubles(streamSize: Long): DoubleStream = ???

    @stub
    // Returns a stream producing the given streamSize number of
    // pseudorandom double values, each conforming to the given origin
    // (inclusive) and bound (exclusive).
    def doubles(streamSize: Long, randomNumberOrigin: double, randomNumberBound: double): DoubleStream = ???

    @stub
    // Returns an effectively unlimited stream of pseudorandom int
    // values.
    def ints(): IntStream = ???

    @stub
    // Returns an effectively unlimited stream of pseudorandom int values, each conforming to the given origin (inclusive) and bound
    // (exclusive).
    def ints(randomNumberOrigin: Int, randomNumberBound: Int): IntStream = ???

    @stub
    // Returns a stream producing the given streamSize number of
    // pseudorandom int values.
    def ints(streamSize: Long): IntStream = ???

    @stub
    // Returns a stream producing the given streamSize number
    // of pseudorandom int values, each conforming to the given
    // origin (inclusive) and bound (exclusive).
    def ints(streamSize: Long, randomNumberOrigin: Int, randomNumberBound: Int): IntStream = ???

    @stub
    // Returns an effectively unlimited stream of pseudorandom long
    // values.
    def longs(): LongStream = ???

    @stub
    // Returns a stream producing the given streamSize number of
    // pseudorandom long values.
    def longs(streamSize: Long): LongStream = ???

    @stub
    // Returns an effectively unlimited stream of pseudorandom long values, each conforming to the given origin (inclusive) and bound
    // (exclusive).
    def longs(randomNumberOrigin: Long, randomNumberBound: Long): LongStream = ???

    @stub
    // Returns a stream producing the given streamSize number of
    // pseudorandom long, each conforming to the given origin
    // (inclusive) and bound (exclusive).
    def longs(streamSize: Long, randomNumberOrigin: Long, randomNumberBound: Long): LongStream = ???

    @stub
    // Generates the next pseudorandom number.
    protected def next(bits: Int): Int = ???

    @stub
    // Returns the next pseudorandom, uniformly distributed
    // boolean value from this random number generator's
    // sequence.
    def nextBoolean(): Boolean = ???

    @stub
    // Generates random bytes and places them into a user-supplied
    // byte array.
    def nextBytes(bytes: Array[Byte]): Unit = ???

    @stub
    // Returns the next pseudorandom, uniformly distributed
    // double value between 0.0 and
    // 1.0 from this random number generator's sequence.
    def nextDouble(): double = ???

    @stub
    // Returns the next pseudorandom, uniformly distributed float
    // value between 0.0 and 1.0 from this random
    // number generator's sequence.
    def nextFloat(): float = ???

    @stub
    // Returns the next pseudorandom, Gaussian ("normally") distributed
    // double value with mean 0.0 and standard
    // deviation 1.0 from this random number generator's sequence.
    def nextGaussian(): double = ???

    @stub
    // Returns the next pseudorandom, uniformly distributed int
    // value from this random number generator's sequence.
    def nextInt(): Int = ???

    @stub
    // Returns a pseudorandom, uniformly distributed int value
    // between 0 (inclusive) and the specified value (exclusive), drawn from
    // this random number generator's sequence.
    def nextInt(bound: Int): Int = ???

    @stub
    // Returns the next pseudorandom, uniformly distributed long
    // value from this random number generator's sequence.
    def nextLong(): Long = ???
}
