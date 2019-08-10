package java.nio.channels

import java.lang.Object
import java.nio.channels.spi.{AbstractInterruptibleChannel, SelectorProvider}
import scala.scalanative.annotation.stub

/** A channel that can be multiplexed via a Selector.
 * 
 *   In order to be used with a selector, an instance of this class must
 *  first be registered via the register method.  This method returns a new SelectionKey object
 *  that represents the channel's registration with the selector.
 * 
 *   Once registered with a selector, a channel remains registered until it
 *  is deregistered.  This involves deallocating whatever resources were
 *  allocated to the channel by the selector.
 * 
 *   A channel cannot be deregistered directly; instead, the key representing
 *  its registration must be cancelled.  Cancelling a key requests that
 *  the channel be deregistered during the selector's next selection operation.
 *  A key may be cancelled explicitly by invoking its cancel method.  All of a channel's keys are cancelled
 *  implicitly when the channel is closed, whether by invoking its close method or by interrupting a thread blocked in an I/O
 *  operation upon the channel.
 * 
 *   If the selector itself is closed then the channel will be deregistered,
 *  and the key representing its registration will be invalidated, without
 *  further delay.
 * 
 *   A channel may be registered at most once with any particular selector.
 * 
 *   Whether or not a channel is registered with one or more selectors may be
 *  determined by invoking the isRegistered method.
 * 
 *   Selectable channels are safe for use by multiple concurrent
 *  threads. 
 * 
 * 
 *  
 *  Blocking mode
 * 
 *  A selectable channel is either in blocking mode or in
 *  non-blocking mode.  In blocking mode, every I/O operation invoked
 *  upon the channel will block until it completes.  In non-blocking mode an I/O
 *  operation will never block and may transfer fewer bytes than were requested
 *  or possibly no bytes at all.  The blocking mode of a selectable channel may
 *  be determined by invoking its isBlocking method.
 * 
 *   Newly-created selectable channels are always in blocking mode.
 *  Non-blocking mode is most useful in conjunction with selector-based
 *  multiplexing.  A channel must be placed into non-blocking mode before being
 *  registered with a selector, and may not be returned to blocking mode until
 *  it has been deregistered.
 */
abstract class SelectableChannel extends AbstractInterruptibleChannel with Channel {

    /** Initializes a new instance of this class. */
    @stub
    protected def this() = ???

    /** Retrieves the object upon which the configureBlocking and register methods synchronize. */
    def blockingLock(): Any

    /** Adjusts this channel's blocking mode. */
    def configureBlocking(block: Boolean): SelectableChannel

    /** Tells whether or not every I/O operation on this channel will block
     *  until it completes.
     */
    def isBlocking(): Boolean

    /** Tells whether or not this channel is currently registered with any
     *  selectors.
     */
    def isRegistered(): Boolean

    /** Retrieves the key representing the channel's registration with the given
     *  selector.
     */
    def keyFor(sel: Selector): SelectionKey

    /** Returns the provider that created this channel. */
    def provider(): SelectorProvider

    /** Registers this channel with the given selector, returning a selection
     *  key.
     */
    def register(sel: Selector, ops: Int): SelectionKey

    /** Registers this channel with the given selector, returning a selection
     *  key.
     */
    def register(sel: Selector, ops: Int, att: Any): SelectionKey

    /** Returns an operation set
     *  identifying this channel's supported operations.
     */
    def validOps(): Int
}
