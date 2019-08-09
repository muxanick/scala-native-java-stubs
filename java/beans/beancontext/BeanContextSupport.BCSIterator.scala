package java.beans.beancontext

import java.lang.Object
import java.util.Iterator

/** protected final subclass that encapsulates an iterator but implements
 *  a noop remove() method.
 */
object protected final BeanContextSupport.BCSIterator extends Object with Iterator {

    /** Returns true if the iteration has more elements. */
    @stub
    def hasNext(): Boolean = ???

    /** Returns the next element in the iteration. */
    @stub
    def next(): Object = ???
}
