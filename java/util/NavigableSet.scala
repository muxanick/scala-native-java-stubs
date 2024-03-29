package java.util

import scala.scalanative.annotation.stub

/** A SortedSet extended with navigation methods reporting
 *  closest matches for given search targets. Methods lower,
 *  floor, ceiling, and higher return elements
 *  respectively less than, less than or equal, greater than or equal,
 *  and greater than a given element, returning null if there
 *  is no such element.  A NavigableSet may be accessed and
 *  traversed in either ascending or descending order.  The descendingSet method returns a view of the set with the senses of
 *  all relational and directional methods inverted. The performance of
 *  ascending operations and views is likely to be faster than that of
 *  descending ones.  This interface additionally defines methods
 *  pollFirst and pollLast that return and remove the
 *  lowest and highest element, if one exists, else returning null.  Methods subSet, headSet,
 *  and tailSet differ from the like-named SortedSet methods in accepting additional arguments describing
 *  whether lower and upper bounds are inclusive versus exclusive.
 *  Subsets of any NavigableSet must implement the NavigableSet interface.
 * 
 *   The return values of navigation methods may be ambiguous in
 *  implementations that permit null elements. However, even
 *  in this case the result can be disambiguated by checking
 *  contains(null). To avoid such issues, implementations of
 *  this interface are encouraged to not permit insertion of
 *  null elements. (Note that sorted sets of Comparable elements intrinsically do not permit null.)
 * 
 *  Methods
 *  subSet(E, E),
 *  headSet(E), and
 *  tailSet(E)
 *  are specified to return SortedSet to allow existing
 *  implementations of SortedSet to be compatibly retrofitted to
 *  implement NavigableSet, but extensions and implementations
 *  of this interface are encouraged to override these methods to return
 *  NavigableSet.
 * 
 *  This interface is a member of the
 *  
 *  Java Collections Framework.
 */
trait NavigableSet[E] extends SortedSet[E] {

    /** Returns the least element in this set greater than or equal to
     *  the given element, or null if there is no such element.
     */
    @stub
    def ceiling(e: E): E = ???

    /** Returns an iterator over the elements in this set, in descending order. */
    @stub
    def descendingIterator(): Iterator[E] = ???

    /** Returns a reverse order view of the elements contained in this set. */
    @stub
    def descendingSet(): NavigableSet[E] = ???

    /** Returns the greatest element in this set less than or equal to
     *  the given element, or null if there is no such element.
     */
    @stub
    def floor(e: E): E = ???

    /** Returns a view of the portion of this set whose elements are
     *  strictly less than toElement.
     */
    @stub
    def headSet(toElement: E): SortedSet[E] = ???

    /** Returns a view of the portion of this set whose elements are less than
     *  (or equal to, if inclusive is true) toElement.
     */
    @stub
    def headSet(toElement: E, inclusive: Boolean): NavigableSet[E] = ???

    /** Returns the least element in this set strictly greater than the
     *  given element, or null if there is no such element.
     */
    @stub
    def higher(e: E): E = ???

    /** Returns an iterator over the elements in this set, in ascending order. */
    @stub
    def iterator(): Iterator[E] = ???

    /** Returns the greatest element in this set strictly less than the
     *  given element, or null if there is no such element.
     */
    @stub
    def lower(e: E): E = ???

    /** Retrieves and removes the first (lowest) element,
     *  or returns null if this set is empty.
     */
    @stub
    def pollFirst(): E = ???

    /** Retrieves and removes the last (highest) element,
     *  or returns null if this set is empty.
     */
    @stub
    def pollLast(): E = ???

    /** Returns a view of the portion of this set whose elements range from
     *  fromElement to toElement.
     */
    @stub
    def subSet(fromElement: E, fromInclusive: Boolean, toElement: E, toInclusive: Boolean): NavigableSet[E] = ???

    /** Returns a view of the portion of this set whose elements range
     *  from fromElement, inclusive, to toElement,
     *  exclusive.
     */
    @stub
    def subSet(fromElement: E, toElement: E): SortedSet[E] = ???

    /** Returns a view of the portion of this set whose elements are
     *  greater than or equal to fromElement.
     */
    @stub
    def tailSet(fromElement: E): SortedSet[E] = ???

    /** Returns a view of the portion of this set whose elements are greater
     *  than (or equal to, if inclusive is true) fromElement.
     */
    @stub
    def tailSet(fromElement: E, inclusive: Boolean): NavigableSet[E] = ???
}
