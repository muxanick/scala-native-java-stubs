package java.net

import java.lang.{Boolean, Integer, Object}

// Defines the standard socket options.
//
//  The name of each socket option defined by this
// class is its field name.
//
//  In this release, the socket options defined here are used by network channels in the channels package.
final class StandardSocketOptions extends Object {
}

object StandardSocketOptions {
    @stub
    // The network interface for Internet Protocol (IP) multicast datagrams.
    def IP_MULTICAST_IF: SocketOption[NetworkInterface] = ???

    @stub
    // Loopback for Internet Protocol (IP) multicast datagrams.
    def IP_MULTICAST_LOOP: SocketOption[Boolean] = ???

    @stub
    // The time-to-live for Internet Protocol (IP) multicast datagrams.
    def IP_MULTICAST_TTL: SocketOption[Integer] = ???

    @stub
    // The Type of Service (ToS) octet in the Internet Protocol (IP) header.
    def IP_TOS: SocketOption[Integer] = ???

    @stub
    // Allow transmission of broadcast datagrams.
    def SO_BROADCAST: SocketOption[Boolean] = ???

    @stub
    // Keep connection alive.
    def SO_KEEPALIVE: SocketOption[Boolean] = ???

    @stub
    // Linger on close if data is present.
    def SO_LINGER: SocketOption[Integer] = ???

    @stub
    // The size of the socket receive buffer.
    def SO_RCVBUF: SocketOption[Integer] = ???

    @stub
    // Re-use address.
    def SO_REUSEADDR: SocketOption[Boolean] = ???

    @stub
    // The size of the socket send buffer.
    def SO_SNDBUF: SocketOption[Integer] = ???
}
