package java.nio.channels

import java.lang.Object
import java.net.{DatagramSocket, ProtocolFamily, SocketAddress, SocketOption}
import java.nio.ByteBuffer
import java.nio.channels.spi.{AbstractInterruptibleChannel, AbstractSelectableChannel, SelectorProvider}
import scala.scalanative.annotation.stub

/** A selectable channel for datagram-oriented sockets.
 * 
 *   A datagram channel is created by invoking one of the open methods
 *  of this class. It is not possible to create a channel for an arbitrary,
 *  pre-existing datagram socket. A newly-created datagram channel is open but not
 *  connected. A datagram channel need not be connected in order for the send and receive methods to be used.  A datagram channel may be
 *  connected, by invoking its connect method, in order to
 *  avoid the overhead of the security checks are otherwise performed as part of
 *  every send and receive operation.  A datagram channel must be connected in
 *  order to use the read and write methods, since those methods do not
 *  accept or return socket addresses.
 * 
 *   Once connected, a datagram channel remains connected until it is
 *  disconnected or closed.  Whether or not a datagram channel is connected may
 *  be determined by invoking its isConnected method.
 * 
 *   Socket options are configured using the setOption method. A datagram channel to an Internet Protocol socket supports
 *  the following options:
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
 *       SO_REUSEADDR 
 *       Re-use address 
 *    
 *    
 *       SO_BROADCAST 
 *       Allow transmission of broadcast datagrams 
 *    
 *    
 *       IP_TOS 
 *       The Type of Service (ToS) octet in the Internet Protocol (IP) header 
 *    
 *    
 *       IP_MULTICAST_IF 
 *       The network interface for Internet Protocol (IP) multicast datagrams 
 *    
 *    
 *       IP_MULTICAST_TTL 
 *       The time-to-live for Internet Protocol (IP) multicast
 *        datagrams 
 *    
 *    
 *       IP_MULTICAST_LOOP 
 *       Loopback for Internet Protocol (IP) multicast datagrams 
 *    
 *  
 *  
 *  Additional (implementation specific) options may also be supported.
 * 
 *   Datagram channels are safe for use by multiple concurrent threads.  They
 *  support concurrent reading and writing, though at most one thread may be
 *  reading and at most one thread may be writing at any given time.  
 */
abstract class DatagramChannel extends AbstractSelectableChannel with ByteChannel with ScatteringByteChannel with GatheringByteChannel with MulticastChannel {

    /** Initializes a new instance of this class. */
    @stub
    protected def this(provider: SelectorProvider) = ???

    /** Binds the channel's socket to a local address. */
    def bind(local: SocketAddress): DatagramChannel

    /** Connects this channel's socket. */
    def connect(remote: SocketAddress): DatagramChannel

    /** Disconnects this channel's socket. */
    def disconnect(): DatagramChannel

    /** Returns the socket address that this channel's socket is bound to. */
    def getLocalAddress(): SocketAddress

    /** Returns the remote address to which this channel's socket is connected. */
    def getRemoteAddress(): SocketAddress

    /** Tells whether or not this channel's socket is connected. */
    def isConnected(): Boolean

    /** Reads a datagram from this channel. */
    def read(dst: ByteBuffer): Int

    /** Reads a datagram from this channel. */
    def read(dsts: Array[ByteBuffer]): Long

    /** Reads a datagram from this channel. */
    def read(dsts: Array[ByteBuffer], offset: Int, length: Int): Long

    /** Receives a datagram via this channel. */
    def receive(dst: ByteBuffer): SocketAddress

    /** Sends a datagram via this channel. */
    def send(src: ByteBuffer, target: SocketAddress): Int

    /** Sets the value of a socket option. */
    val this: abstract[T]

    /** Retrieves a datagram socket associated with this channel. */
    def socket(): DatagramSocket

    /** Returns an operation set identifying this channel's supported
     *  operations.
     */
    def validOps(): Int

    /** Writes a datagram to this channel. */
    def write(src: ByteBuffer): Int

    /** Writes a datagram to this channel. */
    def write(srcs: Array[ByteBuffer]): Long

    /** Writes a datagram to this channel. */
    def write(srcs: Array[ByteBuffer], offset: Int, length: Int): Long
}

object DatagramChannel {
    /** Opens a datagram channel. */
    @stub
    def open(): DatagramChannel = ???

    /** Opens a datagram channel. */
    @stub
    def open(family: ProtocolFamily): DatagramChannel = ???
}
