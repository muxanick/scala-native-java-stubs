package java.net

import java.io.{FileDescriptor, InputStream, OutputStream}
import java.lang.{Object, String}

// The abstract class SocketImpl is a common superclass
// of all classes that actually implement sockets. It is used to
// create both client and server sockets.
// 
// A "plain" socket implements these methods exactly as
// described, without attempting to go through a firewall or proxy.
abstract class SocketImpl extends Object with SocketOptions {

    // The IP address of the remote end of this socket.
    protected def address: InetAddress

    // The file descriptor object for this socket.
    protected def fd: FileDescriptor

    // The local port number to which this socket is connected.
    protected def localport: Int

    // Accepts a connection.
    protected def accept(s: SocketImpl): Unit

    // Returns the number of bytes that can be read from this socket
    // without blocking.
    protected def available(): Int

    // Binds this socket to the specified local IP address and port number.
    protected def bind(host: InetAddress, port: Int): Unit

    // Closes this socket.
    protected def close(): Unit

    // Connects this socket to the specified port number on the specified host.
    protected def connect(address: InetAddress, port: Int): Unit

    // Connects this socket to the specified port number on the specified host.
    protected def connect(address: SocketAddress, timeout: Int): Unit

    // Connects this socket to the specified port on the named host.
    protected def connect(host: String, port: Int): Unit

    // Creates either a stream or a datagram socket.
    protected def create(stream: Boolean): Unit

    // Returns the value of this socket's fd field.
    protected def getFileDescriptor(): FileDescriptor

    // Returns the value of this socket's address field.
    protected def getInetAddress(): InetAddress

    // Returns an input stream for this socket.
    protected def getInputStream(): InputStream

    // Returns the value of this socket's localport field.
    protected def getLocalPort(): Int

    // Returns an output stream for this socket.
    protected def getOutputStream(): OutputStream

    // Returns the value of this socket's port field.
    protected def getPort(): Int

    // Sets the maximum queue length for incoming connection indications
    // (a request to connect) to the count argument.
    protected def listen(backlog: Int): Unit

    // Send one byte of urgent data on the socket.
    protected def sendUrgentData(data: Int): Unit

    // Sets performance preferences for this socket.
    protected def setPerformancePreferences(connectionTime: Int, latency: Int, bandwidth: Int): Unit

    // Places the input stream for this socket at "end of stream".
    protected def shutdownInput(): Unit

    // Disables the output stream for this socket.
    protected def shutdownOutput(): Unit

    // Returns whether or not this SocketImpl supports sending
    // urgent data.
    protected def supportsUrgentData(): Boolean
}
