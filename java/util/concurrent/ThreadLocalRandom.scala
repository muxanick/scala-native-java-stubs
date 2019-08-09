package java.util.concurrent

import java.lang.Object
import java.util.Random
import java.util.stream.{DoubleStream, IntStream, LongStream}

// A random number generator isolated to the current thread.  Like the
// global Random generator used by the Math class, a ThreadLocalRandom is initialized
// with an internally generated seed that may not otherwise be
// modified. When applicable, use of ThreadLocalRandom rather
// than shared Random objects in concurrent programs will
// typically encounter much less overhead and contention.  Use of
// ThreadLocalRandom is particularly appropriate when multiple
// tasks (for example, each a ForkJoinTask) use random numbers
// in parallel in thread pools.
//
// Usages of this class should typically be of the form:
// ThreadLocalRandom.current().nextX(...) (where
// X is Int, Long, etc).
// When all usages are of this form, it is never possible to
// accidently share a ThreadLocalRandom across multiple threads.
//
// This class also provides additional commonly used bounded random
// generation methods.
//
// Instances of ThreadLocalRandom are not cryptographically
// secure.  Consider instead using SecureRandom
// in security-sensitive applications. Additionally,
// default-constructed instances do not use a cryptographically random
// seed unless the system property
// java.util.secureRandomSeed is set to true.
class ThreadLocalRandom extends Random {

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
    // Returns a pseudorandom boolean value.
    def nextBoolean(): Boolean = ???

    @stub
    // Returns a pseudorandom double value between zero
    // (inclusive) and one (exclusive).
    def nextDouble(): double = ???

    @stub
    // Returns a pseudorandom double value between 0.0
    // (inclusive) and the specified bound (exclusive).
    def nextDouble(bound: double): double = ???

    @stub
    // Returns a pseudorandom double value between the specified
    // origin (inclusive) and bound (exclusive).
    def nextDouble(origin: double, bound: double): double = ???

    @stub
    // Returns a pseudorandom float value between zero
    // (inclusive) and one (exclusive).
    def nextFloat(): float = ???

    @stub
    // Returns the next pseudorandom, Gaussian ("normally") distributed
    // double value with mean 0.0 and standard
    // deviation 1.0 from this random number generator's sequence.
    def nextGaussian(): double = ???

    @stub
    // Returns a pseudorandom int value.
    def nextInt(): Int = ???

    @stub
    // Returns a pseudorandom int value between zero (inclusive)
    // and the specified bound (exclusive).
    def nextInt(bound: Int): Int = ???

    @stub
    // Returns a pseudorandom int value between the specified
    // origin (inclusive) and the specified bound (exclusive).
    def nextInt(origin: Int, bound: Int): Int = ???

    @stub
    // Returns a pseudorandom long value.
    def nextLong(): Long = ???

    @stub
    // Returns a pseudorandom long value between zero (inclusive)
    // and the specified bound (exclusive).
    def nextLong(bound: Long): Long = ???

    @stub
    // Returns a pseudorandom long value between the specified
    // origin (inclusive) and the specified bound (exclusive).
    def nextLong(origin: Long, bound: Long): Long = ???
}

object ThreadLocalRandom {
    @stub
    // Returns the current thread's ThreadLocalRandom.
    def current(): ThreadLocalRandom = ???
}
