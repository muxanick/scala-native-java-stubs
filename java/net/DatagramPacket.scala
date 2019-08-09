package java.net

import java.lang.Object

/** This class represents a datagram packet.
 *  
 *  Datagram packets are used to implement a connectionless packet
 *  delivery service. Each message is routed from one machine to
 *  another based solely on information contained within that packet.
 *  Multiple packets sent from one machine to another might be routed
 *  differently, and might arrive in any order. Packet delivery is
 *  not guaranteed.
 */
final class DatagramPacket extends Object {

    /** Constructs a DatagramPacket for receiving packets of
     *  length length.
     */
    @stub
    def this(buf: Array[Byte], length: Int) = ???

    /** Constructs a datagram packet for sending packets of length
     *  length to the specified port number on the specified
     *  host.
     */
    @stub
    def this(buf: Array[Byte], length: Int, address: InetAddress, port: Int) = ???

    /** Constructs a DatagramPacket for receiving packets of
     *  length length, specifying an offset into the buffer.
     */
    @stub
    def this(buf: Array[Byte], offset: Int, length: Int) = ???

    /** Constructs a datagram packet for sending packets of length
     *  length with offset ioffsetto the
     *  specified port number on the specified host.
     */
    @stub
    def this(buf: Array[Byte], offset: Int, length: Int, address: InetAddress, port: Int) = ???

    /** Constructs a datagram packet for sending packets of length
     *  length with offset ioffsetto the
     *  specified port number on the specified host.
     */
    @stub
    def this(buf: Array[Byte], offset: Int, length: Int, address: SocketAddress) = ???

    /** Returns the IP address of the machine to which this datagram is being
     *  sent or from which the datagram was received.
     */
    @stub
    def getAddress(): InetAddress = ???

    /** Returns the data buffer. */
    @stub
    def getData(): Array[Byte] = ???

    /** Returns the length of the data to be sent or the length of the
     *  data received.
     */
    @stub
    def getLength(): Int = ???

    /** Returns the offset of the data to be sent or the offset of the
     *  data received.
     */
    @stub
    def getOffset(): Int = ???

    /** Returns the port number on the remote host to which this datagram is
     *  being sent or from which the datagram was received.
     */
    @stub
    def getPort(): Int = ???

    /** Gets the SocketAddress (usually IP address + port number) of the remote
     *  host that this packet is being sent to or is coming from.
     */
    @stub
    def getSocketAddress(): SocketAddress = ???

    /** Sets the IP address of the machine to which this datagram
     *  is being sent.
     */
    @stub
    def setAddress(iaddr: InetAddress): Unit = ???

    /** Set the data buffer for this packet. */
    @stub
    def setData(buf: Array[Byte]): Unit = ???

    /** Set the data buffer for this packet. */
    @stub
    def setData(buf: Array[Byte], offset: Int, length: Int): Unit = ???

    /** Set the length for this packet. */
    @stub
    def setLength(length: Int): Unit = ???

    /** Sets the port number on the remote host to which this datagram
     *  is being sent.
     */
    @stub
    def setPort(iport: Int): Unit = ???
}
