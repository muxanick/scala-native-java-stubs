package java.beans.beancontext

import java.lang.Object
import java.util.Iterator
import scala.scalanative.annotation.stub

/** protected final subclass that encapsulates an iterator but implements
 *  a noop remove() method.
 */
final object protected BeanContextSupport_BCSIterator extends Object with Iterator {

    /** Returns true if the iteration has more elements. */
    @stub
    def hasNext(): Boolean = ???

    /** Returns the next element in the iteration. */
    @stub
    def next(): Any = ???

    /** Removes from the underlying collection the last element returned
     *  by this iterator (optional operation).
     */
    @stub
    def remove(): Unit = ???
}
