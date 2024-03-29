package java.util

import java.lang.Object
import scala.scalanative.annotation.stub

/** This class provides a skeletal implementation of the Set
 *  interface to minimize the effort required to implement this
 *  interface. 
 * 
 *  The process of implementing a set by extending this class is identical
 *  to that of implementing a Collection by extending AbstractCollection,
 *  except that all of the methods and constructors in subclasses of this
 *  class must obey the additional constraints imposed by the Set
 *  interface (for instance, the add method must not permit addition of
 *  multiple instances of an object to a set).
 * 
 *  Note that this class does not override any of the implementations from
 *  the AbstractCollection class.  It merely adds implementations
 *  for equals and hashCode.
 * 
 *  This class is a member of the
 *  
 *  Java Collections Framework.
 */
abstract class AbstractSet[E] extends AbstractCollection[E] with Set[E] {

    /** Sole constructor. */
    @stub
    protected def this() = ???

    /** Compares the specified object with this set for equality. */
    def equals(o: Any): Boolean

    /** Returns the hash code value for this set. */
    def hashCode(): Int

    /** Removes from this set all of its elements that are contained in the
     *  specified collection (optional operation).
     */
    def removeAll(c: Collection[_]): Boolean
}
