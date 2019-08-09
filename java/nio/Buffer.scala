package java.nio

import java.lang.Object

/** A container for data of a specific primitive type.
 * 
 *   A buffer is a linear, finite sequence of elements of a specific
 *  primitive type.  Aside from its content, the essential properties of a
 *  buffer are its capacity, limit, and position: 
 * 
 *  
 * 
 *     A buffer's capacity is the number of elements it contains.  The
 *    capacity of a buffer is never negative and never changes.  
 * 
 *     A buffer's limit is the index of the first element that should
 *    not be read or written.  A buffer's limit is never negative and is never
 *    greater than its capacity.  
 * 
 *     A buffer's position is the index of the next element to be
 *    read or written.  A buffer's position is never negative and is never
 *    greater than its limit.  
 * 
 *  
 * 
 *   There is one subclass of this class for each non-boolean primitive type.
 * 
 * 
 *   Transferring data 
 * 
 *   Each subclass of this class defines two categories of get and
 *  put operations: 
 * 
 *  
 * 
 *     Relative operations read or write one or more elements starting
 *    at the current position and then increment the position by the number of
 *    elements transferred.  If the requested transfer exceeds the limit then a
 *    relative get operation throws a BufferUnderflowException
 *    and a relative put operation throws a BufferOverflowException; in either case, no data is transferred.  
 * 
 *     Absolute operations take an explicit element index and do not
 *    affect the position.  Absolute get and put operations throw
 *    an IndexOutOfBoundsException if the index argument exceeds the
 *    limit.  
 * 
 *  
 * 
 *   Data may also, of course, be transferred in to or out of a buffer by the
 *  I/O operations of an appropriate channel, which are always relative to the
 *  current position.
 * 
 * 
 *   Marking and resetting 
 * 
 *   A buffer's mark is the index to which its position will be reset
 *  when the reset method is invoked.  The mark is not always
 *  defined, but when it is defined it is never negative and is never greater
 *  than the position.  If the mark is defined then it is discarded when the
 *  position or the limit is adjusted to a value smaller than the mark.  If the
 *  mark is not defined then invoking the reset method causes an
 *  InvalidMarkException to be thrown.
 * 
 * 
 *   Invariants 
 * 
 *   The following invariant holds for the mark, position, limit, and
 *  capacity values:
 * 
 *  
 *      0 <=
 *      mark <=
 *      position <=
 *      limit <=
 *      capacity
 *  
 * 
 *   A newly-created buffer always has a position of zero and a mark that is
 *  undefined.  The initial limit may be zero, or it may be some other value
 *  that depends upon the type of the buffer and the manner in which it is
 *  constructed.  Each element of a newly-allocated buffer is initialized
 *  to zero.
 * 
 * 
 *   Clearing, flipping, and rewinding 
 * 
 *   In addition to methods for accessing the position, limit, and capacity
 *  values and for marking and resetting, this class also defines the following
 *  operations upon buffers:
 * 
 *  
 * 
 *     clear() makes a buffer ready for a new sequence of
 *    channel-read or relative put operations: It sets the limit to the
 *    capacity and the position to zero.  
 * 
 *     flip() makes a buffer ready for a new sequence of
 *    channel-write or relative get operations: It sets the limit to the
 *    current position and then sets the position to zero.  
 * 
 *     rewind() makes a buffer ready for re-reading the data that
 *    it already contains: It leaves the limit unchanged and sets the position
 *    to zero.  
 * 
 *  
 * 
 * 
 *   Read-only buffers 
 * 
 *   Every buffer is readable, but not every buffer is writable.  The
 *  mutation methods of each buffer class are specified as optional
 *  operations that will throw a ReadOnlyBufferException when
 *  invoked upon a read-only buffer.  A read-only buffer does not allow its
 *  content to be changed, but its mark, position, and limit values are mutable.
 *  Whether or not a buffer is read-only may be determined by invoking its
 *  isReadOnly method.
 * 
 * 
 *   Thread safety 
 * 
 *   Buffers are not safe for use by multiple concurrent threads.  If a
 *  buffer is to be used by more than one thread then access to the buffer
 *  should be controlled by appropriate synchronization.
 * 
 * 
 *   Invocation chaining 
 * 
 *   Methods in this class that do not otherwise have a value to return are
 *  specified to return the buffer upon which they are invoked.  This allows
 *  method invocations to be chained; for example, the sequence of statements
 * 
 *  
 *  b.flip();
 *  b.position(23);
 *  b.limit(42);
 * 
 *  can be replaced by the single, more compact statement
 * 
 *  
 *  b.flip().position(23).limit(42);
 */
abstract class Buffer extends Object {

    /** Returns the array that backs this
     *  buffer  (optional operation).
     */
    def array(): Object

    /** Returns the offset within this buffer's backing array of the first
     *  element of the buffer  (optional operation).
     */
    def arrayOffset(): Int

    /** Returns this buffer's capacity. */
    def capacity(): Int

    /** Clears this buffer. */
    def clear(): Buffer

    /** Flips this buffer. */
    def flip(): Buffer

    /** Tells whether or not this buffer is backed by an accessible
     *  array.
     */
    def hasArray(): Boolean

    /** Tells whether there are any elements between the current position and
     *  the limit.
     */
    def hasRemaining(): Boolean

    /** Tells whether or not this buffer is
     *  direct.
     */
    def isDirect(): Boolean

    /** Tells whether or not this buffer is read-only. */
    def isReadOnly(): Boolean

    /** Returns this buffer's limit. */
    def limit(): Int

    /** Sets this buffer's limit. */
    def limit(newLimit: Int): Buffer

    /** Sets this buffer's mark at its position. */
    def mark(): Buffer

    /** Returns this buffer's position. */
    def position(): Int

    /** Sets this buffer's position. */
    def position(newPosition: Int): Buffer

    /** Returns the number of elements between the current position and the
     *  limit.
     */
    def remaining(): Int

    /** Resets this buffer's position to the previously-marked position. */
    def reset(): Buffer
}
