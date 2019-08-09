package java.net

import java.io.FileDescriptor
import java.lang.Object

/** Abstract datagram and multicast socket implementation base class. */
abstract class DatagramSocketImpl extends Object with SocketOptions {

    /** The file descriptor object. */
    protected val fd: FileDescriptor

    /** Binds a datagram socket to a local port and address. */
    protected def bind(lport: Int, laddr: InetAddress): Unit

    /** Close the socket. */
    protected def close(): Unit

    /** Connects a datagram socket to a remote destination. */
    protected def connect(address: InetAddress, port: Int): Unit

    /** Creates a datagram socket. */
    protected def create(): Unit

    /** Disconnects a datagram socket from its remote destination. */
    protected def disconnect(): Unit

    /** Gets the datagram socket file descriptor. */
    protected def getFileDescriptor(): FileDescriptor

    /** Gets the local port. */
    protected def getLocalPort(): Int

    /** Retrieve the TTL (time-to-live) option. */
    protected def getTimeToLive(): Int

    /** Deprecated. 
     * use getTimeToLive instead.
     * 
     */
    protected def getTTL(): Byte

    /** Join the multicast group. */
    protected def join(inetaddr: InetAddress): Unit

    /** Join the multicast group. */
    protected def joinGroup(mcastaddr: SocketAddress, netIf: NetworkInterface): Unit

    /** Leave the multicast group. */
    protected def leave(inetaddr: InetAddress): Unit

    /** Leave the multicast group. */
    protected def leaveGroup(mcastaddr: SocketAddress, netIf: NetworkInterface): Unit

    /** Peek at the packet to see who it is from. */
    protected def peek(i: InetAddress): Int

    /** Peek at the packet to see who it is from. */
    protected def peekData(p: DatagramPacket): Int

    /** Receive the datagram packet. */
    protected def receive(p: DatagramPacket): Unit

    /** Sends a datagram packet. */
    protected def send(p: DatagramPacket): Unit

    /** Set the TTL (time-to-live) option. */
    protected def setTimeToLive(ttl: Int): Unit
}
