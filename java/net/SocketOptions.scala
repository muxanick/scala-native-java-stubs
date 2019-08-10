package java.net

import java.lang.Object
import scala.scalanative.annotation.stub

/** Interface of methods to get/set socket options.  This interface is
 *  implemented by: SocketImpl and  DatagramSocketImpl.
 *  Subclasses of these should override the methods
 *  of this interface in order to support their own options.
 *  
 *  The methods and constants which specify options in this interface are
 *  for implementation only.  If you're not subclassing SocketImpl or
 *  DatagramSocketImpl, you won't use these directly. There are
 *  type-safe methods to get/set each of these options in Socket, ServerSocket,
 *  DatagramSocket and MulticastSocket.
 *  
 */
trait SocketOptions {

    /** Fetch the value of an option. */
    @stub
    def getOption(optID: Int): Any = ???

    /** Enable/disable the option specified by optID. */
    @stub
    def setOption(optID: Int, value: Any): Unit = ???
}

object SocketOptions {
    /** Set which outgoing interface on which to send multicast packets. */
    @stub
    val IP_MULTICAST_IF: Int = ???

    /** Same as above. */
    @stub
    val IP_MULTICAST_IF2: Int = ???

    /** This option enables or disables local loopback of multicast datagrams. */
    @stub
    val IP_MULTICAST_LOOP: Int = ???

    /** This option sets the type-of-service or traffic class field
     *  in the IP header for a TCP or UDP socket.
     */
    @stub
    val IP_TOS: Int = ???

    /** Fetch the local address binding of a socket (this option cannot
     *  be "set" only "gotten", since sockets are bound at creation time,
     *  and so the locally bound address cannot be changed).
     */
    @stub
    val SO_BINDADDR: Int = ???

    /** Sets SO_BROADCAST for a socket. */
    @stub
    val SO_BROADCAST: Int = ???

    /** When the keepalive option is set for a TCP socket and no data
     *  has been exchanged across the socket in either direction for
     *  2 hours (NOTE: the actual value is implementation dependent),
     *  TCP automatically sends a keepalive probe to the peer.
     */
    @stub
    val SO_KEEPALIVE: Int = ???

    /** Specify a linger-on-close timeout. */
    @stub
    val SO_LINGER: Int = ???

    /** When the OOBINLINE option is set, any TCP urgent data received on
     *  the socket will be received through the socket input stream.
     */
    @stub
    val SO_OOBINLINE: Int = ???

    /** Set a hint the size of the underlying buffers used by the
     *  platform for incoming network I/O.
     */
    @stub
    val SO_RCVBUF: Int = ???

    /** Sets SO_REUSEADDR for a socket. */
    @stub
    val SO_REUSEADDR: Int = ???

    /** Set a hint the size of the underlying buffers used by the
     *  platform for outgoing network I/O.
     */
    @stub
    val SO_SNDBUF: Int = ???

    /** Set a timeout on blocking Socket operations: */
    @stub
    val SO_TIMEOUT: Int = ???

    /** Disable Nagle's algorithm for this connection. */
    @stub
    val TCP_NODELAY: Int = ???
}
