package java.net

import java.lang.{Boolean, Integer, Object}

/** Defines the standard socket options.
 * 
 *   The name of each socket option defined by this
 *  class is its field name.
 * 
 *   In this release, the socket options defined here are used by network channels in the channels package.
 */
final class StandardSocketOptions extends Object {
}

object StandardSocketOptions {
    /** The network interface for Internet Protocol (IP) multicast datagrams. */
    @stub
    val IP_MULTICAST_IF: SocketOption[NetworkInterface] = ???

    /** Loopback for Internet Protocol (IP) multicast datagrams. */
    @stub
    val IP_MULTICAST_LOOP: SocketOption[Boolean] = ???

    /** The time-to-live for Internet Protocol (IP) multicast datagrams. */
    @stub
    val IP_MULTICAST_TTL: SocketOption[Integer] = ???

    /** The Type of Service (ToS) octet in the Internet Protocol (IP) header. */
    @stub
    val IP_TOS: SocketOption[Integer] = ???

    /** Allow transmission of broadcast datagrams. */
    @stub
    val SO_BROADCAST: SocketOption[Boolean] = ???

    /** Keep connection alive. */
    @stub
    val SO_KEEPALIVE: SocketOption[Boolean] = ???

    /** Linger on close if data is present. */
    @stub
    val SO_LINGER: SocketOption[Integer] = ???

    /** The size of the socket receive buffer. */
    @stub
    val SO_RCVBUF: SocketOption[Integer] = ???

    /** Re-use address. */
    @stub
    val SO_REUSEADDR: SocketOption[Boolean] = ???

    /** The size of the socket send buffer. */
    @stub
    val SO_SNDBUF: SocketOption[Integer] = ???
}
