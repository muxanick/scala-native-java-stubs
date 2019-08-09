package java.net

import java.lang.Object

// This class represents a datagram packet.
// 
// Datagram packets are used to implement a connectionless packet
// delivery service. Each message is routed from one machine to
// another based solely on information contained within that packet.
// Multiple packets sent from one machine to another might be routed
// differently, and might arrive in any order. Packet delivery is
// not guaranteed.
final class DatagramPacket extends Object {

    @stub
    // Constructs a DatagramPacket for receiving packets of
    // length length.
    def this(buf: Array[Byte], length: Int) = ???

    @stub
    // Constructs a datagram packet for sending packets of length
    // length to the specified port number on the specified
    // host.
    def this(buf: Array[Byte], length: Int, address: InetAddress, port: Int) = ???

    @stub
    // Constructs a DatagramPacket for receiving packets of
    // length length, specifying an offset into the buffer.
    def this(buf: Array[Byte], offset: Int, length: Int) = ???

    @stub
    // Constructs a datagram packet for sending packets of length
    // length with offset ioffsetto the
    // specified port number on the specified host.
    def this(buf: Array[Byte], offset: Int, length: Int, address: InetAddress, port: Int) = ???

    @stub
    // Constructs a datagram packet for sending packets of length
    // length with offset ioffsetto the
    // specified port number on the specified host.
    def this(buf: Array[Byte], offset: Int, length: Int, address: SocketAddress) = ???

    @stub
    // Returns the IP address of the machine to which this datagram is being
    // sent or from which the datagram was received.
    def getAddress(): InetAddress = ???

    @stub
    // Returns the data buffer.
    def getData(): Array[Byte] = ???

    @stub
    // Returns the length of the data to be sent or the length of the
    // data received.
    def getLength(): Int = ???

    @stub
    // Returns the offset of the data to be sent or the offset of the
    // data received.
    def getOffset(): Int = ???

    @stub
    // Returns the port number on the remote host to which this datagram is
    // being sent or from which the datagram was received.
    def getPort(): Int = ???

    @stub
    // Gets the SocketAddress (usually IP address + port number) of the remote
    // host that this packet is being sent to or is coming from.
    def getSocketAddress(): SocketAddress = ???

    @stub
    // Sets the IP address of the machine to which this datagram
    // is being sent.
    def setAddress(iaddr: InetAddress): Unit = ???

    @stub
    // Set the data buffer for this packet.
    def setData(buf: Array[Byte]): Unit = ???

    @stub
    // Set the data buffer for this packet.
    def setData(buf: Array[Byte], offset: Int, length: Int): Unit = ???

    @stub
    // Set the length for this packet.
    def setLength(length: Int): Unit = ???

    @stub
    // Sets the port number on the remote host to which this datagram
    // is being sent.
    def setPort(iport: Int): Unit = ???
}
