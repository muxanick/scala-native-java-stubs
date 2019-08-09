package java.lang

import java.util.Iterator
import java.util.function.Consumer

/** Implementing this interface allows an object to be the target of
 *  the "for-each loop" statement. See
 *  
 *  For-each Loop
 *  
 */
trait Iterable[T] {

    /** Performs the given action for each element of the Iterable
     *  until all elements have been processed or the action throws an
     *  exception.
     */
    @stub
    val Unit: default = ???

    /** Returns an iterator over elements of type T. */
    @stub
    def iterator(): Iterator[T] = ???
}
