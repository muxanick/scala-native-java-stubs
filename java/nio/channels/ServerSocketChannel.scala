package java.nio.channels

import java.lang.Object
import java.net.{ServerSocket, SocketAddress, SocketOption}
import java.nio.channels.spi.{AbstractInterruptibleChannel, AbstractSelectableChannel}

// A selectable channel for stream-oriented listening sockets.
//
//  A server-socket channel is created by invoking the open
// method of this class.  It is not possible to create a channel for an arbitrary,
// pre-existing ServerSocket. A newly-created server-socket channel is
// open but not yet bound.  An attempt to invoke the accept
// method of an unbound server-socket channel will cause a NotYetBoundException
// to be thrown. A server-socket channel can be bound by invoking one of the
// bind methods defined by this class.
//
//  Socket options are configured using the setOption method. Server-socket channels support the following options:
// 
// 
//   
//     Option Name
//     Description
//   
//   
//      SO_RCVBUF 
//      The size of the socket receive buffer 
//   
//   
//      SO_REUSEADDR 
//      Re-use address 
//   
// 
// 
// Additional (implementation specific) options may also be supported.
//
//  Server-socket channels are safe for use by multiple concurrent threads.
// 
abstract class ServerSocketChannel extends AbstractSelectableChannel with NetworkChannel {

    // Accepts a connection made to this channel's socket.
    def accept(): SocketChannel

    // Binds the channel's socket to a local address and configures the socket
    // to listen for connections.
    def bind(local: SocketAddress): ServerSocketChannel

    // Binds the channel's socket to a local address and configures the socket to
    // listen for connections.
    def bind(local: SocketAddress, backlog: Int): ServerSocketChannel

    // Returns the socket address that this channel's socket is bound to.
    def getLocalAddress(): SocketAddress

    // Sets the value of a socket option.
    def this: abstract[T]

    // Retrieves a server socket associated with this channel.
    def socket(): ServerSocket
}

object ServerSocketChannel {
    @stub
    // Opens a server-socket channel.
    def open(): ServerSocketChannel = ???
}
