package java.nio.channels

import java.lang.Object
import java.net.{SocketAddress, SocketOption}
import java.nio.channels.spi.AsynchronousChannelProvider
import java.util.concurrent.Future
import scala.scalanative.annotation.stub

/** An asynchronous channel for stream-oriented listening sockets.
 * 
 *   An asynchronous server-socket channel is created by invoking the
 *  open method of this class.
 *  A newly-created asynchronous server-socket channel is open but not yet bound.
 *  It can be bound to a local address and configured to listen for connections
 *  by invoking the bind method. Once bound,
 *  the accept method
 *  is used to initiate the accepting of connections to the channel's socket.
 *  An attempt to invoke the accept method on an unbound channel will
 *  cause a NotYetBoundException to be thrown.
 * 
 *   Channels of this type are safe for use by multiple concurrent threads
 *  though at most one accept operation can be outstanding at any time.
 *  If a thread initiates an accept operation before a previous accept operation
 *  has completed then an AcceptPendingException will be thrown.
 * 
 *   Socket options are configured using the setOption method. Channels of this type support the following options:
 *  
 *  
 *    
 *      Option Name
 *      Description
 *    
 *    
 *       SO_RCVBUF 
 *       The size of the socket receive buffer 
 *    
 *    
 *       SO_REUSEADDR 
 *       Re-use address 
 *    
 *  
 *  
 *  Additional (implementation specific) options may also be supported.
 * 
 *   Usage Example:
 *  
 *   final AsynchronousServerSocketChannel listener =
 *       AsynchronousServerSocketChannel.open().bind(new InetSocketAddress(5000));
 * 
 *   listener.accept(null, new CompletionHandler<AsynchronousSocketChannel,Void>() {
 *       public void completed(AsynchronousSocketChannel ch, Void att) {
 *           // accept the next connection
 *           listener.accept(null, this);
 * 
 *           // handle this connection
 *           handle(ch);
 *       }
 *       public void failed(Throwable exc, Void att) {
 *           ...
 *       }
 *   });
 *  
 */
abstract class AsynchronousServerSocketChannel extends Object with AsynchronousChannel with NetworkChannel {

    /** Initializes a new instance of this class. */
    @stub
    protected def this(provider: AsynchronousChannelProvider) = ???

    /** Accepts a connection. */
    def accept(): Future[AsynchronousSocketChannel]

    /** Accepts a connection. */
    val Unit: abstract[A]

    /** Binds the channel's socket to a local address and configures the socket to
     *  listen for connections.
     */
    def bind(local: SocketAddress): AsynchronousServerSocketChannel

    /** Binds the channel's socket to a local address and configures the socket to
     *  listen for connections.
     */
    def bind(local: SocketAddress, backlog: Int): AsynchronousServerSocketChannel

    /** Returns the socket address that this channel's socket is bound to. */
    def getLocalAddress(): SocketAddress

    /** Returns the provider that created this channel. */
    def provider(): AsynchronousChannelProvider

    /** Sets the value of a socket option. */
    val this: abstract[T]
}

object AsynchronousServerSocketChannel {
    /** Opens an asynchronous server-socket channel. */
    @stub
    def open(): AsynchronousServerSocketChannel = ???

    /** Opens an asynchronous server-socket channel. */
    @stub
    def open(group: AsynchronousChannelGroup): AsynchronousServerSocketChannel = ???
}
