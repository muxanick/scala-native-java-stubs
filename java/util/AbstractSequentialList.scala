package java.util

import java.lang.Object

/** This class provides a skeletal implementation of the List
 *  interface to minimize the effort required to implement this interface
 *  backed by a "sequential access" data store (such as a linked list).  For
 *  random access data (such as an array), AbstractList should be used
 *  in preference to this class.
 * 
 *  This class is the opposite of the AbstractList class in the sense
 *  that it implements the "random access" methods (get(int index),
 *  set(int index, E element), add(int index, E element) and
 *  remove(int index)) on top of the list's list iterator, instead of
 *  the other way around.
 * 
 *  To implement a list the programmer needs only to extend this class and
 *  provide implementations for the listIterator and size
 *  methods.  For an unmodifiable list, the programmer need only implement the
 *  list iterator's hasNext, next, hasPrevious,
 *  previous and index methods.
 * 
 *  For a modifiable list the programmer should additionally implement the list
 *  iterator's set method.  For a variable-size list the programmer
 *  should additionally implement the list iterator's remove and
 *  add methods.
 * 
 *  The programmer should generally provide a void (no argument) and collection
 *  constructor, as per the recommendation in the Collection interface
 *  specification.
 * 
 *  This class is a member of the
 *  
 *  Java Collections Framework.
 */
abstract class AbstractSequentialList[E] extends AbstractList[E] {

    /** Inserts the specified element at the specified position in this list
     *  (optional operation).
     */
    def add(index: Int, element: E): Unit

    /** Inserts all of the elements in the specified collection into this
     *  list at the specified position (optional operation).
     */
    def addAll(index: Int, c: Collection[_ <: E]): Boolean

    /** Returns the element at the specified position in this list. */
    def get(index: Int): E

    /** Returns an iterator over the elements in this list (in proper
     *  sequence).
     */
    def iterator(): Iterator[E]

    /** Returns a list iterator over the elements in this list (in proper
     *  sequence).
     */
    def listIterator(index: Int): ListIterator[E]

    /** Removes the element at the specified position in this list (optional
     *  operation).
     */
    def remove(index: Int): E
}
