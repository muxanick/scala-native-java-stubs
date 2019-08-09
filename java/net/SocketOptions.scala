package java.net

import java.lang.Object

// Interface of methods to get/set socket options.  This interface is
// implemented by: SocketImpl and  DatagramSocketImpl.
// Subclasses of these should override the methods
// of this interface in order to support their own options.
// 
// The methods and constants which specify options in this interface are
// for implementation only.  If you're not subclassing SocketImpl or
// DatagramSocketImpl, you won't use these directly. There are
// type-safe methods to get/set each of these options in Socket, ServerSocket,
// DatagramSocket and MulticastSocket.
// 
trait SocketOptions {

    @stub
    // Fetch the value of an option.
    def getOption(optID: Int): Object = ???
}

object SocketOptions {
    @stub
    // Set which outgoing interface on which to send multicast packets.
    def IP_MULTICAST_IF: Int = ???

    @stub
    // Same as above.
    def IP_MULTICAST_IF2: Int = ???

    @stub
    // This option enables or disables local loopback of multicast datagrams.
    def IP_MULTICAST_LOOP: Int = ???

    @stub
    // This option sets the type-of-service or traffic class field
    // in the IP header for a TCP or UDP socket.
    def IP_TOS: Int = ???

    @stub
    // Fetch the local address binding of a socket (this option cannot
    // be "set" only "gotten", since sockets are bound at creation time,
    // and so the locally bound address cannot be changed).
    def SO_BINDADDR: Int = ???

    @stub
    // Sets SO_BROADCAST for a socket.
    def SO_BROADCAST: Int = ???

    @stub
    // When the keepalive option is set for a TCP socket and no data
    // has been exchanged across the socket in either direction for
    // 2 hours (NOTE: the actual value is implementation dependent),
    // TCP automatically sends a keepalive probe to the peer.
    def SO_KEEPALIVE: Int = ???

    @stub
    // Specify a linger-on-close timeout.
    def SO_LINGER: Int = ???

    @stub
    // When the OOBINLINE option is set, any TCP urgent data received on
    // the socket will be received through the socket input stream.
    def SO_OOBINLINE: Int = ???

    @stub
    // Set a hint the size of the underlying buffers used by the
    // platform for incoming network I/O.
    def SO_RCVBUF: Int = ???

    @stub
    // Sets SO_REUSEADDR for a socket.
    def SO_REUSEADDR: Int = ???

    @stub
    // Set a hint the size of the underlying buffers used by the
    // platform for outgoing network I/O.
    def SO_SNDBUF: Int = ???

    @stub
    // Set a timeout on blocking Socket operations:
    def SO_TIMEOUT: Int = ???
}
