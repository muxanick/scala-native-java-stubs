package java.util.stream

import java.lang.{Boolean, CharSequence, Double, Integer, Long, Object, String}
import java.util.{Collection, Comparator, DoubleSummaryStatistics, IntSummaryStatistics, List, LongSummaryStatistics, Map, Optional, Set}
import java.util.concurrent.ConcurrentMap
import java.util.function.{BinaryOperator, Function, Predicate, Supplier, ToDoubleFunction, ToIntFunction, ToLongFunction}
import scala.scalanative.annotation.stub

/** Implementations of Collector that implement various useful reduction
 *  operations, such as accumulating elements into collections, summarizing
 *  elements according to various criteria, etc.
 * 
 *  The following are examples of using the predefined collectors to perform
 *  common mutable reduction tasks:
 * 
 *  
 *      // Accumulate names into a List
 *      List<String> list = people.stream().map(Person::getName).collect(Collectors.toList());
 * 
 *      // Accumulate names into a TreeSet
 *      Set<String> set = people.stream().map(Person::getName).collect(Collectors.toCollection(TreeSet::new));
 * 
 *      // Convert elements to strings and concatenate them, separated by commas
 *      String joined = things.stream()
 *                            .map(Object::toString)
 *                            .collect(Collectors.joining(", "));
 * 
 *      // Compute sum of salaries of employee
 *      int total = employees.stream()
 *                           .collect(Collectors.summingInt(Employee::getSalary)));
 * 
 *      // Group employees by department
 *      Map<Department, List<Employee>> byDept
 *          = employees.stream()
 *                     .collect(Collectors.groupingBy(Employee::getDepartment));
 * 
 *      // Compute sum of salaries by department
 *      Map<Department, Integer> totalByDept
 *          = employees.stream()
 *                     .collect(Collectors.groupingBy(Employee::getDepartment,
 *                                                    Collectors.summingInt(Employee::getSalary)));
 * 
 *      // Partition students into passing and failing
 *      Map<Boolean, List<Student>> passingFailing =
 *          students.stream()
 *                  .collect(Collectors.partitioningBy(s -> s.getGrade() >= PASS_THRESHOLD));
 * 
 *  
 */
final class Collectors extends Object {
}

object Collectors {
    /** Returns a Collector that produces the arithmetic mean of a double-valued
     *  function applied to the input elements.
     */
    @stub
    def averagingDouble[T](mapper: ToDoubleFunction[_ >: T]): Collector[T, _, Double] = ???

    /** Returns a Collector that produces the arithmetic mean of an integer-valued
     *  function applied to the input elements.
     */
    @stub
    def averagingInt[T](mapper: ToIntFunction[_ >: T]): Collector[T, _, Double] = ???

    /** Returns a Collector that produces the arithmetic mean of a long-valued
     *  function applied to the input elements.
     */
    @stub
    def averagingLong[T](mapper: ToLongFunction[_ >: T]): Collector[T, _, Double] = ???

    /** Adapts a Collector to perform an additional finishing
     *  transformation.
     */
    @stub
    def collectingAndThen[T, A, R, RR](downstream: Collector[T, A, R], finisher: Function[R, RR]): Collector[T, A, RR] = ???

    /** Returns a Collector accepting elements of type T that
     *  counts the number of input elements.
     */
    @stub
    def counting[T](): Collector[T, _, Long] = ???

    /** Returns a Collector implementing a "group by" operation on
     *  input elements of type T, grouping elements according to a
     *  classification function, and returning the results in a Map.
     */
    @stub
    def groupingBy[T, K](classifier: Function[_ >: T, _ <: K]): Collector[T, _, Map[K, List[T]]] = ???

    /** Returns a Collector implementing a cascaded "group by" operation
     *  on input elements of type T, grouping elements according to a
     *  classification function, and then performing a reduction operation on
     *  the values associated with a given key using the specified downstream
     *  Collector.
     */
    @stub
    def groupingBy[T, K, A, D](classifier: Function[_ >: T, _ <: K], downstream: Collector[_ >: T, A, D]): Collector[T, _, Map[K, D]] = ???

    /** Returns a Collector implementing a cascaded "group by" operation
     *  on input elements of type T, grouping elements according to a
     *  classification function, and then performing a reduction operation on
     *  the values associated with a given key using the specified downstream
     *  Collector.
     */
    @stub
    def groupingBy[T, K, D, A, M <: Map[K, D]](classifier: Function[_ >: T, _ <: K], mapFactory: Supplier[M], downstream: Collector[_ >: T, A, D]): Collector[T, _, M] = ???

    /** Returns a concurrent Collector implementing a "group by"
     *  operation on input elements of type T, grouping elements
     *  according to a classification function.
     */
    @stub
    def groupingByConcurrent[T, K](classifier: Function[_ >: T, _ <: K]): Collector[T, _, ConcurrentMap[K, List[T]]] = ???

    /** Returns a concurrent Collector implementing a cascaded "group by"
     *  operation on input elements of type T, grouping elements
     *  according to a classification function, and then performing a reduction
     *  operation on the values associated with a given key using the specified
     *  downstream Collector.
     */
    @stub
    def groupingByConcurrent[T, K, A, D](classifier: Function[_ >: T, _ <: K], downstream: Collector[_ >: T, A, D]): Collector[T, _, ConcurrentMap[K, D]] = ???

    /** Returns a concurrent Collector implementing a cascaded "group by"
     *  operation on input elements of type T, grouping elements
     *  according to a classification function, and then performing a reduction
     *  operation on the values associated with a given key using the specified
     *  downstream Collector.
     */
    @stub
    def groupingByConcurrent[T, K, A, D, M <: ConcurrentMap[K, D]](classifier: Function[_ >: T, _ <: K], mapFactory: Supplier[M], downstream: Collector[_ >: T, A, D]): Collector[T, _, M] = ???

    /** Returns a Collector that concatenates the input elements into a
     *  String, in encounter order.
     */
    @stub
    def joining(): Collector[CharSequence, _, String] = ???

    /** Returns a Collector that concatenates the input elements,
     *  separated by the specified delimiter, in encounter order.
     */
    @stub
    def joining(delimiter: CharSequence): Collector[CharSequence, _, String] = ???

    /** Returns a Collector that concatenates the input elements,
     *  separated by the specified delimiter, with the specified prefix and
     *  suffix, in encounter order.
     */
    @stub
    def joining(delimiter: CharSequence, prefix: CharSequence, suffix: CharSequence): Collector[CharSequence, _, String] = ???

    /** Adapts a Collector accepting elements of type U to one
     *  accepting elements of type T by applying a mapping function to
     *  each input element before accumulation.
     */
    @stub
    def mapping[T, U, A, R](mapper: Function[_ >: T, _ <: U], downstream: Collector[_ >: U, A, R]): Collector[T, _, R] = ???

    /** Returns a Collector that produces the maximal element according
     *  to a given Comparator, described as an Optional<T>.
     */
    @stub
    def maxBy[T](comparator: Comparator[_ >: T]): Collector[T, _, Optional[T]] = ???

    /** Returns a Collector that produces the minimal element according
     *  to a given Comparator, described as an Optional<T>.
     */
    @stub
    def minBy[T](comparator: Comparator[_ >: T]): Collector[T, _, Optional[T]] = ???

    /** Returns a Collector which partitions the input elements according
     *  to a Predicate, and organizes them into a
     *  Map<Boolean, List<T>>.
     */
    @stub
    def partitioningBy[T](predicate: Predicate[_ >: T]): Collector[T, _, Map[Boolean, List[T]]] = ???

    /** Returns a Collector which partitions the input elements according
     *  to a Predicate, reduces the values in each partition according to
     *  another Collector, and organizes them into a
     *  Map<Boolean, D> whose values are the result of the downstream
     *  reduction.
     */
    @stub
    def partitioningBy[T, D, A](predicate: Predicate[_ >: T], downstream: Collector[_ >: T, A, D]): Collector[T, _, Map[Boolean, D]] = ???

    /** Returns a Collector which performs a reduction of its
     *  input elements under a specified BinaryOperator.
     */
    @stub
    def reducing[T](op: BinaryOperator[T]): Collector[T, _, Optional[T]] = ???

    /** Returns a Collector which performs a reduction of its
     *  input elements under a specified BinaryOperator using the
     *  provided identity.
     */
    @stub
    def reducing[T](identity: T, op: BinaryOperator[T]): Collector[T, _, T] = ???

    /** Returns a Collector which performs a reduction of its
     *  input elements under a specified mapping function and
     *  BinaryOperator.
     */
    @stub
    def reducing[T, U](identity: U, mapper: Function[_ >: T, _ <: U], op: BinaryOperator[U]): Collector[T, _, U] = ???

    /** Returns a Collector which applies an double-producing
     *  mapping function to each input element, and returns summary statistics
     *  for the resulting values.
     */
    @stub
    def summarizingDouble[T](mapper: ToDoubleFunction[_ >: T]): Collector[T, _, DoubleSummaryStatistics] = ???

    /** Returns a Collector which applies an int-producing
     *  mapping function to each input element, and returns summary statistics
     *  for the resulting values.
     */
    @stub
    def summarizingInt[T](mapper: ToIntFunction[_ >: T]): Collector[T, _, IntSummaryStatistics] = ???

    /** Returns a Collector which applies an long-producing
     *  mapping function to each input element, and returns summary statistics
     *  for the resulting values.
     */
    @stub
    def summarizingLong[T](mapper: ToLongFunction[_ >: T]): Collector[T, _, LongSummaryStatistics] = ???

    /** Returns a Collector that produces the sum of a double-valued
     *  function applied to the input elements.
     */
    @stub
    def summingDouble[T](mapper: ToDoubleFunction[_ >: T]): Collector[T, _, Double] = ???

    /** Returns a Collector that produces the sum of a integer-valued
     *  function applied to the input elements.
     */
    @stub
    def summingInt[T](mapper: ToIntFunction[_ >: T]): Collector[T, _, Integer] = ???

    /** Returns a Collector that produces the sum of a long-valued
     *  function applied to the input elements.
     */
    @stub
    def summingLong[T](mapper: ToLongFunction[_ >: T]): Collector[T, _, Long] = ???

    /** Returns a Collector that accumulates the input elements into a
     *  new Collection, in encounter order.
     */
    @stub
    def toCollection[T, C <: Collection[T]](collectionFactory: Supplier[C]): Collector[T, _, C] = ???

    /** Returns a concurrent Collector that accumulates elements into a
     *  ConcurrentMap whose keys and values are the result of applying
     *  the provided mapping functions to the input elements.
     */
    @stub
    def toConcurrentMap[T, K, U](keyMapper: Function[_ >: T, _ <: K], valueMapper: Function[_ >: T, _ <: U]): Collector[T, _, ConcurrentMap[K, U]] = ???

    /** Returns a concurrent Collector that accumulates elements into a
     *  ConcurrentMap whose keys and values are the result of applying
     *  the provided mapping functions to the input elements.
     */
    @stub
    def toConcurrentMap[T, K, U](keyMapper: Function[_ >: T, _ <: K], valueMapper: Function[_ >: T, _ <: U], mergeFunction: BinaryOperator[U]): Collector[T, _, ConcurrentMap[K, U]] = ???

    /** Returns a concurrent Collector that accumulates elements into a
     *  ConcurrentMap whose keys and values are the result of applying
     *  the provided mapping functions to the input elements.
     */
    @stub
    def toConcurrentMap[T, K, U, M <: ConcurrentMap[K, U]](keyMapper: Function[_ >: T, _ <: K], valueMapper: Function[_ >: T, _ <: U], mergeFunction: BinaryOperator[U], mapSupplier: Supplier[M]): Collector[T, _, M] = ???

    /** Returns a Collector that accumulates the input elements into a
     *  new List.
     */
    @stub
    def toList[T](): Collector[T, _, List[T]] = ???

    /** Returns a Collector that accumulates elements into a
     *  Map whose keys and values are the result of applying the provided
     *  mapping functions to the input elements.
     */
    @stub
    def toMap[T, K, U](keyMapper: Function[_ >: T, _ <: K], valueMapper: Function[_ >: T, _ <: U]): Collector[T, _, Map[K, U]] = ???

    /** Returns a Collector that accumulates elements into a
     *  Map whose keys and values are the result of applying the provided
     *  mapping functions to the input elements.
     */
    @stub
    def toMap[T, K, U](keyMapper: Function[_ >: T, _ <: K], valueMapper: Function[_ >: T, _ <: U], mergeFunction: BinaryOperator[U]): Collector[T, _, Map[K, U]] = ???

    /** Returns a Collector that accumulates elements into a
     *  Map whose keys and values are the result of applying the provided
     *  mapping functions to the input elements.
     */
    @stub
    def toMap[T, K, U, M <: Map[K, U]](keyMapper: Function[_ >: T, _ <: K], valueMapper: Function[_ >: T, _ <: U], mergeFunction: BinaryOperator[U], mapSupplier: Supplier[M]): Collector[T, _, M] = ???

    /** Returns a Collector that accumulates the input elements into a
     *  new Set.
     */
    @stub
    def toSet[T](): Collector[T, _, Set[T]] = ???
}
