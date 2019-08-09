package java.util

import java.util.function.Consumer

// An iterator over a collection.  Iterator takes the place of
// Enumeration in the Java Collections Framework.  Iterators
// differ from enumerations in two ways:
//
// 
//       Iterators allow the caller to remove elements from the
//           underlying collection during the iteration with well-defined
//           semantics.
//       Method names have been improved.
// 
//
// This interface is a member of the
// 
// Java Collections Framework.
trait Iterator[E] {

    @stub
    // Performs the given action for each remaining element until all elements
    // have been processed or the action throws an exception.
    def Unit: default = ???

    @stub
    // Returns true if the iteration has more elements.
    def hasNext(): Boolean = ???

    @stub
    // Returns the next element in the iteration.
    def next(): E = ???
}
