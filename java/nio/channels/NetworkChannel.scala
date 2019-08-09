package java.nio.channels

import java.net.{SocketAddress, SocketOption}

// A channel to a network socket.
//
//  A channel that implements this interface is a channel to a network
// socket. The bind method is used to bind the
// socket to a local address, the getLocalAddress method returns the address that the socket is bound to, and
// the setOption and getOption methods are used to set and query socket
// options.  An implementation of this interface should specify the socket options
// that it supports.
//
//  The bind and setOption methods that do
// not otherwise have a value to return are specified to return the network
// channel upon which they are invoked. This allows method invocations to be
// chained. Implementations of this interface should specialize the return type
// so that method invocations on the implementation class can be chained.
trait NetworkChannel extends Channel {

    @stub
    // Binds the channel's socket to a local address.
    def bind(local: SocketAddress): NetworkChannel = ???

    @stub
    // Returns the socket address that this channel's socket is bound to.
    def getLocalAddress(): SocketAddress = ???

    @stub
    // Returns the value of a socket option.
    def T: [T] = ???

    @stub
    // Sets the value of a socket option.
    def this: [T] = ???
}
