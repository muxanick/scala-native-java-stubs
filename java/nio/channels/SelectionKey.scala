package java.nio.channels

import java.lang.Object
import scala.scalanative.annotation.stub

/** A token representing the registration of a SelectableChannel with a
 *  Selector.
 * 
 *   A selection key is created each time a channel is registered with a
 *  selector.  A key remains valid until it is cancelled by invoking its
 *  cancel method, by closing its channel, or by closing its
 *  selector.  Cancelling a key does not immediately remove it from its
 *  selector; it is instead added to the selector's cancelled-key set for removal during the
 *  next selection operation.  The validity of a key may be tested by invoking
 *  its isValid method.
 * 
 *  
 * 
 *   A selection key contains two operation sets represented as
 *  integer values.  Each bit of an operation set denotes a category of
 *  selectable operations that are supported by the key's channel.
 * 
 *  
 * 
 *     The interest set determines which operation categories will
 *    be tested for readiness the next time one of the selector's selection
 *    methods is invoked.  The interest set is initialized with the value given
 *    when the key is created; it may later be changed via the interestOps(int) method. 
 * 
 *     The ready set identifies the operation categories for which
 *    the key's channel has been detected to be ready by the key's selector.
 *    The ready set is initialized to zero when the key is created; it may later
 *    be updated by the selector during a selection operation, but it cannot be
 *    updated directly. 
 * 
 *  
 * 
 *   That a selection key's ready set indicates that its channel is ready for
 *  some operation category is a hint, but not a guarantee, that an operation in
 *  such a category may be performed by a thread without causing the thread to
 *  block.  A ready set is most likely to be accurate immediately after the
 *  completion of a selection operation.  It is likely to be made inaccurate by
 *  external events and by I/O operations that are invoked upon the
 *  corresponding channel.
 * 
 *   This class defines all known operation-set bits, but precisely which
 *  bits are supported by a given channel depends upon the type of the channel.
 *  Each subclass of SelectableChannel defines an validOps() method which returns a set
 *  identifying just those operations that are supported by the channel.  An
 *  attempt to set or test an operation-set bit that is not supported by a key's
 *  channel will result in an appropriate run-time exception.
 * 
 *   It is often necessary to associate some application-specific data with a
 *  selection key, for example an object that represents the state of a
 *  higher-level protocol and handles readiness notifications in order to
 *  implement that protocol.  Selection keys therefore support the
 *  attachment of a single arbitrary object to a key.  An object can be
 *  attached via the attach method and then later retrieved via
 *  the attachment method.
 * 
 *   Selection keys are safe for use by multiple concurrent threads.  The
 *  operations of reading and writing the interest set will, in general, be
 *  synchronized with certain operations of the selector.  Exactly how this
 *  synchronization is performed is implementation-dependent: In a naive
 *  implementation, reading or writing the interest set may block indefinitely
 *  if a selection operation is already in progress; in a high-performance
 *  implementation, reading or writing the interest set may block briefly, if at
 *  all.  In any case, a selection operation will always use the interest-set
 *  value that was current at the moment that the operation began.  
 */
abstract class SelectionKey extends Object {

    /** Constructs an instance of this class. */
    @stub
    protected def this() = ???

    /** Attaches the given object to this key. */
    def attach(ob: Any): Any

    /** Retrieves the current attachment. */
    def attachment(): Any

    /** Requests that the registration of this key's channel with its selector
     *  be cancelled.
     */
    def cancel(): Unit

    /** Returns the channel for which this key was created. */
    def channel(): SelectableChannel

    /** Retrieves this key's interest set. */
    def interestOps(): Int

    /** Sets this key's interest set to the given value. */
    def interestOps(ops: Int): SelectionKey

    /** Tests whether this key's channel is ready to accept a new socket
     *  connection.
     */
    def isAcceptable(): Boolean

    /** Tests whether this key's channel has either finished, or failed to
     *  finish, its socket-connection operation.
     */
    def isConnectable(): Boolean

    /** Tests whether this key's channel is ready for reading. */
    def isReadable(): Boolean

    /** Tells whether or not this key is valid. */
    def isValid(): Boolean

    /** Tests whether this key's channel is ready for writing. */
    def isWritable(): Boolean

    /** Retrieves this key's ready-operation set. */
    def readyOps(): Int

    /** Returns the selector for which this key was created. */
    def selector(): Selector
}

object SelectionKey {
    /** Operation-set bit for socket-accept operations. */
    @stub
    val OP_ACCEPT: Int = ???

    /** Operation-set bit for socket-connect operations. */
    @stub
    val OP_CONNECT: Int = ???

    /** Operation-set bit for read operations. */
    @stub
    val OP_READ: Int = ???

    /** Operation-set bit for write operations. */
    @stub
    val OP_WRITE: Int = ???
}
