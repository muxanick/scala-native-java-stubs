package java.beans.beancontext

import java.lang.Object
import java.util.Iterator

// protected final subclass that encapsulates an iterator but implements
// a noop remove() method.
object protected final BeanContextSupport.BCSIterator extends Object with Iterator {

    @stub
    // Returns true if the iteration has more elements.
    def hasNext(): Boolean = ???

    @stub
    // Returns the next element in the iteration.
    def next(): Object = ???
}
