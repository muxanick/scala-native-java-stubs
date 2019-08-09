package java.util.stream

import java.lang.{Boolean, CharSequence, Double, Integer, Long, Object, String}
import java.util.{Collection, Comparator, DoubleSummaryStatistics, IntSummaryStatistics, List, LongSummaryStatistics, Map, Optional}
import java.util.concurrent.ConcurrentMap
import java.util.function.{BinaryOperator, Function, Predicate, Supplier, ToDoubleFunction, ToIntFunction, ToLongFunction}

// Implementations of Collector that implement various useful reduction
// operations, such as accumulating elements into collections, summarizing
// elements according to various criteria, etc.
//
// The following are examples of using the predefined collectors to perform
// common mutable reduction tasks:
//
// 
//     // Accumulate names into a List
//     List<String> list = people.stream().map(Person::getName).collect(Collectors.toList());
//
//     // Accumulate names into a TreeSet
//     Set<String> set = people.stream().map(Person::getName).collect(Collectors.toCollection(TreeSet::new));
//
//     // Convert elements to strings and concatenate them, separated by commas
//     String joined = things.stream()
//                           .map(Object::toString)
//                           .collect(Collectors.joining(", "));
//
//     // Compute sum of salaries of employee
//     int total = employees.stream()
//                          .collect(Collectors.summingInt(Employee::getSalary)));
//
//     // Group employees by department
//     Map<Department, List<Employee>> byDept
//         = employees.stream()
//                    .collect(Collectors.groupingBy(Employee::getDepartment));
//
//     // Compute sum of salaries by department
//     Map<Department, Integer> totalByDept
//         = employees.stream()
//                    .collect(Collectors.groupingBy(Employee::getDepartment,
//                                                   Collectors.summingInt(Employee::getSalary)));
//
//     // Partition students into passing and failing
//     Map<Boolean, List<Student>> passingFailing =
//         students.stream()
//                 .collect(Collectors.partitioningBy(s -> s.getGrade() >= PASS_THRESHOLD));
//
// 
final class Collectors extends Object {
}

object Collectors {
    @stub
    // Returns a Collector that produces the arithmetic mean of a double-valued
    // function applied to the input elements.
    def Collector[T, _, Double]: [T] = ???

    @stub
    // Returns a Collector that produces the arithmetic mean of an integer-valued
    // function applied to the input elements.
    def Collector[T, _, Double]: [T] = ???

    @stub
    // Returns a Collector that produces the arithmetic mean of a long-valued
    // function applied to the input elements.
    def Collector[T, _, Double]: [T] = ???

    @stub
    // Adapts a Collector to perform an additional finishing
    // transformation.
    def Collector[T, A, RR]: [T, A, R, RR] = ???

    @stub
    // Returns a Collector accepting elements of type T that
    // counts the number of input elements.
    def Collector[T, _, Long]: [T] = ???

    @stub
    // Returns a Collector implementing a "group by" operation on
    // input elements of type T, grouping elements according to a
    // classification function, and returning the results in a Map.
    def Collector[T, _, Map[K, List[T]]]: [T, K] = ???

    @stub
    // Returns a Collector implementing a cascaded "group by" operation
    // on input elements of type T, grouping elements according to a
    // classification function, and then performing a reduction operation on
    // the values associated with a given key using the specified downstream
    // Collector.
    def Collector[T, _, Map[K, D]]: [T, K, A, D] = ???

    @stub
    // Returns a Collector implementing a cascaded "group by" operation
    // on input elements of type T, grouping elements according to a
    // classification function, and then performing a reduction operation on
    // the values associated with a given key using the specified downstream
    // Collector.
    def Collector[T, _, M]: [T, K, D, A, M <: Map[K, D]] = ???

    @stub
    // Returns a concurrent Collector implementing a "group by"
    // operation on input elements of type T, grouping elements
    // according to a classification function.
    def Collector[T, _, ConcurrentMap[K, List[T]]]: [T, K] = ???

    @stub
    // Returns a concurrent Collector implementing a cascaded "group by"
    // operation on input elements of type T, grouping elements
    // according to a classification function, and then performing a reduction
    // operation on the values associated with a given key using the specified
    // downstream Collector.
    def Collector[T, _, ConcurrentMap[K, D]]: [T, K, A, D] = ???

    @stub
    // Returns a concurrent Collector implementing a cascaded "group by"
    // operation on input elements of type T, grouping elements
    // according to a classification function, and then performing a reduction
    // operation on the values associated with a given key using the specified
    // downstream Collector.
    def Collector[T, _, M]: [T, K, A, D, M <: ConcurrentMap[K, D]] = ???

    @stub
    // Returns a Collector that concatenates the input elements into a
    // String, in encounter order.
    def joining(): Collector[CharSequence, _, String] = ???

    @stub
    // Returns a Collector that concatenates the input elements,
    // separated by the specified delimiter, in encounter order.
    def joining(delimiter: CharSequence): Collector[CharSequence, _, String] = ???

    @stub
    // Returns a Collector that concatenates the input elements,
    // separated by the specified delimiter, with the specified prefix and
    // suffix, in encounter order.
    def joining(delimiter: CharSequence, prefix: CharSequence, suffix: CharSequence): Collector[CharSequence, _, String] = ???

    @stub
    // Adapts a Collector accepting elements of type U to one
    // accepting elements of type T by applying a mapping function to
    // each input element before accumulation.
    def Collector[T, _, R]: [T, U, A, R] = ???

    @stub
    // Returns a Collector that produces the maximal element according
    // to a given Comparator, described as an Optional<T>.
    def Collector[T, _, Optional[T]]: [T] = ???

    @stub
    // Returns a Collector that produces the minimal element according
    // to a given Comparator, described as an Optional<T>.
    def Collector[T, _, Optional[T]]: [T] = ???

    @stub
    // Returns a Collector which partitions the input elements according
    // to a Predicate, and organizes them into a
    // Map<Boolean, List<T>>.
    def Collector[T, _, Map[Boolean, List[T]]]: [T] = ???

    @stub
    // Returns a Collector which partitions the input elements according
    // to a Predicate, reduces the values in each partition according to
    // another Collector, and organizes them into a
    // Map<Boolean, D> whose values are the result of the downstream
    // reduction.
    def Collector[T, _, Map[Boolean, D]]: [T, D, A] = ???

    @stub
    // Returns a Collector which performs a reduction of its
    // input elements under a specified BinaryOperator.
    def Collector[T, _, Optional[T]]: [T] = ???

    @stub
    // Returns a Collector which performs a reduction of its
    // input elements under a specified BinaryOperator using the
    // provided identity.
    def Collector[T, _, T]: [T] = ???

    @stub
    // Returns a Collector which performs a reduction of its
    // input elements under a specified mapping function and
    // BinaryOperator.
    def Collector[T, _, U]: [T, U] = ???

    @stub
    // Returns a Collector which applies an double-producing
    // mapping function to each input element, and returns summary statistics
    // for the resulting values.
    def Collector[T, _, DoubleSummaryStatistics]: [T] = ???

    @stub
    // Returns a Collector which applies an int-producing
    // mapping function to each input element, and returns summary statistics
    // for the resulting values.
    def Collector[T, _, IntSummaryStatistics]: [T] = ???

    @stub
    // Returns a Collector which applies an long-producing
    // mapping function to each input element, and returns summary statistics
    // for the resulting values.
    def Collector[T, _, LongSummaryStatistics]: [T] = ???

    @stub
    // Returns a Collector that produces the sum of a double-valued
    // function applied to the input elements.
    def Collector[T, _, Double]: [T] = ???

    @stub
    // Returns a Collector that produces the sum of a integer-valued
    // function applied to the input elements.
    def Collector[T, _, Integer]: [T] = ???

    @stub
    // Returns a Collector that produces the sum of a long-valued
    // function applied to the input elements.
    def Collector[T, _, Long]: [T] = ???

    @stub
    // Returns a Collector that accumulates the input elements into a
    // new Collection, in encounter order.
    def Collector[T, _, C]: [T, C <: Collection[T]] = ???

    @stub
    // Returns a concurrent Collector that accumulates elements into a
    // ConcurrentMap whose keys and values are the result of applying
    // the provided mapping functions to the input elements.
    def Collector[T, _, ConcurrentMap[K, U]]: [T, K, U] = ???

    @stub
    // Returns a concurrent Collector that accumulates elements into a
    // ConcurrentMap whose keys and values are the result of applying
    // the provided mapping functions to the input elements.
    def Collector[T, _, ConcurrentMap[K, U]]: [T, K, U] = ???

    @stub
    // Returns a concurrent Collector that accumulates elements into a
    // ConcurrentMap whose keys and values are the result of applying
    // the provided mapping functions to the input elements.
    def Collector[T, _, M]: [T, K, U, M <: ConcurrentMap[K, U]] = ???

    @stub
    // Returns a Collector that accumulates the input elements into a
    // new List.
    def Collector[T, _, List[T]]: [T] = ???

    @stub
    // Returns a Collector that accumulates elements into a
    // Map whose keys and values are the result of applying the provided
    // mapping functions to the input elements.
    def Collector[T, _, Map[K, U]]: [T, K, U] = ???

    @stub
    // Returns a Collector that accumulates elements into a
    // Map whose keys and values are the result of applying the provided
    // mapping functions to the input elements.
    def Collector[T, _, Map[K, U]]: [T, K, U] = ???

    @stub
    // Returns a Collector that accumulates elements into a
    // Map whose keys and values are the result of applying the provided
    // mapping functions to the input elements.
    def Collector[T, _, M]: [T, K, U, M <: Map[K, U]] = ???
}
