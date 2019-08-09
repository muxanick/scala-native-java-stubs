package java.lang

import java.util.Iterator
import java.util.function.Consumer

// Implementing this interface allows an object to be the target of
// the "for-each loop" statement. See
// 
// For-each Loop
// 
trait Iterable[T] {

    @stub
    // Performs the given action for each element of the Iterable
    // until all elements have been processed or the action throws an
    // exception.
    def Unit: default = ???

    @stub
    // Returns an iterator over elements of type T.
    def iterator(): Iterator[T] = ???
}
