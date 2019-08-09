package java.nio.channels

import java.lang.Object
import java.net.{Socket, SocketAddress, SocketOption}
import java.nio.ByteBuffer
import java.nio.channels.spi.{AbstractInterruptibleChannel, AbstractSelectableChannel}

/** A selectable channel for stream-oriented connecting sockets.
 * 
 *   A socket channel is created by invoking one of the open
 *  methods of this class.  It is not possible to create a channel for an arbitrary,
 *  pre-existing socket. A newly-created socket channel is open but not yet
 *  connected.  An attempt to invoke an I/O operation upon an unconnected
 *  channel will cause a NotYetConnectedException to be thrown.  A
 *  socket channel can be connected by invoking its connect
 *  method; once connected, a socket channel remains connected until it is
 *  closed.  Whether or not a socket channel is connected may be determined by
 *  invoking its isConnected method.
 * 
 *   Socket channels support non-blocking connection: A socket
 *  channel may be created and the process of establishing the link to the
 *  remote socket may be initiated via the connect method for
 *  later completion by the finishConnect method.
 *  Whether or not a connection operation is in progress may be determined by
 *  invoking the isConnectionPending method.
 * 
 *   Socket channels support asynchronous shutdown, which is similar
 *  to the asynchronous close operation specified in the Channel class.
 *  If the input side of a socket is shut down by one thread while another
 *  thread is blocked in a read operation on the socket's channel, then the read
 *  operation in the blocked thread will complete without reading any bytes and
 *  will return -1.  If the output side of a socket is shut down by one
 *  thread while another thread is blocked in a write operation on the socket's
 *  channel, then the blocked thread will receive an AsynchronousCloseException.
 * 
 *   Socket options are configured using the setOption method. Socket channels support the following options:
 *  
 *  
 *    
 *      Option Name
 *      Description
 *    
 *    
 *       SO_SNDBUF 
 *       The size of the socket send buffer 
 *    
 *    
 *       SO_RCVBUF 
 *       The size of the socket receive buffer 
 *    
 *    
 *       SO_KEEPALIVE 
 *       Keep connection alive 
 *    
 *    
 *       SO_REUSEADDR 
 *       Re-use address 
 *    
 *    
 *       SO_LINGER 
 *       Linger on close if data is present (when configured in blocking mode
 *           only) 
 *    
 *    
 *       TCP_NODELAY 
 *       Disable the Nagle algorithm 
 *    
 *  
 *  
 *  Additional (implementation specific) options may also be supported.
 * 
 *   Socket channels are safe for use by multiple concurrent threads.  They
 *  support concurrent reading and writing, though at most one thread may be
 *  reading and at most one thread may be writing at any given time.  The connect and finishConnect methods are
 *  mutually synchronized against each other, and an attempt to initiate a read
 *  or write operation while an invocation of one of these methods is in
 *  progress will block until that invocation is complete.  
 */
abstract class SocketChannel extends AbstractSelectableChannel with ByteChannel with ScatteringByteChannel with GatheringByteChannel with NetworkChannel {

    /** Binds the channel's socket to a local address. */
    def bind(local: SocketAddress): SocketChannel

    /** Connects this channel's socket. */
    def connect(remote: SocketAddress): Boolean

    /** Finishes the process of connecting a socket channel. */
    def finishConnect(): Boolean

    /** Returns the socket address that this channel's socket is bound to. */
    def getLocalAddress(): SocketAddress

    /** Returns the remote address to which this channel's socket is connected. */
    def getRemoteAddress(): SocketAddress

    /** Tells whether or not this channel's network socket is connected. */
    def isConnected(): Boolean

    /** Tells whether or not a connection operation is in progress on this
     *  channel.
     */
    def isConnectionPending(): Boolean

    /** Reads a sequence of bytes from this channel into the given buffer. */
    def read(dst: ByteBuffer): Int

    /** Reads a sequence of bytes from this channel into the given buffers. */
    def read(dsts: Array[ByteBuffer]): Long

    /** Reads a sequence of bytes from this channel into a subsequence of the
     *  given buffers.
     */
    def read(dsts: Array[ByteBuffer], offset: Int, length: Int): Long

    /** Sets the value of a socket option. */
    val this: abstract[T]

    /** Shutdown the connection for reading without closing the channel. */
    def shutdownInput(): SocketChannel

    /** Shutdown the connection for writing without closing the channel. */
    def shutdownOutput(): SocketChannel

    /** Retrieves a socket associated with this channel. */
    def socket(): Socket

    /** Returns an operation set identifying this channel's supported
     *  operations.
     */
    def validOps(): Int

    /** Writes a sequence of bytes to this channel from the given buffer. */
    def write(src: ByteBuffer): Int

    /** Writes a sequence of bytes to this channel from the given buffers. */
    def write(srcs: Array[ByteBuffer]): Long
}

object SocketChannel {
    /** Opens a socket channel. */
    @stub
    def open(): SocketChannel = ???

    /** Opens a socket channel and connects it to a remote address. */
    @stub
    def open(remote: SocketAddress): SocketChannel = ???
}
