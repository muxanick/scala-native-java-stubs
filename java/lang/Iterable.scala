package java.lang

import java.util.{Iterator, Spliterator}
import java.util.function.Consumer
import scala.scalanative.annotation.stub

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
    def forEach(action: Consumer[_ >: T]): Unit = ???

    /** Returns an iterator over elements of type T. */
    @stub
    def iterator(): Iterator[T] = ???

    /** Creates a Spliterator over the elements described by this
     *  Iterable.
     */
    @stub
    def spliterator(): Spliterator[T] = ???
}
