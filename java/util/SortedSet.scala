package java.util

// A Set that further provides a total ordering on its elements.
// The elements are ordered using their natural
// ordering, or by a Comparator typically provided at sorted
// set creation time.  The set's iterator will traverse the set in
// ascending element order. Several additional operations are provided
// to take advantage of the ordering.  (This interface is the set
// analogue of SortedMap.)
//
// All elements inserted into a sorted set must implement the Comparable
// interface (or be accepted by the specified comparator).  Furthermore, all
// such elements must be mutually comparable: e1.compareTo(e2)
// (or comparator.compare(e1, e2)) must not throw a
// ClassCastException for any elements e1 and e2 in
// the sorted set.  Attempts to violate this restriction will cause the
// offending method or constructor invocation to throw a
// ClassCastException.
//
// Note that the ordering maintained by a sorted set (whether or not an
// explicit comparator is provided) must be consistent with equals if
// the sorted set is to correctly implement the Set interface.  (See
// the Comparable interface or Comparator interface for a
// precise definition of consistent with equals.)  This is so because
// the Set interface is defined in terms of the equals
// operation, but a sorted set performs all element comparisons using its
// compareTo (or compare) method, so two elements that are
// deemed equal by this method are, from the standpoint of the sorted set,
// equal.  The behavior of a sorted set is well-defined even if its
// ordering is inconsistent with equals; it just fails to obey the general
// contract of the Set interface.
//
// All general-purpose sorted set implementation classes should
// provide four "standard" constructors: 1) A void (no arguments)
// constructor, which creates an empty sorted set sorted according to
// the natural ordering of its elements.  2) A constructor with a
// single argument of type Comparator, which creates an empty
// sorted set sorted according to the specified comparator.  3) A
// constructor with a single argument of type Collection,
// which creates a new sorted set with the same elements as its
// argument, sorted according to the natural ordering of the elements.
// 4) A constructor with a single argument of type SortedSet,
// which creates a new sorted set with the same elements and the same
// ordering as the input sorted set.  There is no way to enforce this
// recommendation, as interfaces cannot contain constructors.
//
// Note: several methods return subsets with restricted ranges.
// Such ranges are half-open, that is, they include their low
// endpoint but not their high endpoint (where applicable).
// If you need a closed range (which includes both endpoints), and
// the element type allows for calculation of the successor of a given
// value, merely request the subrange from lowEndpoint to
// successor(highEndpoint).  For example, suppose that s
// is a sorted set of strings.  The following idiom obtains a view
// containing all of the strings in s from low to
// high, inclusive:
//   SortedSet<String> sub = s.subSet(low, high+"\0");
//
// A similar technique can be used to generate an open range (which
// contains neither endpoint).  The following idiom obtains a view
// containing all of the Strings in s from low to
// high, exclusive:
//   SortedSet<String> sub = s.subSet(low+"\0", high);
//
// This interface is a member of the
// 
// Java Collections Framework.
trait SortedSet[E] extends Set[E] {

    @stub
    // Returns the comparator used to order the elements in this set,
    // or null if this set uses the natural ordering of its elements.
    def comparator(): Comparator[_ >: E] = ???

    @stub
    // Returns the first (lowest) element currently in this set.
    def first(): E = ???

    @stub
    // Returns a view of the portion of this set whose elements are
    // strictly less than toElement.
    def headSet(toElement: E): SortedSet[E] = ???

    @stub
    // Returns the last (highest) element currently in this set.
    def last(): E = ???

    @stub
    // Creates a Spliterator over the elements in this sorted set.
    def Spliterator[E]: default = ???

    @stub
    // Returns a view of the portion of this set whose elements range
    // from fromElement, inclusive, to toElement,
    // exclusive.
    def subSet(fromElement: E, toElement: E): SortedSet[E] = ???
}
