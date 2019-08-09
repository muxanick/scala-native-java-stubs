package java.nio.channels.spi

import java.lang.Object
import java.net.ProtocolFamily
import java.nio.channels.{Channel, DatagramChannel, Pipe, ServerSocketChannel, SocketChannel}

// Service-provider class for selectors and selectable channels.
//
//  A selector provider is a concrete subclass of this class that has a
// zero-argument constructor and implements the abstract methods specified
// below.  A given invocation of the Java virtual machine maintains a single
// system-wide default provider instance, which is returned by the provider method.  The first invocation of that method will locate
// the default provider as specified below.
//
//  The system-wide default provider is used by the static open
// methods of the DatagramChannel, Pipe, Selector, ServerSocketChannel, and SocketChannel classes.  It is also
// used by the System.inheritedChannel()
// method. A program may make use of a provider other than the default provider
// by instantiating that provider and then directly invoking the open
// methods defined in this class.
//
//  All of the methods in this class are safe for use by multiple concurrent
// threads.  
abstract class SelectorProvider extends Object {

    // Returns the channel inherited from the entity that created this
    // Java virtual machine.
    def inheritedChannel(): Channel

    // Opens a datagram channel.
    def openDatagramChannel(): DatagramChannel

    // Opens a datagram channel.
    def openDatagramChannel(family: ProtocolFamily): DatagramChannel

    // Opens a pipe.
    def openPipe(): Pipe

    // Opens a selector.
    def openSelector(): AbstractSelector

    // Opens a server-socket channel.
    def openServerSocketChannel(): ServerSocketChannel

    // Opens a socket channel.
    def openSocketChannel(): SocketChannel
}
