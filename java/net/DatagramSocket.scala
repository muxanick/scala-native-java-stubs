package java.net

import java.io.Closeable
import java.lang.Object
import java.nio.channels.DatagramChannel

// This class represents a socket for sending and receiving datagram packets.
//
// A datagram socket is the sending or receiving point for a packet
// delivery service. Each packet sent or received on a datagram socket
// is individually addressed and routed. Multiple packets sent from
// one machine to another may be routed differently, and may arrive in
// any order.
//
//  Where possible, a newly constructed DatagramSocket has the
// SO_BROADCAST socket option enabled so as
// to allow the transmission of broadcast datagrams. In order to receive
// broadcast packets a DatagramSocket should be bound to the wildcard address.
// In some implementations, broadcast packets may also be received when
// a DatagramSocket is bound to a more specific address.
// 
// Example:
// DatagramSocket s = new DatagramSocket(null);
//              s.bind(new InetSocketAddress(8888));
// 
// Which is equivalent to:
// DatagramSocket s = new DatagramSocket(8888);
// 
// Both cases will create a DatagramSocket able to receive broadcasts on
// UDP port 8888.
class DatagramSocket extends Object with Closeable {

    @stub
    // Constructs a datagram socket and binds it to any available port
    // on the local host machine.
    def this() = ???

    @stub
    // Creates an unbound datagram socket with the specified
    // DatagramSocketImpl.
    protected def this(impl: DatagramSocketImpl) = ???

    @stub
    // Constructs a datagram socket and binds it to the specified port
    // on the local host machine.
    def this(port: Int) = ???

    @stub
    // Creates a datagram socket, bound to the specified local
    // address.
    def this(port: Int, laddr: InetAddress) = ???

    @stub
    // Binds this DatagramSocket to a specific address and port.
    def bind(addr: SocketAddress): Unit = ???

    @stub
    // Closes this datagram socket.
    def close(): Unit = ???

    @stub
    // Connects the socket to a remote address for this socket.
    def connect(address: InetAddress, port: Int): Unit = ???

    @stub
    // Connects this socket to a remote socket address (IP address + port number).
    def connect(addr: SocketAddress): Unit = ???

    @stub
    // Disconnects the socket.
    def disconnect(): Unit = ???

    @stub
    // Tests if SO_BROADCAST is enabled.
    def getBroadcast(): Boolean = ???

    @stub
    // Returns the unique DatagramChannel object
    // associated with this datagram socket, if any.
    def getChannel(): DatagramChannel = ???

    @stub
    // Returns the address to which this socket is connected.
    def getInetAddress(): InetAddress = ???

    @stub
    // Gets the local address to which the socket is bound.
    def getLocalAddress(): InetAddress = ???

    @stub
    // Returns the port number on the local host to which this socket
    // is bound.
    def getLocalPort(): Int = ???

    @stub
    // Returns the address of the endpoint this socket is bound to.
    def getLocalSocketAddress(): SocketAddress = ???

    @stub
    // Returns the port number to which this socket is connected.
    def getPort(): Int = ???

    @stub
    // Get value of the SO_RCVBUF option for this DatagramSocket, that is the
    // buffer size used by the platform for input on this DatagramSocket.
    def getReceiveBufferSize(): Int = ???

    @stub
    // Returns the address of the endpoint this socket is connected to, or
    // null if it is unconnected.
    def getRemoteSocketAddress(): SocketAddress = ???

    @stub
    // Tests if SO_REUSEADDR is enabled.
    def getReuseAddress(): Boolean = ???

    @stub
    // Get value of the SO_SNDBUF option for this DatagramSocket, that is the
    // buffer size used by the platform for output on this DatagramSocket.
    def getSendBufferSize(): Int = ???

    @stub
    // Retrieve setting for SO_TIMEOUT.
    def getSoTimeout(): Int = ???

    @stub
    // Gets traffic class or type-of-service in the IP datagram
    // header for packets sent from this DatagramSocket.
    def getTrafficClass(): Int = ???

    @stub
    // Returns the binding state of the socket.
    def isBound(): Boolean = ???

    @stub
    // Returns whether the socket is closed or not.
    def isClosed(): Boolean = ???

    @stub
    // Returns the connection state of the socket.
    def isConnected(): Boolean = ???

    @stub
    // Receives a datagram packet from this socket.
    def receive(p: DatagramPacket): Unit = ???

    @stub
    // Sends a datagram packet from this socket.
    def send(p: DatagramPacket): Unit = ???

    @stub
    // Enable/disable SO_BROADCAST.
    def setBroadcast(on: Boolean): Unit = ???

    @stub
    // Sets the SO_RCVBUF option to the specified value for this
    // DatagramSocket.
    def setReceiveBufferSize(size: Int): Unit = ???

    @stub
    // Enable/disable the SO_REUSEADDR socket option.
    def setReuseAddress(on: Boolean): Unit = ???

    @stub
    // Sets the SO_SNDBUF option to the specified value for this
    // DatagramSocket.
    def setSendBufferSize(size: Int): Unit = ???

    @stub
    // Enable/disable SO_TIMEOUT with the specified timeout, in
    //  milliseconds.
    def setSoTimeout(timeout: Int): Unit = ???
}

object DatagramSocket {
    @stub
    // Sets the datagram socket implementation factory for the
    // application.
    def setDatagramSocketImplFactory(fac: DatagramSocketImplFactory): Unit = ???
}
