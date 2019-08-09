package java.net

import java.io.Closeable
import java.lang.Object
import java.nio.channels.DatagramChannel
import scala.scalanative.annotation.stub

/** This class represents a socket for sending and receiving datagram packets.
 * 
 *  A datagram socket is the sending or receiving point for a packet
 *  delivery service. Each packet sent or received on a datagram socket
 *  is individually addressed and routed. Multiple packets sent from
 *  one machine to another may be routed differently, and may arrive in
 *  any order.
 * 
 *   Where possible, a newly constructed DatagramSocket has the
 *  SO_BROADCAST socket option enabled so as
 *  to allow the transmission of broadcast datagrams. In order to receive
 *  broadcast packets a DatagramSocket should be bound to the wildcard address.
 *  In some implementations, broadcast packets may also be received when
 *  a DatagramSocket is bound to a more specific address.
 *  
 *  Example:
 *  DatagramSocket s = new DatagramSocket(null);
 *               s.bind(new InetSocketAddress(8888));
 *  
 *  Which is equivalent to:
 *  DatagramSocket s = new DatagramSocket(8888);
 *  
 *  Both cases will create a DatagramSocket able to receive broadcasts on
 *  UDP port 8888.
 */
class DatagramSocket extends Object with Closeable {

    /** Constructs a datagram socket and binds it to any available port
     *  on the local host machine.
     */
    @stub
    def this() = ???

    /** Creates an unbound datagram socket with the specified
     *  DatagramSocketImpl.
     */
    @stub
    protected def this(impl: DatagramSocketImpl) = ???

    /** Constructs a datagram socket and binds it to the specified port
     *  on the local host machine.
     */
    @stub
    def this(port: Int) = ???

    /** Creates a datagram socket, bound to the specified local
     *  address.
     */
    @stub
    def this(port: Int, laddr: InetAddress) = ???

    /** Creates a datagram socket, bound to the specified local
     *  socket address.
     */
    @stub
    def this(bindaddr: SocketAddress) = ???

    /** Binds this DatagramSocket to a specific address and port. */
    @stub
    def bind(addr: SocketAddress): Unit = ???

    /** Closes this datagram socket. */
    @stub
    def close(): Unit = ???

    /** Connects the socket to a remote address for this socket. */
    @stub
    def connect(address: InetAddress, port: Int): Unit = ???

    /** Connects this socket to a remote socket address (IP address + port number). */
    @stub
    def connect(addr: SocketAddress): Unit = ???

    /** Disconnects the socket. */
    @stub
    def disconnect(): Unit = ???

    /** Tests if SO_BROADCAST is enabled. */
    @stub
    def getBroadcast(): Boolean = ???

    /** Returns the unique DatagramChannel object
     *  associated with this datagram socket, if any.
     */
    @stub
    def getChannel(): DatagramChannel = ???

    /** Returns the address to which this socket is connected. */
    @stub
    def getInetAddress(): InetAddress = ???

    /** Gets the local address to which the socket is bound. */
    @stub
    def getLocalAddress(): InetAddress = ???

    /** Returns the port number on the local host to which this socket
     *  is bound.
     */
    @stub
    def getLocalPort(): Int = ???

    /** Returns the address of the endpoint this socket is bound to. */
    @stub
    def getLocalSocketAddress(): SocketAddress = ???

    /** Returns the port number to which this socket is connected. */
    @stub
    def getPort(): Int = ???

    /** Get value of the SO_RCVBUF option for this DatagramSocket, that is the
     *  buffer size used by the platform for input on this DatagramSocket.
     */
    @stub
    def getReceiveBufferSize(): Int = ???

    /** Returns the address of the endpoint this socket is connected to, or
     *  null if it is unconnected.
     */
    @stub
    def getRemoteSocketAddress(): SocketAddress = ???

    /** Tests if SO_REUSEADDR is enabled. */
    @stub
    def getReuseAddress(): Boolean = ???

    /** Get value of the SO_SNDBUF option for this DatagramSocket, that is the
     *  buffer size used by the platform for output on this DatagramSocket.
     */
    @stub
    def getSendBufferSize(): Int = ???

    /** Retrieve setting for SO_TIMEOUT. */
    @stub
    def getSoTimeout(): Int = ???

    /** Gets traffic class or type-of-service in the IP datagram
     *  header for packets sent from this DatagramSocket.
     */
    @stub
    def getTrafficClass(): Int = ???

    /** Returns the binding state of the socket. */
    @stub
    def isBound(): Boolean = ???

    /** Returns whether the socket is closed or not. */
    @stub
    def isClosed(): Boolean = ???

    /** Returns the connection state of the socket. */
    @stub
    def isConnected(): Boolean = ???

    /** Receives a datagram packet from this socket. */
    @stub
    def receive(p: DatagramPacket): Unit = ???

    /** Sends a datagram packet from this socket. */
    @stub
    def send(p: DatagramPacket): Unit = ???

    /** Enable/disable SO_BROADCAST. */
    @stub
    def setBroadcast(on: Boolean): Unit = ???

    /** Sets the SO_RCVBUF option to the specified value for this
     *  DatagramSocket.
     */
    @stub
    def setReceiveBufferSize(size: Int): Unit = ???

    /** Enable/disable the SO_REUSEADDR socket option. */
    @stub
    def setReuseAddress(on: Boolean): Unit = ???

    /** Sets the SO_SNDBUF option to the specified value for this
     *  DatagramSocket.
     */
    @stub
    def setSendBufferSize(size: Int): Unit = ???

    /** Enable/disable SO_TIMEOUT with the specified timeout, in
     *   milliseconds.
     */
    @stub
    def setSoTimeout(timeout: Int): Unit = ???

    /** Sets traffic class or type-of-service octet in the IP
     *  datagram header for datagrams sent from this DatagramSocket.
     */
    @stub
    def setTrafficClass(tc: Int): Unit = ???
}

object DatagramSocket {
    /** Sets the datagram socket implementation factory for the
     *  application.
     */
    @stub
    def setDatagramSocketImplFactory(fac: DatagramSocketImplFactory): Unit = ???
}
