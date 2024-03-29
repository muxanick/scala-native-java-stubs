package java.util.stream

import java.lang.{Enum, Object, String}
import java.util.Set
import java.util.function.{BiConsumer, BinaryOperator, Function, Supplier}
import scala.scalanative.annotation.stub

/** A mutable reduction operation that
 *  accumulates input elements into a mutable result container, optionally transforming
 *  the accumulated result into a final representation after all input elements
 *  have been processed.  Reduction operations can be performed either sequentially
 *  or in parallel.
 * 
 *  Examples of mutable reduction operations include:
 *  accumulating elements into a Collection; concatenating
 *  strings using a StringBuilder; computing summary information about
 *  elements such as sum, min, max, or average; computing "pivot table" summaries
 *  such as "maximum valued transaction by seller", etc.  The class Collectors
 *  provides implementations of many common mutable reductions.
 * 
 *  A Collector is specified by four functions that work together to
 *  accumulate entries into a mutable result container, and optionally perform
 *  a final transform on the result.  They are: 
 *      creation of a new result container (supplier())
 *      incorporating a new data element into a result container (accumulator())
 *      combining two result containers into one (combiner())
 *      performing an optional final transform on the container (finisher())
 *  
 * 
 *  Collectors also have a set of characteristics, such as
 *  Collector.Characteristics.CONCURRENT, that provide hints that can be used by a
 *  reduction implementation to provide better performance.
 * 
 *  A sequential implementation of a reduction using a collector would
 *  create a single result container using the supplier function, and invoke the
 *  accumulator function once for each input element.  A parallel implementation
 *  would partition the input, create a result container for each partition,
 *  accumulate the contents of each partition into a subresult for that partition,
 *  and then use the combiner function to merge the subresults into a combined
 *  result.
 * 
 *  To ensure that sequential and parallel executions produce equivalent
 *  results, the collector functions must satisfy an identity and an
 *  associativity constraints.
 * 
 *  The identity constraint says that for any partially accumulated result,
 *  combining it with an empty result container must produce an equivalent
 *  result.  That is, for a partially accumulated result a that is the
 *  result of any series of accumulator and combiner invocations, a must
 *  be equivalent to combiner.apply(a, supplier.get()).
 * 
 *  The associativity constraint says that splitting the computation must
 *  produce an equivalent result.  That is, for any input elements t1
 *  and t2, the results r1 and r2 in the computation
 *  below must be equivalent:
 *  
 *      A a1 = supplier.get();
 *      accumulator.accept(a1, t1);
 *      accumulator.accept(a1, t2);
 *      R r1 = finisher.apply(a1);  // result without splitting
 * 
 *      A a2 = supplier.get();
 *      accumulator.accept(a2, t1);
 *      A a3 = supplier.get();
 *      accumulator.accept(a3, t2);
 *      R r2 = finisher.apply(combiner.apply(a2, a3));  // result with splitting
 *   
 * 
 *  For collectors that do not have the UNORDERED characteristic,
 *  two accumulated results a1 and a2 are equivalent if
 *  finisher.apply(a1).equals(finisher.apply(a2)).  For unordered
 *  collectors, equivalence is relaxed to allow for non-equality related to
 *  differences in order.  (For example, an unordered collector that accumulated
 *  elements to a List would consider two lists equivalent if they
 *  contained the same elements, ignoring order.)
 * 
 *  Libraries that implement reduction based on Collector, such as
 *  Stream.collect(Collector), must adhere to the following constraints:
 *  
 *      The first argument passed to the accumulator function, both
 *      arguments passed to the combiner function, and the argument passed to the
 *      finisher function must be the result of a previous invocation of the
 *      result supplier, accumulator, or combiner functions.
 *      The implementation should not do anything with the result of any of
 *      the result supplier, accumulator, or combiner functions other than to
 *      pass them again to the accumulator, combiner, or finisher functions,
 *      or return them to the caller of the reduction operation.
 *      If a result is passed to the combiner or finisher
 *      function, and the same object is not returned from that function, it is
 *      never used again.
 *      Once a result is passed to the combiner or finisher function, it
 *      is never passed to the accumulator function again.
 *      For non-concurrent collectors, any result returned from the result
 *      supplier, accumulator, or combiner functions must be serially
 *      thread-confined.  This enables collection to occur in parallel without
 *      the Collector needing to implement any additional synchronization.
 *      The reduction implementation must manage that the input is properly
 *      partitioned, that partitions are processed in isolation, and combining
 *      happens only after accumulation is complete.
 *      For concurrent collectors, an implementation is free to (but not
 *      required to) implement reduction concurrently.  A concurrent reduction
 *      is one where the accumulator function is called concurrently from
 *      multiple threads, using the same concurrently-modifiable result container,
 *      rather than keeping the result isolated during accumulation.
 *      A concurrent reduction should only be applied if the collector has the
 *      Collector.Characteristics.UNORDERED characteristics or if the
 *      originating data is unordered.
 *  
 * 
 *  In addition to the predefined implementations in Collectors, the
 *  static factory methods of(Supplier, BiConsumer, BinaryOperator, Characteristics...)
 *  can be used to construct collectors.  For example, you could create a collector
 *  that accumulates widgets into a TreeSet with:
 * 
 *  
 *      Collector<Widget, ?, TreeSet<Widget>> intoSet =
 *          Collector.of(TreeSet::new, TreeSet::add,
 *                       (left, right) -> { left.addAll(right); return left; });
 *  
 * 
 *  (This behavior is also implemented by the predefined collector
 *  Collectors.toCollection(Supplier)).
 */
trait Collector[T, A, R] {

    /** A function that folds a value into a mutable result container. */
    @stub
    def accumulator(): BiConsumer[A, T] = ???

    /** Returns a Set of Collector.Characteristics indicating
     *  the characteristics of this Collector.
     */
    @stub
    def characteristics(): Set[Collector.Characteristics] = ???

    /** A function that accepts two partial results and merges them. */
    @stub
    def combiner(): BinaryOperator[A] = ???

    /** Perform the final transformation from the intermediate accumulation type
     *  A to the final result type R.
     */
    @stub
    def finisher(): Function[A, R] = ???

    /** A function that creates and returns a new mutable result container. */
    @stub
    def supplier(): Supplier[A] = ???
}

object Collector {
    /** Characteristics indicating properties of a Collector, which can
     *  be used to optimize reduction implementations.
     */
    class Characteristics private (name: String, ordinal: Int) extends Enum[Characteristics](name, ordinal) {
    }

    object Characteristics {
        /** Indicates that this collector is concurrent, meaning that
         *  the result container can support the accumulator function being
         *  called concurrently with the same result container from multiple
         *  threads.
         */
        final val CONCURRENT: Characteristics = new Characteristics("CONCURRENT", 0)

        /** Indicates that the finisher function is the identity function and
         *  can be elided.
         */
        final val IDENTITY_FINISH: Characteristics = new Characteristics("IDENTITY_FINISH", 1)

        /** Indicates that the collection operation does not commit to preserving
         *  the encounter order of input elements.
         */
        final val UNORDERED: Characteristics = new Characteristics("UNORDERED", 2)

        /** Returns the enum constant of this type with the specified name. */
        @stub
        def valueOf(name: String): Characteristics = ???

        /** Returns an array containing the constants of this enum type, in
         * the order they are declared.
         */
        @stub
        def values(): Array[Characteristics] = ???
    }


    /** Returns a new Collector described by the given supplier,
     *  accumulator, combiner, and finisher functions.
     */
    @stub
    def of[T, A, R](supplier: Supplier[A], accumulator: BiConsumer[A, T], combiner: BinaryOperator[A], finisher: Function[A, R], characteristics: Collector.Characteristics*): Collector[T, A, R] = ???

    /** Returns a new Collector described by the given supplier,
     *  accumulator, and combiner functions.
     */
    @stub
    def of[T, R](supplier: Supplier[R], accumulator: BiConsumer[R, T], combiner: BinaryOperator[R], characteristics: Collector.Characteristics*): Collector[T, R, R] = ???
}
