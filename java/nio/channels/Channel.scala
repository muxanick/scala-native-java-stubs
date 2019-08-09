package java.nio.channels

import java.io.Closeable
import scala.scalanative.annotation.stub

/** A nexus for I/O operations.
 * 
 *   A channel represents an open connection to an entity such as a hardware
 *  device, a file, a network socket, or a program component that is capable of
 *  performing one or more distinct I/O operations, for example reading or
 *  writing.
 * 
 *   A channel is either open or closed.  A channel is open upon creation,
 *  and once closed it remains closed.  Once a channel is closed, any attempt to
 *  invoke an I/O operation upon it will cause a ClosedChannelException
 *  to be thrown.  Whether or not a channel is open may be tested by invoking
 *  its isOpen method.
 * 
 *   Channels are, in general, intended to be safe for multithreaded access
 *  as described in the specifications of the interfaces and classes that extend
 *  and implement this interface.
 */
trait Channel extends Closeable {

    /** Closes this channel. */
    @stub
    def close(): Unit = ???

    /** Tells whether or not this channel is open. */
    @stub
    def isOpen(): Boolean = ???
}
