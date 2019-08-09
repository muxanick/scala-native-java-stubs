package java.util.concurrent

import java.lang.Object
import java.util.{Deque, Iterator}
import scala.scalanative.annotation.stub

/** A Deque that additionally supports blocking operations that wait
 *  for the deque to become non-empty when retrieving an element, and wait for
 *  space to become available in the deque when storing an element.
 * 
 *  BlockingDeque methods come in four forms, with different ways
 *  of handling operations that cannot be satisfied immediately, but may be
 *  satisfied at some point in the future:
 *  one throws an exception, the second returns a special value (either
 *  null or false, depending on the operation), the third
 *  blocks the current thread indefinitely until the operation can succeed,
 *  and the fourth blocks for only a given maximum time limit before giving
 *  up.  These methods are summarized in the following table:
 * 
 *  
 *  Summary of BlockingDeque methods
 *   
 *      First Element (Head)
 *   
 *   
 *     
 *     Throws exception
 *     Special value
 *     Blocks
 *     Times out
 *   
 *   
 *     Insert
 *     addFirst(e)
 *     offerFirst(e)
 *     putFirst(e)
 *     offerFirst(e, time, unit)
 *   
 *   
 *     Remove
 *     removeFirst()
 *     pollFirst()
 *     takeFirst()
 *     pollFirst(time, unit)
 *   
 *   
 *     Examine
 *     getFirst()
 *     peekFirst()
 *     not applicable
 *     not applicable
 *   
 *   
 *      Last Element (Tail)
 *   
 *   
 *     
 *     Throws exception
 *     Special value
 *     Blocks
 *     Times out
 *   
 *   
 *     Insert
 *     addLast(e)
 *     offerLast(e)
 *     putLast(e)
 *     offerLast(e, time, unit)
 *   
 *   
 *     Remove
 *     removeLast()
 *     pollLast()
 *     takeLast()
 *     pollLast(time, unit)
 *   
 *   
 *     Examine
 *     getLast()
 *     peekLast()
 *     not applicable
 *     not applicable
 *   
 *  
 * 
 *  Like any BlockingQueue, a BlockingDeque is thread safe,
 *  does not permit null elements, and may (or may not) be
 *  capacity-constrained.
 * 
 *  A BlockingDeque implementation may be used directly as a FIFO
 *  BlockingQueue. The methods inherited from the
 *  BlockingQueue interface are precisely equivalent to
 *  BlockingDeque methods as indicated in the following table:
 * 
 *  
 *  Comparison of BlockingQueue and BlockingDeque methods
 *   
 *      BlockingQueue Method
 *      Equivalent BlockingDeque Method
 *   
 *   
 *      Insert
 *   
 *   
 *     add(e)
 *     addLast(e)
 *   
 *   
 *     offer(e)
 *     offerLast(e)
 *   
 *   
 *     put(e)
 *     putLast(e)
 *   
 *   
 *     offer(e, time, unit)
 *     offerLast(e, time, unit)
 *   
 *   
 *      Remove
 *   
 *   
 *     remove()
 *     removeFirst()
 *   
 *   
 *     poll()
 *     pollFirst()
 *   
 *   
 *     take()
 *     takeFirst()
 *   
 *   
 *     poll(time, unit)
 *     pollFirst(time, unit)
 *   
 *   
 *      Examine
 *   
 *   
 *     element()
 *     getFirst()
 *   
 *   
 *     peek()
 *     peekFirst()
 *   
 *  
 * 
 *  Memory consistency effects: As with other concurrent
 *  collections, actions in a thread prior to placing an object into a
 *  BlockingDeque
 *  happen-before
 *  actions subsequent to the access or removal of that element from
 *  the BlockingDeque in another thread.
 * 
 *  This interface is a member of the
 *  
 *  Java Collections Framework.
 */
trait BlockingDeque[E] extends BlockingQueue[E] with Deque[E] {

    /** Inserts the specified element into the queue represented by this deque
     *  (in other words, at the tail of this deque) if it is possible to do so
     *  immediately without violating capacity restrictions, returning
     *  true upon success and throwing an
     *  IllegalStateException if no space is currently available.
     */
    @stub
    def add(e: E): Boolean = ???

    /** Inserts the specified element at the front of this deque if it is
     *  possible to do so immediately without violating capacity restrictions,
     *  throwing an IllegalStateException if no space is currently
     *  available.
     */
    @stub
    def addFirst(e: E): Unit = ???

    /** Inserts the specified element at the end of this deque if it is
     *  possible to do so immediately without violating capacity restrictions,
     *  throwing an IllegalStateException if no space is currently
     *  available.
     */
    @stub
    def addLast(e: E): Unit = ???

    /** Returns true if this deque contains the specified element. */
    @stub
    def contains(o: Object): Boolean = ???

    /** Retrieves, but does not remove, the head of the queue represented by
     *  this deque (in other words, the first element of this deque).
     */
    @stub
    def element(): E = ???

    /** Returns an iterator over the elements in this deque in proper sequence. */
    @stub
    def iterator(): Iterator[E] = ???

    /** Inserts the specified element into the queue represented by this deque
     *  (in other words, at the tail of this deque) if it is possible to do so
     *  immediately without violating capacity restrictions, returning
     *  true upon success and false if no space is currently
     *  available.
     */
    @stub
    def offer(e: E): Boolean = ???

    /** Inserts the specified element into the queue represented by this deque
     *  (in other words, at the tail of this deque), waiting up to the
     *  specified wait time if necessary for space to become available.
     */
    @stub
    def offer(e: E, timeout: Long, unit: TimeUnit): Boolean = ???

    /** Inserts the specified element at the front of this deque if it is
     *  possible to do so immediately without violating capacity restrictions,
     *  returning true upon success and false if no space is
     *  currently available.
     */
    @stub
    def offerFirst(e: E): Boolean = ???

    /** Inserts the specified element at the front of this deque,
     *  waiting up to the specified wait time if necessary for space to
     *  become available.
     */
    @stub
    def offerFirst(e: E, timeout: Long, unit: TimeUnit): Boolean = ???

    /** Inserts the specified element at the end of this deque if it is
     *  possible to do so immediately without violating capacity restrictions,
     *  returning true upon success and false if no space is
     *  currently available.
     */
    @stub
    def offerLast(e: E): Boolean = ???

    /** Inserts the specified element at the end of this deque,
     *  waiting up to the specified wait time if necessary for space to
     *  become available.
     */
    @stub
    def offerLast(e: E, timeout: Long, unit: TimeUnit): Boolean = ???

    /** Retrieves, but does not remove, the head of the queue represented by
     *  this deque (in other words, the first element of this deque), or
     *  returns null if this deque is empty.
     */
    @stub
    def peek(): E = ???

    /** Retrieves and removes the head of the queue represented by this deque
     *  (in other words, the first element of this deque), or returns
     *  null if this deque is empty.
     */
    @stub
    def poll(): E = ???

    /** Retrieves and removes the head of the queue represented by this deque
     *  (in other words, the first element of this deque), waiting up to the
     *  specified wait time if necessary for an element to become available.
     */
    @stub
    def poll(timeout: Long, unit: TimeUnit): E = ???

    /** Retrieves and removes the first element of this deque, waiting
     *  up to the specified wait time if necessary for an element to
     *  become available.
     */
    @stub
    def pollFirst(timeout: Long, unit: TimeUnit): E = ???

    /** Retrieves and removes the last element of this deque, waiting
     *  up to the specified wait time if necessary for an element to
     *  become available.
     */
    @stub
    def pollLast(timeout: Long, unit: TimeUnit): E = ???

    /** Pushes an element onto the stack represented by this deque (in other
     *  words, at the head of this deque) if it is possible to do so
     *  immediately without violating capacity restrictions, throwing an
     *  IllegalStateException if no space is currently available.
     */
    @stub
    def push(e: E): Unit = ???

    /** Inserts the specified element into the queue represented by this deque
     *  (in other words, at the tail of this deque), waiting if necessary for
     *  space to become available.
     */
    @stub
    def put(e: E): Unit = ???

    /** Inserts the specified element at the front of this deque,
     *  waiting if necessary for space to become available.
     */
    @stub
    def putFirst(e: E): Unit = ???

    /** Inserts the specified element at the end of this deque,
     *  waiting if necessary for space to become available.
     */
    @stub
    def putLast(e: E): Unit = ???

    /** Retrieves and removes the head of the queue represented by this deque
     *  (in other words, the first element of this deque).
     */
    @stub
    def remove(): E = ???

    /** Removes the first occurrence of the specified element from this deque. */
    @stub
    def remove(o: Object): Boolean = ???

    /** Removes the first occurrence of the specified element from this deque. */
    @stub
    def removeFirstOccurrence(o: Object): Boolean = ???

    /** Removes the last occurrence of the specified element from this deque. */
    @stub
    def removeLastOccurrence(o: Object): Boolean = ???

    /** Returns the number of elements in this deque. */
    @stub
    def size(): Int = ???

    /** Retrieves and removes the head of the queue represented by this deque
     *  (in other words, the first element of this deque), waiting if
     *  necessary until an element becomes available.
     */
    @stub
    def take(): E = ???

    /** Retrieves and removes the first element of this deque, waiting
     *  if necessary until an element becomes available.
     */
    @stub
    def takeFirst(): E = ???

    /** Retrieves and removes the last element of this deque, waiting
     *  if necessary until an element becomes available.
     */
    @stub
    def takeLast(): E = ???
}
