package java.nio.channels.spi

import java.lang.Object
import java.nio.channels.{SelectableChannel, SelectionKey, Selector}
import scala.scalanative.annotation.stub

/** Base implementation class for selectable channels.
 * 
 *   This class defines methods that handle the mechanics of channel
 *  registration, deregistration, and closing.  It maintains the current
 *  blocking mode of this channel as well as its current set of selection keys.
 *  It performs all of the synchronization required to implement the SelectableChannel specification.  Implementations of the
 *  abstract protected methods defined in this class need not synchronize
 *  against other threads that might be engaged in the same operations.  
 */
abstract class AbstractSelectableChannel extends SelectableChannel {

    /** Initializes a new instance of this class. */
    @stub
    protected def this(provider: SelectorProvider) = ???

    /** Retrieves the object upon which the configureBlocking and register methods synchronize. */
    def blockingLock(): Object

    /** Adjusts this channel's blocking mode. */
    def configureBlocking(block: Boolean): SelectableChannel

    /** Closes this channel. */
    protected def implCloseChannel(): Unit

    /** Closes this selectable channel. */
    protected def implCloseSelectableChannel(): Unit

    /** Adjusts this channel's blocking mode. */
    protected def implConfigureBlocking(block: Boolean): Unit

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

    /** Registers this channel with the given selector, returning a selection key. */
    def register(sel: Selector, ops: Int, att: Object): SelectionKey
}
