package java.nio.channels

import java.lang.{Integer, Long, Object, Void}
import java.net.{SocketAddress, SocketOption}
import java.nio.ByteBuffer
import java.nio.channels.spi.AsynchronousChannelProvider
import java.util.concurrent.{Future, TimeUnit}

// An asynchronous channel for stream-oriented connecting sockets.
//
//  Asynchronous socket channels are created in one of two ways. A newly-created
// AsynchronousSocketChannel is created by invoking one of the open methods defined by this class. A newly-created channel is open but
// not yet connected. A connected AsynchronousSocketChannel is created
// when a connection is made to the socket of an AsynchronousServerSocketChannel.
// It is not possible to create an asynchronous socket channel for an arbitrary,
// pre-existing socket.
//
//  A newly-created channel is connected by invoking its connect
// method; once connected, a channel remains connected until it is closed.  Whether
// or not a socket channel is connected may be determined by invoking its getRemoteAddress method. An attempt to invoke an I/O
// operation upon an unconnected channel will cause a NotYetConnectedException
// to be thrown.
//
//  Channels of this type are safe for use by multiple concurrent threads.
// They support concurrent reading and writing, though at most one read operation
// and one write operation can be outstanding at any time.
// If a thread initiates a read operation before a previous read operation has
// completed then a ReadPendingException will be thrown. Similarly, an
// attempt to initiate a write operation before a previous write has completed
// will throw a WritePendingException.
//
//  Socket options are configured using the setOption method. Asynchronous socket channels support the following options:
// 
// 
//   
//     Option Name
//     Description
//   
//   
//      SO_SNDBUF 
//      The size of the socket send buffer 
//   
//   
//      SO_RCVBUF 
//      The size of the socket receive buffer 
//   
//   
//      SO_KEEPALIVE 
//      Keep connection alive 
//   
//   
//      SO_REUSEADDR 
//      Re-use address 
//   
//   
//      TCP_NODELAY 
//      Disable the Nagle algorithm 
//   
// 
// 
// Additional (implementation specific) options may also be supported.
//
// Timeouts
//
//  The read
// and write
// methods defined by this class allow a timeout to be specified when initiating
// a read or write operation. If the timeout elapses before an operation completes
// then the operation completes with the exception InterruptedByTimeoutException. A timeout may leave the channel, or the
// underlying connection, in an inconsistent state. Where the implementation
// cannot guarantee that bytes have not been read from the channel then it puts
// the channel into an implementation specific error state. A subsequent
// attempt to initiate a read operation causes an unspecified runtime
// exception to be thrown. Similarly if a write operation times out and
// the implementation cannot guarantee bytes have not been written to the
// channel then further attempts to write to the channel cause an
// unspecified runtime exception to be thrown. When a timeout elapses then the
// state of the ByteBuffer, or the sequence of buffers, for the I/O
// operation is not defined. Buffers should be discarded or at least care must
// be taken to ensure that the buffers are not accessed while the channel remains
// open. All methods that accept timeout parameters treat values less than or
// equal to zero to mean that the I/O operation does not timeout.
abstract class AsynchronousSocketChannel extends Object with AsynchronousByteChannel, with NetworkChannel {

    // Binds the channel's socket to a local address.
    def bind(local: SocketAddress): AsynchronousSocketChannel

    // Connects this channel.
    def connect(remote: SocketAddress): Future[Void]

    // Connects this channel.
    def Unit: abstract[A]

    // Returns the socket address that this channel's socket is bound to.
    def getLocalAddress(): SocketAddress

    // Returns the remote address to which this channel's socket is connected.
    def getRemoteAddress(): SocketAddress

    // Returns the provider that created this channel.
    def provider(): AsynchronousChannelProvider

    // Reads a sequence of bytes from this channel into the given buffer.
    def read(dst: ByteBuffer): Future[Integer]

    // Reads a sequence of bytes from this channel into a subsequence of the
    // given buffers.
    def Unit: abstract[A]

    // Reads a sequence of bytes from this channel into the given buffer.
    def Unit: [A]

    // Reads a sequence of bytes from this channel into the given buffer.
    def Unit: abstract[A]

    // Sets the value of a socket option.
    def this: abstract[T]

    // Shutdown the connection for reading without closing the channel.
    def shutdownInput(): AsynchronousSocketChannel

    // Shutdown the connection for writing without closing the channel.
    def shutdownOutput(): AsynchronousSocketChannel

    // Writes a sequence of bytes to this channel from the given buffer.
    def write(src: ByteBuffer): Future[Integer]

    // Writes a sequence of bytes to this channel from a subsequence of the given
    // buffers.
    def Unit: abstract[A]

    // Writes a sequence of bytes to this channel from the given buffer.
    def Unit: [A]
}

object AsynchronousSocketChannel {
    @stub
    // Opens an asynchronous socket channel.
    def open(): AsynchronousSocketChannel = ???

    @stub
    // Opens an asynchronous socket channel.
    def open(group: AsynchronousChannelGroup): AsynchronousSocketChannel = ???
}
