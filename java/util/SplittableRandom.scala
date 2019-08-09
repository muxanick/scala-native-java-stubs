package java.util

import java.lang.Object
import java.util.stream.{DoubleStream, IntStream, LongStream}

// A generator of uniform pseudorandom values applicable for use in
// (among other contexts) isolated parallel computations that may
// generate subtasks. Class SplittableRandom supports methods for
// producing pseudorandom numbers of type int, long,
// and double with similar usages as for class
// Random but differs in the following ways:
//
// 
//
// Series of generated values pass the DieHarder suite testing
// independence and uniformity properties of random number generators.
// (Most recently validated with  version
// 3.31.1.) These tests validate only the methods for certain
// types and ranges, but similar properties are expected to hold, at
// least approximately, for others as well. The period
// (length of any series of generated values before it repeats) is at
// least 264. 
//
//  Method split() constructs and returns a new
// SplittableRandom instance that shares no mutable state with the
// current instance. However, with very high probability, the
// values collectively generated by the two objects have the same
// statistical properties as if the same quantity of values were
// generated by a single thread using a single SplittableRandom object.  
//
// Instances of SplittableRandom are not thread-safe.
// They are designed to be split, not shared, across threads. For
// example, a fork/join-style computation using random numbers might include a
// construction of the form new
// Subtask(aSplittableRandom.split()).fork().
//
// This class provides additional methods for generating random
// streams, that employ the above techniques when used in stream.parallel() mode.
//
// 
//
// Instances of SplittableRandom are not cryptographically
// secure.  Consider instead using SecureRandom
// in security-sensitive applications. Additionally,
// default-constructed instances do not use a cryptographically random
// seed unless the system property
// java.util.secureRandomSeed is set to true.
final class SplittableRandom extends Object {

    @stub
    // Creates a new SplittableRandom instance that is likely to
    // generate sequences of values that are statistically independent
    // of those of any other instances in the current program; and
    // may, and typically does, vary across program invocations.
    def this() = ???

    @stub
    // Returns an effectively unlimited stream of pseudorandom double values from this generator and/or one split from it; each value
    // is between zero (inclusive) and one (exclusive).
    def doubles(): DoubleStream = ???

    @stub
    // Returns an effectively unlimited stream of pseudorandom double values from this generator and/or one split from it; each value
    // conforms to the given origin (inclusive) and bound (exclusive).
    def doubles(randomNumberOrigin: double, randomNumberBound: double): DoubleStream = ???

    @stub
    // Returns a stream producing the given streamSize number of
    // pseudorandom double values from this generator and/or one split
    // from it; each value is between zero (inclusive) and one (exclusive).
    def doubles(streamSize: Long): DoubleStream = ???

    @stub
    // Returns a stream producing the given streamSize number of
    // pseudorandom double values from this generator and/or one split
    // from it; each value conforms to the given origin (inclusive) and bound
    // (exclusive).
    def doubles(streamSize: Long, randomNumberOrigin: double, randomNumberBound: double): DoubleStream = ???

    @stub
    // Returns an effectively unlimited stream of pseudorandom int
    // values from this generator and/or one split from it.
    def ints(): IntStream = ???

    @stub
    // Returns an effectively unlimited stream of pseudorandom int values from this generator and/or one split from it; each value
    // conforms to the given origin (inclusive) and bound (exclusive).
    def ints(randomNumberOrigin: Int, randomNumberBound: Int): IntStream = ???

    @stub
    // Returns a stream producing the given streamSize number
    // of pseudorandom int values from this generator and/or
    // one split from it.
    def ints(streamSize: Long): IntStream = ???

    @stub
    // Returns a stream producing the given streamSize number
    // of pseudorandom int values from this generator and/or one split
    // from it; each value conforms to the given origin (inclusive) and bound
    // (exclusive).
    def ints(streamSize: Long, randomNumberOrigin: Int, randomNumberBound: Int): IntStream = ???

    @stub
    // Returns an effectively unlimited stream of pseudorandom long values from this generator and/or one split from it.
    def longs(): LongStream = ???

    @stub
    // Returns a stream producing the given streamSize number
    // of pseudorandom long values from this generator and/or
    // one split from it.
    def longs(streamSize: Long): LongStream = ???

    @stub
    // Returns an effectively unlimited stream of pseudorandom long values from this generator and/or one split from it; each value
    // conforms to the given origin (inclusive) and bound (exclusive).
    def longs(randomNumberOrigin: Long, randomNumberBound: Long): LongStream = ???

    @stub
    // Returns a stream producing the given streamSize number of
    // pseudorandom long values from this generator and/or one split
    // from it; each value conforms to the given origin (inclusive) and bound
    // (exclusive).
    def longs(streamSize: Long, randomNumberOrigin: Long, randomNumberBound: Long): LongStream = ???

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