package java.util

import java.util.function.Consumer
import scala.scalanative.annotation.stub

/** An iterator over a collection.  Iterator takes the place of
 *  Enumeration in the Java Collections Framework.  Iterators
 *  differ from enumerations in two ways:
 * 
 *  
 *        Iterators allow the caller to remove elements from the
 *            underlying collection during the iteration with well-defined
 *            semantics.
 *        Method names have been improved.
 *  
 * 
 *  This interface is a member of the
 *  
 *  Java Collections Framework.
 */
trait Iterator[E] {

    /** Performs the given action for each remaining element until all elements
     *  have been processed or the action throws an exception.
     */
    @stub
    val Unit: default = ???

    /** Returns true if the iteration has more elements. */
    @stub
    def hasNext(): Boolean = ???

    /** Returns the next element in the iteration. */
    @stub
    def next(): E = ???

    /** Removes from the underlying collection the last element returned
     *  by this iterator (optional operation).
     */
    @stub
    val Unit: default = ???
}
